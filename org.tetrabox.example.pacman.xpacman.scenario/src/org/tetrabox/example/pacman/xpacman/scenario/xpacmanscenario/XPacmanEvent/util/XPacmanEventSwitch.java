/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.util;

import fr.inria.diverse.event.commons.model.scenario.Event;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.*;

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
 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.XPacmanEventPackage
 * @generated
 */
public class XPacmanEventSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XPacmanEventPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanEventSwitch() {
		if (modelPackage == null) {
			modelPackage = XPacmanEventPackage.eINSTANCE;
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
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case XPacmanEventPackage.XPACMAN_EVENT: {
				XPacmanEvent<?> xPacmanEvent = (XPacmanEvent<?>)theEObject;
				T1 result = caseXPacmanEvent(xPacmanEvent);
				if (result == null) result = caseEvent(xPacmanEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanEventPackage.PACMAN_DOWN_EVENT: {
				PacmanDownEvent pacmanDownEvent = (PacmanDownEvent)theEObject;
				T1 result = casePacmanDownEvent(pacmanDownEvent);
				if (result == null) result = caseXPacmanEvent(pacmanDownEvent);
				if (result == null) result = caseEvent(pacmanDownEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanEventPackage.PACMAN_LEFT_EVENT: {
				PacmanLeftEvent pacmanLeftEvent = (PacmanLeftEvent)theEObject;
				T1 result = casePacmanLeftEvent(pacmanLeftEvent);
				if (result == null) result = caseXPacmanEvent(pacmanLeftEvent);
				if (result == null) result = caseEvent(pacmanLeftEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanEventPackage.PACMAN_RIGHT_EVENT: {
				PacmanRightEvent pacmanRightEvent = (PacmanRightEvent)theEObject;
				T1 result = casePacmanRightEvent(pacmanRightEvent);
				if (result == null) result = caseXPacmanEvent(pacmanRightEvent);
				if (result == null) result = caseEvent(pacmanRightEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanEventPackage.PACMAN_UP_EVENT: {
				PacmanUpEvent pacmanUpEvent = (PacmanUpEvent)theEObject;
				T1 result = casePacmanUpEvent(pacmanUpEvent);
				if (result == null) result = caseXPacmanEvent(pacmanUpEvent);
				if (result == null) result = caseEvent(pacmanUpEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XPacman Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XPacman Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseXPacmanEvent(XPacmanEvent<T> object) {
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
	public T1 casePacmanDownEvent(PacmanDownEvent object) {
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
	public T1 casePacmanLeftEvent(PacmanLeftEvent object) {
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
	public T1 casePacmanRightEvent(PacmanRightEvent object) {
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
	public T1 casePacmanUpEvent(PacmanUpEvent object) {
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
	public <T> T1 caseEvent(Event<T> object) {
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
	public T1 defaultCase(EObject object) {
		return null;
	}

} //XPacmanEventSwitch
