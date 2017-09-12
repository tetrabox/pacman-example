/**
 */
package org.tetrabox.example.pacman.xpacmanmt.pacman;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Tile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getTop <em>Top</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getRight <em>Right</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getBottom <em>Bottom</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getLeft <em>Left</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getX <em>X</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getAbstractTile()
 * @model
 * @generated
 */
public interface AbstractTile extends EObject {
	/**
	 * Returns the value of the '<em><b>Top</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top</em>' reference.
	 * @see #setTop(AbstractTile)
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getAbstractTile_Top()
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getBottom
	 * @model opposite="bottom"
	 * @generated
	 */
	AbstractTile getTop();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getTop <em>Top</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top</em>' reference.
	 * @see #getTop()
	 * @generated
	 */
	void setTop(AbstractTile value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(AbstractTile)
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getAbstractTile_Right()
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getLeft
	 * @model opposite="left"
	 * @generated
	 */
	AbstractTile getRight();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(AbstractTile value);

	/**
	 * Returns the value of the '<em><b>Bottom</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom</em>' reference.
	 * @see #setBottom(AbstractTile)
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getAbstractTile_Bottom()
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getTop
	 * @model opposite="top"
	 * @generated
	 */
	AbstractTile getBottom();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getBottom <em>Bottom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom</em>' reference.
	 * @see #getBottom()
	 * @generated
	 */
	void setBottom(AbstractTile value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(AbstractTile)
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getAbstractTile_Left()
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getRight
	 * @model opposite="right"
	 * @generated
	 */
	AbstractTile getLeft();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(AbstractTile value);

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
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getAbstractTile_X()
	 * @model
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getX <em>X</em>}' attribute.
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
	 * @see org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage#getAbstractTile_Y()
	 * @model
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize();

} // AbstractTile
