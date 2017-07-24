/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.impl;

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

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.XPacmanProviderPackage;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.XPacmanEventOccurrence;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.XPacmanScenario;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.XPacmanScenarioElement;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.XPacmanScenarioFSM;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.XPacmanScenarioFSMState;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.XPacmanScenarioFSMTransition;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.XPacmanScenarioFactory;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.XPacmanScenarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XPacmanScenarioPackageImpl extends EPackageImpl implements XPacmanScenarioPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPacmanScenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPacmanScenarioElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPacmanEventOccurrenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPacmanScenarioFSMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPacmanScenarioFSMStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPacmanScenarioFSMTransitionEClass = null;

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
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.XPacmanScenarioPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XPacmanScenarioPackageImpl() {
		super(eNS_URI, XPacmanScenarioFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XPacmanScenarioPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XPacmanScenarioPackage init() {
		if (isInited) return (XPacmanScenarioPackage)EPackage.Registry.INSTANCE.getEPackage(XPacmanScenarioPackage.eNS_URI);

		// Obtain or create and register package
		XPacmanScenarioPackageImpl theXPacmanScenarioPackage = (XPacmanScenarioPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XPacmanScenarioPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XPacmanScenarioPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PacmanPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		XPacmanArbiterPackageImpl theXPacmanArbiterPackage = (XPacmanArbiterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XPacmanArbiterPackage.eNS_URI) instanceof XPacmanArbiterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XPacmanArbiterPackage.eNS_URI) : XPacmanArbiterPackage.eINSTANCE);
		XPacmanEventPackageImpl theXPacmanEventPackage = (XPacmanEventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XPacmanEventPackage.eNS_URI) instanceof XPacmanEventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XPacmanEventPackage.eNS_URI) : XPacmanEventPackage.eINSTANCE);
		XPacmanPropertyPackageImpl theXPacmanPropertyPackage = (XPacmanPropertyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XPacmanPropertyPackage.eNS_URI) instanceof XPacmanPropertyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XPacmanPropertyPackage.eNS_URI) : XPacmanPropertyPackage.eINSTANCE);
		XPacmanProviderPackageImpl theXPacmanProviderPackage = (XPacmanProviderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XPacmanProviderPackage.eNS_URI) instanceof XPacmanProviderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XPacmanProviderPackage.eNS_URI) : XPacmanProviderPackage.eINSTANCE);

		// Create package meta-data objects
		theXPacmanScenarioPackage.createPackageContents();
		theXPacmanArbiterPackage.createPackageContents();
		theXPacmanEventPackage.createPackageContents();
		theXPacmanPropertyPackage.createPackageContents();
		theXPacmanProviderPackage.createPackageContents();

		// Initialize created meta-data
		theXPacmanScenarioPackage.initializePackageContents();
		theXPacmanArbiterPackage.initializePackageContents();
		theXPacmanEventPackage.initializePackageContents();
		theXPacmanPropertyPackage.initializePackageContents();
		theXPacmanProviderPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXPacmanScenarioPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XPacmanScenarioPackage.eNS_URI, theXPacmanScenarioPackage);
		return theXPacmanScenarioPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXPacmanScenario() {
		return xPacmanScenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXPacmanScenarioElement() {
		return xPacmanScenarioElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXPacmanEventOccurrence() {
		return xPacmanEventOccurrenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXPacmanScenarioFSM() {
		return xPacmanScenarioFSMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXPacmanScenarioFSMState() {
		return xPacmanScenarioFSMStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXPacmanScenarioFSMTransition() {
		return xPacmanScenarioFSMTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanScenarioFactory getXPacmanScenarioFactory() {
		return (XPacmanScenarioFactory)getEFactoryInstance();
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
		xPacmanScenarioEClass = createEClass(XPACMAN_SCENARIO);

		xPacmanScenarioElementEClass = createEClass(XPACMAN_SCENARIO_ELEMENT);

		xPacmanEventOccurrenceEClass = createEClass(XPACMAN_EVENT_OCCURRENCE);

		xPacmanScenarioFSMEClass = createEClass(XPACMAN_SCENARIO_FSM);

		xPacmanScenarioFSMStateEClass = createEClass(XPACMAN_SCENARIO_FSM_STATE);

		xPacmanScenarioFSMTransitionEClass = createEClass(XPACMAN_SCENARIO_FSM_TRANSITION);
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
		XPacmanEventPackage theXPacmanEventPackage = (XPacmanEventPackage)EPackage.Registry.INSTANCE.getEPackage(XPacmanEventPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theScenarioPackage.getScenario());
		EGenericType g2 = createEGenericType(this.getXPacmanScenarioElement());
		g1.getETypeArguments().add(g2);
		xPacmanScenarioEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getScenarioElement());
		g2 = createEGenericType(theXPacmanPropertyPackage.getXPacmanProperty());
		g1.getETypeArguments().add(g2);
		xPacmanScenarioElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getEventOccurrence());
		g2 = createEGenericType(theXPacmanEventPackage.getXPacmanEvent());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theXPacmanPropertyPackage.getXPacmanProperty());
		g1.getETypeArguments().add(g2);
		xPacmanEventOccurrenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanScenarioElement());
		xPacmanEventOccurrenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getScenarioFSM());
		g2 = createEGenericType(theXPacmanPropertyPackage.getXPacmanProperty());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theXPacmanEventPackage.getXPacmanEvent());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getXPacmanScenarioFSMState());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getXPacmanScenarioFSMTransition());
		g1.getETypeArguments().add(g2);
		xPacmanScenarioFSMEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanScenarioElement());
		xPacmanScenarioFSMEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getScenarioFSMState());
		g2 = createEGenericType(theXPacmanEventPackage.getXPacmanEvent());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getXPacmanScenarioFSMTransition());
		g1.getETypeArguments().add(g2);
		xPacmanScenarioFSMStateEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getScenarioFSMTransition());
		g2 = createEGenericType(theXPacmanPropertyPackage.getXPacmanProperty());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getXPacmanScenarioFSMState());
		g1.getETypeArguments().add(g2);
		xPacmanScenarioFSMTransitionEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(xPacmanScenarioEClass, XPacmanScenario.class, "XPacmanScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xPacmanScenarioElementEClass, XPacmanScenarioElement.class, "XPacmanScenarioElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xPacmanEventOccurrenceEClass, XPacmanEventOccurrence.class, "XPacmanEventOccurrence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xPacmanScenarioFSMEClass, XPacmanScenarioFSM.class, "XPacmanScenarioFSM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xPacmanScenarioFSMStateEClass, XPacmanScenarioFSMState.class, "XPacmanScenarioFSMState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xPacmanScenarioFSMTransitionEClass, XPacmanScenarioFSMTransition.class, "XPacmanScenarioFSMTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //XPacmanScenarioPackageImpl
