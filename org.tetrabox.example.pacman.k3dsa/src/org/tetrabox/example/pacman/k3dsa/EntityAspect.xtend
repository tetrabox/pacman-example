package org.tetrabox.example.pacman.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import pacman.AbstractTile
import pacman.Board
import pacman.Entity
import pacman.Ghost
import pacman.GhostHouseTile
import pacman.GhostPersonality
import pacman.Pacman
import pacman.PassableTile
import pacman.Tile
import pacman.WallTile

import static extension org.tetrabox.example.pacman.k3dsa.BoardAspect.*
import static extension org.tetrabox.example.pacman.k3dsa.PacmanAspect.*
import static extension org.tetrabox.example.pacman.k3dsa.TileAspect.*

@Aspect(className=Entity)
abstract class EntityAspect {
	public var int speed
	
	// 0 = up, 1 = left, 2 = down, 3 = right
	public var int direction
	
	public var PassableTile currentTile
	
	public var PassableTile nextTile
	
	public var int xMoveProgress
	
	public var int yMoveProgress
	
	// 0.25s total
	protected val int baseMoveTime = 125000000
	
	def void initialize() {
		_self.currentTile = _self.initialTile
		_self.nextTile = _self.computeNextTile
		_self.speed = 100
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
		var progress = Math.floor(deltaTime * _self.speed / 100.00) as int
		switch (_self.direction) {
			case 0: {
				progress = _self.xTowardCenter(progress)
				if (progress > 0) {
					val nextTile = _self.nextTile
					if (nextTile != null && nextTile instanceof PassableTile) {
						// proceed normally
						var yMoveProgress = _self.yMoveProgress - progress
						if (-yMoveProgress > _self.baseMoveTime) {
							yMoveProgress = 2 * _self.baseMoveTime + yMoveProgress
							_self.yMoveProgress = yMoveProgress
							if (_self.nextTile != null) {
								_self.enterNextTile
							}
							_self.nextTile = _self.computeNextTile
						} else {
							_self.yMoveProgress = yMoveProgress
						}
					} else {
						// only add/subtract toward 0
						_self.yTowardCenter(progress)
					}
				}
			}
			case 1: {
				progress = _self.yTowardCenter(progress)
				if (progress > 0) {
					val nextTile = _self.nextTile
					if (nextTile != null && nextTile instanceof PassableTile) {
						// proceed normally
						var xMoveProgress = _self.xMoveProgress - progress
						if (-xMoveProgress > _self.baseMoveTime) {
							xMoveProgress = 2 * _self.baseMoveTime + xMoveProgress
							_self.xMoveProgress = xMoveProgress
							if (_self.nextTile != null) {
								_self.enterNextTile
							}
							_self.nextTile = _self.computeNextTile
						} else {
							_self.xMoveProgress = xMoveProgress
						}
					} else {
						// only add/subtract toward 0
						_self.xTowardCenter(progress)
					}
				}
			}
			case 2: {
				progress = _self.xTowardCenter(progress)
				if (progress > 0) {
					val nextTile = _self.nextTile
					if (nextTile != null && nextTile instanceof PassableTile) {
						// proceed normally
						var yMoveProgress = _self.yMoveProgress + progress
						if (yMoveProgress > _self.baseMoveTime) {
							yMoveProgress = -(2 * _self.baseMoveTime - yMoveProgress)
							_self.yMoveProgress = yMoveProgress
							if (_self.nextTile != null) {
								_self.enterNextTile
							}
							_self.nextTile = _self.computeNextTile
						} else {
							_self.yMoveProgress = yMoveProgress
						}
					} else {
						// only add/subtract toward 0
						_self.yTowardCenter(progress)
					}
				}
			}
			case 3: {
				progress = _self.yTowardCenter(progress)
				if (progress > 0) {
					val nextTile = _self.nextTile
					if (nextTile != null && nextTile instanceof PassableTile) {
						// proceed normally
						var xMoveProgress = _self.xMoveProgress + progress
						if (xMoveProgress > _self.baseMoveTime) {
							xMoveProgress = -(2 * _self.baseMoveTime - xMoveProgress)
							_self.xMoveProgress = xMoveProgress
							if (_self.nextTile != null) {
								_self.enterNextTile
							}
							_self.nextTile = _self.computeNextTile
						} else {
							_self.xMoveProgress = xMoveProgress
						}
					} else {
						// only add/subtract toward 0
						_self.xTowardCenter(progress)
					}
				}
			}
		}
	}
	
