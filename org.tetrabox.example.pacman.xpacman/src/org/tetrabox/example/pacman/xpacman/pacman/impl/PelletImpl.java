/**
 */
package org.tetrabox.example.pacman.xpacman.pacman.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tetrabox.example.pacman.xpacman.pacman.Pacman;
import org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage;
import org.tetrabox.example.pacman.xpacman.pacman.Pellet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pellet</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PelletImpl extends EObjectImpl implements Pellet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PelletImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanPackage.Literals.PELLET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eat(Pacman pacman) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //PelletImpl
