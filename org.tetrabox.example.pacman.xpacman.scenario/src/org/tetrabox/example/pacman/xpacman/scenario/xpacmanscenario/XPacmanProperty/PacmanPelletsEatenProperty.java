/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty;

import fr.inria.diverse.event.commons.model.property.IntegerAttributeProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.tetrabox.example.pacman.xpacman.pacman.Pacman;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pacman Pellets Eaten Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyPackage#getPacmanPelletsEatenProperty()
 * @model
 * @generated
 */
public interface PacmanPelletsEatenProperty extends PacmanProperty<Pacman>, IntegerAttributeProperty<Pacman> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage.Literals.PACMAN__PELLETS_EATEN;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // PacmanPelletsEatenProperty
