/**
 */
package org.tetrabox.example.pacman.xpacman.pacman.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tetrabox.example.pacman.xpacman.pacman.Pacman;
import org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage;
import org.tetrabox.example.pacman.xpacman.pacman.Pellet;
import org.tetrabox.example.pacman.xpacman.pacman.PelletType;
import org.tetrabox.example.pacman.xpacman.pacman.Tile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.pacman.xpacman.pacman.impl.TileImpl#getInitialPellet <em>Initial Pellet</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacman.pacman.impl.TileImpl#getPellet <em>Pellet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TileImpl extends PassableTileImpl implements Tile {
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
	 * The cached value of the '{@link #getPellet() <em>Pellet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPellet()
	 * @generated
	 * @ordered
	 */
	protected Pellet pellet;

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
	public Pellet getPellet() {
		return pellet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPellet(Pellet newPellet, NotificationChain msgs) {
		Pellet oldPellet = pellet;
		pellet = newPellet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PacmanPackage.TILE__PELLET, oldPellet, newPellet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPellet(Pellet newPellet) {
		if (newPellet != pellet) {
			NotificationChain msgs = null;
			if (pellet != null)
				msgs = ((InternalEObject)pellet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PacmanPackage.TILE__PELLET, null, msgs);
			if (newPellet != null)
				msgs = ((InternalEObject)newPellet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PacmanPackage.TILE__PELLET, null, msgs);
			msgs = basicSetPellet(newPellet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.TILE__PELLET, newPellet, newPellet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eatPellet(Pacman pacman) {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PacmanPackage.TILE__PELLET:
				return basicSetPellet(null, msgs);
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
			case PacmanPackage.TILE__INITIAL_PELLET:
				return getInitialPellet();
			case PacmanPackage.TILE__PELLET:
				return getPellet();
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
			case PacmanPackage.TILE__INITIAL_PELLET:
				setInitialPellet((PelletType)newValue);
				return;
			case PacmanPackage.TILE__PELLET:
				setPellet((Pellet)newValue);
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
			case PacmanPackage.TILE__INITIAL_PELLET:
				setInitialPellet(INITIAL_PELLET_EDEFAULT);
				return;
			case PacmanPackage.TILE__PELLET:
				setPellet((Pellet)null);
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
			case PacmanPackage.TILE__INITIAL_PELLET:
				return initialPellet != INITIAL_PELLET_EDEFAULT;
			case PacmanPackage.TILE__PELLET:
				return pellet != null;
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
		result.append(" (initialPellet: ");
		result.append(initialPellet);
		result.append(')');
		return result.toString();
	}

} //TileImpl
