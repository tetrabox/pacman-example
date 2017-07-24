/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.pacman.xpacman.pacman.Entity;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class EntityPropertyImpl<T extends Entity> extends XPacmanStatePropertyImpl<T> implements EntityProperty<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPacmanPropertyPackage.Literals.ENTITY_PROPERTY;
	}

} //EntityPropertyImpl
