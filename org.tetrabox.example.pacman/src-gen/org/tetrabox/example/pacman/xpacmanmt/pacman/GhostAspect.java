/**
 */
package org.tetrabox.example.pacman.xpacmanmt.pacman;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ghost Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.GhostAspect#getTargetTile <em>Target Tile</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getGhostAspect()
 * @model
 * @generated
 */
public interface GhostAspect extends EntityAspect {
	/**
	 * Returns the value of the '<em><b>Target Tile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Tile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Tile</em>' attribute.
	 * @see #setTargetTile(Object)
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getGhostAspect_TargetTile()
	 * @model unique="false" dataType="org.tetrabox.example.pacman.xpacmanmt.pacman.void"
	 * @generated
	 */
	Object getTargetTile();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.GhostAspect#getTargetTile <em>Target Tile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Tile</em>' attribute.
	 * @see #getTargetTile()
	 * @generated
	 */
	void setTargetTile(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void changeTargetTile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enterNextTile();

} // GhostAspect
