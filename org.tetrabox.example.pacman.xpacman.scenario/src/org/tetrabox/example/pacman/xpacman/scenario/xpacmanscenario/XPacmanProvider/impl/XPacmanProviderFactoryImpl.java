/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XPacmanProviderFactoryImpl extends EFactoryImpl implements XPacmanProviderFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XPacmanProviderFactory init() {
		try {
			XPacmanProviderFactory theXPacmanProviderFactory = (XPacmanProviderFactory)EPackage.Registry.INSTANCE.getEFactory(XPacmanProviderPackage.eNS_URI);
			if (theXPacmanProviderFactory != null) {
				return theXPacmanProviderFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XPacmanProviderFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanProviderFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XPacmanProviderPackage.PACMAN_REFERENCE: return createPacmanReference();
			case XPacmanProviderPackage.PACMAN_QUERY: return createPacmanQuery();
			case XPacmanProviderPackage.GHOST_REFERENCE: return createGhostReference();
			case XPacmanProviderPackage.GHOST_QUERY: return createGhostQuery();
			case XPacmanProviderPackage.ENTITY_REFERENCE: return createEntityReference();
			case XPacmanProviderPackage.ENTITY_QUERY: return createEntityQuery();
			case XPacmanProviderPackage.BOARD_REFERENCE: return createBoardReference();
			case XPacmanProviderPackage.BOARD_QUERY: return createBoardQuery();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanReference createPacmanReference() {
		PacmanReferenceImpl pacmanReference = new PacmanReferenceImpl();
		return pacmanReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanQuery createPacmanQuery() {
		PacmanQueryImpl pacmanQuery = new PacmanQueryImpl();
		return pacmanQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GhostReference createGhostReference() {
		GhostReferenceImpl ghostReference = new GhostReferenceImpl();
		return ghostReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GhostQuery createGhostQuery() {
		GhostQueryImpl ghostQuery = new GhostQueryImpl();
		return ghostQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityReference createEntityReference() {
		EntityReferenceImpl entityReference = new EntityReferenceImpl();
		return entityReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityQuery createEntityQuery() {
		EntityQueryImpl entityQuery = new EntityQueryImpl();
		return entityQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoardReference createBoardReference() {
		BoardReferenceImpl boardReference = new BoardReferenceImpl();
		return boardReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoardQuery createBoardQuery() {
		BoardQueryImpl boardQuery = new BoardQueryImpl();
		return boardQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanProviderPackage getXPacmanProviderPackage() {
		return (XPacmanProviderPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XPacmanProviderPackage getPackage() {
		return XPacmanProviderPackage.eINSTANCE;
	}

} //XPacmanProviderFactoryImpl
