/**
 */
package org.tetrabox.example.pacman.xpacmanmt.pacman;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pacman</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Pacman#getInitialLives <em>Initial Lives</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Pacman#getPelletsEaten <em>Pellets Eaten</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Pacman#getLives <em>Lives</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getPacman()
 * @model
 * @generated
 */
public interface Pacman extends Entity {
	/**
	 * Returns the value of the '<em><b>Initial Lives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Lives</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Lives</em>' attribute.
	 * @see #setInitialLives(int)
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getPacman_InitialLives()
	 * @model
	 * @generated
	 */
	int getInitialLives();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Pacman#getInitialLives <em>Initial Lives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Lives</em>' attribute.
	 * @see #getInitialLives()
	 * @generated
	 */
	void setInitialLives(int value);

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
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getPacman_PelletsEaten()
	 * @model unique="false"
	 * @generated
	 */
	int getPelletsEaten();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Pacman#getPelletsEaten <em>Pellets Eaten</em>}' attribute.
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
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getPacman_Lives()
	 * @model unique="false"
	 * @generated
	 */
	int getLives();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Pacman#getLives <em>Lives</em>}' attribute.
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
	void update(long deltaTime);

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
	void energize();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void up();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void left();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void down();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void right();

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
	void eat();

} // Pacman
