package org.tetrabox.example.pacman.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.melange.annotation.Containment
import pacman.AbstractTile
import pacman.Pacman
import pacman.PacmanFactory
import pacman.Pellet
import pacman.Tile

import static extension org.tetrabox.example.pacman.k3dsa.PelletAspect.*

@Aspect(className=AbstractTile)
class AbstractTileAspect {
	def void initialize() {
	}
}

@Aspect(className=Tile)
class TileAspect extends AbstractTileAspect {
	
	@Containment
	public var Pellet pellet
	
	@OverrideAspectMethod
	def void initialize() {
		switch (_self.initialPellet) {
			case PELLET: {
				_self.pellet = PacmanFactory.eINSTANCE.createPellet
			}
			case SUPER_PELLET: {
				_self.pellet = PacmanFactory.eINSTANCE.createSuperPellet
			}
			default: {
			}
		}
	}
	
	@Step
	def void eatPellet(Pacman pacman) {
		if (_self.pellet !== null) {
			_self.pellet.eat(pacman)
			_self.pellet = null
		}
	}
}
