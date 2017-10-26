/**
 */
package org.tetrabox.example.pacman.xpacman.event.pacmanevent;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.gemoc.executionframework.event.model.event.EventPackage;

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
 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmaneventFactory
 * @model kind="package"
 * @generated
 */
public interface PacmaneventPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pacmanevent";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.tetrabox.example.pacman.xpacman/pacman/event/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pacmanevent";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PacmaneventPackage eINSTANCE = org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmaneventPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmanDSLEventImpl <em>Pacman DSL Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmanDSLEventImpl
	 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmaneventPackageImpl#getPacmanDSLEvent()
	 * @generated
	 */
	int PACMAN_DSL_EVENT = 0;

	/**
	 * The number of structural features of the '<em>Pacman DSL Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_DSL_EVENT_FEATURE_COUNT = EventPackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmanEventImpl <em>Pacman Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmanEventImpl
	 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmaneventPackageImpl#getPacmanEvent()
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
	int PACMAN_EVENT__PACMAN = PACMAN_DSL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pacman Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_EVENT_FEATURE_COUNT = PACMAN_DSL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmanLeftEventImpl <em>Pacman Left Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmanLeftEventImpl
	 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmaneventPackageImpl#getPacmanLeftEvent()
	 * @generated
	 */
	int PACMAN_LEFT_EVENT = 2;

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
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmanDownEventImpl <em>Pacman Down Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmanDownEventImpl
	 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmaneventPackageImpl#getPacmanDownEvent()
	 * @generated
	 */
	int PACMAN_DOWN_EVENT = 3;

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
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmanUpEventImpl <em>Pacman Up Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmanUpEventImpl
	 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmaneventPackageImpl#getPacmanUpEvent()
	 * @generated
	 */
	int PACMAN_UP_EVENT = 4;

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
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmanRightEventImpl <em>Pacman Right Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmanRightEventImpl
	 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmaneventPackageImpl#getPacmanRightEvent()
	 * @generated
	 */
	int PACMAN_RIGHT_EVENT = 5;

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
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanDSLEvent <em>Pacman DSL Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman DSL Event</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanDSLEvent
	 * @generated
	 */
	EClass getPacmanDSLEvent();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanEvent <em>Pacman Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Event</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanEvent
	 * @generated
	 */
	EClass getPacmanEvent();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanEvent#getPacman <em>Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pacman</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanEvent#getPacman()
	 * @see #getPacmanEvent()
	 * @generated
	 */
	EReference getPacmanEvent_Pacman();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanLeftEvent <em>Pacman Left Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Left Event</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanLeftEvent
	 * @generated
	 */
	EClass getPacmanLeftEvent();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanDownEvent <em>Pacman Down Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Down Event</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanDownEvent
	 * @generated
	 */
	EClass getPacmanDownEvent();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanUpEvent <em>Pacman Up Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Up Event</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanUpEvent
	 * @generated
	 */
	EClass getPacmanUpEvent();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanRightEvent <em>Pacman Right Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Right Event</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanRightEvent
	 * @generated
	 */
	EClass getPacmanRightEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PacmaneventFactory getPacmaneventFactory();

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
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmanDSLEventImpl <em>Pacman DSL Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmanDSLEventImpl
		 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmaneventPackageImpl#getPacmanDSLEvent()
		 * @generated
		 */
		EClass PACMAN_DSL_EVENT = eINSTANCE.getPacmanDSLEvent();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmanEventImpl <em>Pacman Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmanEventImpl
		 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmaneventPackageImpl#getPacmanEvent()
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
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmanLeftEventImpl <em>Pacman Left Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmanLeftEventImpl
		 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmaneventPackageImpl#getPacmanLeftEvent()
		 * @generated
		 */
		EClass PACMAN_LEFT_EVENT = eINSTANCE.getPacmanLeftEvent();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmanDownEventImpl <em>Pacman Down Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmanDownEventImpl
		 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmaneventPackageImpl#getPacmanDownEvent()
		 * @generated
		 */
		EClass PACMAN_DOWN_EVENT = eINSTANCE.getPacmanDownEvent();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmanUpEventImpl <em>Pacman Up Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmanUpEventImpl
		 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmaneventPackageImpl#getPacmanUpEvent()
		 * @generated
		 */
		EClass PACMAN_UP_EVENT = eINSTANCE.getPacmanUpEvent();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmanRightEventImpl <em>Pacman Right Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmanRightEventImpl
		 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmaneventPackageImpl#getPacmanRightEvent()
		 * @generated
		 */
		EClass PACMAN_RIGHT_EVENT = eINSTANCE.getPacmanRightEvent();

	}

} //PacmaneventPackage
