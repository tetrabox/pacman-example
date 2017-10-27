/**
 */
package org.tetrabox.example.pacman.xpacman.pacman;

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
 *   <li>{@link org.tetrabox.example.pacman.xpacman.pacman.Entity#getInitialTile <em>Initial Tile</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacman.pacman.Entity#getSpeed <em>Speed</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacman.pacman.Entity#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacman.pacman.Entity#getCurrentTile <em>Current Tile</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacman.pacman.Entity#getXMoveProgress <em>XMove Progress</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacman.pacman.Entity#getYMoveProgress <em>YMove Progress</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage#getEntity()
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
	 * @see org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage#getEntity_InitialTile()
	 * @model required="true"
	 * @generated
	 */
	PassableTile getInitialTile();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacman.pacman.Entity#getInitialTile <em>Initial Tile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Tile</em>' reference.
	 * @see #getInitialTile()
	 * @generated
	 */
	void setInitialTile(PassableTile value);

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
	 * @see org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage#getEntity_Speed()
	 * @model unique="false"
	 * @generated
	 */
	int getSpeed();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacman.pacman.Entity#getSpeed <em>Speed</em>}' attribute.
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
	 * @see org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage#getEntity_Direction()
	 * @model unique="false"
	 * @generated
	 */
	int getDirection();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacman.pacman.Entity#getDirection <em>Direction</em>}' attribute.
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
	 * @see #setCurrentTile(PassableTile)
	 * @see org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage#getEntity_CurrentTile()
	 * @model
	 * @generated
	 */
	PassableTile getCurrentTile();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacman.pacman.Entity#getCurrentTile <em>Current Tile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Tile</em>' reference.
	 * @see #getCurrentTile()
	 * @generated
	 */
	void setCurrentTile(PassableTile value);

	/**
	 * Returns the value of the '<em><b>XMove Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMove Progress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMove Progress</em>' attribute.
	 * @see #setXMoveProgress(int)
	 * @see org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage#getEntity_XMoveProgress()
	 * @model unique="false"
	 * @generated
	 */
	int getXMoveProgress();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacman.pacman.Entity#getXMoveProgress <em>XMove Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XMove Progress</em>' attribute.
	 * @see #getXMoveProgress()
	 * @generated
	 */
	void setXMoveProgress(int value);

	/**
	 * Returns the value of the '<em><b>YMove Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YMove Progress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YMove Progress</em>' attribute.
	 * @see #setYMoveProgress(int)
	 * @see org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage#getEntity_YMoveProgress()
	 * @model unique="false"
	 * @generated
	 */
	int getYMoveProgress();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacman.pacman.Entity#getYMoveProgress <em>YMove Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YMove Progress</em>' attribute.
	 * @see #getYMoveProgress()
	 * @generated
	 */
	void setYMoveProgress(int value);

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
	void enterNextTile(int x, int y);

} // Entity
