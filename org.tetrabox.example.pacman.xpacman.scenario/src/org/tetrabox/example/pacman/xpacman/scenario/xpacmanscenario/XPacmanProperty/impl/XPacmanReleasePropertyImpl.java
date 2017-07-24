/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl;

import fr.inria.diverse.event.commons.model.property.impl.ReleasePropertyImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanAbstractProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyPackage;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanReleaseProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XPacman Release Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XPacmanReleasePropertyImpl extends ReleasePropertyImpl<XPacmanAbstractProperty> implements XPacmanReleaseProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XPacmanReleasePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPacmanPropertyPackage.Literals.XPACMAN_RELEASE_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetLeftFormula(XPacmanAbstractProperty newLeftFormula, NotificationChain msgs) {
		return super.basicSetLeftFormula(newLeftFormula, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetRightFormula(XPacmanAbstractProperty newRightFormula, NotificationChain msgs) {
		return super.basicSetRightFormula(newRightFormula, msgs);
	}

} //XPacmanReleasePropertyImpl
