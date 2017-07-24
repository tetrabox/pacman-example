/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl;

import fr.inria.diverse.event.commons.model.scenario.impl.ElementReferenceImpl;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.pacman.xpacman.pacman.Ghost;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.GhostReference;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.XPacmanProviderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ghost Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GhostReferenceImpl extends ElementReferenceImpl<Ghost> implements GhostReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GhostReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPacmanProviderPackage.Literals.GHOST_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setElement(Ghost newElement) {
		super.setElement(newElement);
	}

} //GhostReferenceImpl
