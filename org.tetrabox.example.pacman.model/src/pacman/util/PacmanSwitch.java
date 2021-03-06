/**
 */
package pacman.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import pacman.*;

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
 * @see pacman.PacmanPackage
 * @generated
 */
public class PacmanSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PacmanPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanSwitch() {
		if (modelPackage == null) {
			modelPackage = PacmanPackage.eINSTANCE;
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
			case PacmanPackage.ABSTRACT_TILE: {
				AbstractTile abstractTile = (AbstractTile)theEObject;
				T result = caseAbstractTile(abstractTile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanPackage.BOARD: {
				Board board = (Board)theEObject;
				T result = caseBoard(board);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanPackage.PACMAN: {
				Pacman pacman = (Pacman)theEObject;
				T result = casePacman(pacman);
				if (result == null) result = caseEntity(pacman);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanPackage.GHOST: {
				Ghost ghost = (Ghost)theEObject;
				T result = caseGhost(ghost);
				if (result == null) result = caseEntity(ghost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanPackage.PASSABLE_TILE: {
				PassableTile passableTile = (PassableTile)theEObject;
				T result = casePassableTile(passableTile);
				if (result == null) result = caseAbstractTile(passableTile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanPackage.TILE: {
				Tile tile = (Tile)theEObject;
				T result = caseTile(tile);
				if (result == null) result = casePassableTile(tile);
				if (result == null) result = caseAbstractTile(tile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanPackage.GHOST_HOUSE_TILE: {
				GhostHouseTile ghostHouseTile = (GhostHouseTile)theEObject;
				T result = caseGhostHouseTile(ghostHouseTile);
				if (result == null) result = casePassableTile(ghostHouseTile);
				if (result == null) result = caseAbstractTile(ghostHouseTile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanPackage.WALL_TILE: {
				WallTile wallTile = (WallTile)theEObject;
				T result = caseWallTile(wallTile);
				if (result == null) result = caseAbstractTile(wallTile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanPackage.PELLET: {
				Pellet pellet = (Pellet)theEObject;
				T result = casePellet(pellet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanPackage.SUPER_PELLET: {
				SuperPellet superPellet = (SuperPellet)theEObject;
				T result = caseSuperPellet(superPellet);
				if (result == null) result = casePellet(superPellet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Tile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Tile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTile(AbstractTile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTile(Tile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Board</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Board</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoard(Board object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePacman(Pacman object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ghost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ghost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGhost(Ghost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passable Tile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passable Tile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassableTile(PassableTile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ghost House Tile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ghost House Tile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGhostHouseTile(GhostHouseTile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wall Tile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wall Tile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWallTile(WallTile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pellet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pellet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePellet(Pellet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Pellet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Pellet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperPellet(SuperPellet object) {
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

} //PacmanSwitch
