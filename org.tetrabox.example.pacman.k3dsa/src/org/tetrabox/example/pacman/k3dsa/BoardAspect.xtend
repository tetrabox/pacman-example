package org.tetrabox.example.pacman.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.eclipse.emf.common.util.EList
import pacman.Board
import pacman.Ghost
import pacman.GhostPersonality
import pacman.Pacman
import pacman.Tile

import static extension org.tetrabox.example.pacman.k3dsa.AbstractTileAspect.*
import static extension org.tetrabox.example.pacman.k3dsa.EntityAspect.*
import static extension org.tetrabox.example.pacman.k3dsa.PacmanAspect.*
import static extension org.tetrabox.example.pacman.k3dsa.TileAspect.*
import static extension org.tetrabox.example.pacman.k3dsa.GhostAspect.*

@Aspect(className=Board)
class BoardAspect {
	
	private var long elapsedTime
	
	private var long previousTime
	
	private val long targetFps = 30
	
	private val long targetFrameRate = 1000000000l / targetFps
	
	private var long modeChangeTimer = 5000000000l
	
	private var boolean scatterMode = true
	
	private var long frightenedTimer = 0l
	
	private var int totalPellets
	
	@InitializeModel
	@Step
	def void initializeModel(EList<String> args) {
		_self.tiles.forEach[initialize]
		_self.entities.forEach[initialize]
		_self.totalPellets = _self.tiles.filter[it instanceof Tile && (it as Tile).pellet != null].length
	}
	
	@Step
	def void reset() {
		_self.entities.forEach[reset]
	}
	
	@Main
	def void run() {
		var pacmanAlive = _self.entities.exists[it instanceof Pacman && (it as Pacman).lives > 0]
		var pelletsRemaining = _self.tiles.filter[it instanceof Tile]
				.map[it as Tile].exists[pellet != null]
		_self.previousTime = System.nanoTime
		while(pacmanAlive && pelletsRemaining) {
			val currentTime = System.nanoTime
			val deltaTime = currentTime - _self.previousTime
			_self.previousTime = currentTime
			_self.update(deltaTime)
			pacmanAlive = _self.entities.exists[it instanceof Pacman && (it as Pacman).lives > 0]
			pelletsRemaining = _self.tiles.filter[it instanceof Tile]
					.map[it as Tile].exists[pellet != null]
			if (deltaTime < _self.targetFrameRate) {
				val waitTime = _self.targetFrameRate - deltaTime
				val long millis = waitTime / 1000000
				val int nanos = (waitTime % 1000000) as int
				Thread.sleep(millis, nanos)
			}
		}
	}
	
	@Step
	def void update(long deltaTime) {
		_self.elapsedTime = _self.elapsedTime + deltaTime
		val totalPellets = _self.totalPellets
		val remainingPellets = _self.tiles.filter[it instanceof Tile && (it as Tile).pellet != null].length
		val blueMilestoneReached = remainingPellets == totalPellets - totalPellets / 8
		val orangeMilestoneReached = remainingPellets == totalPellets - totalPellets / 3
		val frightenedTimer = _self.frightenedTimer
		var modeChangeTimer = _self.modeChangeTimer
		var modeChangeNeeded = false
		if (frightenedTimer > 0) {
			if (frightenedTimer > deltaTime) {
				_self.frightenedTimer = frightenedTimer - deltaTime
			} else {
				val remainingDeltaTime = deltaTime - frightenedTimer
				_self.frightenedTimer = 0
				_self.entities.filter[it instanceof Ghost].map[it as Ghost].forEach[switchFrightenedMode]
				modeChangeTimer = modeChangeTimer - remainingDeltaTime
				if (modeChangeTimer <= remainingDeltaTime) {
					modeChangeNeeded = true
				}
			}
		} else {
			modeChangeTimer = modeChangeTimer - deltaTime
			if (modeChangeTimer <= deltaTime) {
				modeChangeNeeded = true
			}
		}
		if (modeChangeNeeded) {
			if (_self.scatterMode) {
				_self.entities.filter[it instanceof Ghost].map[it as Ghost].forEach[enterChaseMode]
				_self.scatterMode = false
				modeChangeTimer += 20000000000l
			} else {
				_self.entities.filter[it instanceof Ghost].map[it as Ghost].forEach[enterScatterMode]
				_self.scatterMode = true
				modeChangeTimer += 5000000000l
			}
		}
		_self.modeChangeTimer = modeChangeTimer
		_self.entities.filter[it instanceof Ghost].forEach[
			val ghost = it as Ghost
			if (ghost.personnality == GhostPersonality.SHADOW) {
				if ((_self.elapsedTime >= 10000000000l && ghost.speed == 100) ||
						(_self.elapsedTime >= 20000000000l && ghost.speed == 105)
				) {
					ghost.modifySpeed(5)
				}
			}
			if (blueMilestoneReached && ghost.personnality == GhostPersonality.BASHFUL) {
				ghost.activate
			} else if (orangeMilestoneReached && ghost.personnality == GhostPersonality.POKEY) {
				ghost.activate
			}
			ghost.update(deltaTime)
		]
		_self.entities.filter[it instanceof Pacman].forEach[update(deltaTime)]
	}
	
	@Step
	def void enterFrightenedMode() {
		if (_self.frightenedTimer == 0) {
			_self.entities.filter[it instanceof Ghost].map[it as Ghost].forEach[switchFrightenedMode]
		}
		_self.frightenedTimer = 10000000000l
	}
}
