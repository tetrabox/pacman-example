/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty;

import fr.inria.diverse.event.commons.model.property.SingleReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.tetrabox.example.pacman.xpacman.pacman.Ghost;
import org.tetrabox.example.pacman.xpacman.pacman.Tile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ghost Current Tile Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyPackage#getGhostCurrentTileProperty()
 * @model
 * @generated
 */
public interface GhostCurrentTileProperty extends GhostProperty<Ghost>, SingleReferenceProperty<TileProperty<Tile>, Ghost> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage.Literals.ENTITY__CURRENT_TILE;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // GhostCurrentTileProperty