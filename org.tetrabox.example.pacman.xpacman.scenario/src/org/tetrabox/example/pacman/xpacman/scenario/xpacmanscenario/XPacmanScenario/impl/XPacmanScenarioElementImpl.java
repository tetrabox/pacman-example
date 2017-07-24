/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.impl;

import fr.inria.diverse.event.commons.model.scenario.impl.ScenarioElementImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanProperty;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.XPacmanScenarioElement;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.XPacmanScenarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class XPacmanScenarioElementImpl extends ScenarioElementImpl<XPacmanProperty> implements XPacmanScenarioElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XPacmanScenarioElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPacmanScenarioPackage.Literals.XPACMAN_SCENARIO_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetGuard(XPacmanProperty newGuard, NotificationChain msgs) {
		return super.basicSetGuard(newGuard, msgs);
	}

} //XPacmanScenarioElementImpl
