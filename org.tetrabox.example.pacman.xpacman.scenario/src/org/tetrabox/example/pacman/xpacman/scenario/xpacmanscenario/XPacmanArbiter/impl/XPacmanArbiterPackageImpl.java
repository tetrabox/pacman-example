/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.impl;

import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiter;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiterFactory;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiterPackage;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiterState;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiterTransition;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.XPacmanEventPackage;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.XPacmanEventPackageImpl;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyPackage;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.XPacmanPropertyPackageImpl;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.XPacmanProviderPackage;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.XPacmanScenarioPackage;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.impl.XPacmanScenarioPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XPacmanArbiterPackageImpl extends EPackageImpl implements XPacmanArbiterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPacmanArbiterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPacmanArbiterStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPacmanArbiterTransitionEClass = null;

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
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XPacmanArbiterPackageImpl() {
		super(eNS_URI, XPacmanArbiterFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XPacmanArbiterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XPacmanArbiterPackage init() {
		if (isInited) return (XPacmanArbiterPackage)EPackage.Registry.INSTANCE.getEPackage(XPacmanArbiterPackage.eNS_URI);

		// Obtain or create and register package
		XPacmanArbiterPackageImpl theXPacmanArbiterPackage = (XPacmanArbiterPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XPacmanArbiterPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XPacmanArbiterPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PacmanPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		XPacmanEventPackageImpl theXPacmanEventPackage = (XPacmanEventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XPacmanEventPackage.eNS_URI) instanceof XPacmanEventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XPacmanEventPackage.eNS_URI) : XPacmanEventPackage.eINSTANCE);
		XPacmanPropertyPackageImpl theXPacmanPropertyPackage = (XPacmanPropertyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XPacmanPropertyPackage.eNS_URI) instanceof XPacmanPropertyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XPacmanPropertyPackage.eNS_URI) : XPacmanPropertyPackage.eINSTANCE);
		XPacmanProviderPackageImpl theXPacmanProviderPackage = (XPacmanProviderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XPacmanProviderPackage.eNS_URI) instanceof XPacmanProviderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XPacmanProviderPackage.eNS_URI) : XPacmanProviderPackage.eINSTANCE);
		XPacmanScenarioPackageImpl theXPacmanScenarioPackage = (XPacmanScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XPacmanScenarioPackage.eNS_URI) instanceof XPacmanScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XPacmanScenarioPackage.eNS_URI) : XPacmanScenarioPackage.eINSTANCE);

		// Create package meta-data objects
		theXPacmanArbiterPackage.createPackageContents();
		theXPacmanEventPackage.createPackageContents();
		theXPacmanPropertyPackage.createPackageContents();
		theXPacmanProviderPackage.createPackageContents();
		theXPacmanScenarioPackage.createPackageContents();

		// Initialize created meta-data
		theXPacmanArbiterPackage.initializePackageContents();
		theXPacmanEventPackage.initializePackageContents();
		theXPacmanPropertyPackage.initializePackageContents();
		theXPacmanProviderPackage.initializePackageContents();
		theXPacmanScenarioPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXPacmanArbiterPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XPacmanArbiterPackage.eNS_URI, theXPacmanArbiterPackage);
		return theXPacmanArbiterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXPacmanArbiter() {
		return xPacmanArbiterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXPacmanArbiterState() {
		return xPacmanArbiterStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXPacmanArbiterTransition() {
		return xPacmanArbiterTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanArbiterFactory getXPacmanArbiterFactory() {
		return (XPacmanArbiterFactory)getEFactoryInstance();
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
		xPacmanArbiterEClass = createEClass(XPACMAN_ARBITER);

		xPacmanArbiterStateEClass = createEClass(XPACMAN_ARBITER_STATE);

		xPacmanArbiterTransitionEClass = createEClass(XPACMAN_ARBITER_TRANSITION);
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
		XPacmanPropertyPackage theXPacmanPropertyPackage = (XPacmanPropertyPackage)EPackage.Registry.INSTANCE.getEPackage(XPacmanPropertyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theScenarioPackage.getArbiter());
		EGenericType g2 = createEGenericType(theXPacmanPropertyPackage.getXPacmanProperty());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getXPacmanArbiterState());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getXPacmanArbiterTransition());
		g1.getETypeArguments().add(g2);
		xPacmanArbiterEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getArbiterState());
		g2 = createEGenericType(theXPacmanPropertyPackage.getXPacmanProperty());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getXPacmanArbiterTransition());
		g1.getETypeArguments().add(g2);
		xPacmanArbiterStateEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getArbiterTransition());
		g2 = createEGenericType(theXPacmanPropertyPackage.getXPacmanProperty());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getXPacmanArbiterState());
		g1.getETypeArguments().add(g2);
		xPacmanArbiterTransitionEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(xPacmanArbiterEClass, XPacmanArbiter.class, "XPacmanArbiter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xPacmanArbiterStateEClass, XPacmanArbiterState.class, "XPacmanArbiterState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xPacmanArbiterTransitionEClass, XPacmanArbiterTransition.class, "XPacmanArbiterTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //XPacmanArbiterPackageImpl
