package org.tetrabox.example.pacman.xpacman.eventmanager;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gemoc.event.commons.interpreter.IBehavioralAPI;
import org.eclipse.gemoc.event.commons.interpreter.EventInstance;
import org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect;
import org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.XPacmanEventPackage;
import org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanUpEvent;
import org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanDownEvent;
import org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanLeftEvent;
import org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanRightEvent;
import org.tetrabox.example.pacman.xpacman.pacman.Pacman;

public class XPacmanBehavioralAPI implements IBehavioralAPI {

	@Override
	public boolean canSendEvent(EventInstance event) {
		if (event.getOriginalEvent() instanceof PacmanUpEvent) {
			return true;
		} else
		if (event.getOriginalEvent() instanceof PacmanDownEvent) {
			return true;
		} else
		if (event.getOriginalEvent() instanceof PacmanLeftEvent) {
			return true;
		} else
		if (event.getOriginalEvent() instanceof PacmanRightEvent) {
			return true;
		}
		return false;
	}
	
	@Override
	public Set<EClass> getEventClasses() {
		final Set<EClass> eventClasses = new HashSet<>();
		eventClasses.add(XPacmanEventPackage.eINSTANCE.getPacmanUpEvent());
		eventClasses.add(XPacmanEventPackage.eINSTANCE.getPacmanDownEvent());
		eventClasses.add(XPacmanEventPackage.eINSTANCE.getPacmanLeftEvent());
		eventClasses.add(XPacmanEventPackage.eINSTANCE.getPacmanRightEvent());
		return eventClasses;
	}
	
	@Override
	public void dispatchEvent(EventInstance event) {
		if (event.getOriginalEvent() instanceof PacmanUpEvent) {
			handlePacmanUpEvent(event);
		} else
		if (event.getOriginalEvent() instanceof PacmanDownEvent) {
			handlePacmanDownEvent(event);
		} else
		if (event.getOriginalEvent() instanceof PacmanLeftEvent) {
			handlePacmanLeftEvent(event);
		} else
		if (event.getOriginalEvent() instanceof PacmanRightEvent) {
			handlePacmanRightEvent(event);
		}
	}
	
	private void handlePacmanUpEvent(EventInstance _event) {
		final Pacman pacman = (Pacman) _event.getParameters().get(_event.getOriginalEvent().eClass().getEAllStructuralFeatures().get(0));
		PacmanAspect.up(pacman);
	}
	
	private void handlePacmanDownEvent(EventInstance _event) {
		final Pacman pacman = (Pacman) _event.getParameters().get(_event.getOriginalEvent().eClass().getEAllStructuralFeatures().get(0));
		PacmanAspect.down(pacman);
	}
	
	private void handlePacmanLeftEvent(EventInstance _event) {
		final Pacman pacman = (Pacman) _event.getParameters().get(_event.getOriginalEvent().eClass().getEAllStructuralFeatures().get(0));
		PacmanAspect.left(pacman);
	}
	
	private void handlePacmanRightEvent(EventInstance _event) {
		final Pacman pacman = (Pacman) _event.getParameters().get(_event.getOriginalEvent().eClass().getEAllStructuralFeatures().get(0));
		PacmanAspect.right(pacman);
	}
	
}
