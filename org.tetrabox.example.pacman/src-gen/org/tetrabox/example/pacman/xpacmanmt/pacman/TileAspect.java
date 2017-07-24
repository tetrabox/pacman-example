/**
 */
package org.tetrabox.example.pacman.xpacmanmt.pacman;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tile Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.TileAspect#isHasPellet <em>Has Pellet</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getTileAspect()
 * @model
 * @generated
 */
public interface TileAspect extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Pellet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Pellet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Pellet</em>' attribute.
	 * @see #setHasPellet(boolean)
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getTileAspect_HasPellet()
	 * @model unique="false"
	 * @generated
	 */
	boolean isHasPellet();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.TileAspect#isHasPellet <em>Has Pellet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Pellet</em>' attribute.
	 * @see #isHasPellet()
	 * @generated
	 */
	void setHasPellet(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize();

} // TileAspect
