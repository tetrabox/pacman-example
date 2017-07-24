/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XPacmanArbiterFactoryImpl extends EFactoryImpl implements XPacmanArbiterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XPacmanArbiterFactory init() {
		try {
			XPacmanArbiterFactory theXPacmanArbiterFactory = (XPacmanArbiterFactory)EPackage.Registry.INSTANCE.getEFactory(XPacmanArbiterPackage.eNS_URI);
			if (theXPacmanArbiterFactory != null) {
				return theXPacmanArbiterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XPacmanArbiterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanArbiterFactoryImpl() {
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
			case XPacmanArbiterPackage.XPACMAN_ARBITER: return createXPacmanArbiter();
			case XPacmanArbiterPackage.XPACMAN_ARBITER_STATE: return createXPacmanArbiterState();
			case XPacmanArbiterPackage.XPACMAN_ARBITER_TRANSITION: return createXPacmanArbiterTransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanArbiter createXPacmanArbiter() {
		XPacmanArbiterImpl xPacmanArbiter = new XPacmanArbiterImpl();
		return xPacmanArbiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanArbiterState createXPacmanArbiterState() {
		XPacmanArbiterStateImpl xPacmanArbiterState = new XPacmanArbiterStateImpl();
		return xPacmanArbiterState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanArbiterTransition createXPacmanArbiterTransition() {
		XPacmanArbiterTransitionImpl xPacmanArbiterTransition = new XPacmanArbiterTransitionImpl();
		return xPacmanArbiterTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanArbiterPackage getXPacmanArbiterPackage() {
		return (XPacmanArbiterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XPacmanArbiterPackage getPackage() {
		return XPacmanArbiterPackage.eINSTANCE;
	}

} //XPacmanArbiterFactoryImpl
