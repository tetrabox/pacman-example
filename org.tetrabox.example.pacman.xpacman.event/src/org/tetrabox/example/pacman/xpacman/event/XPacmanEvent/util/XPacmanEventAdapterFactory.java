/**
 */
package org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gemoc.event.commons.model.scenario.Event;

import org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.XPacmanEventPackage
 * @generated
 */
public class XPacmanEventAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XPacmanEventPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanEventAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XPacmanEventPackage.eINSTANCE;
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
	protected XPacmanEventSwitch<Adapter> modelSwitch =
		new XPacmanEventSwitch<Adapter>() {
			@Override
			public Adapter caseXPacmanDSLEvent(XPacmanDSLEvent object) {
				return createXPacmanDSLEventAdapter();
			}
			@Override
			public Adapter casePacmanEvent(PacmanEvent object) {
				return createPacmanEventAdapter();
			}
			@Override
			public Adapter casePacmanDownEvent(PacmanDownEvent object) {
				return createPacmanDownEventAdapter();
			}
			@Override
			public Adapter casePacmanLeftEvent(PacmanLeftEvent object) {
				return createPacmanLeftEventAdapter();
			}
			@Override
			public Adapter casePacmanRightEvent(PacmanRightEvent object) {
				return createPacmanRightEventAdapter();
			}
			@Override
			public Adapter casePacmanUpEvent(PacmanUpEvent object) {
				return createPacmanUpEventAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.XPacmanDSLEvent <em>XPacman DSL Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.XPacmanDSLEvent
	 * @generated
	 */
	public Adapter createXPacmanDSLEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanEvent <em>Pacman Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanEvent
	 * @generated
	 */
	public Adapter createPacmanEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanDownEvent <em>Pacman Down Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanDownEvent
	 * @generated
	 */
	public Adapter createPacmanDownEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanLeftEvent <em>Pacman Left Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanLeftEvent
	 * @generated
	 */
	public Adapter createPacmanLeftEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanRightEvent <em>Pacman Right Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanRightEvent
	 * @generated
	 */
	public Adapter createPacmanRightEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanUpEvent <em>Pacman Up Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanUpEvent
	 * @generated
	 */
	public Adapter createPacmanUpEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.event.commons.model.scenario.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.event.commons.model.scenario.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
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

} //XPacmanEventAdapterFactory
