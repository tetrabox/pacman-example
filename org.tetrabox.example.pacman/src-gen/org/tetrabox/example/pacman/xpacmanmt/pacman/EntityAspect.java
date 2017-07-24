/**
 */
package org.tetrabox.example.pacman.xpacmanmt.pacman;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.EntityAspect#getSpeed <em>Speed</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.EntityAspect#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.EntityAspect#getCurrentTile <em>Current Tile</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.EntityAspect#getNextTile <em>Next Tile</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getEntityAspect()
 * @model
 * @generated
 */
public interface EntityAspect extends EObject {
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
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getEntityAspect_Speed()
	 * @model unique="false"
	 * @generated
	 */
	int getSpeed();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.EntityAspect#getSpeed <em>Speed</em>}' attribute.
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
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getEntityAspect_Direction()
	 * @model unique="false"
	 * @generated
	 */
	int getDirection();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.EntityAspect#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(int value);

	/**
	 * Returns the value of the '<em><b>Current Tile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Tile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Tile</em>' attribute.
	 * @see #setCurrentTile(Object)
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getEntityAspect_CurrentTile()
	 * @model unique="false" dataType="org.tetrabox.example.pacman.xpacmanmt.pacman.void"
	 * @generated
	 */
	Object getCurrentTile();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.EntityAspect#getCurrentTile <em>Current Tile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Tile</em>' attribute.
	 * @see #getCurrentTile()
	 * @generated
	 */
	void setCurrentTile(Object value);

	/**
	 * Returns the value of the '<em><b>Next Tile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Tile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Tile</em>' attribute.
	 * @see #setNextTile(Object)
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getEntityAspect_NextTile()
	 * @model unique="false" dataType="org.tetrabox.example.pacman.xpacmanmt.pacman.void"
	 * @generated
	 */
	Object getNextTile();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.EntityAspect#getNextTile <em>Next Tile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Tile</em>' attribute.
	 * @see #getNextTile()
	 * @generated
	 */
	void setNextTile(Object value);

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
	void modifySpeed();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void changeDirection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void update();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enterNextTile();

} // EntityAspect
