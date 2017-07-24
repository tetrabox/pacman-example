/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty;

import fr.inria.diverse.event.commons.model.property.StringAttributeProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.tetrabox.example.pacman.xpacman.pacman.Ghost;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ghost Name Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyPackage#getGhostNameProperty()
 * @model
 * @generated
 */
public interface GhostNameProperty extends GhostProperty<Ghost>, StringAttributeProperty<Ghost> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage.Literals.GHOST__NAME;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // GhostNameProperty
