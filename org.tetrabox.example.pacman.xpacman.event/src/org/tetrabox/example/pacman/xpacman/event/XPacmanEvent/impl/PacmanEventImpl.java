/**
 */
package org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.PacmanEvent;
import org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.XPacmanEventPackage;

import org.tetrabox.example.pacman.xpacman.pacman.Pacman;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pacman Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.pacman.xpacman.event.XPacmanEvent.impl.PacmanEventImpl#getPacman <em>Pacman</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PacmanEventImpl extends XPacmanDSLEventImpl implements PacmanEvent {
	/**
	 * The cached value of the '{@link #getPacman() <em>Pacman</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacman()
	 * @generated
	 * @ordered
	 */
	protected Pacman pacman;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PacmanEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPacmanEventPackage.Literals.PACMAN_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pacman getPacman() {
		if (pacman != null && pacman.eIsProxy()) {
			InternalEObject oldPacman = (InternalEObject)pacman;
			pacman = (Pacman)eResolveProxy(oldPacman);
			if (pacman != oldPacman) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPacmanEventPackage.PACMAN_EVENT__PACMAN, oldPacman, pacman));
			}
		}
		return pacman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pacman basicGetPacman() {
		return pacman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacman(Pacman newPacman) {
		Pacman oldPacman = pacman;
		pacman = newPacman;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPacmanEventPackage.PACMAN_EVENT__PACMAN, oldPacman, pacman));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XPacmanEventPackage.PACMAN_EVENT__PACMAN:
				if (resolve) return getPacman();
				return basicGetPacman();
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
			case XPacmanEventPackage.PACMAN_EVENT__PACMAN:
				setPacman((Pacman)newValue);
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
			case XPacmanEventPackage.PACMAN_EVENT__PACMAN:
				setPacman((Pacman)null);
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
			case XPacmanEventPackage.PACMAN_EVENT__PACMAN:
				return pacman != null;
		}
		return super.eIsSet(featureID);
	}

} //PacmanEventImpl
