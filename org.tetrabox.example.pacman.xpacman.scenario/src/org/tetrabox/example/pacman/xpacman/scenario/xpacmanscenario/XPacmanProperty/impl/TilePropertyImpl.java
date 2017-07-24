/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.pacman.xpacman.pacman.Tile;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tile Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TilePropertyImpl<T extends Tile> extends XPacmanStatePropertyImpl<T> implements TileProperty<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TilePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPacmanPropertyPackage.Literals.TILE_PROPERTY;
	}

} //TilePropertyImpl
