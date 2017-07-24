/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty;

import fr.inria.diverse.event.commons.model.property.SingleReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.tetrabox.example.pacman.xpacman.pacman.Entity;
import org.tetrabox.example.pacman.xpacman.pacman.Tile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Current Tile Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyPackage#getEntityCurrentTileProperty()
 * @model
 * @generated
 */
public interface EntityCurrentTileProperty extends EntityProperty<Entity>, SingleReferenceProperty<TileProperty<Tile>, Entity> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage.Literals.ENTITY__CURRENT_TILE;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // EntityCurrentTileProperty
