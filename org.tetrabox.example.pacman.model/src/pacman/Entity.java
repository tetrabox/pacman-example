/**
 */
package pacman;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacman.Entity#getInitialTile <em>Initial Tile</em>}</li>
 * </ul>
 *
 * @see pacman.PacmanPackage#getEntity()
 * @model abstract="true"
 * @generated
 */
public interface Entity extends EObject {

	/**
	 * Returns the value of the '<em><b>Initial Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Tile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Tile</em>' reference.
	 * @see #setInitialTile(PassableTile)
	 * @see pacman.PacmanPackage#getEntity_InitialTile()
	 * @model required="true"
	 * @generated
	 */
	PassableTile getInitialTile();

	/**
	 * Sets the value of the '{@link pacman.Entity#getInitialTile <em>Initial Tile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Tile</em>' reference.
	 * @see #getInitialTile()
	 * @generated
	 */
	void setInitialTile(PassableTile value);
} // Entity
