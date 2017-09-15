package org.tetrabox.example.pacman.xpacman.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect;
import org.tetrabox.example.pacman.xpacman.aspects.PelletAspectPelletAspectProperties;
import org.tetrabox.example.pacman.xpacman.pacman.Pacman;
import org.tetrabox.example.pacman.xpacman.pacman.Pellet;

@Aspect(className = Pellet.class)
@SuppressWarnings("all")
public class PelletAspect {
  @Step
  public static void eat(final Pellet _self, final Pacman pacman) {
	final org.tetrabox.example.pacman.xpacman.aspects.PelletAspectPelletAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.PelletAspectPelletAspectContext
			.getSelf(_self);
	if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.SuperPellet) {
		org.tetrabox.example.pacman.xpacman.aspects.SuperPelletAspect
				.eat((org.tetrabox.example.pacman.xpacman.pacman.SuperPellet) _self, pacman);
	} else if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Pellet) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.tetrabox.example.pacman.xpacman.aspects.PelletAspect._privk3_eat(_self_,
						(org.tetrabox.example.pacman.xpacman.pacman.Pellet) _self, pacman);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "Pellet", "eat");
		} else {
			command.execute();
		}
		;
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  protected static void _privk3_eat(final PelletAspectPelletAspectProperties _self_, final Pellet _self, final Pacman pacman) {
    int _pelletsEaten = PacmanAspect.pelletsEaten(pacman);
    int _plus = (_pelletsEaten + 1);
    PacmanAspect.pelletsEaten(pacman, _plus);
  }
}
