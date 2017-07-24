/**
 */
package org.tetrabox.example.pacman.xpacman.pacman;

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
 * @see org.tetrabox.example.pacman.xpacman.pacman.PacmanFactory
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
	String eNS_URI = "http://org.tetrabox.example.pacman.xpacman/pacman/";

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
	PacmanPackage eINSTANCE = org.tetrabox.example.pacman.xpacman.pacman.impl.PacmanPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.pacman.impl.TileImpl <em>Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.pacman.impl.TileImpl
	 * @see org.tetrabox.example.pacman.xpacman.pacman.impl.PacmanPackageImpl#getTile()
	 * @generated
	 */
	int TILE = 0;

	/**
	 * The feature id for the '<em><b>Top</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__TOP = 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__BOTTOM = 2;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__LEFT = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__X = 4;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__Y = 5;

	/**
	 * The feature id for the '<em><b>Passable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__PASSABLE = 6;

	/**
	 * The feature id for the '<em><b>Initial Pellet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__INITIAL_PELLET = 7;

	/**
	 * The feature id for the '<em><b>Has Pellet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__HAS_PELLET = 8;

	/**
	 * The number of structural features of the '<em>Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.pacman.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.pacman.impl.BoardImpl
	 * @see org.tetrabox.example.pacman.xpacman.pacman.impl.PacmanPackageImpl#getBoard()
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
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.pacman.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.pacman.impl.EntityImpl
	 * @see org.tetrabox.example.pacman.xpacman.pacman.impl.PacmanPackageImpl#getEntity()
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
	 * The feature id for the '<em><b>Next Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NEXT_TILE = 4;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.pacman.impl.PacmanImpl <em>Pacman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.pacman.impl.PacmanImpl
	 * @see org.tetrabox.example.pacman.xpacman.pacman.impl.PacmanPackageImpl#getPacman()
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
	 * The feature id for the '<em><b>Next Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN__NEXT_TILE = ENTITY__NEXT_TILE;

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
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.pacman.impl.GhostImpl <em>Ghost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.pacman.impl.GhostImpl
	 * @see org.tetrabox.example.pacman.xpacman.pacman.impl.PacmanPackageImpl#getGhost()
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
	 * The feature id for the '<em><b>Next Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST__NEXT_TILE = ENTITY__NEXT_TILE;

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
	 * The feature id for the '<em><b>Target Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST__TARGET_TILE = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ghost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.pacman.PelletType <em>Pellet Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.pacman.PelletType
	 * @see org.tetrabox.example.pacman.xpacman.pacman.impl.PacmanPackageImpl#getPelletType()
	 * @generated
	 */
	int PELLET_TYPE = 5;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.pacman.GhostPersonality <em>Ghost Personality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.pacman.GhostPersonality
	 * @see org.tetrabox.example.pacman.xpacman.pacman.impl.PacmanPackageImpl#getGhostPersonality()
	 * @generated
	 */
	int GHOST_PERSONALITY = 6;


	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.pacman.Tile <em>Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Tile
	 * @generated
	 */
	EClass getTile();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.pacman.xpacman.pacman.Tile#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Top</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Tile#getTop()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_Top();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.pacman.xpacman.pacman.Tile#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Tile#getRight()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_Right();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.pacman.xpacman.pacman.Tile#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bottom</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Tile#getBottom()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_Bottom();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.pacman.xpacman.pacman.Tile#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Tile#getLeft()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_Left();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.pacman.xpacman.pacman.Tile#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Tile#getX()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_X();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.pacman.xpacman.pacman.Tile#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Tile#getY()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.pacman.xpacman.pacman.Tile#isPassable <em>Passable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passable</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Tile#isPassable()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_Passable();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.pacman.xpacman.pacman.Tile#getInitialPellet <em>Initial Pellet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Pellet</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Tile#getInitialPellet()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_InitialPellet();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.pacman.xpacman.pacman.Tile#isHasPellet <em>Has Pellet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Pellet</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Tile#isHasPellet()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_HasPellet();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.pacman.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tetrabox.example.pacman.xpacman.pacman.Board#getTiles <em>Tiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tiles</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Board#getTiles()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Tiles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tetrabox.example.pacman.xpacman.pacman.Board#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Board#getEntities()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Entities();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.pacman.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.pacman.xpacman.pacman.Entity#getInitialTile <em>Initial Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Tile</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Entity#getInitialTile()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_InitialTile();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.pacman.xpacman.pacman.Entity#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Entity#getSpeed()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Speed();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.pacman.xpacman.pacman.Entity#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Entity#getDirection()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Direction();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.pacman.xpacman.pacman.Entity#getCurrentTile <em>Current Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Tile</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Entity#getCurrentTile()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_CurrentTile();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.pacman.xpacman.pacman.Entity#getNextTile <em>Next Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Tile</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Entity#getNextTile()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_NextTile();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.pacman.Pacman <em>Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Pacman
	 * @generated
	 */
	EClass getPacman();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.pacman.xpacman.pacman.Pacman#getInitialLives <em>Initial Lives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Lives</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Pacman#getInitialLives()
	 * @see #getPacman()
	 * @generated
	 */
	EAttribute getPacman_InitialLives();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.pacman.xpacman.pacman.Pacman#getPelletsEaten <em>Pellets Eaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pellets Eaten</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Pacman#getPelletsEaten()
	 * @see #getPacman()
	 * @generated
	 */
	EAttribute getPacman_PelletsEaten();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.pacman.xpacman.pacman.Pacman#getLives <em>Lives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lives</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Pacman#getLives()
	 * @see #getPacman()
	 * @generated
	 */
	EAttribute getPacman_Lives();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.pacman.Ghost <em>Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ghost</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Ghost
	 * @generated
	 */
	EClass getGhost();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.pacman.xpacman.pacman.Ghost#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Ghost#getName()
	 * @see #getGhost()
	 * @generated
	 */
	EAttribute getGhost_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.pacman.xpacman.pacman.Ghost#getPersonnality <em>Personnality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Personnality</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Ghost#getPersonnality()
	 * @see #getGhost()
	 * @generated
	 */
	EAttribute getGhost_Personnality();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.pacman.xpacman.pacman.Ghost#getTargetTile <em>Target Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Tile</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.Ghost#getTargetTile()
	 * @see #getGhost()
	 * @generated
	 */
	EReference getGhost_TargetTile();

	/**
	 * Returns the meta object for enum '{@link org.tetrabox.example.pacman.xpacman.pacman.PelletType <em>Pellet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pellet Type</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.PelletType
	 * @generated
	 */
	EEnum getPelletType();

	/**
	 * Returns the meta object for enum '{@link org.tetrabox.example.pacman.xpacman.pacman.GhostPersonality <em>Ghost Personality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ghost Personality</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.GhostPersonality
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
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.pacman.impl.TileImpl <em>Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.pacman.impl.TileImpl
		 * @see org.tetrabox.example.pacman.xpacman.pacman.impl.PacmanPackageImpl#getTile()
		 * @generated
		 */
		EClass TILE = eINSTANCE.getTile();

		/**
		 * The meta object literal for the '<em><b>Top</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__TOP = eINSTANCE.getTile_Top();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__RIGHT = eINSTANCE.getTile_Right();

		/**
		 * The meta object literal for the '<em><b>Bottom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__BOTTOM = eINSTANCE.getTile_Bottom();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__LEFT = eINSTANCE.getTile_Left();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__X = eINSTANCE.getTile_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__Y = eINSTANCE.getTile_Y();

		/**
		 * The meta object literal for the '<em><b>Passable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__PASSABLE = eINSTANCE.getTile_Passable();

		/**
		 * The meta object literal for the '<em><b>Initial Pellet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__INITIAL_PELLET = eINSTANCE.getTile_InitialPellet();

		/**
		 * The meta object literal for the '<em><b>Has Pellet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__HAS_PELLET = eINSTANCE.getTile_HasPellet();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.pacman.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.pacman.impl.BoardImpl
		 * @see org.tetrabox.example.pacman.xpacman.pacman.impl.PacmanPackageImpl#getBoard()
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
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.pacman.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.pacman.impl.EntityImpl
		 * @see org.tetrabox.example.pacman.xpacman.pacman.impl.PacmanPackageImpl#getEntity()
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
		 * The meta object literal for the '<em><b>Next Tile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__NEXT_TILE = eINSTANCE.getEntity_NextTile();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.pacman.impl.PacmanImpl <em>Pacman</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.pacman.impl.PacmanImpl
		 * @see org.tetrabox.example.pacman.xpacman.pacman.impl.PacmanPackageImpl#getPacman()
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
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.pacman.impl.GhostImpl <em>Ghost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.pacman.impl.GhostImpl
		 * @see org.tetrabox.example.pacman.xpacman.pacman.impl.PacmanPackageImpl#getGhost()
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
		 * The meta object literal for the '<em><b>Target Tile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GHOST__TARGET_TILE = eINSTANCE.getGhost_TargetTile();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.pacman.PelletType <em>Pellet Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.pacman.PelletType
		 * @see org.tetrabox.example.pacman.xpacman.pacman.impl.PacmanPackageImpl#getPelletType()
		 * @generated
		 */
		EEnum PELLET_TYPE = eINSTANCE.getPelletType();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.pacman.GhostPersonality <em>Ghost Personality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.pacman.GhostPersonality
		 * @see org.tetrabox.example.pacman.xpacman.pacman.impl.PacmanPackageImpl#getGhostPersonality()
		 * @generated
		 */
		EEnum GHOST_PERSONALITY = eINSTANCE.getGhostPersonality();

	}

} //PacmanPackage
