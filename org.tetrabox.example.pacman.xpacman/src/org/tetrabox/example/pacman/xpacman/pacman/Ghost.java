/**
 */
package org.tetrabox.example.pacman.xpacman.pacman;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ghost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.pacman.xpacman.pacman.Ghost#getName <em>Name</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacman.pacman.Ghost#getPersonnality <em>Personnality</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacman.pacman.Ghost#getTargetTile <em>Target Tile</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage#getGhost()
 * @model
 * @generated
 */
public interface Ghost extends Entity {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage#getGhost_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacman.pacman.Ghost#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Personnality</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tetrabox.example.pacman.xpacman.pacman.GhostPersonality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personnality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personnality</em>' attribute.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.GhostPersonality
	 * @see #setPersonnality(GhostPersonality)
	 * @see org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage#getGhost_Personnality()
	 * @model required="true"
	 * @generated
	 */
	GhostPersonality getPersonnality();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacman.pacman.Ghost#getPersonnality <em>Personnality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personnality</em>' attribute.
	 * @see org.tetrabox.example.pacman.xpacman.pacman.GhostPersonality
	 * @see #getPersonnality()
	 * @generated
	 */
	void setPersonnality(GhostPersonality value);

	/**
	 * Returns the value of the '<em><b>Target Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Tile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Tile</em>' reference.
	 * @see #setTargetTile(Tile)
	 * @see org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage#getGhost_TargetTile()
	 * @model
	 * @generated
	 */
	Tile getTargetTile();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacman.pacman.Ghost#getTargetTile <em>Target Tile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Tile</em>' reference.
	 * @see #getTargetTile()
	 * @generated
	 */
	void setTargetTile(Tile value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void changeTargetTile(Tile targetTile);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enterNextTile();

} // Ghost
