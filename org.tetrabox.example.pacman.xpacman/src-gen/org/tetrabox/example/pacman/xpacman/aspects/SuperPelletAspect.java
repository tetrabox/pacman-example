package org.tetrabox.example.pacman.xpacman.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect;
import org.tetrabox.example.pacman.xpacman.aspects.PelletAspect;
import org.tetrabox.example.pacman.xpacman.aspects.SuperPelletAspectSuperPelletAspectProperties;
import org.tetrabox.example.pacman.xpacman.pacman.Pacman;
import org.tetrabox.example.pacman.xpacman.pacman.SuperPellet;

@Aspect(className = SuperPellet.class)
@SuppressWarnings("all")
public class SuperPelletAspect extends PelletAspect {
  @Step
  @OverrideAspectMethod
  public static void eat(final SuperPellet _self, final Pacman pacman) {
	final org.tetrabox.example.pacman.xpacman.aspects.SuperPelletAspectSuperPelletAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.SuperPelletAspectSuperPelletAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_eat(_self_, _self, pacman);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "SuperPellet", "eat");
	} else {
		command.execute();
	}
	;
	;
}
  
  private static void super_eat(final SuperPellet _self, final Pacman pacman) {
    final org.tetrabox.example.pacman.xpacman.aspects.PelletAspectPelletAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.PelletAspectPelletAspectContext.getSelf(_self);
     org.tetrabox.example.pacman.xpacman.aspects.PelletAspect._privk3_eat(_self_, _self,pacman);
  }
  
  protected static void _privk3_eat(final SuperPelletAspectSuperPelletAspectProperties _self_, final SuperPellet _self, final Pacman pacman) {
    SuperPelletAspect.super_eat(_self, pacman);
    PacmanAspect.energize(pacman);
  }
}
