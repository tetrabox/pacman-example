/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl;

import fr.inria.diverse.event.commons.model.scenario.impl.EventImpl;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.XPacmanEvent;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.XPacmanEventPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XPacman Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class XPacmanEventImpl<T> extends EventImpl<T> implements XPacmanEvent<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XPacmanEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPacmanEventPackage.Literals.XPACMAN_EVENT;
	}

} //XPacmanEventImpl
