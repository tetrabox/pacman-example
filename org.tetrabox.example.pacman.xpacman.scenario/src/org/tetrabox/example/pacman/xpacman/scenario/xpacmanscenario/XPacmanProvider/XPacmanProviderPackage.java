/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider;

import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.XPacmanProviderFactory
 * @model kind="package"
 * @generated
 */
public interface XPacmanProviderPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "XPacmanProvider";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.tetrabox.example.pacman.xpacman/scenario/XPacmanProvider/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "XPacmanProvider";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XPacmanProviderPackage eINSTANCE = org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.PacmanProviderImpl <em>Pacman Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.PacmanProviderImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl#getPacmanProvider()
	 * @generated
	 */
	int PACMAN_PROVIDER = 0;

	/**
	 * The number of structural features of the '<em>Pacman Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_PROVIDER_FEATURE_COUNT = ScenarioPackage.ELEMENT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.PacmanReferenceImpl <em>Pacman Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.PacmanReferenceImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl#getPacmanReference()
	 * @generated
	 */
	int PACMAN_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_REFERENCE__ELEMENT = ScenarioPackage.ELEMENT_REFERENCE__ELEMENT;

	/**
	 * The number of structural features of the '<em>Pacman Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_REFERENCE_FEATURE_COUNT = ScenarioPackage.ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.PacmanQueryImpl <em>Pacman Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.PacmanQueryImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl#getPacmanQuery()
	 * @generated
	 */
	int PACMAN_QUERY = 2;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_QUERY__QUERY = ScenarioPackage.ELEMENT_QUERY__QUERY;

	/**
	 * The number of structural features of the '<em>Pacman Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_QUERY_FEATURE_COUNT = ScenarioPackage.ELEMENT_QUERY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.GhostProviderImpl <em>Ghost Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.GhostProviderImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl#getGhostProvider()
	 * @generated
	 */
	int GHOST_PROVIDER = 3;

	/**
	 * The number of structural features of the '<em>Ghost Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_PROVIDER_FEATURE_COUNT = ScenarioPackage.ELEMENT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.GhostReferenceImpl <em>Ghost Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.GhostReferenceImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl#getGhostReference()
	 * @generated
	 */
	int GHOST_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_REFERENCE__ELEMENT = ScenarioPackage.ELEMENT_REFERENCE__ELEMENT;

	/**
	 * The number of structural features of the '<em>Ghost Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_REFERENCE_FEATURE_COUNT = ScenarioPackage.ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.GhostQueryImpl <em>Ghost Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.GhostQueryImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl#getGhostQuery()
	 * @generated
	 */
	int GHOST_QUERY = 5;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_QUERY__QUERY = ScenarioPackage.ELEMENT_QUERY__QUERY;

	/**
	 * The number of structural features of the '<em>Ghost Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_QUERY_FEATURE_COUNT = ScenarioPackage.ELEMENT_QUERY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.EntityProviderImpl <em>Entity Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.EntityProviderImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl#getEntityProvider()
	 * @generated
	 */
	int ENTITY_PROVIDER = 6;

	/**
	 * The number of structural features of the '<em>Entity Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PROVIDER_FEATURE_COUNT = ScenarioPackage.ELEMENT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.EntityReferenceImpl <em>Entity Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.EntityReferenceImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl#getEntityReference()
	 * @generated
	 */
	int ENTITY_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REFERENCE__ELEMENT = ScenarioPackage.ELEMENT_REFERENCE__ELEMENT;

	/**
	 * The number of structural features of the '<em>Entity Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REFERENCE_FEATURE_COUNT = ScenarioPackage.ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.EntityQueryImpl <em>Entity Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.EntityQueryImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl#getEntityQuery()
	 * @generated
	 */
	int ENTITY_QUERY = 8;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_QUERY__QUERY = ScenarioPackage.ELEMENT_QUERY__QUERY;

	/**
	 * The number of structural features of the '<em>Entity Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_QUERY_FEATURE_COUNT = ScenarioPackage.ELEMENT_QUERY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.BoardProviderImpl <em>Board Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.BoardProviderImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl#getBoardProvider()
	 * @generated
	 */
	int BOARD_PROVIDER = 9;

	/**
	 * The number of structural features of the '<em>Board Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_PROVIDER_FEATURE_COUNT = ScenarioPackage.ELEMENT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.BoardReferenceImpl <em>Board Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.BoardReferenceImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl#getBoardReference()
	 * @generated
	 */
	int BOARD_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_REFERENCE__ELEMENT = ScenarioPackage.ELEMENT_REFERENCE__ELEMENT;

	/**
	 * The number of structural features of the '<em>Board Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_REFERENCE_FEATURE_COUNT = ScenarioPackage.ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.BoardQueryImpl <em>Board Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.BoardQueryImpl
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl#getBoardQuery()
	 * @generated
	 */
	int BOARD_QUERY = 11;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_QUERY__QUERY = ScenarioPackage.ELEMENT_QUERY__QUERY;

	/**
	 * The number of structural features of the '<em>Board Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_QUERY_FEATURE_COUNT = ScenarioPackage.ELEMENT_QUERY_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.PacmanProvider <em>Pacman Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Provider</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.PacmanProvider
	 * @generated
	 */
	EClass getPacmanProvider();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.PacmanReference <em>Pacman Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Reference</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.PacmanReference
	 * @generated
	 */
	EClass getPacmanReference();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.PacmanQuery <em>Pacman Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman Query</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.PacmanQuery
	 * @generated
	 */
	EClass getPacmanQuery();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.GhostProvider <em>Ghost Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ghost Provider</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.GhostProvider
	 * @generated
	 */
	EClass getGhostProvider();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.GhostReference <em>Ghost Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ghost Reference</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.GhostReference
	 * @generated
	 */
	EClass getGhostReference();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.GhostQuery <em>Ghost Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ghost Query</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.GhostQuery
	 * @generated
	 */
	EClass getGhostQuery();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.EntityProvider <em>Entity Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Provider</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.EntityProvider
	 * @generated
	 */
	EClass getEntityProvider();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.EntityReference <em>Entity Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Reference</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.EntityReference
	 * @generated
	 */
	EClass getEntityReference();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.EntityQuery <em>Entity Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Query</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.EntityQuery
	 * @generated
	 */
	EClass getEntityQuery();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.BoardProvider <em>Board Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board Provider</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.BoardProvider
	 * @generated
	 */
	EClass getBoardProvider();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.BoardReference <em>Board Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board Reference</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.BoardReference
	 * @generated
	 */
	EClass getBoardReference();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.BoardQuery <em>Board Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board Query</em>'.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.BoardQuery
	 * @generated
	 */
	EClass getBoardQuery();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XPacmanProviderFactory getXPacmanProviderFactory();

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
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.PacmanProviderImpl <em>Pacman Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.PacmanProviderImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl#getPacmanProvider()
		 * @generated
		 */
		EClass PACMAN_PROVIDER = eINSTANCE.getPacmanProvider();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.PacmanReferenceImpl <em>Pacman Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.PacmanReferenceImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl#getPacmanReference()
		 * @generated
		 */
		EClass PACMAN_REFERENCE = eINSTANCE.getPacmanReference();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.PacmanQueryImpl <em>Pacman Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.PacmanQueryImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl#getPacmanQuery()
		 * @generated
		 */
		EClass PACMAN_QUERY = eINSTANCE.getPacmanQuery();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.GhostProviderImpl <em>Ghost Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.GhostProviderImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl#getGhostProvider()
		 * @generated
		 */
		EClass GHOST_PROVIDER = eINSTANCE.getGhostProvider();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.GhostReferenceImpl <em>Ghost Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.GhostReferenceImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl#getGhostReference()
		 * @generated
		 */
		EClass GHOST_REFERENCE = eINSTANCE.getGhostReference();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.GhostQueryImpl <em>Ghost Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.GhostQueryImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl#getGhostQuery()
		 * @generated
		 */
		EClass GHOST_QUERY = eINSTANCE.getGhostQuery();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.EntityProviderImpl <em>Entity Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.EntityProviderImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl#getEntityProvider()
		 * @generated
		 */
		EClass ENTITY_PROVIDER = eINSTANCE.getEntityProvider();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.EntityReferenceImpl <em>Entity Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.EntityReferenceImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl#getEntityReference()
		 * @generated
		 */
		EClass ENTITY_REFERENCE = eINSTANCE.getEntityReference();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.EntityQueryImpl <em>Entity Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.EntityQueryImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl#getEntityQuery()
		 * @generated
		 */
		EClass ENTITY_QUERY = eINSTANCE.getEntityQuery();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.BoardProviderImpl <em>Board Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.BoardProviderImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl#getBoardProvider()
		 * @generated
		 */
		EClass BOARD_PROVIDER = eINSTANCE.getBoardProvider();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.BoardReferenceImpl <em>Board Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.BoardReferenceImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl#getBoardReference()
		 * @generated
		 */
		EClass BOARD_REFERENCE = eINSTANCE.getBoardReference();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.BoardQueryImpl <em>Board Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.BoardQueryImpl
		 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl#getBoardQuery()
		 * @generated
		 */
		EClass BOARD_QUERY = eINSTANCE.getBoardQuery();

	}

} //XPacmanProviderPackage
