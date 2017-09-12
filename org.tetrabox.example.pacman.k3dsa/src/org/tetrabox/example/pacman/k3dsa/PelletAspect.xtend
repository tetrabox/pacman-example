package org.tetrabox.example.pacman.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import pacman.Pacman
import pacman.Pellet
import pacman.SuperPellet

import static extension org.tetrabox.example.pacman.k3dsa.PacmanAspect.*

@Aspect(className=Pellet)
class PelletAspect {
	@Step
	def void eat(Pacman pacman) {
		pacman.pelletsEaten = pacman.pelletsEaten + 1
	}
}

@Aspect(className=SuperPellet)
class SuperPelletAspect extends PelletAspect {
	
	@Step
	@OverrideAspectMethod
	def void eat(Pacman pacman) {
		_self.super_eat(pacman)
		pacman.energize
	}
}
