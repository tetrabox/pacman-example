/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl;

import fr.inria.diverse.event.commons.model.scenario.impl.ElementProviderImpl;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.pacman.xpacman.pacman.Board;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.BoardProvider;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.XPacmanProviderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Board Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class BoardProviderImpl extends ElementProviderImpl<Board> implements BoardProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoardProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPacmanProviderPackage.Literals.BOARD_PROVIDER;
	}

} //BoardProviderImpl
