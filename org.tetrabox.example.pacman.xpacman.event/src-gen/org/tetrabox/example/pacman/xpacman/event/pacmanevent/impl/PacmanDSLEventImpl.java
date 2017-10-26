/**
 */
package org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.gemoc.executionframework.event.model.event.impl.EventImpl;

import org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanDSLEvent;
import org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmaneventPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pacman DSL Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class PacmanDSLEventImpl extends EventImpl implements PacmanDSLEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PacmanDSLEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmaneventPackage.Literals.PACMAN_DSL_EVENT;
	}

} //PacmanDSLEventImpl
