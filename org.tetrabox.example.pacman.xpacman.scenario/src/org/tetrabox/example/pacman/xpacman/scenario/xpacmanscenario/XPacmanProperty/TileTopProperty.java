/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty;

import fr.inria.diverse.event.commons.model.property.SingleReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.tetrabox.example.pacman.xpacman.pacman.Tile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tile Top Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyPackage#getTileTopProperty()
 * @model
 * @generated
 */
public interface TileTopProperty extends TileProperty<Tile>, SingleReferenceProperty<TileProperty<Tile>, Tile> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage.Literals.TILE__TOP;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // TileTopProperty
