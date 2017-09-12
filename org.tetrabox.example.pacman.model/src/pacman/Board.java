/**
 */
package pacman;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacman.Board#getTiles <em>Tiles</em>}</li>
 *   <li>{@link pacman.Board#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see pacman.PacmanPackage#getBoard()
 * @model
 * @generated
 */
public interface Board extends EObject {
	/**
	 * Returns the value of the '<em><b>Tiles</b></em>' containment reference list.
	 * The list contents are of type {@link pacman.AbstractTile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiles</em>' containment reference list.
	 * @see pacman.PacmanPackage#getBoard_Tiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractTile> getTiles();

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link pacman.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see pacman.PacmanPackage#getBoard_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

} // Board
