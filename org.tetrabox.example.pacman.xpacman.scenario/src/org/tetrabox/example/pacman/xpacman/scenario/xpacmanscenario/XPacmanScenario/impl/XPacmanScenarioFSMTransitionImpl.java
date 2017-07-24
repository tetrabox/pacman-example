/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.impl;

import fr.inria.diverse.event.commons.model.scenario.impl.ScenarioFSMTransitionImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanProperty;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.XPacmanScenarioFSMState;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.XPacmanScenarioFSMTransition;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.XPacmanScenarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSM Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XPacmanScenarioFSMTransitionImpl extends ScenarioFSMTransitionImpl<XPacmanProperty, XPacmanScenarioFSMState> implements XPacmanScenarioFSMTransition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XPacmanScenarioFSMTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPacmanScenarioPackage.Literals.XPACMAN_SCENARIO_FSM_TRANSITION;
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetSource(XPacmanScenarioFSMState newSource, NotificationChain msgs) {
		return super.basicSetSource(newSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetTarget(XPacmanScenarioFSMState newTarget, NotificationChain msgs) {
		return super.basicSetTarget(newTarget, msgs);
	}

} //XPacmanScenarioFSMTransitionImpl
