/**
 */
package org.tetrabox.example.pacman.xpacman.event.XPacmanEvent;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.gemoc.event.commons.model.scenario.ScenarioPackage;

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
 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.XPacmanEventFactory
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
	XPacmanEventPackage eINSTANCE = org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.XPacmanEventPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.XPacmanDSLEventImpl <em>XPacman DSL Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.XPacmanDSLEventImpl
	 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.XPacmanEventPackageImpl#getXPacmanDSLEvent()
	 * @generated
	 */
	int XPACMAN_DSL_EVENT = 0;

	/**
	 * The number of structural features of the '<em>XPacman DSL Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_DSL_EVENT_FEATURE_COUNT = ScenarioPackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.PacmanEventImpl <em>Pacman Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.PacmanEventImpl
	 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.XPacmanEventPackageImpl#getPacmanEvent()
	 * @generated
	 */
	int PACMAN_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Pacman</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_EVENT__PACMAN = XPACMAN_DSL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pacman Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_EVENT_FEATURE_COUNT = XPACMAN_DSL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.PacmanDownEventImpl <em>Pacman Down Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.PacmanDownEventImpl
	 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.XPacmanEventPackageImpl#getPacmanDownEvent()
	 * @generated
	 */
	int PACMAN_DOWN_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Pacman</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_DOWN_EVENT__PACMAN = PACMAN_EVENT__PACMAN;

	/**
	 * The number of structural features of the '<em>Pacman Down Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_DOWN_EVENT_FEATURE_COUNT = PACMAN_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.PacmanLeftEventImpl <em>Pacman Left Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.PacmanLeftEventImpl
	 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.XPacmanEventPackageImpl#getPacmanLeftEvent()
	 * @generated
	 */
	int PACMAN_LEFT_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Pacman</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_LEFT_EVENT__PACMAN = PACMAN_EVENT__PACMAN;

	/**
	 * The number of structural features of the '<em>Pacman Left Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_LEFT_EVENT_FEATURE_COUNT = PACMAN_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.PacmanRightEventImpl <em>Pacman Right Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.PacmanRightEventImpl
	 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.XPacmanEventPackageImpl#getPacmanRightEvent()
	 * @generated
	 */
	int PACMAN_RIGHT_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Pacman</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_RIGHT_EVENT__PACMAN = PACMAN_EVENT__PACMAN;

	/**
	 * The number of structural features of the '<em>Pacman Right Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_RIGHT_EVENT_FEATURE_COUNT = PACMAN_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.PacmanUpEventImpl <em>Pacman Up Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.PacmanUpEventImpl
	 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.XPacmanEventPackageImpl#getPacmanUpEvent()
	 * @generated
	 */
	int PACMAN_UP_EVENT = 5;

	/**
	 * The feature id for the '<em><b>Pacman</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_UP_EVENT__PACMAN = PACMAN_EVENT__PACMAN;

	/**
	 * The number of structural features of the '<em>Pacman Up Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_UP_EVENT_FEATURE_COUNT = PACMAN_EVENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.XPacmanDSLEvent <em>XPacman DSL Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XPacman DSL Event</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.XPacmanDSLEvent
	 * @generated
	 */
	EClass getXPacmanDSLEvent();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanEvent <em>Pacman Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Event</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanEvent
	 * @generated
	 */
	EClass getPacmanEvent();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanEvent#getPacman <em>Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pacman</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanEvent#getPacman()
	 * @see #getPacmanEvent()
	 * @generated
	 */
	EReference getPacmanEvent_Pacman();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanDownEvent <em>Pacman Down Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Down Event</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanDownEvent
	 * @generated
	 */
	EClass getPacmanDownEvent();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanLeftEvent <em>Pacman Left Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Left Event</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanLeftEvent
	 * @generated
	 */
	EClass getPacmanLeftEvent();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanRightEvent <em>Pacman Right Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Right Event</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanRightEvent
	 * @generated
	 */
	EClass getPacmanRightEvent();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanUpEvent <em>Pacman Up Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Up Event</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanUpEvent
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
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.XPacmanDSLEventImpl <em>XPacman DSL Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.XPacmanDSLEventImpl
		 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.XPacmanEventPackageImpl#getXPacmanDSLEvent()
		 * @generated
		 */
		EClass XPACMAN_DSL_EVENT = eINSTANCE.getXPacmanDSLEvent();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.PacmanEventImpl <em>Pacman Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.PacmanEventImpl
		 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.XPacmanEventPackageImpl#getPacmanEvent()
		 * @generated
		 */
		EClass PACMAN_EVENT = eINSTANCE.getPacmanEvent();

		/**
		 * The meta object literal for the '<em><b>Pacman</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACMAN_EVENT__PACMAN = eINSTANCE.getPacmanEvent_Pacman();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.PacmanDownEventImpl <em>Pacman Down Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.PacmanDownEventImpl
		 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.XPacmanEventPackageImpl#getPacmanDownEvent()
		 * @generated
		 */
		EClass PACMAN_DOWN_EVENT = eINSTANCE.getPacmanDownEvent();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.PacmanLeftEventImpl <em>Pacman Left Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.PacmanLeftEventImpl
		 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.XPacmanEventPackageImpl#getPacmanLeftEvent()
		 * @generated
		 */
		EClass PACMAN_LEFT_EVENT = eINSTANCE.getPacmanLeftEvent();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.PacmanRightEventImpl <em>Pacman Right Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.PacmanRightEventImpl
		 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.XPacmanEventPackageImpl#getPacmanRightEvent()
		 * @generated
		 */
		EClass PACMAN_RIGHT_EVENT = eINSTANCE.getPacmanRightEvent();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.PacmanUpEventImpl <em>Pacman Up Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.PacmanUpEventImpl
		 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.XPacmanEventPackageImpl#getPacmanUpEvent()
		 * @generated
		 */
		EClass PACMAN_UP_EVENT = eINSTANCE.getPacmanUpEvent();

	}

} //XPacmanEventPackage
