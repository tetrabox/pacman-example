/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XPacmanPropertyFactoryImpl extends EFactoryImpl implements XPacmanPropertyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XPacmanPropertyFactory init() {
		try {
			XPacmanPropertyFactory theXPacmanPropertyFactory = (XPacmanPropertyFactory)EPackage.Registry.INSTANCE.getEFactory(XPacmanPropertyPackage.eNS_URI);
			if (theXPacmanPropertyFactory != null) {
				return theXPacmanPropertyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XPacmanPropertyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanPropertyFactoryImpl() {
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
			case XPacmanPropertyPackage.PACMAN_ENTER_NEXT_TILE_PROPERTY: return createPacmanEnterNextTileProperty();
			case XPacmanPropertyPackage.GHOST_ENTER_NEXT_TILE_PROPERTY: return createGhostEnterNextTileProperty();
			case XPacmanPropertyPackage.ENTITY_CHANGE_DIRECTION_PROPERTY: return createEntityChangeDirectionProperty();
			case XPacmanPropertyPackage.PACMAN_LEFT_PROPERTY: return createPacmanLeftProperty();
			case XPacmanPropertyPackage.PACMAN_RIGHT_PROPERTY: return createPacmanRightProperty();
			case XPacmanPropertyPackage.PACMAN_EAT_PELLET_PROPERTY: return createPacmanEatPelletProperty();
			case XPacmanPropertyPackage.PACMAN_UP_PROPERTY: return createPacmanUpProperty();
			case XPacmanPropertyPackage.PACMAN_INITIALIZE_PROPERTY: return createPacmanInitializeProperty();
			case XPacmanPropertyPackage.ENTITY_MODIFY_SPEED_PROPERTY: return createEntityModifySpeedProperty();
			case XPacmanPropertyPackage.BOARD_INITIALIZE_MODEL_PROPERTY: return createBoardInitializeModelProperty();
			case XPacmanPropertyPackage.ENTITY_INITIALIZE_PROPERTY: return createEntityInitializeProperty();
			case XPacmanPropertyPackage.PACMAN_CHANGE_DIRECTION_PROPERTY: return createPacmanChangeDirectionProperty();
			case XPacmanPropertyPackage.ENTITY_UPDATE_PROPERTY: return createEntityUpdateProperty();
			case XPacmanPropertyPackage.BOARD_RESET_PROPERTY: return createBoardResetProperty();
			case XPacmanPropertyPackage.PACMAN_DOWN_PROPERTY: return createPacmanDownProperty();
			case XPacmanPropertyPackage.ENTITY_ENTER_NEXT_TILE_PROPERTY: return createEntityEnterNextTileProperty();
			case XPacmanPropertyPackage.PACMAN_KILL_PROPERTY: return createPacmanKillProperty();
			case XPacmanPropertyPackage.BOARD_UPDATE_PROPERTY: return createBoardUpdateProperty();
			case XPacmanPropertyPackage.GHOST_CHANGE_TARGET_TILE_PROPERTY: return createGhostChangeTargetTileProperty();
			case XPacmanPropertyPackage.UNARY_TILE_PROPERTY: return createUnaryTileProperty();
			case XPacmanPropertyPackage.BINARY_TILE_PROPERTY: return createBinaryTileProperty();
			case XPacmanPropertyPackage.TILE_TOP_PROPERTY: return createTileTopProperty();
			case XPacmanPropertyPackage.TILE_RIGHT_PROPERTY: return createTileRightProperty();
			case XPacmanPropertyPackage.TILE_BOTTOM_PROPERTY: return createTileBottomProperty();
			case XPacmanPropertyPackage.TILE_LEFT_PROPERTY: return createTileLeftProperty();
			case XPacmanPropertyPackage.TILE_XPROPERTY: return createTileXProperty();
			case XPacmanPropertyPackage.TILE_YPROPERTY: return createTileYProperty();
			case XPacmanPropertyPackage.TILE_PASSABLE_PROPERTY: return createTilePassableProperty();
			case XPacmanPropertyPackage.TILE_INITIAL_PELLET_PROPERTY: return createTileInitialPelletProperty();
			case XPacmanPropertyPackage.TILE_HAS_PELLET_PROPERTY: return createTileHasPelletProperty();
			case XPacmanPropertyPackage.UNARY_BOARD_PROPERTY: return createUnaryBoardProperty();
			case XPacmanPropertyPackage.BINARY_BOARD_PROPERTY: return createBinaryBoardProperty();
			case XPacmanPropertyPackage.TILE_BOARD_CONTAINER_PROPERTY: return createTileBoardContainerProperty();
			case XPacmanPropertyPackage.BOARD_TILES_PROPERTY: return createBoardTilesProperty();
			case XPacmanPropertyPackage.ENTITY_BOARD_CONTAINER_PROPERTY: return createEntityBoardContainerProperty();
			case XPacmanPropertyPackage.UNARY_ENTITY_PROPERTY: return createUnaryEntityProperty();
			case XPacmanPropertyPackage.BINARY_ENTITY_PROPERTY: return createBinaryEntityProperty();
			case XPacmanPropertyPackage.ENTITY_INITIAL_TILE_PROPERTY: return createEntityInitialTileProperty();
			case XPacmanPropertyPackage.ENTITY_SPEED_PROPERTY: return createEntitySpeedProperty();
			case XPacmanPropertyPackage.ENTITY_DIRECTION_PROPERTY: return createEntityDirectionProperty();
			case XPacmanPropertyPackage.ENTITY_CURRENT_TILE_PROPERTY: return createEntityCurrentTileProperty();
			case XPacmanPropertyPackage.ENTITY_NEXT_TILE_PROPERTY: return createEntityNextTileProperty();
			case XPacmanPropertyPackage.BOARD_ENTITIES_PROPERTY: return createBoardEntitiesProperty();
			case XPacmanPropertyPackage.UNARY_PACMAN_PROPERTY: return createUnaryPacmanProperty();
			case XPacmanPropertyPackage.BINARY_PACMAN_PROPERTY: return createBinaryPacmanProperty();
			case XPacmanPropertyPackage.PACMAN_INITIAL_TILE_PROPERTY: return createPacmanInitialTileProperty();
			case XPacmanPropertyPackage.PACMAN_SPEED_PROPERTY: return createPacmanSpeedProperty();
			case XPacmanPropertyPackage.PACMAN_DIRECTION_PROPERTY: return createPacmanDirectionProperty();
			case XPacmanPropertyPackage.PACMAN_CURRENT_TILE_PROPERTY: return createPacmanCurrentTileProperty();
			case XPacmanPropertyPackage.PACMAN_NEXT_TILE_PROPERTY: return createPacmanNextTileProperty();
			case XPacmanPropertyPackage.PACMAN_INITIAL_LIVES_PROPERTY: return createPacmanInitialLivesProperty();
			case XPacmanPropertyPackage.PACMAN_PELLETS_EATEN_PROPERTY: return createPacmanPelletsEatenProperty();
			case XPacmanPropertyPackage.PACMAN_LIVES_PROPERTY: return createPacmanLivesProperty();
			case XPacmanPropertyPackage.UNARY_GHOST_PROPERTY: return createUnaryGhostProperty();
			case XPacmanPropertyPackage.BINARY_GHOST_PROPERTY: return createBinaryGhostProperty();
			case XPacmanPropertyPackage.GHOST_INITIAL_TILE_PROPERTY: return createGhostInitialTileProperty();
			case XPacmanPropertyPackage.GHOST_SPEED_PROPERTY: return createGhostSpeedProperty();
			case XPacmanPropertyPackage.GHOST_DIRECTION_PROPERTY: return createGhostDirectionProperty();
			case XPacmanPropertyPackage.GHOST_CURRENT_TILE_PROPERTY: return createGhostCurrentTileProperty();
			case XPacmanPropertyPackage.GHOST_NEXT_TILE_PROPERTY: return createGhostNextTileProperty();
			case XPacmanPropertyPackage.GHOST_NAME_PROPERTY: return createGhostNameProperty();
			case XPacmanPropertyPackage.GHOST_PERSONNALITY_PROPERTY: return createGhostPersonnalityProperty();
			case XPacmanPropertyPackage.GHOST_TARGET_TILE_PROPERTY: return createGhostTargetTileProperty();
			case XPacmanPropertyPackage.XPACMAN_NEXT_PROPERTY: return createXPacmanNextProperty();
			case XPacmanPropertyPackage.XPACMAN_UNTIL_PROPERTY: return createXPacmanUntilProperty();
			case XPacmanPropertyPackage.XPACMAN_RELEASE_PROPERTY: return createXPacmanReleaseProperty();
			case XPacmanPropertyPackage.XPACMAN_NEGATION_TEMPORAL_PROPERTY: return createXPacmanNegationTemporalProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanEnterNextTileProperty createPacmanEnterNextTileProperty() {
		PacmanEnterNextTilePropertyImpl pacmanEnterNextTileProperty = new PacmanEnterNextTilePropertyImpl();
		return pacmanEnterNextTileProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GhostEnterNextTileProperty createGhostEnterNextTileProperty() {
		GhostEnterNextTilePropertyImpl ghostEnterNextTileProperty = new GhostEnterNextTilePropertyImpl();
		return ghostEnterNextTileProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityChangeDirectionProperty createEntityChangeDirectionProperty() {
		EntityChangeDirectionPropertyImpl entityChangeDirectionProperty = new EntityChangeDirectionPropertyImpl();
		return entityChangeDirectionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanLeftProperty createPacmanLeftProperty() {
		PacmanLeftPropertyImpl pacmanLeftProperty = new PacmanLeftPropertyImpl();
		return pacmanLeftProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanRightProperty createPacmanRightProperty() {
		PacmanRightPropertyImpl pacmanRightProperty = new PacmanRightPropertyImpl();
		return pacmanRightProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanEatPelletProperty createPacmanEatPelletProperty() {
		PacmanEatPelletPropertyImpl pacmanEatPelletProperty = new PacmanEatPelletPropertyImpl();
		return pacmanEatPelletProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanUpProperty createPacmanUpProperty() {
		PacmanUpPropertyImpl pacmanUpProperty = new PacmanUpPropertyImpl();
		return pacmanUpProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanInitializeProperty createPacmanInitializeProperty() {
		PacmanInitializePropertyImpl pacmanInitializeProperty = new PacmanInitializePropertyImpl();
		return pacmanInitializeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityModifySpeedProperty createEntityModifySpeedProperty() {
		EntityModifySpeedPropertyImpl entityModifySpeedProperty = new EntityModifySpeedPropertyImpl();
		return entityModifySpeedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoardInitializeModelProperty createBoardInitializeModelProperty() {
		BoardInitializeModelPropertyImpl boardInitializeModelProperty = new BoardInitializeModelPropertyImpl();
		return boardInitializeModelProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityInitializeProperty createEntityInitializeProperty() {
		EntityInitializePropertyImpl entityInitializeProperty = new EntityInitializePropertyImpl();
		return entityInitializeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanChangeDirectionProperty createPacmanChangeDirectionProperty() {
		PacmanChangeDirectionPropertyImpl pacmanChangeDirectionProperty = new PacmanChangeDirectionPropertyImpl();
		return pacmanChangeDirectionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityUpdateProperty createEntityUpdateProperty() {
		EntityUpdatePropertyImpl entityUpdateProperty = new EntityUpdatePropertyImpl();
		return entityUpdateProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoardResetProperty createBoardResetProperty() {
		BoardResetPropertyImpl boardResetProperty = new BoardResetPropertyImpl();
		return boardResetProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanDownProperty createPacmanDownProperty() {
		PacmanDownPropertyImpl pacmanDownProperty = new PacmanDownPropertyImpl();
		return pacmanDownProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityEnterNextTileProperty createEntityEnterNextTileProperty() {
		EntityEnterNextTilePropertyImpl entityEnterNextTileProperty = new EntityEnterNextTilePropertyImpl();
		return entityEnterNextTileProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanKillProperty createPacmanKillProperty() {
		PacmanKillPropertyImpl pacmanKillProperty = new PacmanKillPropertyImpl();
		return pacmanKillProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoardUpdateProperty createBoardUpdateProperty() {
		BoardUpdatePropertyImpl boardUpdateProperty = new BoardUpdatePropertyImpl();
		return boardUpdateProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GhostChangeTargetTileProperty createGhostChangeTargetTileProperty() {
		GhostChangeTargetTilePropertyImpl ghostChangeTargetTileProperty = new GhostChangeTargetTilePropertyImpl();
		return ghostChangeTargetTileProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryTileProperty createUnaryTileProperty() {
		UnaryTilePropertyImpl unaryTileProperty = new UnaryTilePropertyImpl();
		return unaryTileProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryTileProperty createBinaryTileProperty() {
		BinaryTilePropertyImpl binaryTileProperty = new BinaryTilePropertyImpl();
		return binaryTileProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TileTopProperty createTileTopProperty() {
		TileTopPropertyImpl tileTopProperty = new TileTopPropertyImpl();
		return tileTopProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TileRightProperty createTileRightProperty() {
		TileRightPropertyImpl tileRightProperty = new TileRightPropertyImpl();
		return tileRightProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TileBottomProperty createTileBottomProperty() {
		TileBottomPropertyImpl tileBottomProperty = new TileBottomPropertyImpl();
		return tileBottomProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TileLeftProperty createTileLeftProperty() {
		TileLeftPropertyImpl tileLeftProperty = new TileLeftPropertyImpl();
		return tileLeftProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TileXProperty createTileXProperty() {
		TileXPropertyImpl tileXProperty = new TileXPropertyImpl();
		return tileXProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TileYProperty createTileYProperty() {
		TileYPropertyImpl tileYProperty = new TileYPropertyImpl();
		return tileYProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TilePassableProperty createTilePassableProperty() {
		TilePassablePropertyImpl tilePassableProperty = new TilePassablePropertyImpl();
		return tilePassableProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TileInitialPelletProperty createTileInitialPelletProperty() {
		TileInitialPelletPropertyImpl tileInitialPelletProperty = new TileInitialPelletPropertyImpl();
		return tileInitialPelletProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TileHasPelletProperty createTileHasPelletProperty() {
		TileHasPelletPropertyImpl tileHasPelletProperty = new TileHasPelletPropertyImpl();
		return tileHasPelletProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryBoardProperty createUnaryBoardProperty() {
		UnaryBoardPropertyImpl unaryBoardProperty = new UnaryBoardPropertyImpl();
		return unaryBoardProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryBoardProperty createBinaryBoardProperty() {
		BinaryBoardPropertyImpl binaryBoardProperty = new BinaryBoardPropertyImpl();
		return binaryBoardProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TileBoardContainerProperty createTileBoardContainerProperty() {
		TileBoardContainerPropertyImpl tileBoardContainerProperty = new TileBoardContainerPropertyImpl();
		return tileBoardContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoardTilesProperty createBoardTilesProperty() {
		BoardTilesPropertyImpl boardTilesProperty = new BoardTilesPropertyImpl();
		return boardTilesProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityBoardContainerProperty createEntityBoardContainerProperty() {
		EntityBoardContainerPropertyImpl entityBoardContainerProperty = new EntityBoardContainerPropertyImpl();
		return entityBoardContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryEntityProperty createUnaryEntityProperty() {
		UnaryEntityPropertyImpl unaryEntityProperty = new UnaryEntityPropertyImpl();
		return unaryEntityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryEntityProperty createBinaryEntityProperty() {
		BinaryEntityPropertyImpl binaryEntityProperty = new BinaryEntityPropertyImpl();
		return binaryEntityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityInitialTileProperty createEntityInitialTileProperty() {
		EntityInitialTilePropertyImpl entityInitialTileProperty = new EntityInitialTilePropertyImpl();
		return entityInitialTileProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntitySpeedProperty createEntitySpeedProperty() {
		EntitySpeedPropertyImpl entitySpeedProperty = new EntitySpeedPropertyImpl();
		return entitySpeedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityDirectionProperty createEntityDirectionProperty() {
		EntityDirectionPropertyImpl entityDirectionProperty = new EntityDirectionPropertyImpl();
		return entityDirectionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityCurrentTileProperty createEntityCurrentTileProperty() {
		EntityCurrentTilePropertyImpl entityCurrentTileProperty = new EntityCurrentTilePropertyImpl();
		return entityCurrentTileProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityNextTileProperty createEntityNextTileProperty() {
		EntityNextTilePropertyImpl entityNextTileProperty = new EntityNextTilePropertyImpl();
		return entityNextTileProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoardEntitiesProperty createBoardEntitiesProperty() {
		BoardEntitiesPropertyImpl boardEntitiesProperty = new BoardEntitiesPropertyImpl();
		return boardEntitiesProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryPacmanProperty createUnaryPacmanProperty() {
		UnaryPacmanPropertyImpl unaryPacmanProperty = new UnaryPacmanPropertyImpl();
		return unaryPacmanProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryPacmanProperty createBinaryPacmanProperty() {
		BinaryPacmanPropertyImpl binaryPacmanProperty = new BinaryPacmanPropertyImpl();
		return binaryPacmanProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanInitialTileProperty createPacmanInitialTileProperty() {
		PacmanInitialTilePropertyImpl pacmanInitialTileProperty = new PacmanInitialTilePropertyImpl();
		return pacmanInitialTileProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanSpeedProperty createPacmanSpeedProperty() {
		PacmanSpeedPropertyImpl pacmanSpeedProperty = new PacmanSpeedPropertyImpl();
		return pacmanSpeedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanDirectionProperty createPacmanDirectionProperty() {
		PacmanDirectionPropertyImpl pacmanDirectionProperty = new PacmanDirectionPropertyImpl();
		return pacmanDirectionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanCurrentTileProperty createPacmanCurrentTileProperty() {
		PacmanCurrentTilePropertyImpl pacmanCurrentTileProperty = new PacmanCurrentTilePropertyImpl();
		return pacmanCurrentTileProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanNextTileProperty createPacmanNextTileProperty() {
		PacmanNextTilePropertyImpl pacmanNextTileProperty = new PacmanNextTilePropertyImpl();
		return pacmanNextTileProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanInitialLivesProperty createPacmanInitialLivesProperty() {
		PacmanInitialLivesPropertyImpl pacmanInitialLivesProperty = new PacmanInitialLivesPropertyImpl();
		return pacmanInitialLivesProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanPelletsEatenProperty createPacmanPelletsEatenProperty() {
		PacmanPelletsEatenPropertyImpl pacmanPelletsEatenProperty = new PacmanPelletsEatenPropertyImpl();
		return pacmanPelletsEatenProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanLivesProperty createPacmanLivesProperty() {
		PacmanLivesPropertyImpl pacmanLivesProperty = new PacmanLivesPropertyImpl();
		return pacmanLivesProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryGhostProperty createUnaryGhostProperty() {
		UnaryGhostPropertyImpl unaryGhostProperty = new UnaryGhostPropertyImpl();
		return unaryGhostProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryGhostProperty createBinaryGhostProperty() {
		BinaryGhostPropertyImpl binaryGhostProperty = new BinaryGhostPropertyImpl();
		return binaryGhostProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GhostInitialTileProperty createGhostInitialTileProperty() {
		GhostInitialTilePropertyImpl ghostInitialTileProperty = new GhostInitialTilePropertyImpl();
		return ghostInitialTileProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GhostSpeedProperty createGhostSpeedProperty() {
		GhostSpeedPropertyImpl ghostSpeedProperty = new GhostSpeedPropertyImpl();
		return ghostSpeedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GhostDirectionProperty createGhostDirectionProperty() {
		GhostDirectionPropertyImpl ghostDirectionProperty = new GhostDirectionPropertyImpl();
		return ghostDirectionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GhostCurrentTileProperty createGhostCurrentTileProperty() {
		GhostCurrentTilePropertyImpl ghostCurrentTileProperty = new GhostCurrentTilePropertyImpl();
		return ghostCurrentTileProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GhostNextTileProperty createGhostNextTileProperty() {
		GhostNextTilePropertyImpl ghostNextTileProperty = new GhostNextTilePropertyImpl();
		return ghostNextTileProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GhostNameProperty createGhostNameProperty() {
		GhostNamePropertyImpl ghostNameProperty = new GhostNamePropertyImpl();
		return ghostNameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GhostPersonnalityProperty createGhostPersonnalityProperty() {
		GhostPersonnalityPropertyImpl ghostPersonnalityProperty = new GhostPersonnalityPropertyImpl();
		return ghostPersonnalityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GhostTargetTileProperty createGhostTargetTileProperty() {
		GhostTargetTilePropertyImpl ghostTargetTileProperty = new GhostTargetTilePropertyImpl();
		return ghostTargetTileProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanNextProperty createXPacmanNextProperty() {
		XPacmanNextPropertyImpl xPacmanNextProperty = new XPacmanNextPropertyImpl();
		return xPacmanNextProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanUntilProperty createXPacmanUntilProperty() {
		XPacmanUntilPropertyImpl xPacmanUntilProperty = new XPacmanUntilPropertyImpl();
		return xPacmanUntilProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanReleaseProperty createXPacmanReleaseProperty() {
		XPacmanReleasePropertyImpl xPacmanReleaseProperty = new XPacmanReleasePropertyImpl();
		return xPacmanReleaseProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanNegationTemporalProperty createXPacmanNegationTemporalProperty() {
		XPacmanNegationTemporalPropertyImpl xPacmanNegationTemporalProperty = new XPacmanNegationTemporalPropertyImpl();
		return xPacmanNegationTemporalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanPropertyPackage getXPacmanPropertyPackage() {
		return (XPacmanPropertyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XPacmanPropertyPackage getPackage() {
		return XPacmanPropertyPackage.eINSTANCE;
	}

} //XPacmanPropertyFactoryImpl
