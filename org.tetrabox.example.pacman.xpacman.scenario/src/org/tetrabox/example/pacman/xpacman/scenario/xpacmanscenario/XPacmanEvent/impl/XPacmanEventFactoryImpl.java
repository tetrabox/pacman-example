/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XPacmanEventFactoryImpl extends EFactoryImpl implements XPacmanEventFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XPacmanEventFactory init() {
		try {
			XPacmanEventFactory theXPacmanEventFactory = (XPacmanEventFactory)EPackage.Registry.INSTANCE.getEFactory(XPacmanEventPackage.eNS_URI);
			if (theXPacmanEventFactory != null) {
				return theXPacmanEventFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XPacmanEventFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanEventFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XPacmanEventPackage.PACMAN_DOWN_EVENT: return createPacmanDownEvent();
			case XPacmanEventPackage.PACMAN_LEFT_EVENT: return createPacmanLeftEvent();
			case XPacmanEventPackage.PACMAN_RIGHT_EVENT: return createPacmanRightEvent();
			case XPacmanEventPackage.PACMAN_UP_EVENT: return createPacmanUpEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanDownEvent createPacmanDownEvent() {
		PacmanDownEventImpl pacmanDownEvent = new PacmanDownEventImpl();
		return pacmanDownEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanLeftEvent createPacmanLeftEvent() {
		PacmanLeftEventImpl pacmanLeftEvent = new PacmanLeftEventImpl();
		return pacmanLeftEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanRightEvent createPacmanRightEvent() {
		PacmanRightEventImpl pacmanRightEvent = new PacmanRightEventImpl();
		return pacmanRightEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanUpEvent createPacmanUpEvent() {
		PacmanUpEventImpl pacmanUpEvent = new PacmanUpEventImpl();
		return pacmanUpEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanEventPackage getXPacmanEventPackage() {
		return (XPacmanEventPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XPacmanEventPackage getPackage() {
		return XPacmanEventPackage.eINSTANCE;
	}

} //XPacmanEventFactoryImpl