	private def int xTowardCenter(int progress) {
		if (_self.xMoveProgress != 0) {
			// add/subtract from xMoveProgress
			if (progress > Math.abs(_self.xMoveProgress)) {
				_self.xMoveProgress = 0
				return progress - Math.abs(_self.xMoveProgress)
			} else {
				_self.xMoveProgress = _self.xMoveProgress - (Math.signum(_self.xMoveProgress) as int) * progress
				return 0
			}
		}
		return progress
	}
	
	private def int yTowardCenter(int progress) {
		if (_self.yMoveProgress != 0) {
			// add/subtract from xMoveProgress
			if (progress > Math.abs(_self.yMoveProgress)) {
				_self.yMoveProgress = 0
				return progress - Math.abs(_self.yMoveProgress)
			} else {
				_self.yMoveProgress = _self.yMoveProgress - (Math.signum(_self.yMoveProgress) as int) * progress
				return 0
			}
		}
		return progress
	}
	
	protected abstract def PassableTile computeNextTile()
	
	@Step
	def void enterNextTile() {
		_self.currentTile = _self.nextTile
	}
}

@Aspect(className=Ghost)
class GhostAspect extends EntityAspect {
	
	public var AbstractTile targetTile
	
	private var Board board
	
	private var PassableTile previousTile
	
	private var boolean activated
	
	@OverrideAspectMethod
	def void initialize() {
		_self.speed = 100
		_self.board = _self.eContainer as Board
		_self.currentTile = _self.initialTile
		_self.previousTile = null
		if (_self.personnality == GhostPersonality.SHADOW || _self.personnality == GhostPersonality.SPEEDY) {
			_self.activate
		} else {
			_self.activated = false
		}
	}
	
	@Step
	@OverrideAspectMethod
	def void update(long deltaTime) {
		if (_self.activated) {
			_self.super_update(deltaTime)
			val pacmen = _self.board.entities.filter[it instanceof Pacman]
			pacmen.filter[it.currentTile == _self.currentTile].forEach[(it as Pacman).kill]
		}
	}
	
	@Step
	def void activate() {
		_self.activated = true
		_self.changeTargetTile(_self.findTargetTile)
		_self.nextTile = _self.computeNextTile
	}
	
	@Step
	def void enterChaseMode() {
		
	}
	
	@Step
	def void enterScatterMode() {
		
	}
	
	@Step
	def void enterFrightenedMode() {
		
	}
	
	@Step
	def void changeTargetTile(AbstractTile targetTile) {
		_self.targetTile = targetTile
		_self.nextTile = _self.computeNextTile
	}
	
//	private def Tile findGhostHouseExit() {
//		val currentTile = _self.currentTile
//		val paths = new ArrayList<List<PassableTile>>
//		if (currentTile.top instanceof GhostHouseTile)
//		paths.add(newArrayList(currentTile.top))
//		paths.add(newArrayList(currentTile.top))
//		paths.add(newArrayList(currentTile.top))
//		paths.add(newArrayList(currentTile.top))
//		null
//	}
	
	private def AbstractTile findTargetTile() {
		if (_self.activated) {
			val pacman = _self.board.entities.filter[it instanceof Pacman].head
			return switch (_self.personnality) {
				case SHADOW: {
					pacman.currentTile
				}
				case SPEEDY: {
					switch (pacman.direction) {
						case 0: {
							pacman.currentTile?.top?.top?.top?.top
						}
						case 1: {
							pacman.currentTile?.left?.left?.left?.left
						}
						case 2: {
							pacman.currentTile?.bottom?.bottom?.bottom?.bottom
						}
						case 3: {
							pacman.currentTile?.right.right.right.right
						}
						default: null
					}
				}
				case BASHFUL: {
					val tile2 = switch (pacman.direction) {
						case 0: {
							pacman.currentTile?.top?.top
						}
						case 1: {
							pacman.currentTile?.left?.left
						}
						case 2: {
							pacman.currentTile?.bottom?.bottom
						}
						case 3: {
							pacman.currentTile?.right?.right
						}
						default: null
					}
					val tile1 = _self.board.entities.filter[it instanceof Ghost]
							.findFirst[(it as Ghost).personnality == GhostPersonality.SHADOW]
							?.currentTile
					val x = (2 * tile2.x + tile1.x) % 28
					val y = (2 * tile2.y + tile1.y) % 36
					_self.board.tiles.findFirst[it.x == x && it.y == y]
				}
				case POKEY: {
					val d = _self.computeDistanceBetweenTiles(_self.currentTile, pacman.currentTile)
					if (d > 8) {
						return pacman.currentTile
					} else {
						_self.board.tiles.findFirst[it.x == 0 && it.y == 35]
					}
					null
				}
			}
		} else {
			return null
		}
	}
	
	@Step
	@OverrideAspectMethod
	def void enterNextTile() {
		_self.previousTile = _self.currentTile
		_self.super_enterNextTile
		_self.changeTargetTile(_self.findTargetTile)
	}
	
