/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.pacman.xpacman.pacman.Board;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Board Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class BoardPropertyImpl<T extends Board> extends XPacmanStatePropertyImpl<T> implements BoardProperty<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoardPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPacmanPropertyPackage.Literals.BOARD_PROPERTY;
	}

} //BoardPropertyImpl
