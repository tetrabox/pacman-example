/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty;

import org.eclipse.emf.ecore.EOperation;

import org.tetrabox.example.pacman.xpacman.pacman.Pacman;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pacman Initialize Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyPackage#getPacmanInitializeProperty()
 * @model
 * @generated
 */
public interface PacmanInitializeProperty extends XPacmanStepProperty<Pacman> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.Iterator<EOperation> it = org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage.Literals.PACMAN.getEOperations().iterator();\nEOperation result = null;\nwhile (it.hasNext() && result == null) {\n\tEOperation op = it.next();\n\tif (op.getName().equals(\"initialize\")) {\n\t\tresult = op;\n\t}\n}\nreturn result;\n'"
	 * @generated
	 */
	EOperation getOperation();

} // PacmanInitializeProperty
