/**
 */
package org.tetrabox.example.pacman.xpacmanmt.pacman;

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
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Board#getTiles <em>Tiles</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Board#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getBoard()
 * @model
 * @generated
 */
public interface Board extends EObject {
	/**
	 * Returns the value of the '<em><b>Tiles</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiles</em>' containment reference list.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getBoard_Tiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractTile> getTiles();

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.example.pacman.xpacmanmt.pacman.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getBoard_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void reset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void update(long deltaTime);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enterFrightenedMode();

} // Board
