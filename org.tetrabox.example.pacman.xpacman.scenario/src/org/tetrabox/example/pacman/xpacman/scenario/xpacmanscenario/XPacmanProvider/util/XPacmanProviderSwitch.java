/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.util;

import fr.inria.diverse.event.commons.model.property.StateProperty;

import fr.inria.diverse.event.commons.model.scenario.ElementProvider;
import fr.inria.diverse.event.commons.model.scenario.ElementQuery;
import fr.inria.diverse.event.commons.model.scenario.ElementReference;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.*;

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
 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.XPacmanProviderPackage
 * @generated
 */
public class XPacmanProviderSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XPacmanProviderPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanProviderSwitch() {
		if (modelPackage == null) {
			modelPackage = XPacmanProviderPackage.eINSTANCE;
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
			case XPacmanProviderPackage.PACMAN_PROVIDER: {
				PacmanProvider pacmanProvider = (PacmanProvider)theEObject;
				T1 result = casePacmanProvider(pacmanProvider);
				if (result == null) result = caseElementProvider(pacmanProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanProviderPackage.PACMAN_REFERENCE: {
				PacmanReference pacmanReference = (PacmanReference)theEObject;
				T1 result = casePacmanReference(pacmanReference);
				if (result == null) result = caseElementReference(pacmanReference);
				if (result == null) result = casePacmanProvider(pacmanReference);
				if (result == null) result = caseElementProvider(pacmanReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanProviderPackage.PACMAN_QUERY: {
				PacmanQuery pacmanQuery = (PacmanQuery)theEObject;
				T1 result = casePacmanQuery(pacmanQuery);
				if (result == null) result = caseElementQuery(pacmanQuery);
				if (result == null) result = casePacmanProvider(pacmanQuery);
				if (result == null) result = caseElementProvider(pacmanQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanProviderPackage.GHOST_PROVIDER: {
				GhostProvider ghostProvider = (GhostProvider)theEObject;
				T1 result = caseGhostProvider(ghostProvider);
				if (result == null) result = caseElementProvider(ghostProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanProviderPackage.GHOST_REFERENCE: {
				GhostReference ghostReference = (GhostReference)theEObject;
				T1 result = caseGhostReference(ghostReference);
				if (result == null) result = caseElementReference(ghostReference);
				if (result == null) result = caseGhostProvider(ghostReference);
				if (result == null) result = caseElementProvider(ghostReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanProviderPackage.GHOST_QUERY: {
				GhostQuery ghostQuery = (GhostQuery)theEObject;
				T1 result = caseGhostQuery(ghostQuery);
				if (result == null) result = caseElementQuery(ghostQuery);
				if (result == null) result = caseGhostProvider(ghostQuery);
				if (result == null) result = caseElementProvider(ghostQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanProviderPackage.ENTITY_PROVIDER: {
				EntityProvider entityProvider = (EntityProvider)theEObject;
				T1 result = caseEntityProvider(entityProvider);
				if (result == null) result = caseElementProvider(entityProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanProviderPackage.ENTITY_REFERENCE: {
				EntityReference entityReference = (EntityReference)theEObject;
				T1 result = caseEntityReference(entityReference);
				if (result == null) result = caseElementReference(entityReference);
				if (result == null) result = caseEntityProvider(entityReference);
				if (result == null) result = caseElementProvider(entityReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanProviderPackage.ENTITY_QUERY: {
				EntityQuery entityQuery = (EntityQuery)theEObject;
				T1 result = caseEntityQuery(entityQuery);
				if (result == null) result = caseElementQuery(entityQuery);
				if (result == null) result = caseEntityProvider(entityQuery);
				if (result == null) result = caseElementProvider(entityQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanProviderPackage.BOARD_PROVIDER: {
				BoardProvider boardProvider = (BoardProvider)theEObject;
				T1 result = caseBoardProvider(boardProvider);
				if (result == null) result = caseElementProvider(boardProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanProviderPackage.BOARD_REFERENCE: {
				BoardReference boardReference = (BoardReference)theEObject;
				T1 result = caseBoardReference(boardReference);
				if (result == null) result = caseElementReference(boardReference);
				if (result == null) result = caseBoardProvider(boardReference);
				if (result == null) result = caseElementProvider(boardReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanProviderPackage.BOARD_QUERY: {
				BoardQuery boardQuery = (BoardQuery)theEObject;
				T1 result = caseBoardQuery(boardQuery);
				if (result == null) result = caseElementQuery(boardQuery);
				if (result == null) result = caseBoardProvider(boardQuery);
				if (result == null) result = caseElementProvider(boardQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePacmanProvider(PacmanProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePacmanReference(PacmanReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePacmanQuery(PacmanQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ghost Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ghost Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGhostProvider(GhostProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ghost Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ghost Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGhostReference(GhostReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ghost Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ghost Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGhostQuery(GhostQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEntityProvider(EntityProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEntityReference(EntityReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEntityQuery(EntityQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Board Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Board Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBoardProvider(BoardProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Board Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Board Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBoardReference(BoardReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Board Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Board Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBoardQuery(BoardQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseElementProvider(ElementProvider<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseElementReference(ElementReference<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T, P extends StateProperty<T>> T1 caseElementQuery(ElementQuery<T, P> object) {
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

} //XPacmanProviderSwitch
