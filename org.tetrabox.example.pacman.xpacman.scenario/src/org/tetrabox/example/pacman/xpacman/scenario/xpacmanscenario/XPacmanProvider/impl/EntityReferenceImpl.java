/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl;

import fr.inria.diverse.event.commons.model.scenario.impl.ElementReferenceImpl;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.pacman.xpacman.pacman.Entity;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.EntityReference;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.XPacmanProviderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EntityReferenceImpl extends ElementReferenceImpl<Entity> implements EntityReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPacmanProviderPackage.Literals.ENTITY_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setElement(Entity newElement) {
		super.setElement(newElement);
	}

} //EntityReferenceImpl
