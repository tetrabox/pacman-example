/**
 */
package org.tetrabox.example.pacman.xpacmanmt.pacman;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanFactory
 * @model kind="package"
 * @generated
 */
public interface PacmanPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pacman";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.tetrabox.example.pacman.xpacmanmt/pacman/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pacman";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PacmanPackage eINSTANCE = org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.impl.AbstractTileImpl <em>Abstract Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.AbstractTileImpl
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl#getAbstractTile()
	 * @generated
	 */
	int ABSTRACT_TILE = 0;

	/**
	 * The feature id for the '<em><b>Top</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TILE__TOP = 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TILE__RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TILE__BOTTOM = 2;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TILE__LEFT = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TILE__X = 4;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TILE__Y = 5;

	/**
	 * The number of structural features of the '<em>Abstract Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TILE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.impl.TileImpl <em>Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.TileImpl
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl#getTile()
	 * @generated
	 */
	int TILE = 6;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.BoardImpl
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 1;

	/**
	 * The feature id for the '<em><b>Tiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__TILES = 0;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__ENTITIES = 1;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.EntityImpl
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Initial Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__INITIAL_TILE = 0;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SPEED = 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DIRECTION = 2;

	/**
	 * The feature id for the '<em><b>Current Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CURRENT_TILE = 3;

	/**
	 * The feature id for the '<em><b>XMove Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__XMOVE_PROGRESS = 4;

	/**
	 * The feature id for the '<em><b>YMove Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__YMOVE_PROGRESS = 5;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanImpl <em>Pacman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanImpl
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl#getPacman()
	 * @generated
	 */
	int PACMAN = 3;

	/**
	 * The feature id for the '<em><b>Initial Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN__INITIAL_TILE = ENTITY__INITIAL_TILE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN__SPEED = ENTITY__SPEED;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN__DIRECTION = ENTITY__DIRECTION;

	/**
	 * The feature id for the '<em><b>Current Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN__CURRENT_TILE = ENTITY__CURRENT_TILE;

	/**
	 * The feature id for the '<em><b>XMove Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN__XMOVE_PROGRESS = ENTITY__XMOVE_PROGRESS;

	/**
	 * The feature id for the '<em><b>YMove Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN__YMOVE_PROGRESS = ENTITY__YMOVE_PROGRESS;

	/**
	 * The feature id for the '<em><b>Initial Lives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN__INITIAL_LIVES = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pellets Eaten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN__PELLETS_EATEN = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN__LIVES = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pacman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.impl.GhostImpl <em>Ghost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.GhostImpl
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl#getGhost()
	 * @generated
	 */
	int GHOST = 4;

	/**
	 * The feature id for the '<em><b>Initial Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST__INITIAL_TILE = ENTITY__INITIAL_TILE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST__SPEED = ENTITY__SPEED;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST__DIRECTION = ENTITY__DIRECTION;

	/**
	 * The feature id for the '<em><b>Current Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST__CURRENT_TILE = ENTITY__CURRENT_TILE;

	/**
	 * The feature id for the '<em><b>XMove Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST__XMOVE_PROGRESS = ENTITY__XMOVE_PROGRESS;

	/**
	 * The feature id for the '<em><b>YMove Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST__YMOVE_PROGRESS = ENTITY__YMOVE_PROGRESS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST__NAME = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Personnality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST__PERSONNALITY = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scatter Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST__SCATTER_TILE = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST__TARGET_TILE = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Frightened Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST__FRIGHTENED_MODE = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Ghost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PassableTileImpl <em>Passable Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PassableTileImpl
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl#getPassableTile()
	 * @generated
	 */
	int PASSABLE_TILE = 5;

	/**
	 * The feature id for the '<em><b>Top</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSABLE_TILE__TOP = ABSTRACT_TILE__TOP;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSABLE_TILE__RIGHT = ABSTRACT_TILE__RIGHT;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSABLE_TILE__BOTTOM = ABSTRACT_TILE__BOTTOM;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSABLE_TILE__LEFT = ABSTRACT_TILE__LEFT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSABLE_TILE__X = ABSTRACT_TILE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSABLE_TILE__Y = ABSTRACT_TILE__Y;

	/**
	 * The number of structural features of the '<em>Passable Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSABLE_TILE_FEATURE_COUNT = ABSTRACT_TILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Top</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__TOP = PASSABLE_TILE__TOP;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__RIGHT = PASSABLE_TILE__RIGHT;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__BOTTOM = PASSABLE_TILE__BOTTOM;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__LEFT = PASSABLE_TILE__LEFT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__X = PASSABLE_TILE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__Y = PASSABLE_TILE__Y;

	/**
	 * The feature id for the '<em><b>Initial Pellet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__INITIAL_PELLET = PASSABLE_TILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pellet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__PELLET = PASSABLE_TILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_FEATURE_COUNT = PASSABLE_TILE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.impl.GhostHouseTileImpl <em>Ghost House Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.GhostHouseTileImpl
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl#getGhostHouseTile()
	 * @generated
	 */
	int GHOST_HOUSE_TILE = 7;

	/**
	 * The feature id for the '<em><b>Top</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_HOUSE_TILE__TOP = PASSABLE_TILE__TOP;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_HOUSE_TILE__RIGHT = PASSABLE_TILE__RIGHT;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_HOUSE_TILE__BOTTOM = PASSABLE_TILE__BOTTOM;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_HOUSE_TILE__LEFT = PASSABLE_TILE__LEFT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_HOUSE_TILE__X = PASSABLE_TILE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_HOUSE_TILE__Y = PASSABLE_TILE__Y;

	/**
	 * The number of structural features of the '<em>Ghost House Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_HOUSE_TILE_FEATURE_COUNT = PASSABLE_TILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.impl.WallTileImpl <em>Wall Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.WallTileImpl
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl#getWallTile()
	 * @generated
	 */
	int WALL_TILE = 8;

	/**
	 * The feature id for the '<em><b>Top</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_TILE__TOP = ABSTRACT_TILE__TOP;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_TILE__RIGHT = ABSTRACT_TILE__RIGHT;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_TILE__BOTTOM = ABSTRACT_TILE__BOTTOM;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_TILE__LEFT = ABSTRACT_TILE__LEFT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_TILE__X = ABSTRACT_TILE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_TILE__Y = ABSTRACT_TILE__Y;

	/**
	 * The number of structural features of the '<em>Wall Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_TILE_FEATURE_COUNT = ABSTRACT_TILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PelletImpl <em>Pellet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PelletImpl
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl#getPellet()
	 * @generated
	 */
	int PELLET = 9;

	/**
	 * The number of structural features of the '<em>Pellet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PELLET_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.impl.SuperPelletImpl <em>Super Pellet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.SuperPelletImpl
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl#getSuperPellet()
	 * @generated
	 */
	int SUPER_PELLET = 10;

	/**
	 * The number of structural features of the '<em>Super Pellet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PELLET_FEATURE_COUNT = PELLET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.PelletType <em>Pellet Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PelletType
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl#getPelletType()
	 * @generated
	 */
	int PELLET_TYPE = 11;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.GhostPersonality <em>Ghost Personality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.GhostPersonality
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl#getGhostPersonality()
	 * @generated
	 */
	int GHOST_PERSONALITY = 12;


	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile <em>Abstract Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Tile</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile
	 * @generated
	 */
	EClass getAbstractTile();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Top</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getTop()
	 * @see #getAbstractTile()
	 * @generated
	 */
	EReference getAbstractTile_Top();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getRight()
	 * @see #getAbstractTile()
	 * @generated
	 */
	EReference getAbstractTile_Right();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bottom</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getBottom()
	 * @see #getAbstractTile()
	 * @generated
	 */
	EReference getAbstractTile_Bottom();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getLeft()
	 * @see #getAbstractTile()
	 * @generated
	 */
	EReference getAbstractTile_Left();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getX()
	 * @see #getAbstractTile()
	 * @generated
	 */
	EAttribute getAbstractTile_X();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getY()
	 * @see #getAbstractTile()
	 * @generated
	 */
	EAttribute getAbstractTile_Y();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Tile <em>Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.Tile
	 * @generated
	 */
	EClass getTile();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Tile#getInitialPellet <em>Initial Pellet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Pellet</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.Tile#getInitialPellet()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_InitialPellet();

	/**
	 * Returns the meta object for the containment reference '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Tile#getPellet <em>Pellet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pellet</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.Tile#getPellet()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_Pellet();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Board#getTiles <em>Tiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tiles</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.Board#getTiles()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Tiles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Board#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.Board#getEntities()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Entities();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Entity#getInitialTile <em>Initial Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Tile</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.Entity#getInitialTile()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_InitialTile();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Entity#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.Entity#getSpeed()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Speed();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Entity#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.Entity#getDirection()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Direction();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Entity#getCurrentTile <em>Current Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Tile</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.Entity#getCurrentTile()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_CurrentTile();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Entity#getXMoveProgress <em>XMove Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XMove Progress</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.Entity#getXMoveProgress()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_XMoveProgress();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Entity#getYMoveProgress <em>YMove Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YMove Progress</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.Entity#getYMoveProgress()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_YMoveProgress();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Pacman <em>Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.Pacman
	 * @generated
	 */
	EClass getPacman();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Pacman#getInitialLives <em>Initial Lives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Lives</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.Pacman#getInitialLives()
	 * @see #getPacman()
	 * @generated
	 */
	EAttribute getPacman_InitialLives();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Pacman#getPelletsEaten <em>Pellets Eaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pellets Eaten</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.Pacman#getPelletsEaten()
	 * @see #getPacman()
	 * @generated
	 */
	EAttribute getPacman_PelletsEaten();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Pacman#getLives <em>Lives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lives</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.Pacman#getLives()
	 * @see #getPacman()
	 * @generated
	 */
	EAttribute getPacman_Lives();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost <em>Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ghost</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost
	 * @generated
	 */
	EClass getGhost();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost#getName()
	 * @see #getGhost()
	 * @generated
	 */
	EAttribute getGhost_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost#getPersonnality <em>Personnality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Personnality</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost#getPersonnality()
	 * @see #getGhost()
	 * @generated
	 */
	EAttribute getGhost_Personnality();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost#getScatterTile <em>Scatter Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scatter Tile</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost#getScatterTile()
	 * @see #getGhost()
	 * @generated
	 */
	EReference getGhost_ScatterTile();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost#getTargetTile <em>Target Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Tile</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost#getTargetTile()
	 * @see #getGhost()
	 * @generated
	 */
	EReference getGhost_TargetTile();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost#isFrightenedMode <em>Frightened Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frightened Mode</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost#isFrightenedMode()
	 * @see #getGhost()
	 * @generated
	 */
	EAttribute getGhost_FrightenedMode();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.PassableTile <em>Passable Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passable Tile</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PassableTile
	 * @generated
	 */
	EClass getPassableTile();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.GhostHouseTile <em>Ghost House Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ghost House Tile</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.GhostHouseTile
	 * @generated
	 */
	EClass getGhostHouseTile();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.WallTile <em>Wall Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wall Tile</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.WallTile
	 * @generated
	 */
	EClass getWallTile();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Pellet <em>Pellet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pellet</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.Pellet
	 * @generated
	 */
	EClass getPellet();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.SuperPellet <em>Super Pellet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Pellet</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.SuperPellet
	 * @generated
	 */
	EClass getSuperPellet();

	/**
	 * Returns the meta object for enum '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.PelletType <em>Pellet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pellet Type</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PelletType
	 * @generated
	 */
	EEnum getPelletType();

	/**
	 * Returns the meta object for enum '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.GhostPersonality <em>Ghost Personality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ghost Personality</em>'.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.GhostPersonality
	 * @generated
	 */
	EEnum getGhostPersonality();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PacmanFactory getPacmanFactory();

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
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.impl.AbstractTileImpl <em>Abstract Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.AbstractTileImpl
		 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl#getAbstractTile()
		 * @generated
		 */
		EClass ABSTRACT_TILE = eINSTANCE.getAbstractTile();

		/**
		 * The meta object literal for the '<em><b>Top</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TILE__TOP = eINSTANCE.getAbstractTile_Top();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TILE__RIGHT = eINSTANCE.getAbstractTile_Right();

		/**
		 * The meta object literal for the '<em><b>Bottom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TILE__BOTTOM = eINSTANCE.getAbstractTile_Bottom();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TILE__LEFT = eINSTANCE.getAbstractTile_Left();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TILE__X = eINSTANCE.getAbstractTile_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TILE__Y = eINSTANCE.getAbstractTile_Y();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.impl.TileImpl <em>Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.TileImpl
		 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl#getTile()
		 * @generated
		 */
		EClass TILE = eINSTANCE.getTile();

		/**
		 * The meta object literal for the '<em><b>Initial Pellet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__INITIAL_PELLET = eINSTANCE.getTile_InitialPellet();

		/**
		 * The meta object literal for the '<em><b>Pellet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__PELLET = eINSTANCE.getTile_Pellet();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.BoardImpl
		 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();

		/**
		 * The meta object literal for the '<em><b>Tiles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__TILES = eINSTANCE.getBoard_Tiles();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__ENTITIES = eINSTANCE.getBoard_Entities();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.EntityImpl
		 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Initial Tile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__INITIAL_TILE = eINSTANCE.getEntity_InitialTile();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__SPEED = eINSTANCE.getEntity_Speed();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__DIRECTION = eINSTANCE.getEntity_Direction();

		/**
		 * The meta object literal for the '<em><b>Current Tile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__CURRENT_TILE = eINSTANCE.getEntity_CurrentTile();

		/**
		 * The meta object literal for the '<em><b>XMove Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__XMOVE_PROGRESS = eINSTANCE.getEntity_XMoveProgress();

		/**
		 * The meta object literal for the '<em><b>YMove Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__YMOVE_PROGRESS = eINSTANCE.getEntity_YMoveProgress();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanImpl <em>Pacman</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanImpl
		 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl#getPacman()
		 * @generated
		 */
		EClass PACMAN = eINSTANCE.getPacman();

		/**
		 * The meta object literal for the '<em><b>Initial Lives</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACMAN__INITIAL_LIVES = eINSTANCE.getPacman_InitialLives();

		/**
		 * The meta object literal for the '<em><b>Pellets Eaten</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACMAN__PELLETS_EATEN = eINSTANCE.getPacman_PelletsEaten();

		/**
		 * The meta object literal for the '<em><b>Lives</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACMAN__LIVES = eINSTANCE.getPacman_Lives();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.impl.GhostImpl <em>Ghost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.GhostImpl
		 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl#getGhost()
		 * @generated
		 */
		EClass GHOST = eINSTANCE.getGhost();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GHOST__NAME = eINSTANCE.getGhost_Name();

		/**
		 * The meta object literal for the '<em><b>Personnality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GHOST__PERSONNALITY = eINSTANCE.getGhost_Personnality();

		/**
		 * The meta object literal for the '<em><b>Scatter Tile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GHOST__SCATTER_TILE = eINSTANCE.getGhost_ScatterTile();

		/**
		 * The meta object literal for the '<em><b>Target Tile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GHOST__TARGET_TILE = eINSTANCE.getGhost_TargetTile();

		/**
		 * The meta object literal for the '<em><b>Frightened Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GHOST__FRIGHTENED_MODE = eINSTANCE.getGhost_FrightenedMode();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PassableTileImpl <em>Passable Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PassableTileImpl
		 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl#getPassableTile()
		 * @generated
		 */
		EClass PASSABLE_TILE = eINSTANCE.getPassableTile();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.impl.GhostHouseTileImpl <em>Ghost House Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.GhostHouseTileImpl
		 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl#getGhostHouseTile()
		 * @generated
		 */
		EClass GHOST_HOUSE_TILE = eINSTANCE.getGhostHouseTile();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.impl.WallTileImpl <em>Wall Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.WallTileImpl
		 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl#getWallTile()
		 * @generated
		 */
		EClass WALL_TILE = eINSTANCE.getWallTile();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PelletImpl <em>Pellet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PelletImpl
		 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl#getPellet()
		 * @generated
		 */
		EClass PELLET = eINSTANCE.getPellet();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.impl.SuperPelletImpl <em>Super Pellet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.SuperPelletImpl
		 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl#getSuperPellet()
		 * @generated
		 */
		EClass SUPER_PELLET = eINSTANCE.getSuperPellet();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.PelletType <em>Pellet Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PelletType
		 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl#getPelletType()
		 * @generated
		 */
		EEnum PELLET_TYPE = eINSTANCE.getPelletType();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.GhostPersonality <em>Ghost Personality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.GhostPersonality
		 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.impl.PacmanPackageImpl#getGhostPersonality()
		 * @generated
		 */
		EEnum GHOST_PERSONALITY = eINSTANCE.getGhostPersonality();

	}

} //PacmanPackage
