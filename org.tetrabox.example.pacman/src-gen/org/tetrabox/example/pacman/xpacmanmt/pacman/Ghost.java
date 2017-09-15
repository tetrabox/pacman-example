/**
 */
package org.tetrabox.example.pacman.xpacmanmt.pacman;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ghost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost#getName <em>Name</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost#getPersonnality <em>Personnality</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost#getScatterTile <em>Scatter Tile</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost#getTargetTile <em>Target Tile</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost#isFrightenedMode <em>Frightened Mode</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getGhost()
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
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getGhost_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Personnality</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tetrabox.example.pacman.xpacmanmt.pacman.GhostPersonality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personnality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personnality</em>' attribute.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.GhostPersonality
	 * @see #setPersonnality(GhostPersonality)
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getGhost_Personnality()
	 * @model required="true"
	 * @generated
	 */
	GhostPersonality getPersonnality();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost#getPersonnality <em>Personnality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personnality</em>' attribute.
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.GhostPersonality
	 * @see #getPersonnality()
	 * @generated
	 */
	void setPersonnality(GhostPersonality value);

	/**
	 * Returns the value of the '<em><b>Scatter Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scatter Tile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scatter Tile</em>' reference.
	 * @see #setScatterTile(AbstractTile)
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getGhost_ScatterTile()
	 * @model required="true"
	 * @generated
	 */
	AbstractTile getScatterTile();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost#getScatterTile <em>Scatter Tile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scatter Tile</em>' reference.
	 * @see #getScatterTile()
	 * @generated
	 */
	void setScatterTile(AbstractTile value);

	/**
	 * Returns the value of the '<em><b>Target Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Tile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Tile</em>' reference.
	 * @see #setTargetTile(AbstractTile)
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getGhost_TargetTile()
	 * @model
	 * @generated
	 */
	AbstractTile getTargetTile();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost#getTargetTile <em>Target Tile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Tile</em>' reference.
	 * @see #getTargetTile()
	 * @generated
	 */
	void setTargetTile(AbstractTile value);

	/**
	 * Returns the value of the '<em><b>Frightened Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frightened Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frightened Mode</em>' attribute.
	 * @see #setFrightenedMode(boolean)
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getGhost_FrightenedMode()
	 * @model unique="false"
	 * @generated
	 */
	boolean isFrightenedMode();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost#isFrightenedMode <em>Frightened Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frightened Mode</em>' attribute.
	 * @see #isFrightenedMode()
	 * @generated
	 */
	void setFrightenedMode(boolean value);

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
	void activate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enterChaseMode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enterScatterMode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void switchFrightenedMode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void changeTargetTile(AbstractTile targetTile);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void eat();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enterNextTile();

} // Ghost
