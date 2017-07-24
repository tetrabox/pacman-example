/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.util;

import fr.inria.diverse.event.commons.model.property.StateProperty;

import fr.inria.diverse.event.commons.model.scenario.ElementProvider;
import fr.inria.diverse.event.commons.model.scenario.ElementQuery;
import fr.inria.diverse.event.commons.model.scenario.ElementReference;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.XPacmanProviderPackage
 * @generated
 */
public class XPacmanProviderAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XPacmanProviderPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanProviderAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XPacmanProviderPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XPacmanProviderSwitch<Adapter> modelSwitch =
		new XPacmanProviderSwitch<Adapter>() {
			@Override
			public Adapter casePacmanProvider(PacmanProvider object) {
				return createPacmanProviderAdapter();
			}
			@Override
			public Adapter casePacmanReference(PacmanReference object) {
				return createPacmanReferenceAdapter();
			}
			@Override
			public Adapter casePacmanQuery(PacmanQuery object) {
				return createPacmanQueryAdapter();
			}
			@Override
			public Adapter caseGhostProvider(GhostProvider object) {
				return createGhostProviderAdapter();
			}
			@Override
			public Adapter caseGhostReference(GhostReference object) {
				return createGhostReferenceAdapter();
			}
			@Override
			public Adapter caseGhostQuery(GhostQuery object) {
				return createGhostQueryAdapter();
			}
			@Override
			public Adapter caseEntityProvider(EntityProvider object) {
				return createEntityProviderAdapter();
			}
			@Override
			public Adapter caseEntityReference(EntityReference object) {
				return createEntityReferenceAdapter();
			}
			@Override
			public Adapter caseEntityQuery(EntityQuery object) {
				return createEntityQueryAdapter();
			}
			@Override
			public Adapter caseBoardProvider(BoardProvider object) {
				return createBoardProviderAdapter();
			}
			@Override
			public Adapter caseBoardReference(BoardReference object) {
				return createBoardReferenceAdapter();
			}
			@Override
			public Adapter caseBoardQuery(BoardQuery object) {
				return createBoardQueryAdapter();
			}
			@Override
			public <T> Adapter caseElementProvider(ElementProvider<T> object) {
				return createElementProviderAdapter();
			}
			@Override
			public <T> Adapter caseElementReference(ElementReference<T> object) {
				return createElementReferenceAdapter();
			}
			@Override
			public <T, P extends StateProperty<T>> Adapter caseElementQuery(ElementQuery<T, P> object) {
				return createElementQueryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.PacmanProvider <em>Pacman Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.PacmanProvider
	 * @generated
	 */
	public Adapter createPacmanProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.PacmanReference <em>Pacman Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.PacmanReference
	 * @generated
	 */
	public Adapter createPacmanReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.PacmanQuery <em>Pacman Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.PacmanQuery
	 * @generated
	 */
	public Adapter createPacmanQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.GhostProvider <em>Ghost Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.GhostProvider
	 * @generated
	 */
	public Adapter createGhostProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.GhostReference <em>Ghost Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.GhostReference
	 * @generated
	 */
	public Adapter createGhostReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.GhostQuery <em>Ghost Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.GhostQuery
	 * @generated
	 */
	public Adapter createGhostQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.EntityProvider <em>Entity Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.EntityProvider
	 * @generated
	 */
	public Adapter createEntityProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.EntityReference <em>Entity Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.EntityReference
	 * @generated
	 */
	public Adapter createEntityReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.EntityQuery <em>Entity Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.EntityQuery
	 * @generated
	 */
	public Adapter createEntityQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.BoardProvider <em>Board Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.BoardProvider
	 * @generated
	 */
	public Adapter createBoardProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.BoardReference <em>Board Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.BoardReference
	 * @generated
	 */
	public Adapter createBoardReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.BoardQuery <em>Board Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.BoardQuery
	 * @generated
	 */
	public Adapter createBoardQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.scenario.ElementProvider <em>Element Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.scenario.ElementProvider
	 * @generated
	 */
	public Adapter createElementProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.scenario.ElementReference <em>Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.scenario.ElementReference
	 * @generated
	 */
	public Adapter createElementReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.scenario.ElementQuery <em>Element Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.scenario.ElementQuery
	 * @generated
	 */
	public Adapter createElementQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XPacmanProviderAdapterFactory
