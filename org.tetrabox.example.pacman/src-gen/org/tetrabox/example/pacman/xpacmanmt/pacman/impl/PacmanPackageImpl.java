/**
 */
package org.tetrabox.example.pacman.xpacmanmt.pacman.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Board;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Entity;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost;
import org.tetrabox.example.pacman.xpacmanmt.pacman.GhostHouseTile;
import org.tetrabox.example.pacman.xpacmanmt.pacman.GhostPersonality;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Pacman;
import org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanFactory;
import org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage;
import org.tetrabox.example.pacman.xpacmanmt.pacman.PassableTile;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Pellet;
import org.tetrabox.example.pacman.xpacmanmt.pacman.PelletType;
import org.tetrabox.example.pacman.xpacmanmt.pacman.SuperPellet;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Tile;
import org.tetrabox.example.pacman.xpacmanmt.pacman.WallTile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PacmanPackageImpl extends EPackageImpl implements PacmanPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ghostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passableTileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ghostHouseTileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wallTileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pelletEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superPelletEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pelletTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ghostPersonalityEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PacmanPackageImpl() {
		super(eNS_URI, PacmanFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PacmanPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PacmanPackage init() {
		if (isInited) return (PacmanPackage)EPackage.Registry.INSTANCE.getEPackage(PacmanPackage.eNS_URI);

		// Obtain or create and register package
		PacmanPackageImpl thePacmanPackage = (PacmanPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PacmanPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PacmanPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePacmanPackage.createPackageContents();

		// Initialize created meta-data
		thePacmanPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePacmanPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PacmanPackage.eNS_URI, thePacmanPackage);
		return thePacmanPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTile() {
		return abstractTileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTile_Top() {
		return (EReference)abstractTileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTile_Right() {
		return (EReference)abstractTileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTile_Bottom() {
		return (EReference)abstractTileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTile_Left() {
		return (EReference)abstractTileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTile_X() {
		return (EAttribute)abstractTileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTile_Y() {
		return (EAttribute)abstractTileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTile() {
		return tileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTile_InitialPellet() {
		return (EAttribute)tileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTile_Pellet() {
		return (EReference)tileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoard() {
		return boardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoard_Tiles() {
		return (EReference)boardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoard_Entities() {
		return (EReference)boardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_InitialTile() {
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Speed() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Direction() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_CurrentTile() {
		return (EReference)entityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_NextTile() {
		return (EReference)entityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_XMoveProgress() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_YMoveProgress() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacman() {
		return pacmanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPacman_InitialLives() {
		return (EAttribute)pacmanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPacman_PelletsEaten() {
		return (EAttribute)pacmanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPacman_Lives() {
		return (EAttribute)pacmanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPacman_Energized() {
		return (EAttribute)pacmanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGhost() {
		return ghostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGhost_Name() {
		return (EAttribute)ghostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGhost_Personnality() {
		return (EAttribute)ghostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGhost_TargetTile() {
		return (EReference)ghostEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassableTile() {
		return passableTileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGhostHouseTile() {
		return ghostHouseTileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWallTile() {
		return wallTileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPellet() {
		return pelletEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperPellet() {
		return superPelletEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPelletType() {
		return pelletTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGhostPersonality() {
		return ghostPersonalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanFactory getPacmanFactory() {
		return (PacmanFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractTileEClass = createEClass(ABSTRACT_TILE);
		createEReference(abstractTileEClass, ABSTRACT_TILE__TOP);
		createEReference(abstractTileEClass, ABSTRACT_TILE__RIGHT);
		createEReference(abstractTileEClass, ABSTRACT_TILE__BOTTOM);
		createEReference(abstractTileEClass, ABSTRACT_TILE__LEFT);
		createEAttribute(abstractTileEClass, ABSTRACT_TILE__X);
		createEAttribute(abstractTileEClass, ABSTRACT_TILE__Y);

		boardEClass = createEClass(BOARD);
		createEReference(boardEClass, BOARD__TILES);
		createEReference(boardEClass, BOARD__ENTITIES);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__INITIAL_TILE);
		createEAttribute(entityEClass, ENTITY__SPEED);
		createEAttribute(entityEClass, ENTITY__DIRECTION);
		createEReference(entityEClass, ENTITY__CURRENT_TILE);
		createEReference(entityEClass, ENTITY__NEXT_TILE);
		createEAttribute(entityEClass, ENTITY__XMOVE_PROGRESS);
		createEAttribute(entityEClass, ENTITY__YMOVE_PROGRESS);

		pacmanEClass = createEClass(PACMAN);
		createEAttribute(pacmanEClass, PACMAN__INITIAL_LIVES);
		createEAttribute(pacmanEClass, PACMAN__PELLETS_EATEN);
		createEAttribute(pacmanEClass, PACMAN__LIVES);
		createEAttribute(pacmanEClass, PACMAN__ENERGIZED);

		ghostEClass = createEClass(GHOST);
		createEAttribute(ghostEClass, GHOST__NAME);
		createEAttribute(ghostEClass, GHOST__PERSONNALITY);
		createEReference(ghostEClass, GHOST__TARGET_TILE);

		passableTileEClass = createEClass(PASSABLE_TILE);

		tileEClass = createEClass(TILE);
		createEAttribute(tileEClass, TILE__INITIAL_PELLET);
		createEReference(tileEClass, TILE__PELLET);

		ghostHouseTileEClass = createEClass(GHOST_HOUSE_TILE);

		wallTileEClass = createEClass(WALL_TILE);

		pelletEClass = createEClass(PELLET);

		superPelletEClass = createEClass(SUPER_PELLET);

		// Create enums
		pelletTypeEEnum = createEEnum(PELLET_TYPE);
		ghostPersonalityEEnum = createEEnum(GHOST_PERSONALITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pacmanEClass.getESuperTypes().add(this.getEntity());
		ghostEClass.getESuperTypes().add(this.getEntity());
		passableTileEClass.getESuperTypes().add(this.getAbstractTile());
		tileEClass.getESuperTypes().add(this.getPassableTile());
		ghostHouseTileEClass.getESuperTypes().add(this.getPassableTile());
		wallTileEClass.getESuperTypes().add(this.getAbstractTile());
		superPelletEClass.getESuperTypes().add(this.getPellet());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractTileEClass, AbstractTile.class, "AbstractTile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractTile_Top(), this.getAbstractTile(), this.getAbstractTile_Bottom(), "top", null, 0, 1, AbstractTile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTile_Right(), this.getAbstractTile(), this.getAbstractTile_Left(), "right", null, 0, 1, AbstractTile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTile_Bottom(), this.getAbstractTile(), this.getAbstractTile_Top(), "bottom", null, 0, 1, AbstractTile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTile_Left(), this.getAbstractTile(), this.getAbstractTile_Right(), "left", null, 0, 1, AbstractTile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTile_X(), ecorePackage.getEInt(), "x", null, 0, 1, AbstractTile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTile_Y(), ecorePackage.getEInt(), "y", null, 0, 1, AbstractTile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(abstractTileEClass, null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(boardEClass, Board.class, "Board", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoard_Tiles(), this.getAbstractTile(), null, "tiles", null, 0, -1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoard_Entities(), this.getEntity(), null, "entities", null, 0, -1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(boardEClass, null, "initializeModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "args", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(boardEClass, null, "reset", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(boardEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(boardEClass, null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "deltaTime", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_InitialTile(), this.getPassableTile(), null, "initialTile", null, 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Speed(), ecorePackage.getEInt(), "speed", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Direction(), ecorePackage.getEInt(), "direction", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_CurrentTile(), this.getPassableTile(), null, "currentTile", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_NextTile(), this.getPassableTile(), null, "nextTile", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_XMoveProgress(), ecorePackage.getEInt(), "xMoveProgress", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_YMoveProgress(), ecorePackage.getEInt(), "yMoveProgress", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(entityEClass, null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(entityEClass, null, "modifySpeed", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "speed", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(entityEClass, null, "changeDirection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "newDirection", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(entityEClass, null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "deltaTime", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(entityEClass, null, "enterNextTile", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pacmanEClass, Pacman.class, "Pacman", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPacman_InitialLives(), ecorePackage.getEInt(), "initialLives", null, 0, 1, Pacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPacman_PelletsEaten(), ecorePackage.getEInt(), "pelletsEaten", null, 0, 1, Pacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPacman_Lives(), ecorePackage.getEInt(), "lives", null, 0, 1, Pacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPacman_Energized(), ecorePackage.getEBoolean(), "energized", null, 0, 1, Pacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(pacmanEClass, null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pacmanEClass, null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "deltaTime", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pacmanEClass, null, "changeDirection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "newDirection", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(pacmanEClass, null, "energize", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(pacmanEClass, null, "up", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(pacmanEClass, null, "left", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(pacmanEClass, null, "down", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(pacmanEClass, null, "right", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pacmanEClass, ecorePackage.getEBoolean(), "canTakeDirection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "direction", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(pacmanEClass, null, "enterNextTile", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(pacmanEClass, null, "kill", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ghostEClass, Ghost.class, "Ghost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGhost_Name(), ecorePackage.getEString(), "name", null, 0, 1, Ghost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGhost_Personnality(), this.getGhostPersonality(), "personnality", null, 1, 1, Ghost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGhost_TargetTile(), this.getAbstractTile(), null, "targetTile", null, 0, 1, Ghost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(ghostEClass, null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ghostEClass, null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "deltaTime", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(ghostEClass, null, "activate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(ghostEClass, null, "enterChaseMode", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(ghostEClass, null, "enterScatterMode", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(ghostEClass, null, "enterFrightenedMode", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ghostEClass, null, "changeTargetTile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractTile(), "targetTile", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(ghostEClass, null, "enterNextTile", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(passableTileEClass, PassableTile.class, "PassableTile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tileEClass, Tile.class, "Tile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTile_InitialPellet(), this.getPelletType(), "initialPellet", "NO_PELLET", 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTile_Pellet(), this.getPellet(), null, "pellet", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(tileEClass, null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tileEClass, null, "eatPellet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPacman(), "pacman", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ghostHouseTileEClass, GhostHouseTile.class, "GhostHouseTile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wallTileEClass, WallTile.class, "WallTile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pelletEClass, Pellet.class, "Pellet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(pelletEClass, null, "eat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPacman(), "pacman", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(superPelletEClass, SuperPellet.class, "SuperPellet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(superPelletEClass, null, "eat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPacman(), "pacman", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(pelletTypeEEnum, PelletType.class, "PelletType");
		addEEnumLiteral(pelletTypeEEnum, PelletType.NO_PELLET);
		addEEnumLiteral(pelletTypeEEnum, PelletType.PELLET);
		addEEnumLiteral(pelletTypeEEnum, PelletType.SUPER_PELLET);

		initEEnum(ghostPersonalityEEnum, GhostPersonality.class, "GhostPersonality");
		addEEnumLiteral(ghostPersonalityEEnum, GhostPersonality.SHADOW);
		addEEnumLiteral(ghostPersonalityEEnum, GhostPersonality.SPEEDY);
		addEEnumLiteral(ghostPersonalityEEnum, GhostPersonality.BASHFUL);
		addEEnumLiteral(ghostPersonalityEEnum, GhostPersonality.POKEY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";	
		addAnnotation
		  (abstractTileEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (boardEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (boardEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (boardEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (boardEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (entityEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (entityEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (entityEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (entityEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (entityEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEntity_Speed(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEntity_Direction(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEntity_CurrentTile(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEntity_NextTile(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEntity_XMoveProgress(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEntity_YMoveProgress(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (pacmanEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (pacmanEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (pacmanEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (pacmanEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (pacmanEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (pacmanEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (pacmanEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (pacmanEClass.getEOperations().get(7), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (pacmanEClass.getEOperations().get(8), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (pacmanEClass.getEOperations().get(9), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (pacmanEClass.getEOperations().get(10), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPacman_PelletsEaten(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPacman_Lives(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPacman_Energized(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (ghostEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (ghostEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (ghostEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (ghostEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (ghostEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (ghostEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (ghostEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (ghostEClass.getEOperations().get(7), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGhost_TargetTile(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (tileEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (tileEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTile_Pellet(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (pelletEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (pelletEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (superPelletEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (superPelletEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });
	}

} //PacmanPackageImpl
