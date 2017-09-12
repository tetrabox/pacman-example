/**
 */
package pacman.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pacman.AbstractTile;
import pacman.PacmanPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Tile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacman.impl.AbstractTileImpl#getTop <em>Top</em>}</li>
 *   <li>{@link pacman.impl.AbstractTileImpl#getRight <em>Right</em>}</li>
 *   <li>{@link pacman.impl.AbstractTileImpl#getBottom <em>Bottom</em>}</li>
 *   <li>{@link pacman.impl.AbstractTileImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link pacman.impl.AbstractTileImpl#getX <em>X</em>}</li>
 *   <li>{@link pacman.impl.AbstractTileImpl#getY <em>Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractTileImpl extends MinimalEObjectImpl.Container implements AbstractTile {
	/**
	 * The cached value of the '{@link #getTop() <em>Top</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop()
	 * @generated
	 * @ordered
	 */
	protected AbstractTile top;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected AbstractTile right;

	/**
	 * The cached value of the '{@link #getBottom() <em>Bottom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottom()
	 * @generated
	 * @ordered
	 */
	protected AbstractTile bottom;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected AbstractTile left;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected int x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected int y = Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanPackage.Literals.ABSTRACT_TILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTile getTop() {
		if (top != null && top.eIsProxy()) {
			InternalEObject oldTop = (InternalEObject)top;
			top = (AbstractTile)eResolveProxy(oldTop);
			if (top != oldTop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanPackage.ABSTRACT_TILE__TOP, oldTop, top));
			}
		}
		return top;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTile basicGetTop() {
		return top;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTop(AbstractTile newTop, NotificationChain msgs) {
		AbstractTile oldTop = top;
		top = newTop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PacmanPackage.ABSTRACT_TILE__TOP, oldTop, newTop);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTop(AbstractTile newTop) {
		if (newTop != top) {
			NotificationChain msgs = null;
			if (top != null)
				msgs = ((InternalEObject)top).eInverseRemove(this, PacmanPackage.ABSTRACT_TILE__BOTTOM, AbstractTile.class, msgs);
			if (newTop != null)
				msgs = ((InternalEObject)newTop).eInverseAdd(this, PacmanPackage.ABSTRACT_TILE__BOTTOM, AbstractTile.class, msgs);
			msgs = basicSetTop(newTop, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.ABSTRACT_TILE__TOP, newTop, newTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTile getRight() {
		if (right != null && right.eIsProxy()) {
			InternalEObject oldRight = (InternalEObject)right;
			right = (AbstractTile)eResolveProxy(oldRight);
			if (right != oldRight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanPackage.ABSTRACT_TILE__RIGHT, oldRight, right));
			}
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTile basicGetRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(AbstractTile newRight, NotificationChain msgs) {
		AbstractTile oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PacmanPackage.ABSTRACT_TILE__RIGHT, oldRight, newRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(AbstractTile newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject)right).eInverseRemove(this, PacmanPackage.ABSTRACT_TILE__LEFT, AbstractTile.class, msgs);
			if (newRight != null)
				msgs = ((InternalEObject)newRight).eInverseAdd(this, PacmanPackage.ABSTRACT_TILE__LEFT, AbstractTile.class, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.ABSTRACT_TILE__RIGHT, newRight, newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTile getBottom() {
		if (bottom != null && bottom.eIsProxy()) {
			InternalEObject oldBottom = (InternalEObject)bottom;
			bottom = (AbstractTile)eResolveProxy(oldBottom);
			if (bottom != oldBottom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanPackage.ABSTRACT_TILE__BOTTOM, oldBottom, bottom));
			}
		}
		return bottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTile basicGetBottom() {
		return bottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBottom(AbstractTile newBottom, NotificationChain msgs) {
		AbstractTile oldBottom = bottom;
		bottom = newBottom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PacmanPackage.ABSTRACT_TILE__BOTTOM, oldBottom, newBottom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottom(AbstractTile newBottom) {
		if (newBottom != bottom) {
			NotificationChain msgs = null;
			if (bottom != null)
				msgs = ((InternalEObject)bottom).eInverseRemove(this, PacmanPackage.ABSTRACT_TILE__TOP, AbstractTile.class, msgs);
			if (newBottom != null)
				msgs = ((InternalEObject)newBottom).eInverseAdd(this, PacmanPackage.ABSTRACT_TILE__TOP, AbstractTile.class, msgs);
			msgs = basicSetBottom(newBottom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.ABSTRACT_TILE__BOTTOM, newBottom, newBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTile getLeft() {
		if (left != null && left.eIsProxy()) {
			InternalEObject oldLeft = (InternalEObject)left;
			left = (AbstractTile)eResolveProxy(oldLeft);
			if (left != oldLeft) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanPackage.ABSTRACT_TILE__LEFT, oldLeft, left));
			}
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTile basicGetLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(AbstractTile newLeft, NotificationChain msgs) {
		AbstractTile oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PacmanPackage.ABSTRACT_TILE__LEFT, oldLeft, newLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(AbstractTile newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject)left).eInverseRemove(this, PacmanPackage.ABSTRACT_TILE__RIGHT, AbstractTile.class, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject)newLeft).eInverseAdd(this, PacmanPackage.ABSTRACT_TILE__RIGHT, AbstractTile.class, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.ABSTRACT_TILE__LEFT, newLeft, newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(int newX) {
		int oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.ABSTRACT_TILE__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(int newY) {
		int oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.ABSTRACT_TILE__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PacmanPackage.ABSTRACT_TILE__TOP:
				if (top != null)
					msgs = ((InternalEObject)top).eInverseRemove(this, PacmanPackage.ABSTRACT_TILE__BOTTOM, AbstractTile.class, msgs);
				return basicSetTop((AbstractTile)otherEnd, msgs);
			case PacmanPackage.ABSTRACT_TILE__RIGHT:
				if (right != null)
					msgs = ((InternalEObject)right).eInverseRemove(this, PacmanPackage.ABSTRACT_TILE__LEFT, AbstractTile.class, msgs);
				return basicSetRight((AbstractTile)otherEnd, msgs);
			case PacmanPackage.ABSTRACT_TILE__BOTTOM:
				if (bottom != null)
					msgs = ((InternalEObject)bottom).eInverseRemove(this, PacmanPackage.ABSTRACT_TILE__TOP, AbstractTile.class, msgs);
				return basicSetBottom((AbstractTile)otherEnd, msgs);
			case PacmanPackage.ABSTRACT_TILE__LEFT:
				if (left != null)
					msgs = ((InternalEObject)left).eInverseRemove(this, PacmanPackage.ABSTRACT_TILE__RIGHT, AbstractTile.class, msgs);
				return basicSetLeft((AbstractTile)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PacmanPackage.ABSTRACT_TILE__TOP:
				return basicSetTop(null, msgs);
			case PacmanPackage.ABSTRACT_TILE__RIGHT:
				return basicSetRight(null, msgs);
			case PacmanPackage.ABSTRACT_TILE__BOTTOM:
				return basicSetBottom(null, msgs);
			case PacmanPackage.ABSTRACT_TILE__LEFT:
				return basicSetLeft(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PacmanPackage.ABSTRACT_TILE__TOP:
				if (resolve) return getTop();
				return basicGetTop();
			case PacmanPackage.ABSTRACT_TILE__RIGHT:
				if (resolve) return getRight();
				return basicGetRight();
			case PacmanPackage.ABSTRACT_TILE__BOTTOM:
				if (resolve) return getBottom();
				return basicGetBottom();
			case PacmanPackage.ABSTRACT_TILE__LEFT:
				if (resolve) return getLeft();
				return basicGetLeft();
			case PacmanPackage.ABSTRACT_TILE__X:
				return getX();
			case PacmanPackage.ABSTRACT_TILE__Y:
				return getY();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PacmanPackage.ABSTRACT_TILE__TOP:
				setTop((AbstractTile)newValue);
				return;
			case PacmanPackage.ABSTRACT_TILE__RIGHT:
				setRight((AbstractTile)newValue);
				return;
			case PacmanPackage.ABSTRACT_TILE__BOTTOM:
				setBottom((AbstractTile)newValue);
				return;
			case PacmanPackage.ABSTRACT_TILE__LEFT:
				setLeft((AbstractTile)newValue);
				return;
			case PacmanPackage.ABSTRACT_TILE__X:
				setX((Integer)newValue);
				return;
			case PacmanPackage.ABSTRACT_TILE__Y:
				setY((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PacmanPackage.ABSTRACT_TILE__TOP:
				setTop((AbstractTile)null);
				return;
			case PacmanPackage.ABSTRACT_TILE__RIGHT:
				setRight((AbstractTile)null);
				return;
			case PacmanPackage.ABSTRACT_TILE__BOTTOM:
				setBottom((AbstractTile)null);
				return;
			case PacmanPackage.ABSTRACT_TILE__LEFT:
				setLeft((AbstractTile)null);
				return;
			case PacmanPackage.ABSTRACT_TILE__X:
				setX(X_EDEFAULT);
				return;
			case PacmanPackage.ABSTRACT_TILE__Y:
				setY(Y_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PacmanPackage.ABSTRACT_TILE__TOP:
				return top != null;
			case PacmanPackage.ABSTRACT_TILE__RIGHT:
				return right != null;
			case PacmanPackage.ABSTRACT_TILE__BOTTOM:
				return bottom != null;
			case PacmanPackage.ABSTRACT_TILE__LEFT:
				return left != null;
			case PacmanPackage.ABSTRACT_TILE__X:
				return x != X_EDEFAULT;
			case PacmanPackage.ABSTRACT_TILE__Y:
				return y != Y_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(')');
		return result.toString();
	}

} //AbstractTileImpl
