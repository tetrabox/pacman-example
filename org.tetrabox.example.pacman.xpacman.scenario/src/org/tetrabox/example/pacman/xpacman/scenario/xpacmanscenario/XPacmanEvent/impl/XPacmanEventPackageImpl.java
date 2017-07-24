/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl;

import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiterPackage;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.impl.XPacmanArbiterPackageImpl;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.PacmanDownEvent;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.PacmanLeftEvent;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.PacmanRightEvent;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.PacmanUpEvent;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.XPacmanEvent;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.XPacmanEventFactory;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.XPacmanEventPackage;

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
public class XPacmanEventPackageImpl extends EPackageImpl implements XPacmanEventPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPacmanEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanDownEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanLeftEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanRightEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanUpEventEClass = null;

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
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.XPacmanEventPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XPacmanEventPackageImpl() {
		super(eNS_URI, XPacmanEventFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XPacmanEventPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XPacmanEventPackage init() {
		if (isInited) return (XPacmanEventPackage)EPackage.Registry.INSTANCE.getEPackage(XPacmanEventPackage.eNS_URI);

		// Obtain or create and register package
		XPacmanEventPackageImpl theXPacmanEventPackage = (XPacmanEventPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XPacmanEventPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XPacmanEventPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PacmanPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		XPacmanArbiterPackageImpl theXPacmanArbiterPackage = (XPacmanArbiterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XPacmanArbiterPackage.eNS_URI) instanceof XPacmanArbiterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XPacmanArbiterPackage.eNS_URI) : XPacmanArbiterPackage.eINSTANCE);
		XPacmanPropertyPackageImpl theXPacmanPropertyPackage = (XPacmanPropertyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XPacmanPropertyPackage.eNS_URI) instanceof XPacmanPropertyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XPacmanPropertyPackage.eNS_URI) : XPacmanPropertyPackage.eINSTANCE);
		XPacmanProviderPackageImpl theXPacmanProviderPackage = (XPacmanProviderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XPacmanProviderPackage.eNS_URI) instanceof XPacmanProviderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XPacmanProviderPackage.eNS_URI) : XPacmanProviderPackage.eINSTANCE);
		XPacmanScenarioPackageImpl theXPacmanScenarioPackage = (XPacmanScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XPacmanScenarioPackage.eNS_URI) instanceof XPacmanScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XPacmanScenarioPackage.eNS_URI) : XPacmanScenarioPackage.eINSTANCE);

		// Create package meta-data objects
		theXPacmanEventPackage.createPackageContents();
		theXPacmanArbiterPackage.createPackageContents();
		theXPacmanPropertyPackage.createPackageContents();
		theXPacmanProviderPackage.createPackageContents();
		theXPacmanScenarioPackage.createPackageContents();

		// Initialize created meta-data
		theXPacmanEventPackage.initializePackageContents();
		theXPacmanArbiterPackage.initializePackageContents();
		theXPacmanPropertyPackage.initializePackageContents();
		theXPacmanProviderPackage.initializePackageContents();
		theXPacmanScenarioPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXPacmanEventPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XPacmanEventPackage.eNS_URI, theXPacmanEventPackage);
		return theXPacmanEventPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXPacmanEvent() {
		return xPacmanEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanDownEvent() {
		return pacmanDownEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanLeftEvent() {
		return pacmanLeftEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanRightEvent() {
		return pacmanRightEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanUpEvent() {
		return pacmanUpEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanEventFactory getXPacmanEventFactory() {
		return (XPacmanEventFactory)getEFactoryInstance();
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
		xPacmanEventEClass = createEClass(XPACMAN_EVENT);

		pacmanDownEventEClass = createEClass(PACMAN_DOWN_EVENT);

		pacmanLeftEventEClass = createEClass(PACMAN_LEFT_EVENT);

		pacmanRightEventEClass = createEClass(PACMAN_RIGHT_EVENT);

		pacmanUpEventEClass = createEClass(PACMAN_UP_EVENT);
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

		// Create type parameters
		ETypeParameter xPacmanEventEClass_T = addETypeParameter(xPacmanEventEClass, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theScenarioPackage.getEvent());
		EGenericType g2 = createEGenericType(xPacmanEventEClass_T);
		g1.getETypeArguments().add(g2);
		xPacmanEventEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanEvent());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanDownEventEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanEvent());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanLeftEventEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanEvent());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanRightEventEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanEvent());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanUpEventEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(xPacmanEventEClass, XPacmanEvent.class, "XPacmanEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pacmanDownEventEClass, PacmanDownEvent.class, "PacmanDownEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pacmanLeftEventEClass, PacmanLeftEvent.class, "PacmanLeftEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pacmanRightEventEClass, PacmanRightEvent.class, "PacmanRightEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pacmanUpEventEClass, PacmanUpEvent.class, "PacmanUpEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //XPacmanEventPackageImpl
