/**
 */
package pacman;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pellet Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pacman.PacmanPackage#getPelletType()
 * @model
 * @generated
 */
public enum PelletType implements Enumerator {
	/**
	 * The '<em><b>NO PELLET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_PELLET_VALUE
	 * @generated
	 * @ordered
	 */
	NO_PELLET(0, "NO_PELLET", "NO_PELLET"),

	/**
	 * The '<em><b>PELLET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PELLET_VALUE
	 * @generated
	 * @ordered
	 */
	PELLET(1, "PELLET", "PELLET"),

	/**
	 * The '<em><b>SUPER PELLET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPER_PELLET_VALUE
	 * @generated
	 * @ordered
	 */
	SUPER_PELLET(2, "SUPER_PELLET", "SUPER_PELLET");

	/**
	 * The '<em><b>NO PELLET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO PELLET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_PELLET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_PELLET_VALUE = 0;

	/**
	 * The '<em><b>PELLET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PELLET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PELLET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PELLET_VALUE = 1;

	/**
	 * The '<em><b>SUPER PELLET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUPER PELLET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUPER_PELLET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUPER_PELLET_VALUE = 2;

	/**
	 * An array of all the '<em><b>Pellet Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PelletType[] VALUES_ARRAY =
		new PelletType[] {
			NO_PELLET,
			PELLET,
			SUPER_PELLET,
		};

	/**
	 * A public read-only list of all the '<em><b>Pellet Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PelletType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pellet Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PelletType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PelletType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pellet Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PelletType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PelletType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pellet Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PelletType get(int value) {
		switch (value) {
			case NO_PELLET_VALUE: return NO_PELLET;
			case PELLET_VALUE: return PELLET;
			case SUPER_PELLET_VALUE: return SUPER_PELLET;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PelletType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
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
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PelletType
