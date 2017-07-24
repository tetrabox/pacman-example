/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent;

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
 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.XPacmanEventFactory
 * @model kind="package"
 * @generated
 */
public interface XPacmanEventPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "XPacmanEvent";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.tetrabox.example.pacman.xpacman/scenario/XPacmanEvent/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "XPacmanEvent";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XPacmanEventPackage eINSTANCE = org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.XPacmanEventPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.XPacmanEventImpl <em>XPacman Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.XPacmanEventImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.XPacmanEventPackageImpl#getXPacmanEvent()
	 * @generated
	 */
	int XPACMAN_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_EVENT__TARGET_PROVIDER = ScenarioPackage.EVENT__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>XPacman Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_EVENT_FEATURE_COUNT = ScenarioPackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.PacmanDownEventImpl <em>Pacman Down Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.PacmanDownEventImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.XPacmanEventPackageImpl#getPacmanDownEvent()
	 * @generated
	 */
	int PACMAN_DOWN_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_DOWN_EVENT__TARGET_PROVIDER = XPACMAN_EVENT__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Pacman Down Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_DOWN_EVENT_FEATURE_COUNT = XPACMAN_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.PacmanLeftEventImpl <em>Pacman Left Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.PacmanLeftEventImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.XPacmanEventPackageImpl#getPacmanLeftEvent()
	 * @generated
	 */
	int PACMAN_LEFT_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_LEFT_EVENT__TARGET_PROVIDER = XPACMAN_EVENT__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Pacman Left Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_LEFT_EVENT_FEATURE_COUNT = XPACMAN_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.PacmanRightEventImpl <em>Pacman Right Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.PacmanRightEventImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.XPacmanEventPackageImpl#getPacmanRightEvent()
	 * @generated
	 */
	int PACMAN_RIGHT_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_RIGHT_EVENT__TARGET_PROVIDER = XPACMAN_EVENT__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Pacman Right Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_RIGHT_EVENT_FEATURE_COUNT = XPACMAN_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.PacmanUpEventImpl <em>Pacman Up Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.PacmanUpEventImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.XPacmanEventPackageImpl#getPacmanUpEvent()
	 * @generated
	 */
	int PACMAN_UP_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_UP_EVENT__TARGET_PROVIDER = XPACMAN_EVENT__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Pacman Up Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_UP_EVENT_FEATURE_COUNT = XPACMAN_EVENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.XPacmanEvent <em>XPacman Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XPacman Event</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.XPacmanEvent
	 * @generated
	 */
	EClass getXPacmanEvent();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.PacmanDownEvent <em>Pacman Down Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Down Event</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.PacmanDownEvent
	 * @generated
	 */
	EClass getPacmanDownEvent();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.PacmanLeftEvent <em>Pacman Left Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Left Event</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.PacmanLeftEvent
	 * @generated
	 */
	EClass getPacmanLeftEvent();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.PacmanRightEvent <em>Pacman Right Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Right Event</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.PacmanRightEvent
	 * @generated
	 */
	EClass getPacmanRightEvent();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.PacmanUpEvent <em>Pacman Up Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Up Event</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.PacmanUpEvent
	 * @generated
	 */
	EClass getPacmanUpEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XPacmanEventFactory getXPacmanEventFactory();

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
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.XPacmanEventImpl <em>XPacman Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.XPacmanEventImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.XPacmanEventPackageImpl#getXPacmanEvent()
		 * @generated
		 */
		EClass XPACMAN_EVENT = eINSTANCE.getXPacmanEvent();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.PacmanDownEventImpl <em>Pacman Down Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.PacmanDownEventImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.XPacmanEventPackageImpl#getPacmanDownEvent()
		 * @generated
		 */
		EClass PACMAN_DOWN_EVENT = eINSTANCE.getPacmanDownEvent();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.PacmanLeftEventImpl <em>Pacman Left Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.PacmanLeftEventImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.XPacmanEventPackageImpl#getPacmanLeftEvent()
		 * @generated
		 */
		EClass PACMAN_LEFT_EVENT = eINSTANCE.getPacmanLeftEvent();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.PacmanRightEventImpl <em>Pacman Right Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.PacmanRightEventImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.XPacmanEventPackageImpl#getPacmanRightEvent()
		 * @generated
		 */
		EClass PACMAN_RIGHT_EVENT = eINSTANCE.getPacmanRightEvent();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.PacmanUpEventImpl <em>Pacman Up Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.PacmanUpEventImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.XPacmanEventPackageImpl#getPacmanUpEvent()
		 * @generated
		 */
		EClass PACMAN_UP_EVENT = eINSTANCE.getPacmanUpEvent();

	}

} //XPacmanEventPackage
