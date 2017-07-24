/**
 */
package pacman;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacman.Tile#getTop <em>Top</em>}</li>
 *   <li>{@link pacman.Tile#getRight <em>Right</em>}</li>
 *   <li>{@link pacman.Tile#getBottom <em>Bottom</em>}</li>
 *   <li>{@link pacman.Tile#getLeft <em>Left</em>}</li>
 *   <li>{@link pacman.Tile#getX <em>X</em>}</li>
 *   <li>{@link pacman.Tile#getY <em>Y</em>}</li>
 *   <li>{@link pacman.Tile#isPassable <em>Passable</em>}</li>
 *   <li>{@link pacman.Tile#getInitialPellet <em>Initial Pellet</em>}</li>
 * </ul>
 *
 * @see pacman.PacmanPackage#getTile()
 * @model
 * @generated
 */
public interface Tile extends EObject {
	/**
	 * Returns the value of the '<em><b>Top</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pacman.Tile#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top</em>' reference.
	 * @see #setTop(Tile)
	 * @see pacman.PacmanPackage#getTile_Top()
	 * @see pacman.Tile#getBottom
	 * @model opposite="bottom"
	 * @generated
	 */
	Tile getTop();

	/**
	 * Sets the value of the '{@link pacman.Tile#getTop <em>Top</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top</em>' reference.
	 * @see #getTop()
	 * @generated
	 */
	void setTop(Tile value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pacman.Tile#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Tile)
	 * @see pacman.PacmanPackage#getTile_Right()
	 * @see pacman.Tile#getLeft
	 * @model opposite="left"
	 * @generated
	 */
	Tile getRight();

	/**
	 * Sets the value of the '{@link pacman.Tile#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Tile value);

	/**
	 * Returns the value of the '<em><b>Bottom</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pacman.Tile#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom</em>' reference.
	 * @see #setBottom(Tile)
	 * @see pacman.PacmanPackage#getTile_Bottom()
	 * @see pacman.Tile#getTop
	 * @model opposite="top"
	 * @generated
	 */
	Tile getBottom();

	/**
	 * Sets the value of the '{@link pacman.Tile#getBottom <em>Bottom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom</em>' reference.
	 * @see #getBottom()
	 * @generated
	 */
	void setBottom(Tile value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pacman.Tile#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Tile)
	 * @see pacman.PacmanPackage#getTile_Left()
	 * @see pacman.Tile#getRight
	 * @model opposite="right"
	 * @generated
	 */
	Tile getLeft();

	/**
	 * Sets the value of the '{@link pacman.Tile#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Tile value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see pacman.PacmanPackage#getTile_X()
	 * @model
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link pacman.Tile#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see pacman.PacmanPackage#getTile_Y()
	 * @model
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link pacman.Tile#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Returns the value of the '<em><b>Passable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passable</em>' attribute.
	 * @see #setPassable(boolean)
	 * @see pacman.PacmanPackage#getTile_Passable()
	 * @model
	 * @generated
	 */
	boolean isPassable();

	/**
	 * Sets the value of the '{@link pacman.Tile#isPassable <em>Passable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passable</em>' attribute.
	 * @see #isPassable()
	 * @generated
	 */
	void setPassable(boolean value);

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
