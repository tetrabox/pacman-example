/**
 */
package org.tetrabox.example.pacman.xpacman.pacman.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tetrabox.example.pacman.xpacman.pacman.Pacman;
import org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pacman</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.pacman.xpacman.pacman.impl.PacmanImpl#getInitialLives <em>Initial Lives</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacman.pacman.impl.PacmanImpl#getPelletsEaten <em>Pellets Eaten</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacman.pacman.impl.PacmanImpl#getLives <em>Lives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PacmanImpl extends EntityImpl implements Pacman {
	/**
	 * The default value of the '{@link #getInitialLives() <em>Initial Lives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialLives()
	 * @generated
	 * @ordered
	 */
	protected static final int INITIAL_LIVES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInitialLives() <em>Initial Lives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialLives()
	 * @generated
	 * @ordered
	 */
	protected int initialLives = INITIAL_LIVES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPelletsEaten() <em>Pellets Eaten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPelletsEaten()
	 * @generated
	 * @ordered
	 */
	protected static final int PELLETS_EATEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPelletsEaten() <em>Pellets Eaten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPelletsEaten()
	 * @generated
	 * @ordered
	 */
	protected int pelletsEaten = PELLETS_EATEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLives() <em>Lives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLives()
	 * @generated
	 * @ordered
	 */
	protected static final int LIVES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLives() <em>Lives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLives()
	 * @generated
	 * @ordered
	 */
	protected int lives = LIVES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PacmanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanPackage.Literals.PACMAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInitialLives() {
		return initialLives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialLives(int newInitialLives) {
		int oldInitialLives = initialLives;
		initialLives = newInitialLives;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.PACMAN__INITIAL_LIVES, oldInitialLives, initialLives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPelletsEaten() {
		return pelletsEaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPelletsEaten(int newPelletsEaten) {
		int oldPelletsEaten = pelletsEaten;
		pelletsEaten = newPelletsEaten;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.PACMAN__PELLETS_EATEN, oldPelletsEaten, pelletsEaten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLives() {
		return lives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLives(int newLives) {
		int oldLives = lives;
		lives = newLives;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.PACMAN__LIVES, oldLives, lives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void up() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void left() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void down() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void right() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eatPellet() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void kill() {
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
			case PacmanPackage.PACMAN__INITIAL_LIVES:
				return getInitialLives();
			case PacmanPackage.PACMAN__PELLETS_EATEN:
				return getPelletsEaten();
			case PacmanPackage.PACMAN__LIVES:
				return getLives();
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
			case PacmanPackage.PACMAN__INITIAL_LIVES:
				setInitialLives((Integer)newValue);
				return;
			case PacmanPackage.PACMAN__PELLETS_EATEN:
				setPelletsEaten((Integer)newValue);
				return;
			case PacmanPackage.PACMAN__LIVES:
				setLives((Integer)newValue);
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
			case PacmanPackage.PACMAN__INITIAL_LIVES:
				setInitialLives(INITIAL_LIVES_EDEFAULT);
				return;
			case PacmanPackage.PACMAN__PELLETS_EATEN:
				setPelletsEaten(PELLETS_EATEN_EDEFAULT);
				return;
			case PacmanPackage.PACMAN__LIVES:
				setLives(LIVES_EDEFAULT);
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
			case PacmanPackage.PACMAN__INITIAL_LIVES:
				return initialLives != INITIAL_LIVES_EDEFAULT;
			case PacmanPackage.PACMAN__PELLETS_EATEN:
				return pelletsEaten != PELLETS_EATEN_EDEFAULT;
			case PacmanPackage.PACMAN__LIVES:
				return lives != LIVES_EDEFAULT;
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
		result.append(" (initialLives: ");
		result.append(initialLives);
		result.append(", pelletsEaten: ");
		result.append(pelletsEaten);
		result.append(", lives: ");
		result.append(lives);
		result.append(')');
		return result.toString();
	}

} //PacmanImpl
