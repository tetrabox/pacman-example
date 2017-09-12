/**
 */
package pacman;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pacman</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacman.Pacman#getInitialLives <em>Initial Lives</em>}</li>
 * </ul>
 *
 * @see pacman.PacmanPackage#getPacman()
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
	 * @see pacman.PacmanPackage#getPacman_InitialLives()
	 * @model
	 * @generated
	 */
	int getInitialLives();

	/**
	 * Sets the value of the '{@link pacman.Pacman#getInitialLives <em>Initial Lives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Lives</em>' attribute.
	 * @see #getInitialLives()
	 * @generated
	 */
	void setInitialLives(int value);

} // Pacman
