/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.tetrabox.example.pacman.xpacman.pacman.Pacman;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanLeftProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pacman Left Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PacmanLeftPropertyImpl extends XPacmanStepPropertyImpl<Pacman> implements PacmanLeftProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PacmanLeftPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPacmanPropertyPackage.Literals.PACMAN_LEFT_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation() {
		java.util.Iterator<EOperation> it = org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage.Literals.PACMAN.getEOperations().iterator();
		EOperation result = null;
		while (it.hasNext() && result == null) {
			EOperation op = it.next();
			if (op.getName().equals("left")) {
				result = op;
			}
		}
		return result;
		
	}

} //PacmanLeftPropertyImpl
