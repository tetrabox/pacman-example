/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.impl;

import fr.inria.diverse.event.commons.model.scenario.ScenarioFSMTransition;
import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;

import fr.inria.diverse.event.commons.model.scenario.impl.ScenarioFSMStateImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.XPacmanEvent;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.XPacmanScenarioFSMState;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.XPacmanScenarioFSMTransition;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.XPacmanScenarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSM State</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XPacmanScenarioFSMStateImpl extends ScenarioFSMStateImpl<XPacmanEvent<?>, XPacmanScenarioFSMTransition> implements XPacmanScenarioFSMState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XPacmanScenarioFSMStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPacmanScenarioPackage.Literals.XPACMAN_SCENARIO_FSM_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetEvent(XPacmanEvent<?> newEvent, NotificationChain msgs) {
		return super.basicSetEvent(newEvent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XPacmanScenarioFSMTransition> getOutgoingTransitions() {
		if (outgoingTransitions == null) {
			outgoingTransitions = new EObjectWithInverseResolvingEList<XPacmanScenarioFSMTransition>(XPacmanScenarioFSMTransition.class, this, XPacmanScenarioPackage.XPACMAN_SCENARIO_FSM_STATE__OUTGOING_TRANSITIONS, ScenarioPackage.SCENARIO_FSM_TRANSITION__SOURCE) { private static final long serialVersionUID = 1L; @Override public Class<?> getInverseFeatureClass() { return ScenarioFSMTransition.class; } };
		}
		return outgoingTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XPacmanScenarioFSMTransition> getIncomingTransitions() {
		if (incomingTransitions == null) {
			incomingTransitions = new EObjectWithInverseResolvingEList<XPacmanScenarioFSMTransition>(XPacmanScenarioFSMTransition.class, this, XPacmanScenarioPackage.XPACMAN_SCENARIO_FSM_STATE__INCOMING_TRANSITIONS, ScenarioPackage.SCENARIO_FSM_TRANSITION__TARGET) { private static final long serialVersionUID = 1L; @Override public Class<?> getInverseFeatureClass() { return ScenarioFSMTransition.class; } };
		}
		return incomingTransitions;
	}

} //XPacmanScenarioFSMStateImpl
