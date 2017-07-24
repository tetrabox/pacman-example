package org.tetrabox.example.pacman.xpacman.eventmanager;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect;
import org.tetrabox.example.pacman.xpacman.pacman.Pacman;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.PacmanDownEvent;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.PacmanLeftEvent;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.PacmanRightEvent;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.PacmanUpEvent;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.XPacmanEventPackage;

import fr.inria.diverse.event.commons.interpreter.event.AbstractEventManager;
import fr.inria.diverse.event.commons.model.EventInstance;
import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;

public class XPacmanEventManager extends AbstractEventManager {

	@Override
	public boolean canSendEvent(Object input) {
		if (input instanceof EventInstance) {
			final EventInstance event = (EventInstance) input;
			if (event.getOriginalEvent() instanceof PacmanUpEvent) {
				return true;
			} else
			if (event.getOriginalEvent() instanceof PacmanRightEvent) {
				return true;
			} else
			if (event.getOriginalEvent() instanceof PacmanDownEvent) {
				return true;
			} else
			if (event.getOriginalEvent() instanceof PacmanLeftEvent) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public Set<EClass> getEventClasses() {
		final Set<EClass> eventClasses = new HashSet<>();
		eventClasses.add(XPacmanEventPackage.eINSTANCE.getPacmanUpEvent());
		eventClasses.add(XPacmanEventPackage.eINSTANCE.getPacmanRightEvent());
		eventClasses.add(XPacmanEventPackage.eINSTANCE.getPacmanDownEvent());
		eventClasses.add(XPacmanEventPackage.eINSTANCE.getPacmanLeftEvent());
		return eventClasses;
	}
	
	@Override
	protected void dispatchEvent(EventInstance event) {
		if (event.getOriginalEvent() instanceof PacmanUpEvent) {
			handlePacmanUpEvent(event);
		} else
		if (event.getOriginalEvent() instanceof PacmanRightEvent) {
			handlePacmanRightEvent(event);
		} else
		if (event.getOriginalEvent() instanceof PacmanDownEvent) {
			handlePacmanDownEvent(event);
		} else
		if (event.getOriginalEvent() instanceof PacmanLeftEvent) {
			handlePacmanLeftEvent(event);
		}
	}
	
	private void handlePacmanUpEvent(EventInstance _event) {
		final Pacman target = (Pacman) _event.getParameters().get(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER);
		PacmanAspect.up(target);
	}
	
	private void handlePacmanRightEvent(EventInstance _event) {
		final Pacman target = (Pacman) _event.getParameters().get(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER);
		PacmanAspect.right(target);
	}
	
	private void handlePacmanDownEvent(EventInstance _event) {
		final Pacman target = (Pacman) _event.getParameters().get(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER);
		PacmanAspect.down(target);
	}
	
	private void handlePacmanLeftEvent(EventInstance _event) {
		final Pacman target = (Pacman) _event.getParameters().get(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER);
		PacmanAspect.left(target);
	}
	
	@Override
	protected EventInstance rebuildEvent(Object result, Object caller, String className, String methodName) {
		return null;
	}
}
