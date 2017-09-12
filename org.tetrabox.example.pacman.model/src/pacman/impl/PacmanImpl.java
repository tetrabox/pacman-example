/**
 */
package pacman.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import pacman.Pacman;
import pacman.PacmanPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pacman</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacman.impl.PacmanImpl#getInitialLives <em>Initial Lives</em>}</li>
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PacmanPackage.PACMAN__INITIAL_LIVES:
				return getInitialLives();
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
		result.append(')');
		return result.toString();
	}

} //PacmanImpl
