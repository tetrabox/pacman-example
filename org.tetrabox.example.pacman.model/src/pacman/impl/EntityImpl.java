/**
 */
package pacman.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import pacman.Entity;
import pacman.PacmanPackage;
import pacman.PassableTile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacman.impl.EntityImpl#getInitialTile <em>Initial Tile</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
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
	@SuppressWarnings("unchecked")
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PacmanPackage.ENTITY__INITIAL_TILE:
				if (resolve) return getInitialTile();
				return basicGetInitialTile();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PacmanPackage.ENTITY__INITIAL_TILE:
				setInitialTile((PassableTile)newValue);
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
		}
		return super.eIsSet(featureID);
	}

} //EntityImpl
