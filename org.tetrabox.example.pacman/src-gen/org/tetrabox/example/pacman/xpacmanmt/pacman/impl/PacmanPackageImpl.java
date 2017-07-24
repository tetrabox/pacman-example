/**
 */
package org.tetrabox.example.pacman.xpacmanmt.pacman.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.tetrabox.example.pacman.xpacmanmt.pacman.Board;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Entity;
import org.tetrabox.example.pacman.xpacmanmt.pacman.EntityAspect;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost;
import org.tetrabox.example.pacman.xpacmanmt.pacman.GhostAspect;
import org.tetrabox.example.pacman.xpacmanmt.pacman.GhostPersonality;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Pacman;
import org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanAspect;
import org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanFactory;
import org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage;
import org.tetrabox.example.pacman.xpacmanmt.pacman.PelletType;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Tile;
import org.tetrabox.example.pacman.xpacmanmt.pacman.TileAspect;

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
	public EClass getTile() {
		return tileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTile_Top() {
		return (EReference)tileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTile_Right() {
		return (EReference)tileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTile_Bottom() {
		return (EReference)tileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTile_Left() {
		return (EReference)tileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTile_X() {
		return (EAttribute)tileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTile_Y() {
		return (EAttribute)tileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTile_Passable() {
		return (EAttribute)tileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTile_InitialPellet() {
		return (EAttribute)tileEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTile_HasPellet() {
		return (EAttribute)tileEClass.getEStructuralFeatures().get(8);
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
		tileEClass = createEClass(TILE);
		createEReference(tileEClass, TILE__TOP);
		createEReference(tileEClass, TILE__RIGHT);
		createEReference(tileEClass, TILE__BOTTOM);
		createEReference(tileEClass, TILE__LEFT);
		createEAttribute(tileEClass, TILE__X);
		createEAttribute(tileEClass, TILE__Y);
		createEAttribute(tileEClass, TILE__PASSABLE);
		createEAttribute(tileEClass, TILE__INITIAL_PELLET);
		createEAttribute(tileEClass, TILE__HAS_PELLET);

		boardEClass = createEClass(BOARD);
		createEReference(boardEClass, BOARD__TILES);
		createEReference(boardEClass, BOARD__ENTITIES);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__INITIAL_TILE);
		createEAttribute(entityEClass, ENTITY__SPEED);
		createEAttribute(entityEClass, ENTITY__DIRECTION);
		createEReference(entityEClass, ENTITY__CURRENT_TILE);
		createEReference(entityEClass, ENTITY__NEXT_TILE);

		pacmanEClass = createEClass(PACMAN);
		createEAttribute(pacmanEClass, PACMAN__INITIAL_LIVES);
		createEAttribute(pacmanEClass, PACMAN__PELLETS_EATEN);
		createEAttribute(pacmanEClass, PACMAN__LIVES);

		ghostEClass = createEClass(GHOST);
		createEAttribute(ghostEClass, GHOST__NAME);
		createEAttribute(ghostEClass, GHOST__PERSONNALITY);
		createEReference(ghostEClass, GHOST__TARGET_TILE);

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

		// Initialize classes and features; add operations and parameters
		initEClass(tileEClass, Tile.class, "Tile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTile_Top(), this.getTile(), this.getTile_Bottom(), "top", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTile_Right(), this.getTile(), this.getTile_Left(), "right", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTile_Bottom(), this.getTile(), this.getTile_Top(), "bottom", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTile_Left(), this.getTile(), this.getTile_Right(), "left", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_X(), ecorePackage.getEInt(), "x", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_Y(), ecorePackage.getEInt(), "y", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_Passable(), ecorePackage.getEBoolean(), "passable", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_InitialPellet(), this.getPelletType(), "initialPellet", "NO_PELLET", 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_HasPellet(), ecorePackage.getEBoolean(), "hasPellet", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(tileEClass, null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(boardEClass, Board.class, "Board", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoard_Tiles(), this.getTile(), null, "tiles", null, 0, -1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoard_Entities(), this.getEntity(), null, "entities", null, 0, -1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(boardEClass, null, "initializeModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "args", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(boardEClass, null, "reset", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(boardEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(boardEClass, null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "deltaTime", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_InitialTile(), this.getTile(), null, "initialTile", null, 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Speed(), ecorePackage.getEInt(), "speed", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Direction(), ecorePackage.getEInt(), "direction", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_CurrentTile(), this.getTile(), null, "currentTile", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_NextTile(), this.getTile(), null, "nextTile", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		addEOperation(pacmanEClass, null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pacmanEClass, null, "changeDirection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "newDirection", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(pacmanEClass, null, "up", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(pacmanEClass, null, "left", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(pacmanEClass, null, "down", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(pacmanEClass, null, "right", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(pacmanEClass, null, "enterNextTile", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(pacmanEClass, null, "eatPellet", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(pacmanEClass, null, "kill", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ghostEClass, Ghost.class, "Ghost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGhost_Name(), ecorePackage.getEString(), "name", null, 0, 1, Ghost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGhost_Personnality(), this.getGhostPersonality(), "personnality", null, 1, 1, Ghost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGhost_TargetTile(), this.getTile(), null, "targetTile", null, 0, 1, Ghost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(ghostEClass, null, "changeTargetTile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTile(), "targetTile", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(ghostEClass, null, "enterNextTile", 0, 1, IS_UNIQUE, IS_ORDERED);

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
		  (tileEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTile_HasPellet(), 
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
		  (getGhost_TargetTile(), 
		   source, 
		   new String[] {
		   });
	}

} //PacmanPackageImpl
