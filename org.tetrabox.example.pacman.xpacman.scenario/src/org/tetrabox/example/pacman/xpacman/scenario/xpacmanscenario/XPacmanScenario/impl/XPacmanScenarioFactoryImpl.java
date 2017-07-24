/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XPacmanScenarioFactoryImpl extends EFactoryImpl implements XPacmanScenarioFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XPacmanScenarioFactory init() {
		try {
			XPacmanScenarioFactory theXPacmanScenarioFactory = (XPacmanScenarioFactory)EPackage.Registry.INSTANCE.getEFactory(XPacmanScenarioPackage.eNS_URI);
			if (theXPacmanScenarioFactory != null) {
				return theXPacmanScenarioFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XPacmanScenarioFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanScenarioFactoryImpl() {
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
			case XPacmanScenarioPackage.XPACMAN_SCENARIO: return createXPacmanScenario();
			case XPacmanScenarioPackage.XPACMAN_EVENT_OCCURRENCE: return createXPacmanEventOccurrence();
			case XPacmanScenarioPackage.XPACMAN_SCENARIO_FSM: return createXPacmanScenarioFSM();
			case XPacmanScenarioPackage.XPACMAN_SCENARIO_FSM_STATE: return createXPacmanScenarioFSMState();
			case XPacmanScenarioPackage.XPACMAN_SCENARIO_FSM_TRANSITION: return createXPacmanScenarioFSMTransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanScenario createXPacmanScenario() {
		XPacmanScenarioImpl xPacmanScenario = new XPacmanScenarioImpl();
		return xPacmanScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanEventOccurrence createXPacmanEventOccurrence() {
		XPacmanEventOccurrenceImpl xPacmanEventOccurrence = new XPacmanEventOccurrenceImpl();
		return xPacmanEventOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanScenarioFSM createXPacmanScenarioFSM() {
		XPacmanScenarioFSMImpl xPacmanScenarioFSM = new XPacmanScenarioFSMImpl();
		return xPacmanScenarioFSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanScenarioFSMState createXPacmanScenarioFSMState() {
		XPacmanScenarioFSMStateImpl xPacmanScenarioFSMState = new XPacmanScenarioFSMStateImpl();
		return xPacmanScenarioFSMState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanScenarioFSMTransition createXPacmanScenarioFSMTransition() {
		XPacmanScenarioFSMTransitionImpl xPacmanScenarioFSMTransition = new XPacmanScenarioFSMTransitionImpl();
		return xPacmanScenarioFSMTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanScenarioPackage getXPacmanScenarioPackage() {
		return (XPacmanScenarioPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XPacmanScenarioPackage getPackage() {
		return XPacmanScenarioPackage.eINSTANCE;
	}

} //XPacmanScenarioFactoryImpl
