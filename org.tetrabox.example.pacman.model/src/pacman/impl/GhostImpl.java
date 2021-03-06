/**
 */
package pacman.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import pacman.AbstractTile;
import pacman.Ghost;
import pacman.GhostPersonality;
import pacman.PacmanPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ghost</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacman.impl.GhostImpl#getName <em>Name</em>}</li>
 *   <li>{@link pacman.impl.GhostImpl#getPersonnality <em>Personnality</em>}</li>
 *   <li>{@link pacman.impl.GhostImpl#getScatterTile <em>Scatter Tile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GhostImpl extends EntityImpl implements Ghost {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getPersonnality() <em>Personnality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonnality()
	 * @generated
	 * @ordered
	 */
	protected static final GhostPersonality PERSONNALITY_EDEFAULT = GhostPersonality.SHADOW;
	/**
	 * The cached value of the '{@link #getPersonnality() <em>Personnality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonnality()
	 * @generated
	 * @ordered
	 */
	protected GhostPersonality personnality = PERSONNALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScatterTile() <em>Scatter Tile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScatterTile()
	 * @generated
	 * @ordered
	 */
	protected AbstractTile scatterTile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GhostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanPackage.Literals.GHOST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.GHOST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GhostPersonality getPersonnality() {
		return personnality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonnality(GhostPersonality newPersonnality) {
		GhostPersonality oldPersonnality = personnality;
		personnality = newPersonnality == null ? PERSONNALITY_EDEFAULT : newPersonnality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.GHOST__PERSONNALITY, oldPersonnality, personnality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTile getScatterTile() {
		if (scatterTile != null && scatterTile.eIsProxy()) {
			InternalEObject oldScatterTile = (InternalEObject)scatterTile;
			scatterTile = (AbstractTile)eResolveProxy(oldScatterTile);
			if (scatterTile != oldScatterTile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanPackage.GHOST__SCATTER_TILE, oldScatterTile, scatterTile));
			}
		}
		return scatterTile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTile basicGetScatterTile() {
		return scatterTile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScatterTile(AbstractTile newScatterTile) {
		AbstractTile oldScatterTile = scatterTile;
		scatterTile = newScatterTile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanPackage.GHOST__SCATTER_TILE, oldScatterTile, scatterTile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PacmanPackage.GHOST__NAME:
				return getName();
			case PacmanPackage.GHOST__PERSONNALITY:
				return getPersonnality();
			case PacmanPackage.GHOST__SCATTER_TILE:
				if (resolve) return getScatterTile();
				return basicGetScatterTile();
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
			case PacmanPackage.GHOST__NAME:
				setName((String)newValue);
				return;
			case PacmanPackage.GHOST__PERSONNALITY:
				setPersonnality((GhostPersonality)newValue);
				return;
			case PacmanPackage.GHOST__SCATTER_TILE:
				setScatterTile((AbstractTile)newValue);
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
			case PacmanPackage.GHOST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PacmanPackage.GHOST__PERSONNALITY:
				setPersonnality(PERSONNALITY_EDEFAULT);
				return;
			case PacmanPackage.GHOST__SCATTER_TILE:
				setScatterTile((AbstractTile)null);
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
			case PacmanPackage.GHOST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PacmanPackage.GHOST__PERSONNALITY:
				return personnality != PERSONNALITY_EDEFAULT;
			case PacmanPackage.GHOST__SCATTER_TILE:
				return scatterTile != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", personnality: ");
		result.append(personnality);
		result.append(')');
		return result.toString();
	}

} //GhostImpl
