/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl;

import fr.inria.diverse.event.commons.model.property.ComparisonOperator;
import fr.inria.diverse.event.commons.model.property.IntegerAttributeProperty;
import fr.inria.diverse.event.commons.model.property.PropertyPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tetrabox.example.pacman.xpacman.pacman.Pacman;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanPelletsEatenProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pacman Pellets Eaten Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanPelletsEatenPropertyImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl.PacmanPelletsEatenPropertyImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PacmanPelletsEatenPropertyImpl extends PacmanPropertyImpl<Pacman> implements PacmanPelletsEatenProperty {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonOperator OPERATOR_EDEFAULT = ComparisonOperator.EQUAL;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PacmanPelletsEatenPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPacmanPropertyPackage.Literals.PACMAN_PELLETS_EATEN_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPacmanPropertyPackage.PACMAN_PELLETS_EATEN_PROPERTY__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(ComparisonOperator newOperator) {
		ComparisonOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPacmanPropertyPackage.PACMAN_PELLETS_EATEN_PROPERTY__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getFeature() {
		return org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage.Literals.PACMAN__PELLETS_EATEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XPacmanPropertyPackage.PACMAN_PELLETS_EATEN_PROPERTY__VALUE:
				return getValue();
			case XPacmanPropertyPackage.PACMAN_PELLETS_EATEN_PROPERTY__OPERATOR:
				return getOperator();
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
			case XPacmanPropertyPackage.PACMAN_PELLETS_EATEN_PROPERTY__VALUE:
				setValue((Integer)newValue);
				return;
			case XPacmanPropertyPackage.PACMAN_PELLETS_EATEN_PROPERTY__OPERATOR:
				setOperator((ComparisonOperator)newValue);
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
			case XPacmanPropertyPackage.PACMAN_PELLETS_EATEN_PROPERTY__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case XPacmanPropertyPackage.PACMAN_PELLETS_EATEN_PROPERTY__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
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
			case XPacmanPropertyPackage.PACMAN_PELLETS_EATEN_PROPERTY__VALUE:
				return value != VALUE_EDEFAULT;
			case XPacmanPropertyPackage.PACMAN_PELLETS_EATEN_PROPERTY__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IntegerAttributeProperty.class) {
			switch (derivedFeatureID) {
				case XPacmanPropertyPackage.PACMAN_PELLETS_EATEN_PROPERTY__VALUE: return PropertyPackage.INTEGER_ATTRIBUTE_PROPERTY__VALUE;
				case XPacmanPropertyPackage.PACMAN_PELLETS_EATEN_PROPERTY__OPERATOR: return PropertyPackage.INTEGER_ATTRIBUTE_PROPERTY__OPERATOR;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IntegerAttributeProperty.class) {
			switch (baseFeatureID) {
				case PropertyPackage.INTEGER_ATTRIBUTE_PROPERTY__VALUE: return XPacmanPropertyPackage.PACMAN_PELLETS_EATEN_PROPERTY__VALUE;
				case PropertyPackage.INTEGER_ATTRIBUTE_PROPERTY__OPERATOR: return XPacmanPropertyPackage.PACMAN_PELLETS_EATEN_PROPERTY__OPERATOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //PacmanPelletsEatenPropertyImpl
