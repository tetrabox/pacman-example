/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl;

import fr.inria.diverse.event.commons.model.scenario.impl.ElementReferenceImpl;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.pacman.xpacman.pacman.Board;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.BoardReference;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.XPacmanProviderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Board Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BoardReferenceImpl extends ElementReferenceImpl<Board> implements BoardReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoardReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPacmanProviderPackage.Literals.BOARD_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setElement(Board newElement) {
		super.setElement(newElement);
	}

} //BoardReferenceImpl
