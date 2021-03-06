/**
 */
package pacman.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pacman.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PacmanFactoryImpl extends EFactoryImpl implements PacmanFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PacmanFactory init() {
		try {
			PacmanFactory thePacmanFactory = (PacmanFactory)EPackage.Registry.INSTANCE.getEFactory(PacmanPackage.eNS_URI);
			if (thePacmanFactory != null) {
				return thePacmanFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PacmanFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PacmanPackage.BOARD: return createBoard();
			case PacmanPackage.PACMAN: return createPacman();
			case PacmanPackage.GHOST: return createGhost();
			case PacmanPackage.TILE: return createTile();
			case PacmanPackage.GHOST_HOUSE_TILE: return createGhostHouseTile();
			case PacmanPackage.WALL_TILE: return createWallTile();
			case PacmanPackage.PELLET: return createPellet();
			case PacmanPackage.SUPER_PELLET: return createSuperPellet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PacmanPackage.PELLET_TYPE:
				return createPelletTypeFromString(eDataType, initialValue);
			case PacmanPackage.GHOST_PERSONALITY:
				return createGhostPersonalityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PacmanPackage.PELLET_TYPE:
				return convertPelletTypeToString(eDataType, instanceValue);
			case PacmanPackage.GHOST_PERSONALITY:
				return convertGhostPersonalityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile createTile() {
		TileImpl tile = new TileImpl();
		return tile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Board createBoard() {
		BoardImpl board = new BoardImpl();
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pacman createPacman() {
		PacmanImpl pacman = new PacmanImpl();
		return pacman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ghost createGhost() {
		GhostImpl ghost = new GhostImpl();
		return ghost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GhostHouseTile createGhostHouseTile() {
		GhostHouseTileImpl ghostHouseTile = new GhostHouseTileImpl();
		return ghostHouseTile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WallTile createWallTile() {
		WallTileImpl wallTile = new WallTileImpl();
		return wallTile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pellet createPellet() {
		PelletImpl pellet = new PelletImpl();
		return pellet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperPellet createSuperPellet() {
		SuperPelletImpl superPellet = new SuperPelletImpl();
		return superPellet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PelletType createPelletTypeFromString(EDataType eDataType, String initialValue) {
		PelletType result = PelletType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPelletTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GhostPersonality createGhostPersonalityFromString(EDataType eDataType, String initialValue) {
		GhostPersonality result = GhostPersonality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGhostPersonalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanPackage getPacmanPackage() {
		return (PacmanPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PacmanPackage getPackage() {
		return PacmanPackage.eINSTANCE;
	}

} //PacmanFactoryImpl
