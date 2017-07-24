package org.tetrabox.example.pacman.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.eclipse.emf.common.util.EList
import pacman.Board
import pacman.Entity
import pacman.Ghost
import pacman.Pacman
import pacman.Tile
import pacman.PelletType

import static extension org.tetrabox.example.pacman.k3dsa.BoardAspect.*
import static extension org.tetrabox.example.pacman.k3dsa.TileAspect.*
import static extension org.tetrabox.example.pacman.k3dsa.PacmanAspect.*

@Aspect(className=Board)
class BoardAspect {
	
	private var long previousTime
	
	@InitializeModel
	@Step
	def void initializeModel(EList<String> args) {
		_self.tiles.forEach[initialize]
		_self.entities.forEach[initialize]
	}
	
	@Step
	def void reset() {
		_self.entities.forEach[currentTile = initialTile]
	}
	
	@Main
	def void run() {
		var pacmanAlive = _self.entities.exists[it instanceof Pacman && (it as Pacman).lives > 0]
		var pelletsRemaining = _self.tiles.exists[hasPellet]
		_self.previousTime = System.nanoTime
		while(pacmanAlive && pelletsRemaining) {
			val currentTime = System.nanoTime
			val deltaTime = currentTime - _self.previousTime
			_self.previousTime = currentTime
			_self.update(deltaTime)
			pacmanAlive = _self.entities.exists[it instanceof Pacman && (it as Pacman).lives > 0]
			pelletsRemaining = _self.tiles.exists[hasPellet]
		}
	}
	
	@Step
	def void update(long deltaTime) {
		_self.entities.filter[it instanceof Ghost].forEach[it.update(deltaTime)]
		_self.entities.filter[it instanceof Pacman].forEach[it.update(deltaTime)]
	}
}

@Aspect(className=Tile)
class TileAspect {
	public var boolean hasPellet = false
	
	def void initialize() {
		if (_self.initialPellet != PelletType.NO_PELLET) {
			_self.hasPellet = true
		}
	}
}

@Aspect(className=Entity)
abstract class EntityAspect {
	public var int speed = 100
	
	// 0 = up, 1 = left, 2 = down, 3 = right
	public var int direction = 0
	
	public var Tile currentTile
	
	public var Tile nextTile
	
	// 0.5s
	protected val int baseMoveTime = 500000000
	
	protected var int moveProgress = 0
	
	@Step
	def void initialize() {
		_self.currentTile = _self.initialTile
	}
	
	@Step
	def void modifySpeed(Integer speed) {
		_self.speed = _self.speed + speed
	}
	
	@Step
	def void changeDirection(Integer newDirection) {
		_self.direction = newDirection
	}
	
	@Step
	def void update(long deltaTime) {
		_self.moveProgress = Math.floor(_self.moveProgress + (deltaTime * _self.speed / 100.00)) as int
		if (_self.moveProgress >= _self.baseMoveTime) {
			_self.moveProgress = _self.moveProgress % _self.baseMoveTime
			_self.enterNextTile
			_self.nextTile = _self.computeNextTile
		}
		
	}
	
	protected abstract def Tile computeNextTile()
	
	@Step
	def void enterNextTile() {
		_self.currentTile = _self.nextTile
	}
}

@Aspect(className=Ghost)
class GhostAspect extends EntityAspect {
	
	public var Tile targetTile
	
	@Step
	def void changeTargetTile(Tile targetTile) {
		_self.targetTile = targetTile
	}
	
	@Step
	@OverrideAspectMethod
	def void enterNextTile() {
		_self.super_enterNextTile
		val board = _self.currentTile.eContainer as Board
		board.entities
				.filter[it.currentTile == _self.currentTile && it instanceof Pacman]
				.forEach[(it as Pacman).kill]
	}
	
	@OverrideAspectMethod
	protected def Tile computeNextTile() {
		// ghosts can't go back and choose the closest accessible tile to their target tile, regardless of reachability
		val currentTile = _self.nextTile
		val candidateTiles = switch (_self.direction) {
			case 0: {
				// coming from the bottom
				newArrayList(currentTile.top, currentTile.left, currentTile.right).filter[it != null]
			}
			case 1: {
				// coming from the right
				newArrayList(currentTile.top, currentTile.left, currentTile.bottom).filter[it != null]
			}
			case 2: {
				// coming from the top
				newArrayList(currentTile.left, currentTile.bottom, currentTile.right).filter[it != null]
			}
			case 3: {
				// coming from the left
				newArrayList(currentTile.top, currentTile.bottom, currentTile.right).filter[it != null]
			}
		}
		var Tile result
		if (candidateTiles.size > 1) {
			val targetTile = _self.targetTile
			result = candidateTiles.head
			var d1 = _self.computeDistanceBetweenTiles(result, targetTile)
			for (Tile tile : candidateTiles.tail) {
				val d2 = _self.computeDistanceBetweenTiles(tile, targetTile)
				if (d2 > d1) {
					result = tile
					d1 = d2
				}
			}
		} else {
			result = candidateTiles.head
		}
		if (result == currentTile.top) {
			_self.changeDirection(0)
		} else if (result == currentTile.left) {
			_self.changeDirection(1)
		} else if (result == currentTile.bottom) {
			_self.changeDirection(2)
		} else if (result == currentTile.right) {
			_self.changeDirection(3)
		}
		return result
	}
	
	private def int computeDistanceBetweenTiles(Tile from, Tile to) {
		return (to.x - from.x) * (to.x - from.x) + (to.y - from.y) * (to.y - from.y)
	}
}

@Aspect(className=Pacman)
class PacmanAspect extends EntityAspect {
	
	public var int pelletsEaten = 0
	
	public var int lives
	
	@Step
	@OverrideAspectMethod
	def void initialize() {
		_self.lives = _self.initialLives
		_self.super_initialize
	}
	
	@Step
	@OverrideAspectMethod
	def void changeDirection(Integer newDirection) {
		_self.direction = newDirection
		_self.computeNextTile
	}
	
	@Step(eventTriggerable = true)
	def void up() {
		_self.direction = 0
		_self.computeNextTile
	}
	
	@Step(eventTriggerable = true)
	def void left() {
		_self.direction = 1
		_self.computeNextTile
	}
	
	@Step(eventTriggerable = true)
	def void down() {
		_self.direction = 2
		_self.computeNextTile
	}
	
	@Step(eventTriggerable = true)
	def void right() {
		_self.direction = 3
		_self.computeNextTile
	}
	
	@Step
	@OverrideAspectMethod
	def void enterNextTile() {
		val tile = _self.nextTile
		if (tile != null && tile.passable) {
			_self.super_enterNextTile
			_self.eatPellet
		} else {
			_self.moveProgress = _self.moveProgress + _self.baseMoveTime / 2
		}
	}
	
	@Step
	def void eatPellet() {
		_self.currentTile.hasPellet = false
		_self.pelletsEaten = _self.pelletsEaten + 1
	}
	
	@Step
	def void kill() {
		_self.lives = _self.lives - 1
		(_self.eContainer as Board).reset
	}
	
	@OverrideAspectMethod
	protected def Tile computeNextTile() {
		val currentTile = _self.eContainer as Tile
		var Tile result = null
		switch (_self.direction) {
			case 0: {
				result = currentTile.top
			}
			case 1: {
				result = currentTile.left
			}
			case 2: {
				result = currentTile.bottom
			}
			case 3: {
				result = currentTile.right
			}
		}
		return result
	}
}
