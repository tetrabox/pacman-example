/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.tetrabox.example.pacman.xpacman.pacman.Tile;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileInitialPelletProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tile Initial Pellet Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TileInitialPelletPropertyImpl extends TilePropertyImpl<Tile> implements TileInitialPelletProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TileInitialPelletPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPacmanPropertyPackage.Literals.TILE_INITIAL_PELLET_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getFeature() {
		return org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage.Literals.TILE__INITIAL_PELLET;
	}

} //TileInitialPelletPropertyImpl
