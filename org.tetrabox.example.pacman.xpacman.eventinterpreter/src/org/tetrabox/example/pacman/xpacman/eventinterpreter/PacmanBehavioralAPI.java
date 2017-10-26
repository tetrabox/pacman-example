package org.tetrabox.example.pacman.xpacman.eventinterpreter;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.gemoc.executionframework.event.manager.IBehavioralAPI;
import org.eclipse.gemoc.executionframework.event.model.event.Event;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect;
import org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanDownEvent;
import org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanLeftEvent;
import org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanRightEvent;
import org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanUpEvent;
import org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmaneventPackage;
import org.tetrabox.example.pacman.xpacman.pacman.Pacman;

public class PacmanBehavioralAPI implements IBehavioralAPI {

	@Override
	public boolean canSendEvent(Event _event) {
		if (_event instanceof PacmanLeftEvent) {
			return true;
		} else
		if (_event instanceof PacmanDownEvent) {
			return true;
		} else
		if (_event instanceof PacmanRightEvent) {
			return true;
		} else
		if (_event instanceof PacmanUpEvent) {
			return true;
		}
		return false;
	}
	
	@Override
	public Set<EClass> getEventClasses() {
		final Set<EClass> eventClasses = new HashSet<>();
		eventClasses.add(PacmaneventPackage.eINSTANCE.getPacmanLeftEvent());
		eventClasses.add(PacmaneventPackage.eINSTANCE.getPacmanDownEvent());
		eventClasses.add(PacmaneventPackage.eINSTANCE.getPacmanRightEvent());
		eventClasses.add(PacmaneventPackage.eINSTANCE.getPacmanUpEvent());
		return eventClasses;
	}
	
	@Override
	public void dispatchEvent(Event _event) {
		if (_event instanceof PacmanLeftEvent) {
			handlePacmanLeftEvent((PacmanLeftEvent) _event);
		} else
		if (_event instanceof PacmanDownEvent) {
			handlePacmanDownEvent((PacmanDownEvent) _event);
		} else
		if (_event instanceof PacmanRightEvent) {
			handlePacmanRightEvent((PacmanRightEvent) _event);
		} else
		if (_event instanceof PacmanUpEvent) {
			handlePacmanUpEvent((PacmanUpEvent) _event);
		}
	}
	
	private void handlePacmanLeftEvent(PacmanLeftEvent _event) {
		final Pacman pacman = _event.getPacman();
		PacmanAspect.left(pacman);
	}
	
	private void handlePacmanDownEvent(PacmanDownEvent _event) {
		final Pacman pacman = _event.getPacman();
		PacmanAspect.down(pacman);
	}
	
	private void handlePacmanRightEvent(PacmanRightEvent _event) {
		final Pacman pacman = _event.getPacman();
		PacmanAspect.right(pacman);
	}
	
	private void handlePacmanUpEvent(PacmanUpEvent _event) {
		final Pacman pacman = _event.getPacman();
		PacmanAspect.up(pacman);
	}
	
	@Override
	public void stepExecuted(IExecutionEngine engine, Step<?> stepExecuted) {
		final EOperation op = stepExecuted.getMseoccurrence().getMse().getAction();
		System.out.println(op.getName());
		for (EParameter param : op.getEParameters()) {
			System.out.println("  " + param.getName() + ": " + param.getEType().getName());
		}
		System.out.println();
	}
	
}
