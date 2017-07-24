/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.pacman.xpacman.pacman.Ghost;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ghost Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class GhostPropertyImpl<T extends Ghost> extends EntityPropertyImpl<T> implements GhostProperty<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GhostPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPacmanPropertyPackage.Literals.GHOST_PROPERTY;
	}

} //GhostPropertyImpl
