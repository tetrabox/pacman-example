/**
 */
package pacman;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ghost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacman.Ghost#getName <em>Name</em>}</li>
 *   <li>{@link pacman.Ghost#getPersonnality <em>Personnality</em>}</li>
 * </ul>
 *
 * @see pacman.PacmanPackage#getGhost()
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
	 * @see pacman.PacmanPackage#getGhost_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pacman.Ghost#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Personnality</b></em>' attribute.
	 * The literals are from the enumeration {@link pacman.GhostPersonality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personnality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personnality</em>' attribute.
	 * @see pacman.GhostPersonality
	 * @see #setPersonnality(GhostPersonality)
	 * @see pacman.PacmanPackage#getGhost_Personnality()
	 * @model required="true"
	 * @generated
	 */
	GhostPersonality getPersonnality();

	/**
	 * Sets the value of the '{@link pacman.Ghost#getPersonnality <em>Personnality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personnality</em>' attribute.
	 * @see pacman.GhostPersonality
	 * @see #getPersonnality()
	 * @generated
	 */
	void setPersonnality(GhostPersonality value);
} // Ghost
