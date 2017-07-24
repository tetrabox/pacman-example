/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty;

import fr.inria.diverse.event.commons.model.property.PropertyPackage;

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
 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyFactory
 * @model kind="package"
 * @generated
 */
public interface XPacmanPropertyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "XPacmanProperty";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.tetrabox.example.pacman.xpacman/scenario/XPacmanProperty/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "XPacmanProperty";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XPacmanPropertyPackage eINSTANCE = org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanStepPropertyImpl <em>XPacman Step Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanStepPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getXPacmanStepProperty()
	 * @generated
	 */
	int XPACMAN_STEP_PROPERTY = 23;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_STEP_PROPERTY__STEPPING = PropertyPackage.STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_STEP_PROPERTY__TARGET_PROVIDER = PropertyPackage.STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>XPacman Step Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_STEP_PROPERTY_FEATURE_COUNT = PropertyPackage.STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanEnterNextTilePropertyImpl <em>Pacman Enter Next Tile Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanEnterNextTilePropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanEnterNextTileProperty()
	 * @generated
	 */
	int PACMAN_ENTER_NEXT_TILE_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_ENTER_NEXT_TILE_PROPERTY__STEPPING = XPACMAN_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_ENTER_NEXT_TILE_PROPERTY__TARGET_PROVIDER = XPACMAN_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Pacman Enter Next Tile Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_ENTER_NEXT_TILE_PROPERTY_FEATURE_COUNT = XPACMAN_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostEnterNextTilePropertyImpl <em>Ghost Enter Next Tile Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostEnterNextTilePropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getGhostEnterNextTileProperty()
	 * @generated
	 */
	int GHOST_ENTER_NEXT_TILE_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_ENTER_NEXT_TILE_PROPERTY__STEPPING = XPACMAN_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_ENTER_NEXT_TILE_PROPERTY__TARGET_PROVIDER = XPACMAN_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Ghost Enter Next Tile Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_ENTER_NEXT_TILE_PROPERTY_FEATURE_COUNT = XPACMAN_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityChangeDirectionPropertyImpl <em>Entity Change Direction Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityChangeDirectionPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getEntityChangeDirectionProperty()
	 * @generated
	 */
	int ENTITY_CHANGE_DIRECTION_PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CHANGE_DIRECTION_PROPERTY__STEPPING = XPACMAN_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CHANGE_DIRECTION_PROPERTY__TARGET_PROVIDER = XPACMAN_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Entity Change Direction Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CHANGE_DIRECTION_PROPERTY_FEATURE_COUNT = XPACMAN_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanLeftPropertyImpl <em>Pacman Left Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanLeftPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanLeftProperty()
	 * @generated
	 */
	int PACMAN_LEFT_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_LEFT_PROPERTY__STEPPING = XPACMAN_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_LEFT_PROPERTY__TARGET_PROVIDER = XPACMAN_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Pacman Left Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_LEFT_PROPERTY_FEATURE_COUNT = XPACMAN_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanRightPropertyImpl <em>Pacman Right Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanRightPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanRightProperty()
	 * @generated
	 */
	int PACMAN_RIGHT_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_RIGHT_PROPERTY__STEPPING = XPACMAN_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_RIGHT_PROPERTY__TARGET_PROVIDER = XPACMAN_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Pacman Right Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_RIGHT_PROPERTY_FEATURE_COUNT = XPACMAN_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanEatPelletPropertyImpl <em>Pacman Eat Pellet Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanEatPelletPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanEatPelletProperty()
	 * @generated
	 */
	int PACMAN_EAT_PELLET_PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_EAT_PELLET_PROPERTY__STEPPING = XPACMAN_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_EAT_PELLET_PROPERTY__TARGET_PROVIDER = XPACMAN_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Pacman Eat Pellet Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_EAT_PELLET_PROPERTY_FEATURE_COUNT = XPACMAN_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanUpPropertyImpl <em>Pacman Up Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanUpPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanUpProperty()
	 * @generated
	 */
	int PACMAN_UP_PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_UP_PROPERTY__STEPPING = XPACMAN_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_UP_PROPERTY__TARGET_PROVIDER = XPACMAN_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Pacman Up Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_UP_PROPERTY_FEATURE_COUNT = XPACMAN_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanInitializePropertyImpl <em>Pacman Initialize Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanInitializePropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanInitializeProperty()
	 * @generated
	 */
	int PACMAN_INITIALIZE_PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_INITIALIZE_PROPERTY__STEPPING = XPACMAN_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_INITIALIZE_PROPERTY__TARGET_PROVIDER = XPACMAN_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Pacman Initialize Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_INITIALIZE_PROPERTY_FEATURE_COUNT = XPACMAN_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityModifySpeedPropertyImpl <em>Entity Modify Speed Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityModifySpeedPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getEntityModifySpeedProperty()
	 * @generated
	 */
	int ENTITY_MODIFY_SPEED_PROPERTY = 8;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MODIFY_SPEED_PROPERTY__STEPPING = XPACMAN_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MODIFY_SPEED_PROPERTY__TARGET_PROVIDER = XPACMAN_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Entity Modify Speed Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MODIFY_SPEED_PROPERTY_FEATURE_COUNT = XPACMAN_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BoardInitializeModelPropertyImpl <em>Board Initialize Model Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BoardInitializeModelPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getBoardInitializeModelProperty()
	 * @generated
	 */
	int BOARD_INITIALIZE_MODEL_PROPERTY = 9;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_INITIALIZE_MODEL_PROPERTY__STEPPING = XPACMAN_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_INITIALIZE_MODEL_PROPERTY__TARGET_PROVIDER = XPACMAN_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Board Initialize Model Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_INITIALIZE_MODEL_PROPERTY_FEATURE_COUNT = XPACMAN_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityInitializePropertyImpl <em>Entity Initialize Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityInitializePropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getEntityInitializeProperty()
	 * @generated
	 */
	int ENTITY_INITIALIZE_PROPERTY = 10;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INITIALIZE_PROPERTY__STEPPING = XPACMAN_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INITIALIZE_PROPERTY__TARGET_PROVIDER = XPACMAN_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Entity Initialize Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INITIALIZE_PROPERTY_FEATURE_COUNT = XPACMAN_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanChangeDirectionPropertyImpl <em>Pacman Change Direction Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanChangeDirectionPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanChangeDirectionProperty()
	 * @generated
	 */
	int PACMAN_CHANGE_DIRECTION_PROPERTY = 11;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_CHANGE_DIRECTION_PROPERTY__STEPPING = XPACMAN_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_CHANGE_DIRECTION_PROPERTY__TARGET_PROVIDER = XPACMAN_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Pacman Change Direction Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_CHANGE_DIRECTION_PROPERTY_FEATURE_COUNT = XPACMAN_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityUpdatePropertyImpl <em>Entity Update Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityUpdatePropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getEntityUpdateProperty()
	 * @generated
	 */
	int ENTITY_UPDATE_PROPERTY = 12;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_UPDATE_PROPERTY__STEPPING = XPACMAN_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_UPDATE_PROPERTY__TARGET_PROVIDER = XPACMAN_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Entity Update Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_UPDATE_PROPERTY_FEATURE_COUNT = XPACMAN_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BoardResetPropertyImpl <em>Board Reset Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BoardResetPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getBoardResetProperty()
	 * @generated
	 */
	int BOARD_RESET_PROPERTY = 13;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_RESET_PROPERTY__STEPPING = XPACMAN_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_RESET_PROPERTY__TARGET_PROVIDER = XPACMAN_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Board Reset Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_RESET_PROPERTY_FEATURE_COUNT = XPACMAN_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanDownPropertyImpl <em>Pacman Down Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanDownPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanDownProperty()
	 * @generated
	 */
	int PACMAN_DOWN_PROPERTY = 14;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_DOWN_PROPERTY__STEPPING = XPACMAN_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_DOWN_PROPERTY__TARGET_PROVIDER = XPACMAN_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Pacman Down Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_DOWN_PROPERTY_FEATURE_COUNT = XPACMAN_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityEnterNextTilePropertyImpl <em>Entity Enter Next Tile Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityEnterNextTilePropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getEntityEnterNextTileProperty()
	 * @generated
	 */
	int ENTITY_ENTER_NEXT_TILE_PROPERTY = 15;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ENTER_NEXT_TILE_PROPERTY__STEPPING = XPACMAN_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ENTER_NEXT_TILE_PROPERTY__TARGET_PROVIDER = XPACMAN_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Entity Enter Next Tile Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ENTER_NEXT_TILE_PROPERTY_FEATURE_COUNT = XPACMAN_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanKillPropertyImpl <em>Pacman Kill Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanKillPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanKillProperty()
	 * @generated
	 */
	int PACMAN_KILL_PROPERTY = 16;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_KILL_PROPERTY__STEPPING = XPACMAN_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_KILL_PROPERTY__TARGET_PROVIDER = XPACMAN_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Pacman Kill Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_KILL_PROPERTY_FEATURE_COUNT = XPACMAN_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BoardUpdatePropertyImpl <em>Board Update Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BoardUpdatePropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getBoardUpdateProperty()
	 * @generated
	 */
	int BOARD_UPDATE_PROPERTY = 17;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_UPDATE_PROPERTY__STEPPING = XPACMAN_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_UPDATE_PROPERTY__TARGET_PROVIDER = XPACMAN_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Board Update Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_UPDATE_PROPERTY_FEATURE_COUNT = XPACMAN_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostChangeTargetTilePropertyImpl <em>Ghost Change Target Tile Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostChangeTargetTilePropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getGhostChangeTargetTileProperty()
	 * @generated
	 */
	int GHOST_CHANGE_TARGET_TILE_PROPERTY = 18;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_CHANGE_TARGET_TILE_PROPERTY__STEPPING = XPACMAN_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_CHANGE_TARGET_TILE_PROPERTY__TARGET_PROVIDER = XPACMAN_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Ghost Change Target Tile Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_CHANGE_TARGET_TILE_PROPERTY_FEATURE_COUNT = XPACMAN_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanAbstractPropertyImpl <em>XPacman Abstract Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanAbstractPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getXPacmanAbstractProperty()
	 * @generated
	 */
	int XPACMAN_ABSTRACT_PROPERTY = 19;

	/**
	 * The number of structural features of the '<em>XPacman Abstract Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_ABSTRACT_PROPERTY_FEATURE_COUNT = PropertyPackage.ABSTRACT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanTemporalPropertyImpl <em>XPacman Temporal Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanTemporalPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getXPacmanTemporalProperty()
	 * @generated
	 */
	int XPACMAN_TEMPORAL_PROPERTY = 20;

	/**
	 * The number of structural features of the '<em>XPacman Temporal Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_TEMPORAL_PROPERTY_FEATURE_COUNT = PropertyPackage.TEMPORAL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyImpl <em>XPacman Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getXPacmanProperty()
	 * @generated
	 */
	int XPACMAN_PROPERTY = 21;

	/**
	 * The number of structural features of the '<em>XPacman Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_PROPERTY_FEATURE_COUNT = PropertyPackage.PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanStatePropertyImpl <em>XPacman State Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanStatePropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getXPacmanStateProperty()
	 * @generated
	 */
	int XPACMAN_STATE_PROPERTY = 22;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_STATE_PROPERTY__TARGET = PropertyPackage.STATE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>XPacman State Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_STATE_PROPERTY_FEATURE_COUNT = PropertyPackage.STATE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TilePropertyImpl <em>Tile Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TilePropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getTileProperty()
	 * @generated
	 */
	int TILE_PROPERTY = 24;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_PROPERTY__TARGET = XPACMAN_STATE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Tile Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_PROPERTY_FEATURE_COUNT = XPACMAN_STATE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.UnaryTilePropertyImpl <em>Unary Tile Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.UnaryTilePropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getUnaryTileProperty()
	 * @generated
	 */
	int UNARY_TILE_PROPERTY = 25;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_TILE_PROPERTY__TARGET = TILE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_TILE_PROPERTY__OPERATOR = TILE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_TILE_PROPERTY__PROPERTY = TILE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Tile Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_TILE_PROPERTY_FEATURE_COUNT = TILE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BinaryTilePropertyImpl <em>Binary Tile Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BinaryTilePropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getBinaryTileProperty()
	 * @generated
	 */
	int BINARY_TILE_PROPERTY = 26;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TILE_PROPERTY__TARGET = TILE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TILE_PROPERTY__OPERATOR = TILE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TILE_PROPERTY__LEFT = TILE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TILE_PROPERTY__RIGHT = TILE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Tile Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TILE_PROPERTY_FEATURE_COUNT = TILE_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileTopPropertyImpl <em>Tile Top Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileTopPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getTileTopProperty()
	 * @generated
	 */
	int TILE_TOP_PROPERTY = 27;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_TOP_PROPERTY__TARGET = TILE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_TOP_PROPERTY__PROPERTY = TILE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tile Top Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_TOP_PROPERTY_FEATURE_COUNT = TILE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileRightPropertyImpl <em>Tile Right Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileRightPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getTileRightProperty()
	 * @generated
	 */
	int TILE_RIGHT_PROPERTY = 28;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_RIGHT_PROPERTY__TARGET = TILE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_RIGHT_PROPERTY__PROPERTY = TILE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tile Right Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_RIGHT_PROPERTY_FEATURE_COUNT = TILE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileBottomPropertyImpl <em>Tile Bottom Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileBottomPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getTileBottomProperty()
	 * @generated
	 */
	int TILE_BOTTOM_PROPERTY = 29;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_BOTTOM_PROPERTY__TARGET = TILE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_BOTTOM_PROPERTY__PROPERTY = TILE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tile Bottom Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_BOTTOM_PROPERTY_FEATURE_COUNT = TILE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileLeftPropertyImpl <em>Tile Left Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileLeftPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getTileLeftProperty()
	 * @generated
	 */
	int TILE_LEFT_PROPERTY = 30;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_LEFT_PROPERTY__TARGET = TILE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_LEFT_PROPERTY__PROPERTY = TILE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tile Left Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_LEFT_PROPERTY_FEATURE_COUNT = TILE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileXPropertyImpl <em>Tile XProperty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileXPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getTileXProperty()
	 * @generated
	 */
	int TILE_XPROPERTY = 31;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_XPROPERTY__TARGET = TILE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_XPROPERTY__VALUE = TILE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_XPROPERTY__OPERATOR = TILE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tile XProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_XPROPERTY_FEATURE_COUNT = TILE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileYPropertyImpl <em>Tile YProperty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileYPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getTileYProperty()
	 * @generated
	 */
	int TILE_YPROPERTY = 32;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_YPROPERTY__TARGET = TILE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_YPROPERTY__VALUE = TILE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_YPROPERTY__OPERATOR = TILE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tile YProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_YPROPERTY_FEATURE_COUNT = TILE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TilePassablePropertyImpl <em>Tile Passable Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TilePassablePropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getTilePassableProperty()
	 * @generated
	 */
	int TILE_PASSABLE_PROPERTY = 33;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_PASSABLE_PROPERTY__TARGET = TILE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_PASSABLE_PROPERTY__VALUE = TILE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_PASSABLE_PROPERTY__OPERATOR = TILE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tile Passable Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_PASSABLE_PROPERTY_FEATURE_COUNT = TILE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileInitialPelletPropertyImpl <em>Tile Initial Pellet Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileInitialPelletPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getTileInitialPelletProperty()
	 * @generated
	 */
	int TILE_INITIAL_PELLET_PROPERTY = 34;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_INITIAL_PELLET_PROPERTY__TARGET = TILE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Tile Initial Pellet Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_INITIAL_PELLET_PROPERTY_FEATURE_COUNT = TILE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileHasPelletPropertyImpl <em>Tile Has Pellet Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileHasPelletPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getTileHasPelletProperty()
	 * @generated
	 */
	int TILE_HAS_PELLET_PROPERTY = 35;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_HAS_PELLET_PROPERTY__TARGET = TILE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_HAS_PELLET_PROPERTY__VALUE = TILE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_HAS_PELLET_PROPERTY__OPERATOR = TILE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tile Has Pellet Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_HAS_PELLET_PROPERTY_FEATURE_COUNT = TILE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BoardPropertyImpl <em>Board Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BoardPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getBoardProperty()
	 * @generated
	 */
	int BOARD_PROPERTY = 36;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_PROPERTY__TARGET = XPACMAN_STATE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Board Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_PROPERTY_FEATURE_COUNT = XPACMAN_STATE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.UnaryBoardPropertyImpl <em>Unary Board Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.UnaryBoardPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getUnaryBoardProperty()
	 * @generated
	 */
	int UNARY_BOARD_PROPERTY = 37;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOARD_PROPERTY__TARGET = BOARD_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOARD_PROPERTY__OPERATOR = BOARD_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOARD_PROPERTY__PROPERTY = BOARD_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Board Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOARD_PROPERTY_FEATURE_COUNT = BOARD_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BinaryBoardPropertyImpl <em>Binary Board Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BinaryBoardPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getBinaryBoardProperty()
	 * @generated
	 */
	int BINARY_BOARD_PROPERTY = 38;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOARD_PROPERTY__TARGET = BOARD_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOARD_PROPERTY__OPERATOR = BOARD_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOARD_PROPERTY__LEFT = BOARD_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOARD_PROPERTY__RIGHT = BOARD_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Board Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOARD_PROPERTY_FEATURE_COUNT = BOARD_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileBoardContainerPropertyImpl <em>Tile Board Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileBoardContainerPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getTileBoardContainerProperty()
	 * @generated
	 */
	int TILE_BOARD_CONTAINER_PROPERTY = 39;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_BOARD_CONTAINER_PROPERTY__TARGET = TILE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_BOARD_CONTAINER_PROPERTY__PROPERTY = TILE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tile Board Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_BOARD_CONTAINER_PROPERTY_FEATURE_COUNT = TILE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BoardTilesPropertyImpl <em>Board Tiles Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BoardTilesPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getBoardTilesProperty()
	 * @generated
	 */
	int BOARD_TILES_PROPERTY = 40;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_TILES_PROPERTY__TARGET = BOARD_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_TILES_PROPERTY__PROPERTY = BOARD_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_TILES_PROPERTY__QUANTIFIER = BOARD_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Board Tiles Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_TILES_PROPERTY_FEATURE_COUNT = BOARD_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityPropertyImpl <em>Entity Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getEntityProperty()
	 * @generated
	 */
	int ENTITY_PROPERTY = 42;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PROPERTY__TARGET = XPACMAN_STATE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Entity Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PROPERTY_FEATURE_COUNT = XPACMAN_STATE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityBoardContainerPropertyImpl <em>Entity Board Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityBoardContainerPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getEntityBoardContainerProperty()
	 * @generated
	 */
	int ENTITY_BOARD_CONTAINER_PROPERTY = 41;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BOARD_CONTAINER_PROPERTY__TARGET = ENTITY_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BOARD_CONTAINER_PROPERTY__PROPERTY = ENTITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Board Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BOARD_CONTAINER_PROPERTY_FEATURE_COUNT = ENTITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.UnaryEntityPropertyImpl <em>Unary Entity Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.UnaryEntityPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getUnaryEntityProperty()
	 * @generated
	 */
	int UNARY_ENTITY_PROPERTY = 43;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ENTITY_PROPERTY__TARGET = ENTITY_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ENTITY_PROPERTY__OPERATOR = ENTITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ENTITY_PROPERTY__PROPERTY = ENTITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Entity Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ENTITY_PROPERTY_FEATURE_COUNT = ENTITY_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BinaryEntityPropertyImpl <em>Binary Entity Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BinaryEntityPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getBinaryEntityProperty()
	 * @generated
	 */
	int BINARY_ENTITY_PROPERTY = 44;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ENTITY_PROPERTY__TARGET = ENTITY_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ENTITY_PROPERTY__OPERATOR = ENTITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ENTITY_PROPERTY__LEFT = ENTITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ENTITY_PROPERTY__RIGHT = ENTITY_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Entity Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ENTITY_PROPERTY_FEATURE_COUNT = ENTITY_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityInitialTilePropertyImpl <em>Entity Initial Tile Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityInitialTilePropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getEntityInitialTileProperty()
	 * @generated
	 */
	int ENTITY_INITIAL_TILE_PROPERTY = 45;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INITIAL_TILE_PROPERTY__TARGET = ENTITY_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INITIAL_TILE_PROPERTY__PROPERTY = ENTITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Initial Tile Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INITIAL_TILE_PROPERTY_FEATURE_COUNT = ENTITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntitySpeedPropertyImpl <em>Entity Speed Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntitySpeedPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getEntitySpeedProperty()
	 * @generated
	 */
	int ENTITY_SPEED_PROPERTY = 46;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SPEED_PROPERTY__TARGET = ENTITY_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SPEED_PROPERTY__VALUE = ENTITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SPEED_PROPERTY__OPERATOR = ENTITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entity Speed Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SPEED_PROPERTY_FEATURE_COUNT = ENTITY_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityDirectionPropertyImpl <em>Entity Direction Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityDirectionPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getEntityDirectionProperty()
	 * @generated
	 */
	int ENTITY_DIRECTION_PROPERTY = 47;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DIRECTION_PROPERTY__TARGET = ENTITY_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DIRECTION_PROPERTY__VALUE = ENTITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DIRECTION_PROPERTY__OPERATOR = ENTITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entity Direction Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DIRECTION_PROPERTY_FEATURE_COUNT = ENTITY_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityCurrentTilePropertyImpl <em>Entity Current Tile Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityCurrentTilePropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getEntityCurrentTileProperty()
	 * @generated
	 */
	int ENTITY_CURRENT_TILE_PROPERTY = 48;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CURRENT_TILE_PROPERTY__TARGET = ENTITY_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CURRENT_TILE_PROPERTY__PROPERTY = ENTITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Current Tile Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CURRENT_TILE_PROPERTY_FEATURE_COUNT = ENTITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityNextTilePropertyImpl <em>Entity Next Tile Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityNextTilePropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getEntityNextTileProperty()
	 * @generated
	 */
	int ENTITY_NEXT_TILE_PROPERTY = 49;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_NEXT_TILE_PROPERTY__TARGET = ENTITY_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_NEXT_TILE_PROPERTY__PROPERTY = ENTITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Next Tile Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_NEXT_TILE_PROPERTY_FEATURE_COUNT = ENTITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BoardEntitiesPropertyImpl <em>Board Entities Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BoardEntitiesPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getBoardEntitiesProperty()
	 * @generated
	 */
	int BOARD_ENTITIES_PROPERTY = 50;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_ENTITIES_PROPERTY__TARGET = BOARD_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_ENTITIES_PROPERTY__PROPERTY = BOARD_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_ENTITIES_PROPERTY__QUANTIFIER = BOARD_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Board Entities Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_ENTITIES_PROPERTY_FEATURE_COUNT = BOARD_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanPropertyImpl <em>Pacman Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanProperty()
	 * @generated
	 */
	int PACMAN_PROPERTY = 51;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_PROPERTY__TARGET = ENTITY_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Pacman Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_PROPERTY_FEATURE_COUNT = ENTITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.UnaryPacmanPropertyImpl <em>Unary Pacman Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.UnaryPacmanPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getUnaryPacmanProperty()
	 * @generated
	 */
	int UNARY_PACMAN_PROPERTY = 52;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PACMAN_PROPERTY__TARGET = PACMAN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PACMAN_PROPERTY__OPERATOR = PACMAN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PACMAN_PROPERTY__PROPERTY = PACMAN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Pacman Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PACMAN_PROPERTY_FEATURE_COUNT = PACMAN_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BinaryPacmanPropertyImpl <em>Binary Pacman Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BinaryPacmanPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getBinaryPacmanProperty()
	 * @generated
	 */
	int BINARY_PACMAN_PROPERTY = 53;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PACMAN_PROPERTY__TARGET = PACMAN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PACMAN_PROPERTY__OPERATOR = PACMAN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PACMAN_PROPERTY__LEFT = PACMAN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PACMAN_PROPERTY__RIGHT = PACMAN_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Pacman Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PACMAN_PROPERTY_FEATURE_COUNT = PACMAN_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanInitialTilePropertyImpl <em>Pacman Initial Tile Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanInitialTilePropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanInitialTileProperty()
	 * @generated
	 */
	int PACMAN_INITIAL_TILE_PROPERTY = 54;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_INITIAL_TILE_PROPERTY__TARGET = PACMAN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_INITIAL_TILE_PROPERTY__PROPERTY = PACMAN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pacman Initial Tile Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_INITIAL_TILE_PROPERTY_FEATURE_COUNT = PACMAN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanSpeedPropertyImpl <em>Pacman Speed Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanSpeedPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanSpeedProperty()
	 * @generated
	 */
	int PACMAN_SPEED_PROPERTY = 55;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_SPEED_PROPERTY__TARGET = PACMAN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_SPEED_PROPERTY__VALUE = PACMAN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_SPEED_PROPERTY__OPERATOR = PACMAN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pacman Speed Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_SPEED_PROPERTY_FEATURE_COUNT = PACMAN_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanDirectionPropertyImpl <em>Pacman Direction Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanDirectionPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanDirectionProperty()
	 * @generated
	 */
	int PACMAN_DIRECTION_PROPERTY = 56;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_DIRECTION_PROPERTY__TARGET = PACMAN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_DIRECTION_PROPERTY__VALUE = PACMAN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_DIRECTION_PROPERTY__OPERATOR = PACMAN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pacman Direction Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_DIRECTION_PROPERTY_FEATURE_COUNT = PACMAN_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanCurrentTilePropertyImpl <em>Pacman Current Tile Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanCurrentTilePropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanCurrentTileProperty()
	 * @generated
	 */
	int PACMAN_CURRENT_TILE_PROPERTY = 57;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_CURRENT_TILE_PROPERTY__TARGET = PACMAN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_CURRENT_TILE_PROPERTY__PROPERTY = PACMAN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pacman Current Tile Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_CURRENT_TILE_PROPERTY_FEATURE_COUNT = PACMAN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanNextTilePropertyImpl <em>Pacman Next Tile Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanNextTilePropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanNextTileProperty()
	 * @generated
	 */
	int PACMAN_NEXT_TILE_PROPERTY = 58;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_NEXT_TILE_PROPERTY__TARGET = PACMAN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_NEXT_TILE_PROPERTY__PROPERTY = PACMAN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pacman Next Tile Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_NEXT_TILE_PROPERTY_FEATURE_COUNT = PACMAN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanInitialLivesPropertyImpl <em>Pacman Initial Lives Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanInitialLivesPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanInitialLivesProperty()
	 * @generated
	 */
	int PACMAN_INITIAL_LIVES_PROPERTY = 59;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_INITIAL_LIVES_PROPERTY__TARGET = PACMAN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_INITIAL_LIVES_PROPERTY__VALUE = PACMAN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_INITIAL_LIVES_PROPERTY__OPERATOR = PACMAN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pacman Initial Lives Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_INITIAL_LIVES_PROPERTY_FEATURE_COUNT = PACMAN_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanPelletsEatenPropertyImpl <em>Pacman Pellets Eaten Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanPelletsEatenPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanPelletsEatenProperty()
	 * @generated
	 */
	int PACMAN_PELLETS_EATEN_PROPERTY = 60;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_PELLETS_EATEN_PROPERTY__TARGET = PACMAN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_PELLETS_EATEN_PROPERTY__VALUE = PACMAN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_PELLETS_EATEN_PROPERTY__OPERATOR = PACMAN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pacman Pellets Eaten Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_PELLETS_EATEN_PROPERTY_FEATURE_COUNT = PACMAN_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanLivesPropertyImpl <em>Pacman Lives Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanLivesPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanLivesProperty()
	 * @generated
	 */
	int PACMAN_LIVES_PROPERTY = 61;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_LIVES_PROPERTY__TARGET = PACMAN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_LIVES_PROPERTY__VALUE = PACMAN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_LIVES_PROPERTY__OPERATOR = PACMAN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pacman Lives Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_LIVES_PROPERTY_FEATURE_COUNT = PACMAN_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostPropertyImpl <em>Ghost Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getGhostProperty()
	 * @generated
	 */
	int GHOST_PROPERTY = 62;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_PROPERTY__TARGET = ENTITY_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Ghost Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_PROPERTY_FEATURE_COUNT = ENTITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.UnaryGhostPropertyImpl <em>Unary Ghost Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.UnaryGhostPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getUnaryGhostProperty()
	 * @generated
	 */
	int UNARY_GHOST_PROPERTY = 63;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_GHOST_PROPERTY__TARGET = GHOST_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_GHOST_PROPERTY__OPERATOR = GHOST_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_GHOST_PROPERTY__PROPERTY = GHOST_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Ghost Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_GHOST_PROPERTY_FEATURE_COUNT = GHOST_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BinaryGhostPropertyImpl <em>Binary Ghost Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BinaryGhostPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getBinaryGhostProperty()
	 * @generated
	 */
	int BINARY_GHOST_PROPERTY = 64;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GHOST_PROPERTY__TARGET = GHOST_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GHOST_PROPERTY__OPERATOR = GHOST_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GHOST_PROPERTY__LEFT = GHOST_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GHOST_PROPERTY__RIGHT = GHOST_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Ghost Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GHOST_PROPERTY_FEATURE_COUNT = GHOST_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostInitialTilePropertyImpl <em>Ghost Initial Tile Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostInitialTilePropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getGhostInitialTileProperty()
	 * @generated
	 */
	int GHOST_INITIAL_TILE_PROPERTY = 65;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_INITIAL_TILE_PROPERTY__TARGET = GHOST_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_INITIAL_TILE_PROPERTY__PROPERTY = GHOST_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ghost Initial Tile Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_INITIAL_TILE_PROPERTY_FEATURE_COUNT = GHOST_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostSpeedPropertyImpl <em>Ghost Speed Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostSpeedPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getGhostSpeedProperty()
	 * @generated
	 */
	int GHOST_SPEED_PROPERTY = 66;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_SPEED_PROPERTY__TARGET = GHOST_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_SPEED_PROPERTY__VALUE = GHOST_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_SPEED_PROPERTY__OPERATOR = GHOST_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ghost Speed Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_SPEED_PROPERTY_FEATURE_COUNT = GHOST_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostDirectionPropertyImpl <em>Ghost Direction Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostDirectionPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getGhostDirectionProperty()
	 * @generated
	 */
	int GHOST_DIRECTION_PROPERTY = 67;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_DIRECTION_PROPERTY__TARGET = GHOST_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_DIRECTION_PROPERTY__VALUE = GHOST_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_DIRECTION_PROPERTY__OPERATOR = GHOST_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ghost Direction Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_DIRECTION_PROPERTY_FEATURE_COUNT = GHOST_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostCurrentTilePropertyImpl <em>Ghost Current Tile Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostCurrentTilePropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getGhostCurrentTileProperty()
	 * @generated
	 */
	int GHOST_CURRENT_TILE_PROPERTY = 68;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_CURRENT_TILE_PROPERTY__TARGET = GHOST_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_CURRENT_TILE_PROPERTY__PROPERTY = GHOST_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ghost Current Tile Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_CURRENT_TILE_PROPERTY_FEATURE_COUNT = GHOST_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostNextTilePropertyImpl <em>Ghost Next Tile Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostNextTilePropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getGhostNextTileProperty()
	 * @generated
	 */
	int GHOST_NEXT_TILE_PROPERTY = 69;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_NEXT_TILE_PROPERTY__TARGET = GHOST_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_NEXT_TILE_PROPERTY__PROPERTY = GHOST_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ghost Next Tile Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_NEXT_TILE_PROPERTY_FEATURE_COUNT = GHOST_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostNamePropertyImpl <em>Ghost Name Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostNamePropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getGhostNameProperty()
	 * @generated
	 */
	int GHOST_NAME_PROPERTY = 70;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_NAME_PROPERTY__TARGET = GHOST_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_NAME_PROPERTY__VALUE = GHOST_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_NAME_PROPERTY__OPERATOR = GHOST_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ghost Name Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_NAME_PROPERTY_FEATURE_COUNT = GHOST_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostPersonnalityPropertyImpl <em>Ghost Personnality Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostPersonnalityPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getGhostPersonnalityProperty()
	 * @generated
	 */
	int GHOST_PERSONNALITY_PROPERTY = 71;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_PERSONNALITY_PROPERTY__TARGET = GHOST_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Ghost Personnality Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_PERSONNALITY_PROPERTY_FEATURE_COUNT = GHOST_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostTargetTilePropertyImpl <em>Ghost Target Tile Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostTargetTilePropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getGhostTargetTileProperty()
	 * @generated
	 */
	int GHOST_TARGET_TILE_PROPERTY = 72;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_TARGET_TILE_PROPERTY__TARGET = GHOST_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_TARGET_TILE_PROPERTY__PROPERTY = GHOST_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ghost Target Tile Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_TARGET_TILE_PROPERTY_FEATURE_COUNT = GHOST_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanNextPropertyImpl <em>XPacman Next Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanNextPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getXPacmanNextProperty()
	 * @generated
	 */
	int XPACMAN_NEXT_PROPERTY = 73;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_NEXT_PROPERTY__FORMULA = PropertyPackage.NEXT_PROPERTY__FORMULA;

	/**
	 * The number of structural features of the '<em>XPacman Next Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_NEXT_PROPERTY_FEATURE_COUNT = PropertyPackage.NEXT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanUntilPropertyImpl <em>XPacman Until Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanUntilPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getXPacmanUntilProperty()
	 * @generated
	 */
	int XPACMAN_UNTIL_PROPERTY = 74;

	/**
	 * The feature id for the '<em><b>Left Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_UNTIL_PROPERTY__LEFT_FORMULA = PropertyPackage.UNTIL_PROPERTY__LEFT_FORMULA;

	/**
	 * The feature id for the '<em><b>Right Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_UNTIL_PROPERTY__RIGHT_FORMULA = PropertyPackage.UNTIL_PROPERTY__RIGHT_FORMULA;

	/**
	 * The number of structural features of the '<em>XPacman Until Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_UNTIL_PROPERTY_FEATURE_COUNT = PropertyPackage.UNTIL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanReleasePropertyImpl <em>XPacman Release Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanReleasePropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getXPacmanReleaseProperty()
	 * @generated
	 */
	int XPACMAN_RELEASE_PROPERTY = 75;

	/**
	 * The feature id for the '<em><b>Left Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_RELEASE_PROPERTY__LEFT_FORMULA = PropertyPackage.RELEASE_PROPERTY__LEFT_FORMULA;

	/**
	 * The feature id for the '<em><b>Right Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_RELEASE_PROPERTY__RIGHT_FORMULA = PropertyPackage.RELEASE_PROPERTY__RIGHT_FORMULA;

	/**
	 * The number of structural features of the '<em>XPacman Release Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_RELEASE_PROPERTY_FEATURE_COUNT = PropertyPackage.RELEASE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanNegationTemporalPropertyImpl <em>XPacman Negation Temporal Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanNegationTemporalPropertyImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getXPacmanNegationTemporalProperty()
	 * @generated
	 */
	int XPACMAN_NEGATION_TEMPORAL_PROPERTY = 76;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_NEGATION_TEMPORAL_PROPERTY__FORMULA = PropertyPackage.NEGATION_TEMPORAL_PROPERTY__FORMULA;

	/**
	 * The number of structural features of the '<em>XPacman Negation Temporal Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACMAN_NEGATION_TEMPORAL_PROPERTY_FEATURE_COUNT = PropertyPackage.NEGATION_TEMPORAL_PROPERTY_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanEnterNextTileProperty <em>Pacman Enter Next Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Enter Next Tile Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanEnterNextTileProperty
	 * @generated
	 */
	EClass getPacmanEnterNextTileProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostEnterNextTileProperty <em>Ghost Enter Next Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ghost Enter Next Tile Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostEnterNextTileProperty
	 * @generated
	 */
	EClass getGhostEnterNextTileProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityChangeDirectionProperty <em>Entity Change Direction Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Change Direction Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityChangeDirectionProperty
	 * @generated
	 */
	EClass getEntityChangeDirectionProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanLeftProperty <em>Pacman Left Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Left Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanLeftProperty
	 * @generated
	 */
	EClass getPacmanLeftProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanRightProperty <em>Pacman Right Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Right Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanRightProperty
	 * @generated
	 */
	EClass getPacmanRightProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanEatPelletProperty <em>Pacman Eat Pellet Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Eat Pellet Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanEatPelletProperty
	 * @generated
	 */
	EClass getPacmanEatPelletProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanUpProperty <em>Pacman Up Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Up Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanUpProperty
	 * @generated
	 */
	EClass getPacmanUpProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanInitializeProperty <em>Pacman Initialize Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Initialize Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanInitializeProperty
	 * @generated
	 */
	EClass getPacmanInitializeProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityModifySpeedProperty <em>Entity Modify Speed Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Modify Speed Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityModifySpeedProperty
	 * @generated
	 */
	EClass getEntityModifySpeedProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardInitializeModelProperty <em>Board Initialize Model Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board Initialize Model Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardInitializeModelProperty
	 * @generated
	 */
	EClass getBoardInitializeModelProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityInitializeProperty <em>Entity Initialize Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Initialize Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityInitializeProperty
	 * @generated
	 */
	EClass getEntityInitializeProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanChangeDirectionProperty <em>Pacman Change Direction Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Change Direction Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanChangeDirectionProperty
	 * @generated
	 */
	EClass getPacmanChangeDirectionProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityUpdateProperty <em>Entity Update Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Update Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityUpdateProperty
	 * @generated
	 */
	EClass getEntityUpdateProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardResetProperty <em>Board Reset Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board Reset Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardResetProperty
	 * @generated
	 */
	EClass getBoardResetProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanDownProperty <em>Pacman Down Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Down Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanDownProperty
	 * @generated
	 */
	EClass getPacmanDownProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityEnterNextTileProperty <em>Entity Enter Next Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Enter Next Tile Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityEnterNextTileProperty
	 * @generated
	 */
	EClass getEntityEnterNextTileProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanKillProperty <em>Pacman Kill Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Kill Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanKillProperty
	 * @generated
	 */
	EClass getPacmanKillProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardUpdateProperty <em>Board Update Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board Update Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardUpdateProperty
	 * @generated
	 */
	EClass getBoardUpdateProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostChangeTargetTileProperty <em>Ghost Change Target Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ghost Change Target Tile Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostChangeTargetTileProperty
	 * @generated
	 */
	EClass getGhostChangeTargetTileProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanAbstractProperty <em>XPacman Abstract Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XPacman Abstract Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanAbstractProperty
	 * @generated
	 */
	EClass getXPacmanAbstractProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanTemporalProperty <em>XPacman Temporal Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XPacman Temporal Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanTemporalProperty
	 * @generated
	 */
	EClass getXPacmanTemporalProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanProperty <em>XPacman Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XPacman Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanProperty
	 * @generated
	 */
	EClass getXPacmanProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanStateProperty <em>XPacman State Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XPacman State Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanStateProperty
	 * @generated
	 */
	EClass getXPacmanStateProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanStepProperty <em>XPacman Step Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XPacman Step Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanStepProperty
	 * @generated
	 */
	EClass getXPacmanStepProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileProperty <em>Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileProperty
	 * @generated
	 */
	EClass getTileProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.UnaryTileProperty <em>Unary Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Tile Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.UnaryTileProperty
	 * @generated
	 */
	EClass getUnaryTileProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BinaryTileProperty <em>Binary Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Tile Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BinaryTileProperty
	 * @generated
	 */
	EClass getBinaryTileProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileTopProperty <em>Tile Top Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile Top Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileTopProperty
	 * @generated
	 */
	EClass getTileTopProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileRightProperty <em>Tile Right Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile Right Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileRightProperty
	 * @generated
	 */
	EClass getTileRightProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileBottomProperty <em>Tile Bottom Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile Bottom Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileBottomProperty
	 * @generated
	 */
	EClass getTileBottomProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileLeftProperty <em>Tile Left Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile Left Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileLeftProperty
	 * @generated
	 */
	EClass getTileLeftProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileXProperty <em>Tile XProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile XProperty</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileXProperty
	 * @generated
	 */
	EClass getTileXProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileYProperty <em>Tile YProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile YProperty</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileYProperty
	 * @generated
	 */
	EClass getTileYProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TilePassableProperty <em>Tile Passable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile Passable Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TilePassableProperty
	 * @generated
	 */
	EClass getTilePassableProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileInitialPelletProperty <em>Tile Initial Pellet Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile Initial Pellet Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileInitialPelletProperty
	 * @generated
	 */
	EClass getTileInitialPelletProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileHasPelletProperty <em>Tile Has Pellet Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile Has Pellet Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileHasPelletProperty
	 * @generated
	 */
	EClass getTileHasPelletProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardProperty <em>Board Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardProperty
	 * @generated
	 */
	EClass getBoardProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.UnaryBoardProperty <em>Unary Board Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Board Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.UnaryBoardProperty
	 * @generated
	 */
	EClass getUnaryBoardProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BinaryBoardProperty <em>Binary Board Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Board Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BinaryBoardProperty
	 * @generated
	 */
	EClass getBinaryBoardProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileBoardContainerProperty <em>Tile Board Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile Board Container Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileBoardContainerProperty
	 * @generated
	 */
	EClass getTileBoardContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardTilesProperty <em>Board Tiles Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board Tiles Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardTilesProperty
	 * @generated
	 */
	EClass getBoardTilesProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityBoardContainerProperty <em>Entity Board Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Board Container Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityBoardContainerProperty
	 * @generated
	 */
	EClass getEntityBoardContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityProperty <em>Entity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityProperty
	 * @generated
	 */
	EClass getEntityProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.UnaryEntityProperty <em>Unary Entity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Entity Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.UnaryEntityProperty
	 * @generated
	 */
	EClass getUnaryEntityProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BinaryEntityProperty <em>Binary Entity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Entity Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BinaryEntityProperty
	 * @generated
	 */
	EClass getBinaryEntityProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityInitialTileProperty <em>Entity Initial Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Initial Tile Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityInitialTileProperty
	 * @generated
	 */
	EClass getEntityInitialTileProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntitySpeedProperty <em>Entity Speed Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Speed Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntitySpeedProperty
	 * @generated
	 */
	EClass getEntitySpeedProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityDirectionProperty <em>Entity Direction Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Direction Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityDirectionProperty
	 * @generated
	 */
	EClass getEntityDirectionProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityCurrentTileProperty <em>Entity Current Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Current Tile Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityCurrentTileProperty
	 * @generated
	 */
	EClass getEntityCurrentTileProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityNextTileProperty <em>Entity Next Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Next Tile Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityNextTileProperty
	 * @generated
	 */
	EClass getEntityNextTileProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardEntitiesProperty <em>Board Entities Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board Entities Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardEntitiesProperty
	 * @generated
	 */
	EClass getBoardEntitiesProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanProperty <em>Pacman Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanProperty
	 * @generated
	 */
	EClass getPacmanProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.UnaryPacmanProperty <em>Unary Pacman Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Pacman Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.UnaryPacmanProperty
	 * @generated
	 */
	EClass getUnaryPacmanProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BinaryPacmanProperty <em>Binary Pacman Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Pacman Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BinaryPacmanProperty
	 * @generated
	 */
	EClass getBinaryPacmanProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanInitialTileProperty <em>Pacman Initial Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Initial Tile Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanInitialTileProperty
	 * @generated
	 */
	EClass getPacmanInitialTileProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanSpeedProperty <em>Pacman Speed Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Speed Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanSpeedProperty
	 * @generated
	 */
	EClass getPacmanSpeedProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanDirectionProperty <em>Pacman Direction Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Direction Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanDirectionProperty
	 * @generated
	 */
	EClass getPacmanDirectionProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanCurrentTileProperty <em>Pacman Current Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Current Tile Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanCurrentTileProperty
	 * @generated
	 */
	EClass getPacmanCurrentTileProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanNextTileProperty <em>Pacman Next Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Next Tile Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanNextTileProperty
	 * @generated
	 */
	EClass getPacmanNextTileProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanInitialLivesProperty <em>Pacman Initial Lives Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Initial Lives Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanInitialLivesProperty
	 * @generated
	 */
	EClass getPacmanInitialLivesProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanPelletsEatenProperty <em>Pacman Pellets Eaten Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Pellets Eaten Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanPelletsEatenProperty
	 * @generated
	 */
	EClass getPacmanPelletsEatenProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanLivesProperty <em>Pacman Lives Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Lives Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanLivesProperty
	 * @generated
	 */
	EClass getPacmanLivesProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostProperty <em>Ghost Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ghost Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostProperty
	 * @generated
	 */
	EClass getGhostProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.UnaryGhostProperty <em>Unary Ghost Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Ghost Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.UnaryGhostProperty
	 * @generated
	 */
	EClass getUnaryGhostProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BinaryGhostProperty <em>Binary Ghost Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Ghost Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BinaryGhostProperty
	 * @generated
	 */
	EClass getBinaryGhostProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostInitialTileProperty <em>Ghost Initial Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ghost Initial Tile Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostInitialTileProperty
	 * @generated
	 */
	EClass getGhostInitialTileProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostSpeedProperty <em>Ghost Speed Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ghost Speed Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostSpeedProperty
	 * @generated
	 */
	EClass getGhostSpeedProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostDirectionProperty <em>Ghost Direction Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ghost Direction Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostDirectionProperty
	 * @generated
	 */
	EClass getGhostDirectionProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostCurrentTileProperty <em>Ghost Current Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ghost Current Tile Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostCurrentTileProperty
	 * @generated
	 */
	EClass getGhostCurrentTileProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostNextTileProperty <em>Ghost Next Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ghost Next Tile Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostNextTileProperty
	 * @generated
	 */
	EClass getGhostNextTileProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostNameProperty <em>Ghost Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ghost Name Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostNameProperty
	 * @generated
	 */
	EClass getGhostNameProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostPersonnalityProperty <em>Ghost Personnality Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ghost Personnality Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostPersonnalityProperty
	 * @generated
	 */
	EClass getGhostPersonnalityProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostTargetTileProperty <em>Ghost Target Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ghost Target Tile Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostTargetTileProperty
	 * @generated
	 */
	EClass getGhostTargetTileProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanNextProperty <em>XPacman Next Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XPacman Next Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanNextProperty
	 * @generated
	 */
	EClass getXPacmanNextProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanUntilProperty <em>XPacman Until Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XPacman Until Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanUntilProperty
	 * @generated
	 */
	EClass getXPacmanUntilProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanReleaseProperty <em>XPacman Release Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XPacman Release Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanReleaseProperty
	 * @generated
	 */
	EClass getXPacmanReleaseProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanNegationTemporalProperty <em>XPacman Negation Temporal Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XPacman Negation Temporal Property</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanNegationTemporalProperty
	 * @generated
	 */
	EClass getXPacmanNegationTemporalProperty();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XPacmanPropertyFactory getXPacmanPropertyFactory();

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
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanEnterNextTilePropertyImpl <em>Pacman Enter Next Tile Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanEnterNextTilePropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanEnterNextTileProperty()
		 * @generated
		 */
		EClass PACMAN_ENTER_NEXT_TILE_PROPERTY = eINSTANCE.getPacmanEnterNextTileProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostEnterNextTilePropertyImpl <em>Ghost Enter Next Tile Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostEnterNextTilePropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getGhostEnterNextTileProperty()
		 * @generated
		 */
		EClass GHOST_ENTER_NEXT_TILE_PROPERTY = eINSTANCE.getGhostEnterNextTileProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityChangeDirectionPropertyImpl <em>Entity Change Direction Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityChangeDirectionPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getEntityChangeDirectionProperty()
		 * @generated
		 */
		EClass ENTITY_CHANGE_DIRECTION_PROPERTY = eINSTANCE.getEntityChangeDirectionProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanLeftPropertyImpl <em>Pacman Left Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanLeftPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanLeftProperty()
		 * @generated
		 */
		EClass PACMAN_LEFT_PROPERTY = eINSTANCE.getPacmanLeftProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanRightPropertyImpl <em>Pacman Right Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanRightPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanRightProperty()
		 * @generated
		 */
		EClass PACMAN_RIGHT_PROPERTY = eINSTANCE.getPacmanRightProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanEatPelletPropertyImpl <em>Pacman Eat Pellet Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanEatPelletPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanEatPelletProperty()
		 * @generated
		 */
		EClass PACMAN_EAT_PELLET_PROPERTY = eINSTANCE.getPacmanEatPelletProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanUpPropertyImpl <em>Pacman Up Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanUpPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanUpProperty()
		 * @generated
		 */
		EClass PACMAN_UP_PROPERTY = eINSTANCE.getPacmanUpProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanInitializePropertyImpl <em>Pacman Initialize Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanInitializePropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanInitializeProperty()
		 * @generated
		 */
		EClass PACMAN_INITIALIZE_PROPERTY = eINSTANCE.getPacmanInitializeProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityModifySpeedPropertyImpl <em>Entity Modify Speed Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityModifySpeedPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getEntityModifySpeedProperty()
		 * @generated
		 */
		EClass ENTITY_MODIFY_SPEED_PROPERTY = eINSTANCE.getEntityModifySpeedProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BoardInitializeModelPropertyImpl <em>Board Initialize Model Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BoardInitializeModelPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getBoardInitializeModelProperty()
		 * @generated
		 */
		EClass BOARD_INITIALIZE_MODEL_PROPERTY = eINSTANCE.getBoardInitializeModelProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityInitializePropertyImpl <em>Entity Initialize Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityInitializePropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getEntityInitializeProperty()
		 * @generated
		 */
		EClass ENTITY_INITIALIZE_PROPERTY = eINSTANCE.getEntityInitializeProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanChangeDirectionPropertyImpl <em>Pacman Change Direction Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanChangeDirectionPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanChangeDirectionProperty()
		 * @generated
		 */
		EClass PACMAN_CHANGE_DIRECTION_PROPERTY = eINSTANCE.getPacmanChangeDirectionProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityUpdatePropertyImpl <em>Entity Update Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityUpdatePropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getEntityUpdateProperty()
		 * @generated
		 */
		EClass ENTITY_UPDATE_PROPERTY = eINSTANCE.getEntityUpdateProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BoardResetPropertyImpl <em>Board Reset Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BoardResetPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getBoardResetProperty()
		 * @generated
		 */
		EClass BOARD_RESET_PROPERTY = eINSTANCE.getBoardResetProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanDownPropertyImpl <em>Pacman Down Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanDownPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanDownProperty()
		 * @generated
		 */
		EClass PACMAN_DOWN_PROPERTY = eINSTANCE.getPacmanDownProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityEnterNextTilePropertyImpl <em>Entity Enter Next Tile Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityEnterNextTilePropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getEntityEnterNextTileProperty()
		 * @generated
		 */
		EClass ENTITY_ENTER_NEXT_TILE_PROPERTY = eINSTANCE.getEntityEnterNextTileProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanKillPropertyImpl <em>Pacman Kill Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanKillPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanKillProperty()
		 * @generated
		 */
		EClass PACMAN_KILL_PROPERTY = eINSTANCE.getPacmanKillProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BoardUpdatePropertyImpl <em>Board Update Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BoardUpdatePropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getBoardUpdateProperty()
		 * @generated
		 */
		EClass BOARD_UPDATE_PROPERTY = eINSTANCE.getBoardUpdateProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostChangeTargetTilePropertyImpl <em>Ghost Change Target Tile Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostChangeTargetTilePropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getGhostChangeTargetTileProperty()
		 * @generated
		 */
		EClass GHOST_CHANGE_TARGET_TILE_PROPERTY = eINSTANCE.getGhostChangeTargetTileProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanAbstractPropertyImpl <em>XPacman Abstract Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanAbstractPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getXPacmanAbstractProperty()
		 * @generated
		 */
		EClass XPACMAN_ABSTRACT_PROPERTY = eINSTANCE.getXPacmanAbstractProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanTemporalPropertyImpl <em>XPacman Temporal Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanTemporalPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getXPacmanTemporalProperty()
		 * @generated
		 */
		EClass XPACMAN_TEMPORAL_PROPERTY = eINSTANCE.getXPacmanTemporalProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyImpl <em>XPacman Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getXPacmanProperty()
		 * @generated
		 */
		EClass XPACMAN_PROPERTY = eINSTANCE.getXPacmanProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanStatePropertyImpl <em>XPacman State Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanStatePropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getXPacmanStateProperty()
		 * @generated
		 */
		EClass XPACMAN_STATE_PROPERTY = eINSTANCE.getXPacmanStateProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanStepPropertyImpl <em>XPacman Step Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanStepPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getXPacmanStepProperty()
		 * @generated
		 */
		EClass XPACMAN_STEP_PROPERTY = eINSTANCE.getXPacmanStepProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TilePropertyImpl <em>Tile Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TilePropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getTileProperty()
		 * @generated
		 */
		EClass TILE_PROPERTY = eINSTANCE.getTileProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.UnaryTilePropertyImpl <em>Unary Tile Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.UnaryTilePropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getUnaryTileProperty()
		 * @generated
		 */
		EClass UNARY_TILE_PROPERTY = eINSTANCE.getUnaryTileProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BinaryTilePropertyImpl <em>Binary Tile Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BinaryTilePropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getBinaryTileProperty()
		 * @generated
		 */
		EClass BINARY_TILE_PROPERTY = eINSTANCE.getBinaryTileProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileTopPropertyImpl <em>Tile Top Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileTopPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getTileTopProperty()
		 * @generated
		 */
		EClass TILE_TOP_PROPERTY = eINSTANCE.getTileTopProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileRightPropertyImpl <em>Tile Right Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileRightPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getTileRightProperty()
		 * @generated
		 */
		EClass TILE_RIGHT_PROPERTY = eINSTANCE.getTileRightProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileBottomPropertyImpl <em>Tile Bottom Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileBottomPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getTileBottomProperty()
		 * @generated
		 */
		EClass TILE_BOTTOM_PROPERTY = eINSTANCE.getTileBottomProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileLeftPropertyImpl <em>Tile Left Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileLeftPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getTileLeftProperty()
		 * @generated
		 */
		EClass TILE_LEFT_PROPERTY = eINSTANCE.getTileLeftProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileXPropertyImpl <em>Tile XProperty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileXPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getTileXProperty()
		 * @generated
		 */
		EClass TILE_XPROPERTY = eINSTANCE.getTileXProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileYPropertyImpl <em>Tile YProperty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileYPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getTileYProperty()
		 * @generated
		 */
		EClass TILE_YPROPERTY = eINSTANCE.getTileYProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TilePassablePropertyImpl <em>Tile Passable Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TilePassablePropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getTilePassableProperty()
		 * @generated
		 */
		EClass TILE_PASSABLE_PROPERTY = eINSTANCE.getTilePassableProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileInitialPelletPropertyImpl <em>Tile Initial Pellet Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileInitialPelletPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getTileInitialPelletProperty()
		 * @generated
		 */
		EClass TILE_INITIAL_PELLET_PROPERTY = eINSTANCE.getTileInitialPelletProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileHasPelletPropertyImpl <em>Tile Has Pellet Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileHasPelletPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getTileHasPelletProperty()
		 * @generated
		 */
		EClass TILE_HAS_PELLET_PROPERTY = eINSTANCE.getTileHasPelletProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BoardPropertyImpl <em>Board Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BoardPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getBoardProperty()
		 * @generated
		 */
		EClass BOARD_PROPERTY = eINSTANCE.getBoardProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.UnaryBoardPropertyImpl <em>Unary Board Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.UnaryBoardPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getUnaryBoardProperty()
		 * @generated
		 */
		EClass UNARY_BOARD_PROPERTY = eINSTANCE.getUnaryBoardProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BinaryBoardPropertyImpl <em>Binary Board Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BinaryBoardPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getBinaryBoardProperty()
		 * @generated
		 */
		EClass BINARY_BOARD_PROPERTY = eINSTANCE.getBinaryBoardProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileBoardContainerPropertyImpl <em>Tile Board Container Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.TileBoardContainerPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getTileBoardContainerProperty()
		 * @generated
		 */
		EClass TILE_BOARD_CONTAINER_PROPERTY = eINSTANCE.getTileBoardContainerProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BoardTilesPropertyImpl <em>Board Tiles Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BoardTilesPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getBoardTilesProperty()
		 * @generated
		 */
		EClass BOARD_TILES_PROPERTY = eINSTANCE.getBoardTilesProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityBoardContainerPropertyImpl <em>Entity Board Container Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityBoardContainerPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getEntityBoardContainerProperty()
		 * @generated
		 */
		EClass ENTITY_BOARD_CONTAINER_PROPERTY = eINSTANCE.getEntityBoardContainerProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityPropertyImpl <em>Entity Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getEntityProperty()
		 * @generated
		 */
		EClass ENTITY_PROPERTY = eINSTANCE.getEntityProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.UnaryEntityPropertyImpl <em>Unary Entity Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.UnaryEntityPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getUnaryEntityProperty()
		 * @generated
		 */
		EClass UNARY_ENTITY_PROPERTY = eINSTANCE.getUnaryEntityProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BinaryEntityPropertyImpl <em>Binary Entity Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BinaryEntityPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getBinaryEntityProperty()
		 * @generated
		 */
		EClass BINARY_ENTITY_PROPERTY = eINSTANCE.getBinaryEntityProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityInitialTilePropertyImpl <em>Entity Initial Tile Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityInitialTilePropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getEntityInitialTileProperty()
		 * @generated
		 */
		EClass ENTITY_INITIAL_TILE_PROPERTY = eINSTANCE.getEntityInitialTileProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntitySpeedPropertyImpl <em>Entity Speed Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntitySpeedPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getEntitySpeedProperty()
		 * @generated
		 */
		EClass ENTITY_SPEED_PROPERTY = eINSTANCE.getEntitySpeedProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityDirectionPropertyImpl <em>Entity Direction Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityDirectionPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getEntityDirectionProperty()
		 * @generated
		 */
		EClass ENTITY_DIRECTION_PROPERTY = eINSTANCE.getEntityDirectionProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityCurrentTilePropertyImpl <em>Entity Current Tile Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityCurrentTilePropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getEntityCurrentTileProperty()
		 * @generated
		 */
		EClass ENTITY_CURRENT_TILE_PROPERTY = eINSTANCE.getEntityCurrentTileProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityNextTilePropertyImpl <em>Entity Next Tile Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.EntityNextTilePropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getEntityNextTileProperty()
		 * @generated
		 */
		EClass ENTITY_NEXT_TILE_PROPERTY = eINSTANCE.getEntityNextTileProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BoardEntitiesPropertyImpl <em>Board Entities Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BoardEntitiesPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getBoardEntitiesProperty()
		 * @generated
		 */
		EClass BOARD_ENTITIES_PROPERTY = eINSTANCE.getBoardEntitiesProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanPropertyImpl <em>Pacman Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanProperty()
		 * @generated
		 */
		EClass PACMAN_PROPERTY = eINSTANCE.getPacmanProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.UnaryPacmanPropertyImpl <em>Unary Pacman Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.UnaryPacmanPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getUnaryPacmanProperty()
		 * @generated
		 */
		EClass UNARY_PACMAN_PROPERTY = eINSTANCE.getUnaryPacmanProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BinaryPacmanPropertyImpl <em>Binary Pacman Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BinaryPacmanPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getBinaryPacmanProperty()
		 * @generated
		 */
		EClass BINARY_PACMAN_PROPERTY = eINSTANCE.getBinaryPacmanProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanInitialTilePropertyImpl <em>Pacman Initial Tile Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanInitialTilePropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanInitialTileProperty()
		 * @generated
		 */
		EClass PACMAN_INITIAL_TILE_PROPERTY = eINSTANCE.getPacmanInitialTileProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanSpeedPropertyImpl <em>Pacman Speed Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanSpeedPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanSpeedProperty()
		 * @generated
		 */
		EClass PACMAN_SPEED_PROPERTY = eINSTANCE.getPacmanSpeedProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanDirectionPropertyImpl <em>Pacman Direction Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanDirectionPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanDirectionProperty()
		 * @generated
		 */
		EClass PACMAN_DIRECTION_PROPERTY = eINSTANCE.getPacmanDirectionProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanCurrentTilePropertyImpl <em>Pacman Current Tile Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanCurrentTilePropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanCurrentTileProperty()
		 * @generated
		 */
		EClass PACMAN_CURRENT_TILE_PROPERTY = eINSTANCE.getPacmanCurrentTileProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanNextTilePropertyImpl <em>Pacman Next Tile Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanNextTilePropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanNextTileProperty()
		 * @generated
		 */
		EClass PACMAN_NEXT_TILE_PROPERTY = eINSTANCE.getPacmanNextTileProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanInitialLivesPropertyImpl <em>Pacman Initial Lives Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanInitialLivesPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanInitialLivesProperty()
		 * @generated
		 */
		EClass PACMAN_INITIAL_LIVES_PROPERTY = eINSTANCE.getPacmanInitialLivesProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanPelletsEatenPropertyImpl <em>Pacman Pellets Eaten Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanPelletsEatenPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanPelletsEatenProperty()
		 * @generated
		 */
		EClass PACMAN_PELLETS_EATEN_PROPERTY = eINSTANCE.getPacmanPelletsEatenProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanLivesPropertyImpl <em>Pacman Lives Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanLivesPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getPacmanLivesProperty()
		 * @generated
		 */
		EClass PACMAN_LIVES_PROPERTY = eINSTANCE.getPacmanLivesProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostPropertyImpl <em>Ghost Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getGhostProperty()
		 * @generated
		 */
		EClass GHOST_PROPERTY = eINSTANCE.getGhostProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.UnaryGhostPropertyImpl <em>Unary Ghost Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.UnaryGhostPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getUnaryGhostProperty()
		 * @generated
		 */
		EClass UNARY_GHOST_PROPERTY = eINSTANCE.getUnaryGhostProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BinaryGhostPropertyImpl <em>Binary Ghost Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.BinaryGhostPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getBinaryGhostProperty()
		 * @generated
		 */
		EClass BINARY_GHOST_PROPERTY = eINSTANCE.getBinaryGhostProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostInitialTilePropertyImpl <em>Ghost Initial Tile Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostInitialTilePropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getGhostInitialTileProperty()
		 * @generated
		 */
		EClass GHOST_INITIAL_TILE_PROPERTY = eINSTANCE.getGhostInitialTileProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostSpeedPropertyImpl <em>Ghost Speed Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostSpeedPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getGhostSpeedProperty()
		 * @generated
		 */
		EClass GHOST_SPEED_PROPERTY = eINSTANCE.getGhostSpeedProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostDirectionPropertyImpl <em>Ghost Direction Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostDirectionPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getGhostDirectionProperty()
		 * @generated
		 */
		EClass GHOST_DIRECTION_PROPERTY = eINSTANCE.getGhostDirectionProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostCurrentTilePropertyImpl <em>Ghost Current Tile Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostCurrentTilePropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getGhostCurrentTileProperty()
		 * @generated
		 */
		EClass GHOST_CURRENT_TILE_PROPERTY = eINSTANCE.getGhostCurrentTileProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostNextTilePropertyImpl <em>Ghost Next Tile Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostNextTilePropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getGhostNextTileProperty()
		 * @generated
		 */
		EClass GHOST_NEXT_TILE_PROPERTY = eINSTANCE.getGhostNextTileProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostNamePropertyImpl <em>Ghost Name Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostNamePropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getGhostNameProperty()
		 * @generated
		 */
		EClass GHOST_NAME_PROPERTY = eINSTANCE.getGhostNameProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostPersonnalityPropertyImpl <em>Ghost Personnality Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostPersonnalityPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getGhostPersonnalityProperty()
		 * @generated
		 */
		EClass GHOST_PERSONNALITY_PROPERTY = eINSTANCE.getGhostPersonnalityProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostTargetTilePropertyImpl <em>Ghost Target Tile Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.GhostTargetTilePropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getGhostTargetTileProperty()
		 * @generated
		 */
		EClass GHOST_TARGET_TILE_PROPERTY = eINSTANCE.getGhostTargetTileProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanNextPropertyImpl <em>XPacman Next Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanNextPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getXPacmanNextProperty()
		 * @generated
		 */
		EClass XPACMAN_NEXT_PROPERTY = eINSTANCE.getXPacmanNextProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanUntilPropertyImpl <em>XPacman Until Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanUntilPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getXPacmanUntilProperty()
		 * @generated
		 */
		EClass XPACMAN_UNTIL_PROPERTY = eINSTANCE.getXPacmanUntilProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanReleasePropertyImpl <em>XPacman Release Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanReleasePropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getXPacmanReleaseProperty()
		 * @generated
		 */
		EClass XPACMAN_RELEASE_PROPERTY = eINSTANCE.getXPacmanReleaseProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanNegationTemporalPropertyImpl <em>XPacman Negation Temporal Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanNegationTemporalPropertyImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl#getXPacmanNegationTemporalProperty()
		 * @generated
		 */
		EClass XPACMAN_NEGATION_TEMPORAL_PROPERTY = eINSTANCE.getXPacmanNegationTemporalProperty();

	}

} //XPacmanPropertyPackage
