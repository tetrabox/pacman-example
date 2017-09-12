/**
 */
package pacman.impl;

import org.eclipse.emf.ecore.EClass;

import pacman.PacmanPackage;
import pacman.WallTile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wall Tile</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class WallTileImpl extends AbstractTileImpl implements WallTile {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WallTileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanPackage.Literals.WALL_TILE;
	}

} //WallTileImpl
