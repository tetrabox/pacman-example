/**
 */
package org.tetrabox.example.pacman.xpacmanmt.pacman;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Tile#getInitialPellet <em>Initial Pellet</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Tile#getPellet <em>Pellet</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getTile()
 * @model
 * @generated
 */
public interface Tile extends PassableTile {
	/**
	 * Returns the value of the '<em><b>Initial Pellet</b></em>' attribute.
	 * The default value is <code>"NO_PELLET"</code>.
	 * The literals are from the enumeration {@link org.tetrabox.example.pacman.xpacmanmt.pacman.PelletType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Pellet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Pellet</em>' attribute.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PelletType
	 * @see #setInitialPellet(PelletType)
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getTile_InitialPellet()
	 * @model default="NO_PELLET"
	 * @generated
	 */
	PelletType getInitialPellet();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Tile#getInitialPellet <em>Initial Pellet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Pellet</em>' attribute.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PelletType
	 * @see #getInitialPellet()
	 * @generated
	 */
	void setInitialPellet(PelletType value);

	/**
	 * Returns the value of the '<em><b>Pellet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pellet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pellet</em>' containment reference.
	 * @see #setPellet(Pellet)
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getTile_Pellet()
	 * @model containment="true"
	 * @generated
	 */
	Pellet getPellet();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Tile#getPellet <em>Pellet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pellet</em>' containment reference.
	 * @see #getPellet()
	 * @generated
	 */
	void setPellet(Pellet value);

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
	void eatPellet(Pacman pacman);

} // Tile
