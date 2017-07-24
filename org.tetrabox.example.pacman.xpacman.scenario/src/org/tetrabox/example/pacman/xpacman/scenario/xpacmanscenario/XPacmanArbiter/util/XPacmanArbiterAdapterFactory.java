/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.util;

import fr.inria.diverse.event.commons.model.property.Property;

import fr.inria.diverse.event.commons.model.scenario.Arbiter;
import fr.inria.diverse.event.commons.model.scenario.ArbiterState;
import fr.inria.diverse.event.commons.model.scenario.ArbiterTransition;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiterPackage
 * @generated
 */
public class XPacmanArbiterAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XPacmanArbiterPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanArbiterAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XPacmanArbiterPackage.eINSTANCE;
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
	protected XPacmanArbiterSwitch<Adapter> modelSwitch =
		new XPacmanArbiterSwitch<Adapter>() {
			@Override
			public Adapter caseXPacmanArbiter(XPacmanArbiter object) {
				return createXPacmanArbiterAdapter();
			}
			@Override
			public Adapter caseXPacmanArbiterState(XPacmanArbiterState object) {
				return createXPacmanArbiterStateAdapter();
			}
			@Override
			public Adapter caseXPacmanArbiterTransition(XPacmanArbiterTransition object) {
				return createXPacmanArbiterTransitionAdapter();
			}
			@Override
			public <P extends Property, S extends ArbiterState<P, T>, T extends ArbiterTransition<P, S>> Adapter caseArbiter(Arbiter<P, S, T> object) {
				return createArbiterAdapter();
			}
			@Override
			public <P extends Property, T extends ArbiterTransition<P, ?>> Adapter caseArbiterState(ArbiterState<P, T> object) {
				return createArbiterStateAdapter();
			}
			@Override
			public <P extends Property, S extends ArbiterState<P, ?>> Adapter caseArbiterTransition(ArbiterTransition<P, S> object) {
				return createArbiterTransitionAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiter <em>XPacman Arbiter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiter
	 * @generated
	 */
	public Adapter createXPacmanArbiterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiterState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiterState
	 * @generated
	 */
	public Adapter createXPacmanArbiterStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiterTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiterTransition
	 * @generated
	 */
	public Adapter createXPacmanArbiterTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.scenario.Arbiter <em>Arbiter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.scenario.Arbiter
	 * @generated
	 */
	public Adapter createArbiterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.scenario.ArbiterState <em>Arbiter State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.scenario.ArbiterState
	 * @generated
	 */
	public Adapter createArbiterStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.scenario.ArbiterTransition <em>Arbiter Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.scenario.ArbiterTransition
	 * @generated
	 */
	public Adapter createArbiterTransitionAdapter() {
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

} //XPacmanArbiterAdapterFactory
