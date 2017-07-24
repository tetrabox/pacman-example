/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty;

import fr.inria.diverse.event.commons.model.property.ManyReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.tetrabox.example.pacman.xpacman.pacman.Board;
import org.tetrabox.example.pacman.xpacman.pacman.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board Entities Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyPackage#getBoardEntitiesProperty()
 * @model
 * @generated
 */
public interface BoardEntitiesProperty extends BoardProperty<Board>, ManyReferenceProperty<EntityProperty<Entity>, Board> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage.Literals.BOARD__ENTITIES;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // BoardEntitiesProperty
