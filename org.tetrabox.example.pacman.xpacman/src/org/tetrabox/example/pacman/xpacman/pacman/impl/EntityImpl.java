/**
 */
package org.tetrabox.example.pacman.xpacman.pacman.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tetrabox.example.pacman.xpacman.pacman.Entity;
import org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage;
import org.tetrabox.example.pacman.xpacman.pacman.PassableTile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.pacman.xpacman.pacman.impl.EntityImpl#getInitialTile <em>Initial Tile</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacman.pacman.impl.EntityImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacman.pacman.impl.EntityImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacman.pacman.impl.EntityImpl#getCurrentTile <em>Current Tile</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacman.pacman.impl.EntityImpl#getXMoveProgress <em>XMove Progress</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacman.pacman.impl.EntityImpl#getYMoveProgress <em>YMove Progress</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityImpl extends EObjectImpl implements Entity {
	/**
	 * The cached value of the '{@link #getInitialTile() <em>Initial Tile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialTile()
	 * @generated
	 * @ordered
	 */
	protected PassableTile initialTile;

	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final int SPEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected int speed = SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final int DIRECTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected int direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCurrentTile() <em>Current Tile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentTile()
	 * @generated
	 * @ordered
	 */
	protected PassableTile currentTile;

	/**
	 * The default value of the '{@link #getXMoveProgress() <em>XMove Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMoveProgress()
	 * @generated
	 * @ordered
	 */
	protected static final int XMOVE_PROGRESS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXMoveProgress() <em>XMove Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMoveProgress()
	 * @generated
	 * @ordered
	 */
	protected int xMoveProgress = XMOVE_PROGRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getYMoveProgress() <em>YMove Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYMoveProgress()
	 * @generated
	 * @ordered
	 */
	protected static final int YMOVE_PROGRESS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYMoveProgress() <em>YMove Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYMoveProgress()
	 * @generated
	 * @ordered
	 */
	protected int yMoveProgress = YMOVE_PROGRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassableTile getInitialTile() {
		if (initialTile != null && initialTile.eIsProxy()) {
			InternalEObject oldInitialTile = (InternalEObject)initialTile;
			initialTile = (PassableTile)eResolveProxy(oldInitialTile);
			if (initialTile != oldInitialTile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanPackage.ENTITY__INITIAL_TILE, oldInitialTile, initialTile));
			}
		}
		return initialTile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassableTile basicGetInitialTile() {
		return initialTile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialTile(PassableTile newInitialTile) {
		PassableTile oldInitialTile = initialTile;
		initialTile = newInitialTile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.ENTITY__INITIAL_TILE, oldInitialTile, initialTile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(int newSpeed) {
		int oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.ENTITY__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(int newDirection) {
		int oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.ENTITY__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassableTile getCurrentTile() {
		if (currentTile != null && currentTile.eIsProxy()) {
			InternalEObject oldCurrentTile = (InternalEObject)currentTile;
			currentTile = (PassableTile)eResolveProxy(oldCurrentTile);
			if (currentTile != oldCurrentTile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanPackage.ENTITY__CURRENT_TILE, oldCurrentTile, currentTile));
			}
		}
		return currentTile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassableTile basicGetCurrentTile() {
		return currentTile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentTile(PassableTile newCurrentTile) {
		PassableTile oldCurrentTile = currentTile;
		currentTile = newCurrentTile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.ENTITY__CURRENT_TILE, oldCurrentTile, currentTile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getXMoveProgress() {
		return xMoveProgress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXMoveProgress(int newXMoveProgress) {
		int oldXMoveProgress = xMoveProgress;
		xMoveProgress = newXMoveProgress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.ENTITY__XMOVE_PROGRESS, oldXMoveProgress, xMoveProgress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYMoveProgress() {
		return yMoveProgress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYMoveProgress(int newYMoveProgress) {
		int oldYMoveProgress = yMoveProgress;
		yMoveProgress = newYMoveProgress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.ENTITY__YMOVE_PROGRESS, oldYMoveProgress, yMoveProgress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initialize() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reset() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void modifySpeed(Integer speed) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeDirection(Integer newDirection) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void update(long deltaTime) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void enterNextTile() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PacmanPackage.ENTITY__INITIAL_TILE:
				if (resolve) return getInitialTile();
				return basicGetInitialTile();
			case PacmanPackage.ENTITY__SPEED:
				return getSpeed();
			case PacmanPackage.ENTITY__DIRECTION:
				return getDirection();
			case PacmanPackage.ENTITY__CURRENT_TILE:
				if (resolve) return getCurrentTile();
				return basicGetCurrentTile();
			case PacmanPackage.ENTITY__XMOVE_PROGRESS:
				return getXMoveProgress();
			case PacmanPackage.ENTITY__YMOVE_PROGRESS:
				return getYMoveProgress();
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
			case PacmanPackage.ENTITY__INITIAL_TILE:
				setInitialTile((PassableTile)newValue);
				return;
			case PacmanPackage.ENTITY__SPEED:
				setSpeed((Integer)newValue);
				return;
			case PacmanPackage.ENTITY__DIRECTION:
				setDirection((Integer)newValue);
				return;
			case PacmanPackage.ENTITY__CURRENT_TILE:
				setCurrentTile((PassableTile)newValue);
				return;
			case PacmanPackage.ENTITY__XMOVE_PROGRESS:
				setXMoveProgress((Integer)newValue);
				return;
			case PacmanPackage.ENTITY__YMOVE_PROGRESS:
				setYMoveProgress((Integer)newValue);
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
			case PacmanPackage.ENTITY__INITIAL_TILE:
				setInitialTile((PassableTile)null);
				return;
			case PacmanPackage.ENTITY__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case PacmanPackage.ENTITY__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case PacmanPackage.ENTITY__CURRENT_TILE:
				setCurrentTile((PassableTile)null);
				return;
			case PacmanPackage.ENTITY__XMOVE_PROGRESS:
				setXMoveProgress(XMOVE_PROGRESS_EDEFAULT);
				return;
			case PacmanPackage.ENTITY__YMOVE_PROGRESS:
				setYMoveProgress(YMOVE_PROGRESS_EDEFAULT);
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
			case PacmanPackage.ENTITY__INITIAL_TILE:
				return initialTile != null;
			case PacmanPackage.ENTITY__SPEED:
				return speed != SPEED_EDEFAULT;
			case PacmanPackage.ENTITY__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case PacmanPackage.ENTITY__CURRENT_TILE:
				return currentTile != null;
			case PacmanPackage.ENTITY__XMOVE_PROGRESS:
				return xMoveProgress != XMOVE_PROGRESS_EDEFAULT;
			case PacmanPackage.ENTITY__YMOVE_PROGRESS:
				return yMoveProgress != YMOVE_PROGRESS_EDEFAULT;
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
		result.append(" (speed: ");
		result.append(speed);
		result.append(", direction: ");
		result.append(direction);
		result.append(", xMoveProgress: ");
		result.append(xMoveProgress);
		result.append(", yMoveProgress: ");
		result.append(yMoveProgress);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