	@OverrideAspectMethod
	protected def PassableTile computeNextTile() {
		// ghosts can't go back and choose the closest accessible tile to their target tile, regardless of reachability
		val currentTile = _self.currentTile
		if (_self.activated || !(currentTile instanceof GhostHouseTile)) {
			val previousTile = _self.previousTile
			val filter = [AbstractTile t|
				t != null &&
				t != previousTile &&
				t instanceof PassableTile &&
				(currentTile instanceof GhostHouseTile || !(t instanceof GhostHouseTile))
			]
			val candidateTiles = newArrayList(currentTile.top, currentTile.left,
					currentTile.bottom, currentTile.right).filter(filter).map[it as PassableTile]
			var PassableTile result = null
			if (candidateTiles.size > 1) {
				val targetTile = _self.targetTile
				if (targetTile != null) {
					result = candidateTiles.head
					var d1 = _self.computeDistanceBetweenTiles(result, targetTile)
					for (PassableTile tile : candidateTiles.tail) {
						val d2 = _self.computeDistanceBetweenTiles(tile, targetTile)
						if (d2 < d1) {
							result = tile
							d1 = d2
						}
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
		} else {
			return null
		}
	}
	
	private def int computeDistanceBetweenTiles(AbstractTile from, AbstractTile to) {
		return (to.x - from.x) * (to.x - from.x) + (to.y - from.y) * (to.y - from.y)
	}
}

@Aspect(className=Pacman)
class PacmanAspect extends EntityAspect {
	
	// stores the latest received direction, applying it the next time
	// a tile is entered if possible, discarding it otherwise.
	private var int nextDirection = -1
	
	private var long energizedRemainingDuration
	
	public var int pelletsEaten = 0
	
	public var int lives
	
	public var boolean energized
	
	@OverrideAspectMethod
	def void initialize() {
		_self.lives = _self.initialLives
		_self.direction = 1
		_self.energized = false
		_self.super_initialize
	}
	
	@Step
	@OverrideAspectMethod
	def void update(long deltaTime) {
		_self.super_update(deltaTime)
		if (deltaTime >= _self.energizedRemainingDuration) {
			_self.energizedRemainingDuration = 0
			_self.energized = false
		} else {
			_self.energizedRemainingDuration = _self.energizedRemainingDuration - deltaTime
		}
	}
	
	@Step
	@OverrideAspectMethod
	def void changeDirection(Integer newDirection) {
		_self.direction = newDirection
		_self.nextTile = _self.computeNextTile
	}
	
	@Step
	def void energize() {
		_self.energized = true
		_self.energizedRemainingDuration = 10000000000l
	}
	
	@Step(eventHandler = true)
	def void up() {
		if (_self.canTakeDirection(0)) {
			_self.changeDirection(0)
		} else {
			_self.nextDirection = 0
		}
	}
	
	@Step(eventHandler = true)
	def void left() {
		if (_self.canTakeDirection(1)) {
			_self.changeDirection(1)
		} else {
			_self.nextDirection = 1
		}
	}
	
	@Step(eventHandler = true)
	def void down() {
		if (_self.canTakeDirection(2)) {
			_self.changeDirection(2)
		} else {
			_self.nextDirection = 2
		}
	}
	
	@Step(eventHandler = true)
	def void right() {
		if (_self.canTakeDirection(3)) {
			_self.changeDirection(3)
		} else {
			_self.nextDirection = 3
		}
	}
	
	def boolean canTakeDirection(Integer direction) {
		val nextTile = switch(direction) {
			case 0: {
				_self.currentTile.top
			}
			case 1: {
				_self.currentTile.left
			}
			case 2: {
				_self.currentTile.bottom
			}
			case 3: {
				_self.currentTile.right
			}
			default: null
		}
		nextTile != null && !(nextTile instanceof WallTile) && !(nextTile instanceof GhostHouseTile)
	}
	
	@Step
	@OverrideAspectMethod
	def void enterNextTile() {
		val tile = _self.nextTile
		if (tile != null && tile instanceof Tile) {
			_self.super_enterNextTile;
			(tile as Tile).eatPellet(_self)
		}
		if (_self.canTakeDirection(_self.nextDirection)) {
			_self.changeDirection(_self.nextDirection)
		}
		_self.nextDirection = -1
	}
	
	@Step
	def void kill() {
		_self.lives = _self.lives - 1
		(_self.eContainer as Board).reset
	}
	
	@OverrideAspectMethod
	protected def Tile computeNextTile() {
		val currentTile = _self.currentTile
		var AbstractTile result = null
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
		return if (result instanceof Tile) result else null
	}
}
