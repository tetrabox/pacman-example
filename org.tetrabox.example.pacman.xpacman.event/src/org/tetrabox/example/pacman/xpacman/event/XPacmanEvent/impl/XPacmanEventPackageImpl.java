/**
 */
package org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gemoc.event.commons.model.scenario.ScenarioPackage;

import org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanDownEvent;
import org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanEvent;
import org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanLeftEvent;
import org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanRightEvent;
import org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanUpEvent;
import org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.XPacmanDSLEvent;
import org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.XPacmanEventFactory;
import org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.XPacmanEventPackage;

import org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage;

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
	private EClass xPacmanDSLEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanEventEClass = null;

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
	 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.XPacmanEventPackage#eNS_URI
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

		// Create package meta-data objects
		theXPacmanEventPackage.createPackageContents();

		// Initialize created meta-data
		theXPacmanEventPackage.initializePackageContents();

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
	public EClass getXPacmanDSLEvent() {
		return xPacmanDSLEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanEvent() {
		return pacmanEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPacmanEvent_Pacman() {
		return (EReference)pacmanEventEClass.getEStructuralFeatures().get(0);
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
		xPacmanDSLEventEClass = createEClass(XPACMAN_DSL_EVENT);

		pacmanEventEClass = createEClass(PACMAN_EVENT);
		createEReference(pacmanEventEClass, PACMAN_EVENT__PACMAN);

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

		// Set bounds for type parameters

		// Add supertypes to classes
		xPacmanDSLEventEClass.getESuperTypes().add(theScenarioPackage.getEvent());
		pacmanEventEClass.getESuperTypes().add(this.getXPacmanDSLEvent());
		pacmanDownEventEClass.getESuperTypes().add(this.getPacmanEvent());
		pacmanLeftEventEClass.getESuperTypes().add(this.getPacmanEvent());
		pacmanRightEventEClass.getESuperTypes().add(this.getPacmanEvent());
		pacmanUpEventEClass.getESuperTypes().add(this.getPacmanEvent());

		// Initialize classes and features; add operations and parameters
		initEClass(xPacmanDSLEventEClass, XPacmanDSLEvent.class, "XPacmanDSLEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pacmanEventEClass, PacmanEvent.class, "PacmanEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPacmanEvent_Pacman(), thePacmanPackage.getPacman(), null, "pacman", null, 1, 1, PacmanEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pacmanDownEventEClass, PacmanDownEvent.class, "PacmanDownEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pacmanLeftEventEClass, PacmanLeftEvent.class, "PacmanLeftEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pacmanRightEventEClass, PacmanRightEvent.class, "PacmanRightEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pacmanUpEventEClass, PacmanUpEvent.class, "PacmanUpEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //XPacmanEventPackageImpl
