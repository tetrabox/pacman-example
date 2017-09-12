/**
 */
package pacman;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacman.Tile#getInitialPellet <em>Initial Pellet</em>}</li>
 * </ul>
 *
 * @see pacman.PacmanPackage#getTile()
 * @model
 * @generated
 */
public interface Tile extends PassableTile {
	/**
	 * Returns the value of the '<em><b>Initial Pellet</b></em>' attribute.
	 * The default value is <code>"NO_PELLET"</code>.
	 * The literals are from the enumeration {@link pacman.PelletType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Pellet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Pellet</em>' attribute.
	 * @see pacman.PelletType
	 * @see #setInitialPellet(PelletType)
	 * @see pacman.PacmanPackage#getTile_InitialPellet()
	 * @model default="NO_PELLET"
	 * @generated
	 */
	PelletType getInitialPellet();

	/**
	 * Sets the value of the '{@link pacman.Tile#getInitialPellet <em>Initial Pellet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Pellet</em>' attribute.
	 * @see pacman.PelletType
	 * @see #getInitialPellet()
	 * @generated
	 */
	void setInitialPellet(PelletType value);

} // Tile
