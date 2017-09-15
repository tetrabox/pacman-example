/**
 */
package pacman;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pacman.PacmanFactory
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
	String eNS_URI = "http://org.tetrabox.example.pacman/model";

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
	PacmanPackage eINSTANCE = pacman.impl.PacmanPackageImpl.init();

	/**
	 * The meta object id for the '{@link pacman.impl.AbstractTileImpl <em>Abstract Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman.impl.AbstractTileImpl
	 * @see pacman.impl.PacmanPackageImpl#getAbstractTile()
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
	 * The number of operations of the '<em>Abstract Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacman.impl.TileImpl <em>Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman.impl.TileImpl
	 * @see pacman.impl.PacmanPackageImpl#getTile()
	 * @generated
	 */
	int TILE = 6;

	/**
	 * The meta object id for the '{@link pacman.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman.impl.BoardImpl
	 * @see pacman.impl.PacmanPackageImpl#getBoard()
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
	 * The number of operations of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacman.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman.impl.EntityImpl
	 * @see pacman.impl.PacmanPackageImpl#getEntity()
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
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacman.impl.PacmanImpl <em>Pacman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman.impl.PacmanImpl
	 * @see pacman.impl.PacmanPackageImpl#getPacman()
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
	 * The feature id for the '<em><b>Initial Lives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN__INITIAL_LIVES = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pacman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pacman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman.impl.GhostImpl <em>Ghost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman.impl.GhostImpl
	 * @see pacman.impl.PacmanPackageImpl#getGhost()
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
	 * The number of structural features of the '<em>Ghost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ghost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman.impl.PassableTileImpl <em>Passable Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman.impl.PassableTileImpl
	 * @see pacman.impl.PacmanPackageImpl#getPassableTile()
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
	 * The number of operations of the '<em>Passable Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSABLE_TILE_OPERATION_COUNT = ABSTRACT_TILE_OPERATION_COUNT + 0;

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
	 * The number of structural features of the '<em>Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_FEATURE_COUNT = PASSABLE_TILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_OPERATION_COUNT = PASSABLE_TILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman.impl.GhostHouseTileImpl <em>Ghost House Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman.impl.GhostHouseTileImpl
	 * @see pacman.impl.PacmanPackageImpl#getGhostHouseTile()
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
	 * The number of operations of the '<em>Ghost House Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_HOUSE_TILE_OPERATION_COUNT = PASSABLE_TILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman.impl.WallTileImpl <em>Wall Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman.impl.WallTileImpl
	 * @see pacman.impl.PacmanPackageImpl#getWallTile()
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
	 * The number of operations of the '<em>Wall Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_TILE_OPERATION_COUNT = ABSTRACT_TILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman.impl.PelletImpl <em>Pellet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman.impl.PelletImpl
	 * @see pacman.impl.PacmanPackageImpl#getPellet()
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
	 * The number of operations of the '<em>Pellet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PELLET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacman.impl.SuperPelletImpl <em>Super Pellet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman.impl.SuperPelletImpl
	 * @see pacman.impl.PacmanPackageImpl#getSuperPellet()
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
	 * The number of operations of the '<em>Super Pellet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PELLET_OPERATION_COUNT = PELLET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman.PelletType <em>Pellet Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman.PelletType
	 * @see pacman.impl.PacmanPackageImpl#getPelletType()
	 * @generated
	 */
	int PELLET_TYPE = 11;


	/**
	 * The meta object id for the '{@link pacman.GhostPersonality <em>Ghost Personality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman.GhostPersonality
	 * @see pacman.impl.PacmanPackageImpl#getGhostPersonality()
	 * @generated
	 */
	int GHOST_PERSONALITY = 12;


	/**
	 * Returns the meta object for class '{@link pacman.AbstractTile <em>Abstract Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Tile</em>'.
	 * @see pacman.AbstractTile
	 * @generated
	 */
	EClass getAbstractTile();

	/**
	 * Returns the meta object for the reference '{@link pacman.AbstractTile#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Top</em>'.
	 * @see pacman.AbstractTile#getTop()
	 * @see #getAbstractTile()
	 * @generated
	 */
	EReference getAbstractTile_Top();

	/**
	 * Returns the meta object for the reference '{@link pacman.AbstractTile#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see pacman.AbstractTile#getRight()
	 * @see #getAbstractTile()
	 * @generated
	 */
	EReference getAbstractTile_Right();

	/**
	 * Returns the meta object for the reference '{@link pacman.AbstractTile#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bottom</em>'.
	 * @see pacman.AbstractTile#getBottom()
	 * @see #getAbstractTile()
	 * @generated
	 */
	EReference getAbstractTile_Bottom();

	/**
	 * Returns the meta object for the reference '{@link pacman.AbstractTile#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see pacman.AbstractTile#getLeft()
	 * @see #getAbstractTile()
	 * @generated
	 */
	EReference getAbstractTile_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacman.AbstractTile#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see pacman.AbstractTile#getX()
	 * @see #getAbstractTile()
	 * @generated
	 */
	EAttribute getAbstractTile_X();

	/**
	 * Returns the meta object for the attribute '{@link pacman.AbstractTile#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see pacman.AbstractTile#getY()
	 * @see #getAbstractTile()
	 * @generated
	 */
	EAttribute getAbstractTile_Y();

	/**
	 * Returns the meta object for class '{@link pacman.Tile <em>Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile</em>'.
	 * @see pacman.Tile
	 * @generated
	 */
	EClass getTile();

	/**
	 * Returns the meta object for the attribute '{@link pacman.Tile#getInitialPellet <em>Initial Pellet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Pellet</em>'.
	 * @see pacman.Tile#getInitialPellet()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_InitialPellet();

	/**
	 * Returns the meta object for class '{@link pacman.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see pacman.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the containment reference list '{@link pacman.Board#getTiles <em>Tiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tiles</em>'.
	 * @see pacman.Board#getTiles()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Tiles();

	/**
	 * Returns the meta object for the containment reference list '{@link pacman.Board#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see pacman.Board#getEntities()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Entities();

	/**
	 * Returns the meta object for class '{@link pacman.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see pacman.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the reference '{@link pacman.Entity#getInitialTile <em>Initial Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Tile</em>'.
	 * @see pacman.Entity#getInitialTile()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_InitialTile();

	/**
	 * Returns the meta object for class '{@link pacman.Pacman <em>Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman</em>'.
	 * @see pacman.Pacman
	 * @generated
	 */
	EClass getPacman();

	/**
	 * Returns the meta object for the attribute '{@link pacman.Pacman#getInitialLives <em>Initial Lives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Lives</em>'.
	 * @see pacman.Pacman#getInitialLives()
	 * @see #getPacman()
	 * @generated
	 */
	EAttribute getPacman_InitialLives();

	/**
	 * Returns the meta object for class '{@link pacman.Ghost <em>Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ghost</em>'.
	 * @see pacman.Ghost
	 * @generated
	 */
	EClass getGhost();

	/**
	 * Returns the meta object for the attribute '{@link pacman.Ghost#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pacman.Ghost#getName()
	 * @see #getGhost()
	 * @generated
	 */
	EAttribute getGhost_Name();

	/**
	 * Returns the meta object for the attribute '{@link pacman.Ghost#getPersonnality <em>Personnality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Personnality</em>'.
	 * @see pacman.Ghost#getPersonnality()
	 * @see #getGhost()
	 * @generated
	 */
	EAttribute getGhost_Personnality();

	/**
	 * Returns the meta object for the reference '{@link pacman.Ghost#getScatterTile <em>Scatter Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scatter Tile</em>'.
	 * @see pacman.Ghost#getScatterTile()
	 * @see #getGhost()
	 * @generated
	 */
	EReference getGhost_ScatterTile();

	/**
	 * Returns the meta object for class '{@link pacman.PassableTile <em>Passable Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passable Tile</em>'.
	 * @see pacman.PassableTile
	 * @generated
	 */
	EClass getPassableTile();

	/**
	 * Returns the meta object for class '{@link pacman.GhostHouseTile <em>Ghost House Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ghost House Tile</em>'.
	 * @see pacman.GhostHouseTile
	 * @generated
	 */
	EClass getGhostHouseTile();

	/**
	 * Returns the meta object for class '{@link pacman.WallTile <em>Wall Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wall Tile</em>'.
	 * @see pacman.WallTile
	 * @generated
	 */
	EClass getWallTile();

	/**
	 * Returns the meta object for class '{@link pacman.Pellet <em>Pellet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pellet</em>'.
	 * @see pacman.Pellet
	 * @generated
	 */
	EClass getPellet();

	/**
	 * Returns the meta object for class '{@link pacman.SuperPellet <em>Super Pellet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Pellet</em>'.
	 * @see pacman.SuperPellet
	 * @generated
	 */
	EClass getSuperPellet();

	/**
	 * Returns the meta object for enum '{@link pacman.PelletType <em>Pellet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pellet Type</em>'.
	 * @see pacman.PelletType
	 * @generated
	 */
	EEnum getPelletType();

	/**
	 * Returns the meta object for enum '{@link pacman.GhostPersonality <em>Ghost Personality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ghost Personality</em>'.
	 * @see pacman.GhostPersonality
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
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pacman.impl.AbstractTileImpl <em>Abstract Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman.impl.AbstractTileImpl
		 * @see pacman.impl.PacmanPackageImpl#getAbstractTile()
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
		 * The meta object literal for the '{@link pacman.impl.TileImpl <em>Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman.impl.TileImpl
		 * @see pacman.impl.PacmanPackageImpl#getTile()
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
		 * The meta object literal for the '{@link pacman.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman.impl.BoardImpl
		 * @see pacman.impl.PacmanPackageImpl#getBoard()
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
		 * The meta object literal for the '{@link pacman.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman.impl.EntityImpl
		 * @see pacman.impl.PacmanPackageImpl#getEntity()
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
		 * The meta object literal for the '{@link pacman.impl.PacmanImpl <em>Pacman</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman.impl.PacmanImpl
		 * @see pacman.impl.PacmanPackageImpl#getPacman()
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
		 * The meta object literal for the '{@link pacman.impl.GhostImpl <em>Ghost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman.impl.GhostImpl
		 * @see pacman.impl.PacmanPackageImpl#getGhost()
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
		 * The meta object literal for the '{@link pacman.impl.PassableTileImpl <em>Passable Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman.impl.PassableTileImpl
		 * @see pacman.impl.PacmanPackageImpl#getPassableTile()
		 * @generated
		 */
		EClass PASSABLE_TILE = eINSTANCE.getPassableTile();

		/**
		 * The meta object literal for the '{@link pacman.impl.GhostHouseTileImpl <em>Ghost House Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman.impl.GhostHouseTileImpl
		 * @see pacman.impl.PacmanPackageImpl#getGhostHouseTile()
		 * @generated
		 */
		EClass GHOST_HOUSE_TILE = eINSTANCE.getGhostHouseTile();

		/**
		 * The meta object literal for the '{@link pacman.impl.WallTileImpl <em>Wall Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman.impl.WallTileImpl
		 * @see pacman.impl.PacmanPackageImpl#getWallTile()
		 * @generated
		 */
		EClass WALL_TILE = eINSTANCE.getWallTile();

		/**
		 * The meta object literal for the '{@link pacman.impl.PelletImpl <em>Pellet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman.impl.PelletImpl
		 * @see pacman.impl.PacmanPackageImpl#getPellet()
		 * @generated
		 */
		EClass PELLET = eINSTANCE.getPellet();

		/**
		 * The meta object literal for the '{@link pacman.impl.SuperPelletImpl <em>Super Pellet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman.impl.SuperPelletImpl
		 * @see pacman.impl.PacmanPackageImpl#getSuperPellet()
		 * @generated
		 */
		EClass SUPER_PELLET = eINSTANCE.getSuperPellet();

		/**
		 * The meta object literal for the '{@link pacman.PelletType <em>Pellet Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman.PelletType
		 * @see pacman.impl.PacmanPackageImpl#getPelletType()
		 * @generated
		 */
		EEnum PELLET_TYPE = eINSTANCE.getPelletType();

		/**
		 * The meta object literal for the '{@link pacman.GhostPersonality <em>Ghost Personality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman.GhostPersonality
		 * @see pacman.impl.PacmanPackageImpl#getGhostPersonality()
		 * @generated
		 */
		EEnum GHOST_PERSONALITY = eINSTANCE.getGhostPersonality();

	}

} //PacmanPackage
