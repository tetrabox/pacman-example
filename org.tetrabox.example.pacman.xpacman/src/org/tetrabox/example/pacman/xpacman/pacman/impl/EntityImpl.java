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
import org.tetrabox.example.pacman.xpacman.pacman.Tile;

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
 *   <li>{@link org.tetrabox.example.pacman.xpacman.pacman.impl.EntityImpl#getNextTile <em>Next Tile</em>}</li>
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
	protected Tile initialTile;

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
	protected Tile currentTile;

	/**
	 * The cached value of the '{@link #getNextTile() <em>Next Tile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextTile()
	 * @generated
	 * @ordered
	 */
	protected Tile nextTile;

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
	public Tile getInitialTile() {
		if (initialTile != null && initialTile.eIsProxy()) {
			InternalEObject oldInitialTile = (InternalEObject)initialTile;
			initialTile = (Tile)eResolveProxy(oldInitialTile);
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
	public Tile basicGetInitialTile() {
		return initialTile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialTile(Tile newInitialTile) {
		Tile oldInitialTile = initialTile;
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
	public Tile getCurrentTile() {
		if (currentTile != null && currentTile.eIsProxy()) {
			InternalEObject oldCurrentTile = (InternalEObject)currentTile;
			currentTile = (Tile)eResolveProxy(oldCurrentTile);
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
	public Tile basicGetCurrentTile() {
		return currentTile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentTile(Tile newCurrentTile) {
		Tile oldCurrentTile = currentTile;
		currentTile = newCurrentTile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.ENTITY__CURRENT_TILE, oldCurrentTile, currentTile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile getNextTile() {
		if (nextTile != null && nextTile.eIsProxy()) {
			InternalEObject oldNextTile = (InternalEObject)nextTile;
			nextTile = (Tile)eResolveProxy(oldNextTile);
			if (nextTile != oldNextTile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanPackage.ENTITY__NEXT_TILE, oldNextTile, nextTile));
			}
		}
		return nextTile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile basicGetNextTile() {
		return nextTile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextTile(Tile newNextTile) {
		Tile oldNextTile = nextTile;
		nextTile = newNextTile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.ENTITY__NEXT_TILE, oldNextTile, nextTile));
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
			case PacmanPackage.ENTITY__NEXT_TILE:
				if (resolve) return getNextTile();
				return basicGetNextTile();
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
				setInitialTile((Tile)newValue);
				return;
			case PacmanPackage.ENTITY__SPEED:
				setSpeed((Integer)newValue);
				return;
			case PacmanPackage.ENTITY__DIRECTION:
				setDirection((Integer)newValue);
				return;
			case PacmanPackage.ENTITY__CURRENT_TILE:
				setCurrentTile((Tile)newValue);
				return;
			case PacmanPackage.ENTITY__NEXT_TILE:
				setNextTile((Tile)newValue);
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
				setInitialTile((Tile)null);
				return;
			case PacmanPackage.ENTITY__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case PacmanPackage.ENTITY__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case PacmanPackage.ENTITY__CURRENT_TILE:
				setCurrentTile((Tile)null);
				return;
			case PacmanPackage.ENTITY__NEXT_TILE:
				setNextTile((Tile)null);
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
			case PacmanPackage.ENTITY__NEXT_TILE:
				return nextTile != null;
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
		result.append(')');
		return result.toString();
	}

} //EntityImpl
