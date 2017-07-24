/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty;

import fr.inria.diverse.event.commons.model.property.SingleReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.tetrabox.example.pacman.xpacman.pacman.Pacman;
import org.tetrabox.example.pacman.xpacman.pacman.Tile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pacman Next Tile Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyPackage#getPacmanNextTileProperty()
 * @model
 * @generated
 */
public interface PacmanNextTileProperty extends PacmanProperty<Pacman>, SingleReferenceProperty<TileProperty<Tile>, Pacman> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage.Literals.ENTITY__NEXT_TILE;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // PacmanNextTileProperty