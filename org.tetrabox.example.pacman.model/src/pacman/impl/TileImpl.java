/**
 */
package pacman.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pacman.PacmanPackage;
import pacman.PelletType;
import pacman.Tile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacman.impl.TileImpl#getTop <em>Top</em>}</li>
 *   <li>{@link pacman.impl.TileImpl#getRight <em>Right</em>}</li>
 *   <li>{@link pacman.impl.TileImpl#getBottom <em>Bottom</em>}</li>
 *   <li>{@link pacman.impl.TileImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link pacman.impl.TileImpl#getX <em>X</em>}</li>
 *   <li>{@link pacman.impl.TileImpl#getY <em>Y</em>}</li>
 *   <li>{@link pacman.impl.TileImpl#isPassable <em>Passable</em>}</li>
 *   <li>{@link pacman.impl.TileImpl#getInitialPellet <em>Initial Pellet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TileImpl extends MinimalEObjectImpl.Container implements Tile {
	/**
	 * The cached value of the '{@link #getTop() <em>Top</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop()
	 * @generated
	 * @ordered
	 */
	protected Tile top;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected Tile right;

	/**
	 * The cached value of the '{@link #getBottom() <em>Bottom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottom()
	 * @generated
	 * @ordered
	 */
	protected Tile bottom;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected Tile left;

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
	 * The default value of the '{@link #isPassable() <em>Passable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPassable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PASSABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPassable() <em>Passable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPassable()
	 * @generated
	 * @ordered
	 */
	protected boolean passable = PASSABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialPellet() <em>Initial Pellet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialPellet()
	 * @generated
	 * @ordered
	 */
	protected static final PelletType INITIAL_PELLET_EDEFAULT = PelletType.NO_PELLET;

	/**
	 * The cached value of the '{@link #getInitialPellet() <em>Initial Pellet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialPellet()
	 * @generated
	 * @ordered
	 */
	protected PelletType initialPellet = INITIAL_PELLET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanPackage.Literals.TILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile getTop() {
		if (top != null && top.eIsProxy()) {
			InternalEObject oldTop = (InternalEObject)top;
			top = (Tile)eResolveProxy(oldTop);
			if (top != oldTop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanPackage.TILE__TOP, oldTop, top));
			}
		}
		return top;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile basicGetTop() {
		return top;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTop(Tile newTop, NotificationChain msgs) {
		Tile oldTop = top;
		top = newTop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PacmanPackage.TILE__TOP, oldTop, newTop);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTop(Tile newTop) {
		if (newTop != top) {
			NotificationChain msgs = null;
			if (top != null)
				msgs = ((InternalEObject)top).eInverseRemove(this, PacmanPackage.TILE__BOTTOM, Tile.class, msgs);
			if (newTop != null)
				msgs = ((InternalEObject)newTop).eInverseAdd(this, PacmanPackage.TILE__BOTTOM, Tile.class, msgs);
			msgs = basicSetTop(newTop, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.TILE__TOP, newTop, newTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile getRight() {
		if (right != null && right.eIsProxy()) {
			InternalEObject oldRight = (InternalEObject)right;
			right = (Tile)eResolveProxy(oldRight);
			if (right != oldRight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanPackage.TILE__RIGHT, oldRight, right));
			}
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile basicGetRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(Tile newRight, NotificationChain msgs) {
		Tile oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PacmanPackage.TILE__RIGHT, oldRight, newRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(Tile newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject)right).eInverseRemove(this, PacmanPackage.TILE__LEFT, Tile.class, msgs);
			if (newRight != null)
				msgs = ((InternalEObject)newRight).eInverseAdd(this, PacmanPackage.TILE__LEFT, Tile.class, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.TILE__RIGHT, newRight, newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile getBottom() {
		if (bottom != null && bottom.eIsProxy()) {
			InternalEObject oldBottom = (InternalEObject)bottom;
			bottom = (Tile)eResolveProxy(oldBottom);
			if (bottom != oldBottom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanPackage.TILE__BOTTOM, oldBottom, bottom));
			}
		}
		return bottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile basicGetBottom() {
		return bottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBottom(Tile newBottom, NotificationChain msgs) {
		Tile oldBottom = bottom;
		bottom = newBottom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PacmanPackage.TILE__BOTTOM, oldBottom, newBottom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottom(Tile newBottom) {
		if (newBottom != bottom) {
			NotificationChain msgs = null;
			if (bottom != null)
				msgs = ((InternalEObject)bottom).eInverseRemove(this, PacmanPackage.TILE__TOP, Tile.class, msgs);
			if (newBottom != null)
				msgs = ((InternalEObject)newBottom).eInverseAdd(this, PacmanPackage.TILE__TOP, Tile.class, msgs);
			msgs = basicSetBottom(newBottom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.TILE__BOTTOM, newBottom, newBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile getLeft() {
		if (left != null && left.eIsProxy()) {
			InternalEObject oldLeft = (InternalEObject)left;
			left = (Tile)eResolveProxy(oldLeft);
			if (left != oldLeft) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanPackage.TILE__LEFT, oldLeft, left));
			}
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile basicGetLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(Tile newLeft, NotificationChain msgs) {
		Tile oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PacmanPackage.TILE__LEFT, oldLeft, newLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(Tile newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject)left).eInverseRemove(this, PacmanPackage.TILE__RIGHT, Tile.class, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject)newLeft).eInverseAdd(this, PacmanPackage.TILE__RIGHT, Tile.class, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.TILE__LEFT, newLeft, newLeft));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.TILE__X, oldX, x));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.TILE__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPassable() {
		return passable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassable(boolean newPassable) {
		boolean oldPassable = passable;
		passable = newPassable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.TILE__PASSABLE, oldPassable, passable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PelletType getInitialPellet() {
		return initialPellet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialPellet(PelletType newInitialPellet) {
		PelletType oldInitialPellet = initialPellet;
		initialPellet = newInitialPellet == null ? INITIAL_PELLET_EDEFAULT : newInitialPellet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.TILE__INITIAL_PELLET, oldInitialPellet, initialPellet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PacmanPackage.TILE__TOP:
				if (top != null)
					msgs = ((InternalEObject)top).eInverseRemove(this, PacmanPackage.TILE__BOTTOM, Tile.class, msgs);
				return basicSetTop((Tile)otherEnd, msgs);
			case PacmanPackage.TILE__RIGHT:
				if (right != null)
					msgs = ((InternalEObject)right).eInverseRemove(this, PacmanPackage.TILE__LEFT, Tile.class, msgs);
				return basicSetRight((Tile)otherEnd, msgs);
			case PacmanPackage.TILE__BOTTOM:
				if (bottom != null)
					msgs = ((InternalEObject)bottom).eInverseRemove(this, PacmanPackage.TILE__TOP, Tile.class, msgs);
				return basicSetBottom((Tile)otherEnd, msgs);
			case PacmanPackage.TILE__LEFT:
				if (left != null)
					msgs = ((InternalEObject)left).eInverseRemove(this, PacmanPackage.TILE__RIGHT, Tile.class, msgs);
				return basicSetLeft((Tile)otherEnd, msgs);
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
			case PacmanPackage.TILE__TOP:
				return basicSetTop(null, msgs);
			case PacmanPackage.TILE__RIGHT:
				return basicSetRight(null, msgs);
			case PacmanPackage.TILE__BOTTOM:
				return basicSetBottom(null, msgs);
			case PacmanPackage.TILE__LEFT:
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
			case PacmanPackage.TILE__TOP:
				if (resolve) return getTop();
				return basicGetTop();
			case PacmanPackage.TILE__RIGHT:
				if (resolve) return getRight();
				return basicGetRight();
			case PacmanPackage.TILE__BOTTOM:
				if (resolve) return getBottom();
				return basicGetBottom();
			case PacmanPackage.TILE__LEFT:
				if (resolve) return getLeft();
				return basicGetLeft();
			case PacmanPackage.TILE__X:
				return getX();
			case PacmanPackage.TILE__Y:
				return getY();
			case PacmanPackage.TILE__PASSABLE:
				return isPassable();
			case PacmanPackage.TILE__INITIAL_PELLET:
				return getInitialPellet();
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
			case PacmanPackage.TILE__TOP:
				setTop((Tile)newValue);
				return;
			case PacmanPackage.TILE__RIGHT:
				setRight((Tile)newValue);
				return;
			case PacmanPackage.TILE__BOTTOM:
				setBottom((Tile)newValue);
				return;
			case PacmanPackage.TILE__LEFT:
				setLeft((Tile)newValue);
				return;
			case PacmanPackage.TILE__X:
				setX((Integer)newValue);
				return;
			case PacmanPackage.TILE__Y:
				setY((Integer)newValue);
				return;
			case PacmanPackage.TILE__PASSABLE:
				setPassable((Boolean)newValue);
				return;
			case PacmanPackage.TILE__INITIAL_PELLET:
				setInitialPellet((PelletType)newValue);
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
			case PacmanPackage.TILE__TOP:
				setTop((Tile)null);
				return;
			case PacmanPackage.TILE__RIGHT:
				setRight((Tile)null);
				return;
			case PacmanPackage.TILE__BOTTOM:
				setBottom((Tile)null);
				return;
			case PacmanPackage.TILE__LEFT:
				setLeft((Tile)null);
				return;
			case PacmanPackage.TILE__X:
				setX(X_EDEFAULT);
				return;
			case PacmanPackage.TILE__Y:
				setY(Y_EDEFAULT);
				return;
			case PacmanPackage.TILE__PASSABLE:
				setPassable(PASSABLE_EDEFAULT);
				return;
			case PacmanPackage.TILE__INITIAL_PELLET:
				setInitialPellet(INITIAL_PELLET_EDEFAULT);
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
			case PacmanPackage.TILE__TOP:
				return top != null;
			case PacmanPackage.TILE__RIGHT:
				return right != null;
			case PacmanPackage.TILE__BOTTOM:
				return bottom != null;
			case PacmanPackage.TILE__LEFT:
				return left != null;
			case PacmanPackage.TILE__X:
				return x != X_EDEFAULT;
			case PacmanPackage.TILE__Y:
				return y != Y_EDEFAULT;
			case PacmanPackage.TILE__PASSABLE:
				return passable != PASSABLE_EDEFAULT;
			case PacmanPackage.TILE__INITIAL_PELLET:
				return initialPellet != INITIAL_PELLET_EDEFAULT;
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
		result.append(", passable: ");
		result.append(passable);
		result.append(", initialPellet: ");
		result.append(initialPellet);
		result.append(')');
		return result.toString();
	}

} //TileImpl
