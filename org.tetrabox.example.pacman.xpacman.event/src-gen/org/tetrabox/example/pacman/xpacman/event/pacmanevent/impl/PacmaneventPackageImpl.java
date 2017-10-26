/**
 */
package org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gemoc.executionframework.event.model.event.EventPackage;

import org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanDSLEvent;
import org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanDownEvent;
import org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanEvent;
import org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanLeftEvent;
import org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanRightEvent;
import org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanUpEvent;
import org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmaneventFactory;
import org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmaneventPackage;

import org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PacmaneventPackageImpl extends EPackageImpl implements PacmaneventPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanDSLEventEClass = null;

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
	private EClass pacmanLeftEventEClass = null;

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
	private EClass pacmanUpEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanRightEventEClass = null;

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
	 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmaneventPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PacmaneventPackageImpl() {
		super(eNS_URI, PacmaneventFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PacmaneventPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PacmaneventPackage init() {
		if (isInited) return (PacmaneventPackage)EPackage.Registry.INSTANCE.getEPackage(PacmaneventPackage.eNS_URI);

		// Obtain or create and register package
		PacmaneventPackageImpl thePacmaneventPackage = (PacmaneventPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PacmaneventPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PacmaneventPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EventPackage.eINSTANCE.eClass();
		PacmanPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePacmaneventPackage.createPackageContents();

		// Initialize created meta-data
		thePacmaneventPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePacmaneventPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PacmaneventPackage.eNS_URI, thePacmaneventPackage);
		return thePacmaneventPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanDSLEvent() {
		return pacmanDSLEventEClass;
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
	public EClass getPacmanLeftEvent() {
		return pacmanLeftEventEClass;
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
	public EClass getPacmanUpEvent() {
		return pacmanUpEventEClass;
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
	public PacmaneventFactory getPacmaneventFactory() {
		return (PacmaneventFactory)getEFactoryInstance();
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
		pacmanDSLEventEClass = createEClass(PACMAN_DSL_EVENT);

		pacmanEventEClass = createEClass(PACMAN_EVENT);
		createEReference(pacmanEventEClass, PACMAN_EVENT__PACMAN);

		pacmanLeftEventEClass = createEClass(PACMAN_LEFT_EVENT);

		pacmanDownEventEClass = createEClass(PACMAN_DOWN_EVENT);

		pacmanUpEventEClass = createEClass(PACMAN_UP_EVENT);

		pacmanRightEventEClass = createEClass(PACMAN_RIGHT_EVENT);
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
		EventPackage theEventPackage = (EventPackage)EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI);
		PacmanPackage thePacmanPackage = (PacmanPackage)EPackage.Registry.INSTANCE.getEPackage(PacmanPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pacmanDSLEventEClass.getESuperTypes().add(theEventPackage.getEvent());
		pacmanEventEClass.getESuperTypes().add(this.getPacmanDSLEvent());
		pacmanLeftEventEClass.getESuperTypes().add(this.getPacmanEvent());
		pacmanDownEventEClass.getESuperTypes().add(this.getPacmanEvent());
		pacmanUpEventEClass.getESuperTypes().add(this.getPacmanEvent());
		pacmanRightEventEClass.getESuperTypes().add(this.getPacmanEvent());

		// Initialize classes and features; add operations and parameters
		initEClass(pacmanDSLEventEClass, PacmanDSLEvent.class, "PacmanDSLEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pacmanEventEClass, PacmanEvent.class, "PacmanEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPacmanEvent_Pacman(), thePacmanPackage.getPacman(), null, "pacman", null, 1, 1, PacmanEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pacmanLeftEventEClass, PacmanLeftEvent.class, "PacmanLeftEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pacmanDownEventEClass, PacmanDownEvent.class, "PacmanDownEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pacmanUpEventEClass, PacmanUpEvent.class, "PacmanUpEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pacmanRightEventEClass, PacmanRightEvent.class, "PacmanRightEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PacmaneventPackageImpl
