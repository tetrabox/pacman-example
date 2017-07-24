/**
 */
package org.tetrabox.example.pacman.xpacmanmt.pacman;

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
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Entity#getInitialTile <em>Initial Tile</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Entity#getSpeed <em>Speed</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Entity#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Entity#getCurrentTile <em>Current Tile</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Entity#getNextTile <em>Next Tile</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getEntity()
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
	 * @see #setInitialTile(Tile)
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getEntity_InitialTile()
	 * @model required="true"
	 * @generated
	 */
	Tile getInitialTile();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Entity#getInitialTile <em>Initial Tile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Tile</em>' reference.
	 * @see #getInitialTile()
	 * @generated
	 */
	void setInitialTile(Tile value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(int)
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getEntity_Speed()
	 * @model unique="false"
	 * @generated
	 */
	int getSpeed();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Entity#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(int value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see #setDirection(int)
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getEntity_Direction()
	 * @model unique="false"
	 * @generated
	 */
	int getDirection();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Entity#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(int value);

	/**
	 * Returns the value of the '<em><b>Current Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Tile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Tile</em>' reference.
	 * @see #setCurrentTile(Tile)
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getEntity_CurrentTile()
	 * @model
	 * @generated
	 */
	Tile getCurrentTile();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Entity#getCurrentTile <em>Current Tile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Tile</em>' reference.
	 * @see #getCurrentTile()
	 * @generated
	 */
	void setCurrentTile(Tile value);

	/**
	 * Returns the value of the '<em><b>Next Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Tile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Tile</em>' reference.
	 * @see #setNextTile(Tile)
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getEntity_NextTile()
	 * @model
	 * @generated
	 */
	Tile getNextTile();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Entity#getNextTile <em>Next Tile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Tile</em>' reference.
	 * @see #getNextTile()
	 * @generated
	 */
	void setNextTile(Tile value);

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
	void modifySpeed(Integer speed);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void changeDirection(Integer newDirection);

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
	void enterNextTile();

} // Entity
