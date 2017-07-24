/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl;

import fr.inria.diverse.event.commons.model.property.PropertyPackage;

import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiterPackage;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.impl.XPacmanArbiterPackageImpl;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.XPacmanEventPackage;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.XPacmanEventPackageImpl;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyPackage;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.BoardProvider;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.BoardQuery;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.BoardReference;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.EntityProvider;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.EntityQuery;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.EntityReference;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.GhostProvider;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.GhostQuery;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.GhostReference;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.PacmanProvider;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.PacmanQuery;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.PacmanReference;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.XPacmanProviderFactory;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.XPacmanProviderPackage;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.XPacmanScenarioPackage;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.impl.XPacmanScenarioPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XPacmanProviderPackageImpl extends EPackageImpl implements XPacmanProviderPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ghostProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ghostReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ghostQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boardProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boardReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boardQueryEClass = null;

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
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.XPacmanProviderPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XPacmanProviderPackageImpl() {
		super(eNS_URI, XPacmanProviderFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XPacmanProviderPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XPacmanProviderPackage init() {
		if (isInited) return (XPacmanProviderPackage)EPackage.Registry.INSTANCE.getEPackage(XPacmanProviderPackage.eNS_URI);

		// Obtain or create and register package
		XPacmanProviderPackageImpl theXPacmanProviderPackage = (XPacmanProviderPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XPacmanProviderPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XPacmanProviderPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PacmanPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		XPacmanArbiterPackageImpl theXPacmanArbiterPackage = (XPacmanArbiterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XPacmanArbiterPackage.eNS_URI) instanceof XPacmanArbiterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XPacmanArbiterPackage.eNS_URI) : XPacmanArbiterPackage.eINSTANCE);
		XPacmanEventPackageImpl theXPacmanEventPackage = (XPacmanEventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XPacmanEventPackage.eNS_URI) instanceof XPacmanEventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XPacmanEventPackage.eNS_URI) : XPacmanEventPackage.eINSTANCE);
		XPacmanPropertyPackageImpl theXPacmanPropertyPackage = (XPacmanPropertyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XPacmanPropertyPackage.eNS_URI) instanceof XPacmanPropertyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XPacmanPropertyPackage.eNS_URI) : XPacmanPropertyPackage.eINSTANCE);
		XPacmanScenarioPackageImpl theXPacmanScenarioPackage = (XPacmanScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XPacmanScenarioPackage.eNS_URI) instanceof XPacmanScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XPacmanScenarioPackage.eNS_URI) : XPacmanScenarioPackage.eINSTANCE);

		// Create package meta-data objects
		theXPacmanProviderPackage.createPackageContents();
		theXPacmanArbiterPackage.createPackageContents();
		theXPacmanEventPackage.createPackageContents();
		theXPacmanPropertyPackage.createPackageContents();
		theXPacmanScenarioPackage.createPackageContents();

		// Initialize created meta-data
		theXPacmanProviderPackage.initializePackageContents();
		theXPacmanArbiterPackage.initializePackageContents();
		theXPacmanEventPackage.initializePackageContents();
		theXPacmanPropertyPackage.initializePackageContents();
		theXPacmanScenarioPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXPacmanProviderPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XPacmanProviderPackage.eNS_URI, theXPacmanProviderPackage);
		return theXPacmanProviderPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanProvider() {
		return pacmanProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanReference() {
		return pacmanReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanQuery() {
		return pacmanQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGhostProvider() {
		return ghostProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGhostReference() {
		return ghostReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGhostQuery() {
		return ghostQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityProvider() {
		return entityProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityReference() {
		return entityReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityQuery() {
		return entityQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoardProvider() {
		return boardProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoardReference() {
		return boardReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoardQuery() {
		return boardQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanProviderFactory getXPacmanProviderFactory() {
		return (XPacmanProviderFactory)getEFactoryInstance();
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
		pacmanProviderEClass = createEClass(PACMAN_PROVIDER);

		pacmanReferenceEClass = createEClass(PACMAN_REFERENCE);

		pacmanQueryEClass = createEClass(PACMAN_QUERY);

		ghostProviderEClass = createEClass(GHOST_PROVIDER);

		ghostReferenceEClass = createEClass(GHOST_REFERENCE);

		ghostQueryEClass = createEClass(GHOST_QUERY);

		entityProviderEClass = createEClass(ENTITY_PROVIDER);

		entityReferenceEClass = createEClass(ENTITY_REFERENCE);

		entityQueryEClass = createEClass(ENTITY_QUERY);

		boardProviderEClass = createEClass(BOARD_PROVIDER);

		boardReferenceEClass = createEClass(BOARD_REFERENCE);

		boardQueryEClass = createEClass(BOARD_QUERY);
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

		// Obtain other dependent packages
		ScenarioPackage theScenarioPackage = (ScenarioPackage)EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI);
		PacmanPackage thePacmanPackage = (PacmanPackage)EPackage.Registry.INSTANCE.getEPackage(PacmanPackage.eNS_URI);
		PropertyPackage thePropertyPackage = (PropertyPackage)EPackage.Registry.INSTANCE.getEPackage(PropertyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theScenarioPackage.getElementProvider());
		EGenericType g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanProviderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementReference());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPacmanProvider());
		pacmanReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementQuery());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thePropertyPackage.getStateProperty());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(thePacmanPackage.getPacman());
		g2.getETypeArguments().add(g3);
		pacmanQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPacmanProvider());
		pacmanQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementProvider());
		g2 = createEGenericType(thePacmanPackage.getGhost());
		g1.getETypeArguments().add(g2);
		ghostProviderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementReference());
		g2 = createEGenericType(thePacmanPackage.getGhost());
		g1.getETypeArguments().add(g2);
		ghostReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGhostProvider());
		ghostReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementQuery());
		g2 = createEGenericType(thePacmanPackage.getGhost());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thePropertyPackage.getStateProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getGhost());
		g2.getETypeArguments().add(g3);
		ghostQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGhostProvider());
		ghostQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementProvider());
		g2 = createEGenericType(thePacmanPackage.getEntity());
		g1.getETypeArguments().add(g2);
		entityProviderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementReference());
		g2 = createEGenericType(thePacmanPackage.getEntity());
		g1.getETypeArguments().add(g2);
		entityReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getEntityProvider());
		entityReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementQuery());
		g2 = createEGenericType(thePacmanPackage.getEntity());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thePropertyPackage.getStateProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getEntity());
		g2.getETypeArguments().add(g3);
		entityQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getEntityProvider());
		entityQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementProvider());
		g2 = createEGenericType(thePacmanPackage.getBoard());
		g1.getETypeArguments().add(g2);
		boardProviderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementReference());
		g2 = createEGenericType(thePacmanPackage.getBoard());
		g1.getETypeArguments().add(g2);
		boardReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBoardProvider());
		boardReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementQuery());
		g2 = createEGenericType(thePacmanPackage.getBoard());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thePropertyPackage.getStateProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getBoard());
		g2.getETypeArguments().add(g3);
		boardQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBoardProvider());
		boardQueryEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(pacmanProviderEClass, PacmanProvider.class, "PacmanProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pacmanReferenceEClass, PacmanReference.class, "PacmanReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pacmanQueryEClass, PacmanQuery.class, "PacmanQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ghostProviderEClass, GhostProvider.class, "GhostProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ghostReferenceEClass, GhostReference.class, "GhostReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ghostQueryEClass, GhostQuery.class, "GhostQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityProviderEClass, EntityProvider.class, "EntityProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityReferenceEClass, EntityReference.class, "EntityReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityQueryEClass, EntityQuery.class, "EntityQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boardProviderEClass, BoardProvider.class, "BoardProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boardReferenceEClass, BoardReference.class, "BoardReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boardQueryEClass, BoardQuery.class, "BoardQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //XPacmanProviderPackageImpl
