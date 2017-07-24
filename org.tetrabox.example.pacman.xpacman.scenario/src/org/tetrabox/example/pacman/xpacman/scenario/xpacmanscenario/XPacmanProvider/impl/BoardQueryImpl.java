/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl;

import fr.inria.diverse.event.commons.model.property.StateProperty;

import fr.inria.diverse.event.commons.model.scenario.impl.ElementQueryImpl;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.pacman.xpacman.pacman.Board;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.BoardQuery;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.XPacmanProviderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Board Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BoardQueryImpl extends ElementQueryImpl<Board, StateProperty<Board>> implements BoardQuery {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoardQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPacmanProviderPackage.Literals.BOARD_QUERY;
	}

} //BoardQueryImpl
