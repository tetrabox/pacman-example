/**
 */
package pacman.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link pacman.impl.TileImpl#getInitialPellet <em>Initial Pellet</em>}</li>
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
		result.append(" (initialPellet: ");
		result.append(initialPellet);
		result.append(')');
		return result.toString();
	}

} //TileImpl
