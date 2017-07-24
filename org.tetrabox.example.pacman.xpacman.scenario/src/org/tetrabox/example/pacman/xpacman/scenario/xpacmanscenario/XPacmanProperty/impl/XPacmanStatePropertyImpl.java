/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl;

import fr.inria.diverse.event.commons.model.property.impl.StatePropertyImpl;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyPackage;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanStateProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XPacman State Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class XPacmanStatePropertyImpl<T> extends StatePropertyImpl<T> implements XPacmanStateProperty<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XPacmanStatePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPacmanPropertyPackage.Literals.XPACMAN_STATE_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setTarget(T newTarget) {
		super.setTarget(newTarget);
	}

} //XPacmanStatePropertyImpl
