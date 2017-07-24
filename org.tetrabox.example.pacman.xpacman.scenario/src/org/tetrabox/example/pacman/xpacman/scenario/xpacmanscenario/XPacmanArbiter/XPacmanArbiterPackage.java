/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter;

import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiterFactory
 * @model kind="package"
 * @generated
 */
public interface XPacmanArbiterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "XPacmanArbiter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.tetrabox.example.pacman.xpacman/scenario/XPacmanArbiter/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "XPacmanArbiter";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XPacmanArbiterPackage eINSTANCE = org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.impl.XPacmanArbiterPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.impl.XPacmanArbiterImpl <em>XPacman Arbiter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.impl.XPacmanArbiterImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.impl.XPacmanArbiterPackageImpl#getXPacmanArbiter()
	 * @generated
	 */
	int XPACMAN_ARBITER = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_ARBITER__STATES = ScenarioPackage.ARBITER__STATES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_ARBITER__TRANSITIONS = ScenarioPackage.ARBITER__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_ARBITER__INITIAL_STATE = ScenarioPackage.ARBITER__INITIAL_STATE;

	/**
	 * The feature id for the '<em><b>Accepting States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_ARBITER__ACCEPTING_STATES = ScenarioPackage.ARBITER__ACCEPTING_STATES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_ARBITER__NAME = ScenarioPackage.ARBITER__NAME;

	/**
	 * The number of structural features of the '<em>XPacman Arbiter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_ARBITER_FEATURE_COUNT = ScenarioPackage.ARBITER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.impl.XPacmanArbiterStateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.impl.XPacmanArbiterStateImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.impl.XPacmanArbiterPackageImpl#getXPacmanArbiterState()
	 * @generated
	 */
	int XPACMAN_ARBITER_STATE = 1;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_ARBITER_STATE__INCOMING_TRANSITIONS = ScenarioPackage.ARBITER_STATE__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_ARBITER_STATE__OUTGOING_TRANSITIONS = ScenarioPackage.ARBITER_STATE__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Truth Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_ARBITER_STATE__TRUTH_VALUE = ScenarioPackage.ARBITER_STATE__TRUTH_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_ARBITER_STATE__NAME = ScenarioPackage.ARBITER_STATE__NAME;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_ARBITER_STATE_FEATURE_COUNT = ScenarioPackage.ARBITER_STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.impl.XPacmanArbiterTransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.impl.XPacmanArbiterTransitionImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.impl.XPacmanArbiterPackageImpl#getXPacmanArbiterTransition()
	 * @generated
	 */
	int XPACMAN_ARBITER_TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_ARBITER_TRANSITION__GUARD = ScenarioPackage.ARBITER_TRANSITION__GUARD;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_ARBITER_TRANSITION__SOURCE = ScenarioPackage.ARBITER_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_ARBITER_TRANSITION__TARGET = ScenarioPackage.ARBITER_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_ARBITER_TRANSITION__NAME = ScenarioPackage.ARBITER_TRANSITION__NAME;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_ARBITER_TRANSITION_FEATURE_COUNT = ScenarioPackage.ARBITER_TRANSITION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiter <em>XPacman Arbiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XPacman Arbiter</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiter
	 * @generated
	 */
	EClass getXPacmanArbiter();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiterState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiterState
	 * @generated
	 */
	EClass getXPacmanArbiterState();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiterTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiterTransition
	 * @generated
	 */
	EClass getXPacmanArbiterTransition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XPacmanArbiterFactory getXPacmanArbiterFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.impl.XPacmanArbiterImpl <em>XPacman Arbiter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.impl.XPacmanArbiterImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.impl.XPacmanArbiterPackageImpl#getXPacmanArbiter()
		 * @generated
		 */
		EClass XPACMAN_ARBITER = eINSTANCE.getXPacmanArbiter();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.impl.XPacmanArbiterStateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.impl.XPacmanArbiterStateImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.impl.XPacmanArbiterPackageImpl#getXPacmanArbiterState()
		 * @generated
		 */
		EClass XPACMAN_ARBITER_STATE = eINSTANCE.getXPacmanArbiterState();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.impl.XPacmanArbiterTransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.impl.XPacmanArbiterTransitionImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.impl.XPacmanArbiterPackageImpl#getXPacmanArbiterTransition()
		 * @generated
		 */
		EClass XPACMAN_ARBITER_TRANSITION = eINSTANCE.getXPacmanArbiterTransition();

	}

} //XPacmanArbiterPackage
