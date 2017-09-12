/**
 */
package pacman.impl;

import org.eclipse.emf.ecore.EClass;

import pacman.PacmanPackage;
import pacman.PassableTile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Passable Tile</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class PassableTileImpl extends AbstractTileImpl implements PassableTile {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassableTileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanPackage.Literals.PASSABLE_TILE;
	}

} //PassableTileImpl
