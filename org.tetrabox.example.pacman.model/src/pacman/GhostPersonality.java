/**
 */
package pacman;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ghost Personality</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pacman.PacmanPackage#getGhostPersonality()
 * @model
 * @generated
 */
public enum GhostPersonality implements Enumerator {
	/**
	 * The '<em><b>SHADOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHADOW_VALUE
	 * @generated
	 * @ordered
	 */
	SHADOW(0, "SHADOW", "SHADOW"),

	/**
	 * The '<em><b>SPEEDY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEEDY_VALUE
	 * @generated
	 * @ordered
	 */
	SPEEDY(1, "SPEEDY", "SPEEDY"),

	/**
	 * The '<em><b>BASHFUL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASHFUL_VALUE
	 * @generated
	 * @ordered
	 */
	BASHFUL(2, "BASHFUL", "BASHFUL"),

	/**
	 * The '<em><b>POKEY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POKEY_VALUE
	 * @generated
	 * @ordered
	 */
	POKEY(3, "POKEY", "POKEY");

	/**
	 * The '<em><b>SHADOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHADOW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHADOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHADOW_VALUE = 0;

	/**
	 * The '<em><b>SPEEDY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPEEDY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPEEDY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPEEDY_VALUE = 1;

	/**
	 * The '<em><b>BASHFUL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BASHFUL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BASHFUL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BASHFUL_VALUE = 2;

	/**
	 * The '<em><b>POKEY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POKEY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POKEY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POKEY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Ghost Personality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GhostPersonality[] VALUES_ARRAY =
		new GhostPersonality[] {
			SHADOW,
			SPEEDY,
			BASHFUL,
			POKEY,
		};

	/**
	 * A public read-only list of all the '<em><b>Ghost Personality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GhostPersonality> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ghost Personality</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GhostPersonality get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GhostPersonality result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ghost Personality</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GhostPersonality getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GhostPersonality result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ghost Personality</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GhostPersonality get(int value) {
		switch (value) {
			case SHADOW_VALUE: return SHADOW;
			case SPEEDY_VALUE: return SPEEDY;
			case BASHFUL_VALUE: return BASHFUL;
			case POKEY_VALUE: return POKEY;
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
	private GhostPersonality(int value, String name, String literal) {
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
	
} //GhostPersonality
