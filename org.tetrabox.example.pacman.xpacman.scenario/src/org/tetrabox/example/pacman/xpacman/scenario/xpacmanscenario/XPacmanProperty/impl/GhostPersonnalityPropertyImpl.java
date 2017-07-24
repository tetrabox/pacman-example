/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.tetrabox.example.pacman.xpacman.pacman.Ghost;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostPersonnalityProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ghost Personnality Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GhostPersonnalityPropertyImpl extends GhostPropertyImpl<Ghost> implements GhostPersonnalityProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GhostPersonnalityPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPacmanPropertyPackage.Literals.GHOST_PERSONNALITY_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getFeature() {
		return org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage.Literals.GHOST__PERSONNALITY;
	}

} //GhostPersonnalityPropertyImpl
