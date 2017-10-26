/**
 */
package org.tetrabox.example.pacman.xpacman.event.pacmanevent.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.gemoc.executionframework.event.model.event.Event;

import org.tetrabox.example.pacman.xpacman.event.pacmanevent.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmaneventPackage
 * @generated
 */
public class PacmaneventSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PacmaneventPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmaneventSwitch() {
		if (modelPackage == null) {
			modelPackage = PacmaneventPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PacmaneventPackage.PACMAN_DSL_EVENT: {
				PacmanDSLEvent pacmanDSLEvent = (PacmanDSLEvent)theEObject;
				T result = casePacmanDSLEvent(pacmanDSLEvent);
				if (result == null) result = caseEvent(pacmanDSLEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmaneventPackage.PACMAN_EVENT: {
				PacmanEvent pacmanEvent = (PacmanEvent)theEObject;
				T result = casePacmanEvent(pacmanEvent);
				if (result == null) result = casePacmanDSLEvent(pacmanEvent);
				if (result == null) result = caseEvent(pacmanEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmaneventPackage.PACMAN_LEFT_EVENT: {
				PacmanLeftEvent pacmanLeftEvent = (PacmanLeftEvent)theEObject;
				T result = casePacmanLeftEvent(pacmanLeftEvent);
				if (result == null) result = casePacmanEvent(pacmanLeftEvent);
				if (result == null) result = casePacmanDSLEvent(pacmanLeftEvent);
				if (result == null) result = caseEvent(pacmanLeftEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmaneventPackage.PACMAN_DOWN_EVENT: {
				PacmanDownEvent pacmanDownEvent = (PacmanDownEvent)theEObject;
				T result = casePacmanDownEvent(pacmanDownEvent);
				if (result == null) result = casePacmanEvent(pacmanDownEvent);
				if (result == null) result = casePacmanDSLEvent(pacmanDownEvent);
				if (result == null) result = caseEvent(pacmanDownEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmaneventPackage.PACMAN_UP_EVENT: {
				PacmanUpEvent pacmanUpEvent = (PacmanUpEvent)theEObject;
				T result = casePacmanUpEvent(pacmanUpEvent);
				if (result == null) result = casePacmanEvent(pacmanUpEvent);
				if (result == null) result = casePacmanDSLEvent(pacmanUpEvent);
				if (result == null) result = caseEvent(pacmanUpEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmaneventPackage.PACMAN_RIGHT_EVENT: {
				PacmanRightEvent pacmanRightEvent = (PacmanRightEvent)theEObject;
				T result = casePacmanRightEvent(pacmanRightEvent);
				if (result == null) result = casePacmanEvent(pacmanRightEvent);
				if (result == null) result = casePacmanDSLEvent(pacmanRightEvent);
				if (result == null) result = caseEvent(pacmanRightEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman DSL Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman DSL Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePacmanDSLEvent(PacmanDSLEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePacmanEvent(PacmanEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman Left Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman Left Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePacmanLeftEvent(PacmanLeftEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman Down Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman Down Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePacmanDownEvent(PacmanDownEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman Up Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman Up Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePacmanUpEvent(PacmanUpEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman Right Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman Right Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePacmanRightEvent(PacmanRightEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PacmaneventSwitch
