/**
 */
package org.tetrabox.example.pacman.xpacmanmt.pacman;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanAspect#getPelletsEaten <em>Pellets Eaten</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanAspect#getLives <em>Lives</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getPacmanAspect()
 * @model
 * @generated
 */
public interface PacmanAspect extends EntityAspect {
	/**
	 * Returns the value of the '<em><b>Pellets Eaten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pellets Eaten</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pellets Eaten</em>' attribute.
	 * @see #setPelletsEaten(int)
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getPacmanAspect_PelletsEaten()
	 * @model unique="false"
	 * @generated
	 */
	int getPelletsEaten();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanAspect#getPelletsEaten <em>Pellets Eaten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pellets Eaten</em>' attribute.
	 * @see #getPelletsEaten()
	 * @generated
	 */
	void setPelletsEaten(int value);

	/**
	 * Returns the value of the '<em><b>Lives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lives</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lives</em>' attribute.
	 * @see #setLives(int)
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getPacmanAspect_Lives()
	 * @model unique="false"
	 * @generated
	 */
	int getLives();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanAspect#getLives <em>Lives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lives</em>' attribute.
	 * @see #getLives()
	 * @generated
	 */
	void setLives(int value);

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
	void changeDirection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enterNextTile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void eatPellet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void kill();

} // PacmanAspect
