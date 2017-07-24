/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty;

import org.eclipse.emf.ecore.EOperation;

import org.tetrabox.example.pacman.xpacman.pacman.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Modify Speed Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyPackage#getEntityModifySpeedProperty()
 * @model
 * @generated
 */
public interface EntityModifySpeedProperty extends XPacmanStepProperty<Entity> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.Iterator<EOperation> it = org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage.Literals.ENTITY.getEOperations().iterator();\nEOperation result = null;\nwhile (it.hasNext() && result == null) {\n\tEOperation op = it.next();\n\tif (op.getName().equals(\"modifySpeed\")) {\n\t\tresult = op;\n\t}\n}\nreturn result;\n'"
	 * @generated
	 */
	EOperation getOperation();

} // EntityModifySpeedProperty
