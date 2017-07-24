/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.tetrabox.example.pacman.xpacman.pacman.Ghost;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostChangeTargetTileProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ghost Change Target Tile Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GhostChangeTargetTilePropertyImpl extends XPacmanStepPropertyImpl<Ghost> implements GhostChangeTargetTileProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GhostChangeTargetTilePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPacmanPropertyPackage.Literals.GHOST_CHANGE_TARGET_TILE_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation() {
		java.util.Iterator<EOperation> it = org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage.Literals.GHOST.getEOperations().iterator();
		EOperation result = null;
		while (it.hasNext() && result == null) {
			EOperation op = it.next();
			if (op.getName().equals("changeTargetTile")) {
				result = op;
			}
		}
		return result;
		
	}

} //GhostChangeTargetTilePropertyImpl
