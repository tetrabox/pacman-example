/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.util;

import fr.inria.diverse.event.commons.model.property.AbstractProperty;
import fr.inria.diverse.event.commons.model.property.BinaryProperty;
import fr.inria.diverse.event.commons.model.property.BooleanAttributeProperty;
import fr.inria.diverse.event.commons.model.property.ContainerReferenceProperty;
import fr.inria.diverse.event.commons.model.property.IntegerAttributeProperty;
import fr.inria.diverse.event.commons.model.property.ManyReferenceProperty;
import fr.inria.diverse.event.commons.model.property.NegationTemporalProperty;
import fr.inria.diverse.event.commons.model.property.NextProperty;
import fr.inria.diverse.event.commons.model.property.Property;
import fr.inria.diverse.event.commons.model.property.ReleaseProperty;
import fr.inria.diverse.event.commons.model.property.SingleReferenceProperty;
import fr.inria.diverse.event.commons.model.property.StateProperty;
import fr.inria.diverse.event.commons.model.property.StepProperty;
import fr.inria.diverse.event.commons.model.property.StringAttributeProperty;
import fr.inria.diverse.event.commons.model.property.TemporalProperty;
import fr.inria.diverse.event.commons.model.property.UnaryProperty;
import fr.inria.diverse.event.commons.model.property.UntilProperty;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.tetrabox.example.pacman.xpacman.pacman.Board;
import org.tetrabox.example.pacman.xpacman.pacman.Entity;
import org.tetrabox.example.pacman.xpacman.pacman.Ghost;
import org.tetrabox.example.pacman.xpacman.pacman.Pacman;
import org.tetrabox.example.pacman.xpacman.pacman.Tile;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyPackage
 * @generated
 */
public class XPacmanPropertySwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XPacmanPropertyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanPropertySwitch() {
		if (modelPackage == null) {
			modelPackage = XPacmanPropertyPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case XPacmanPropertyPackage.PACMAN_ENTER_NEXT_TILE_PROPERTY: {
				PacmanEnterNextTileProperty pacmanEnterNextTileProperty = (PacmanEnterNextTileProperty)theEObject;
				T1 result = casePacmanEnterNextTileProperty(pacmanEnterNextTileProperty);
				if (result == null) result = caseXPacmanStepProperty(pacmanEnterNextTileProperty);
				if (result == null) result = caseStepProperty(pacmanEnterNextTileProperty);
				if (result == null) result = caseXPacmanProperty(pacmanEnterNextTileProperty);
				if (result == null) result = caseProperty(pacmanEnterNextTileProperty);
				if (result == null) result = caseXPacmanAbstractProperty(pacmanEnterNextTileProperty);
				if (result == null) result = caseAbstractProperty(pacmanEnterNextTileProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.GHOST_ENTER_NEXT_TILE_PROPERTY: {
				GhostEnterNextTileProperty ghostEnterNextTileProperty = (GhostEnterNextTileProperty)theEObject;
				T1 result = caseGhostEnterNextTileProperty(ghostEnterNextTileProperty);
				if (result == null) result = caseXPacmanStepProperty(ghostEnterNextTileProperty);
				if (result == null) result = caseStepProperty(ghostEnterNextTileProperty);
				if (result == null) result = caseXPacmanProperty(ghostEnterNextTileProperty);
				if (result == null) result = caseProperty(ghostEnterNextTileProperty);
				if (result == null) result = caseXPacmanAbstractProperty(ghostEnterNextTileProperty);
				if (result == null) result = caseAbstractProperty(ghostEnterNextTileProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.ENTITY_CHANGE_DIRECTION_PROPERTY: {
				EntityChangeDirectionProperty entityChangeDirectionProperty = (EntityChangeDirectionProperty)theEObject;
				T1 result = caseEntityChangeDirectionProperty(entityChangeDirectionProperty);
				if (result == null) result = caseXPacmanStepProperty(entityChangeDirectionProperty);
				if (result == null) result = caseStepProperty(entityChangeDirectionProperty);
				if (result == null) result = caseXPacmanProperty(entityChangeDirectionProperty);
				if (result == null) result = caseProperty(entityChangeDirectionProperty);
				if (result == null) result = caseXPacmanAbstractProperty(entityChangeDirectionProperty);
				if (result == null) result = caseAbstractProperty(entityChangeDirectionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.PACMAN_LEFT_PROPERTY: {
				PacmanLeftProperty pacmanLeftProperty = (PacmanLeftProperty)theEObject;
				T1 result = casePacmanLeftProperty(pacmanLeftProperty);
				if (result == null) result = caseXPacmanStepProperty(pacmanLeftProperty);
				if (result == null) result = caseStepProperty(pacmanLeftProperty);
				if (result == null) result = caseXPacmanProperty(pacmanLeftProperty);
				if (result == null) result = caseProperty(pacmanLeftProperty);
				if (result == null) result = caseXPacmanAbstractProperty(pacmanLeftProperty);
				if (result == null) result = caseAbstractProperty(pacmanLeftProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.PACMAN_RIGHT_PROPERTY: {
				PacmanRightProperty pacmanRightProperty = (PacmanRightProperty)theEObject;
				T1 result = casePacmanRightProperty(pacmanRightProperty);
				if (result == null) result = caseXPacmanStepProperty(pacmanRightProperty);
				if (result == null) result = caseStepProperty(pacmanRightProperty);
				if (result == null) result = caseXPacmanProperty(pacmanRightProperty);
				if (result == null) result = caseProperty(pacmanRightProperty);
				if (result == null) result = caseXPacmanAbstractProperty(pacmanRightProperty);
				if (result == null) result = caseAbstractProperty(pacmanRightProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.PACMAN_EAT_PELLET_PROPERTY: {
				PacmanEatPelletProperty pacmanEatPelletProperty = (PacmanEatPelletProperty)theEObject;
				T1 result = casePacmanEatPelletProperty(pacmanEatPelletProperty);
				if (result == null) result = caseXPacmanStepProperty(pacmanEatPelletProperty);
				if (result == null) result = caseStepProperty(pacmanEatPelletProperty);
				if (result == null) result = caseXPacmanProperty(pacmanEatPelletProperty);
				if (result == null) result = caseProperty(pacmanEatPelletProperty);
				if (result == null) result = caseXPacmanAbstractProperty(pacmanEatPelletProperty);
				if (result == null) result = caseAbstractProperty(pacmanEatPelletProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.PACMAN_UP_PROPERTY: {
				PacmanUpProperty pacmanUpProperty = (PacmanUpProperty)theEObject;
				T1 result = casePacmanUpProperty(pacmanUpProperty);
				if (result == null) result = caseXPacmanStepProperty(pacmanUpProperty);
				if (result == null) result = caseStepProperty(pacmanUpProperty);
				if (result == null) result = caseXPacmanProperty(pacmanUpProperty);
				if (result == null) result = caseProperty(pacmanUpProperty);
				if (result == null) result = caseXPacmanAbstractProperty(pacmanUpProperty);
				if (result == null) result = caseAbstractProperty(pacmanUpProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.PACMAN_INITIALIZE_PROPERTY: {
				PacmanInitializeProperty pacmanInitializeProperty = (PacmanInitializeProperty)theEObject;
				T1 result = casePacmanInitializeProperty(pacmanInitializeProperty);
				if (result == null) result = caseXPacmanStepProperty(pacmanInitializeProperty);
				if (result == null) result = caseStepProperty(pacmanInitializeProperty);
				if (result == null) result = caseXPacmanProperty(pacmanInitializeProperty);
				if (result == null) result = caseProperty(pacmanInitializeProperty);
				if (result == null) result = caseXPacmanAbstractProperty(pacmanInitializeProperty);
				if (result == null) result = caseAbstractProperty(pacmanInitializeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.ENTITY_MODIFY_SPEED_PROPERTY: {
				EntityModifySpeedProperty entityModifySpeedProperty = (EntityModifySpeedProperty)theEObject;
				T1 result = caseEntityModifySpeedProperty(entityModifySpeedProperty);
				if (result == null) result = caseXPacmanStepProperty(entityModifySpeedProperty);
				if (result == null) result = caseStepProperty(entityModifySpeedProperty);
				if (result == null) result = caseXPacmanProperty(entityModifySpeedProperty);
				if (result == null) result = caseProperty(entityModifySpeedProperty);
				if (result == null) result = caseXPacmanAbstractProperty(entityModifySpeedProperty);
				if (result == null) result = caseAbstractProperty(entityModifySpeedProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.BOARD_INITIALIZE_MODEL_PROPERTY: {
				BoardInitializeModelProperty boardInitializeModelProperty = (BoardInitializeModelProperty)theEObject;
				T1 result = caseBoardInitializeModelProperty(boardInitializeModelProperty);
				if (result == null) result = caseXPacmanStepProperty(boardInitializeModelProperty);
				if (result == null) result = caseStepProperty(boardInitializeModelProperty);
				if (result == null) result = caseXPacmanProperty(boardInitializeModelProperty);
				if (result == null) result = caseProperty(boardInitializeModelProperty);
				if (result == null) result = caseXPacmanAbstractProperty(boardInitializeModelProperty);
				if (result == null) result = caseAbstractProperty(boardInitializeModelProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.ENTITY_INITIALIZE_PROPERTY: {
				EntityInitializeProperty entityInitializeProperty = (EntityInitializeProperty)theEObject;
				T1 result = caseEntityInitializeProperty(entityInitializeProperty);
				if (result == null) result = caseXPacmanStepProperty(entityInitializeProperty);
				if (result == null) result = caseStepProperty(entityInitializeProperty);
				if (result == null) result = caseXPacmanProperty(entityInitializeProperty);
				if (result == null) result = caseProperty(entityInitializeProperty);
				if (result == null) result = caseXPacmanAbstractProperty(entityInitializeProperty);
				if (result == null) result = caseAbstractProperty(entityInitializeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.PACMAN_CHANGE_DIRECTION_PROPERTY: {
				PacmanChangeDirectionProperty pacmanChangeDirectionProperty = (PacmanChangeDirectionProperty)theEObject;
				T1 result = casePacmanChangeDirectionProperty(pacmanChangeDirectionProperty);
				if (result == null) result = caseXPacmanStepProperty(pacmanChangeDirectionProperty);
				if (result == null) result = caseStepProperty(pacmanChangeDirectionProperty);
				if (result == null) result = caseXPacmanProperty(pacmanChangeDirectionProperty);
				if (result == null) result = caseProperty(pacmanChangeDirectionProperty);
				if (result == null) result = caseXPacmanAbstractProperty(pacmanChangeDirectionProperty);
				if (result == null) result = caseAbstractProperty(pacmanChangeDirectionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.ENTITY_UPDATE_PROPERTY: {
				EntityUpdateProperty entityUpdateProperty = (EntityUpdateProperty)theEObject;
				T1 result = caseEntityUpdateProperty(entityUpdateProperty);
				if (result == null) result = caseXPacmanStepProperty(entityUpdateProperty);
				if (result == null) result = caseStepProperty(entityUpdateProperty);
				if (result == null) result = caseXPacmanProperty(entityUpdateProperty);
				if (result == null) result = caseProperty(entityUpdateProperty);
				if (result == null) result = caseXPacmanAbstractProperty(entityUpdateProperty);
				if (result == null) result = caseAbstractProperty(entityUpdateProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.BOARD_RESET_PROPERTY: {
				BoardResetProperty boardResetProperty = (BoardResetProperty)theEObject;
				T1 result = caseBoardResetProperty(boardResetProperty);
				if (result == null) result = caseXPacmanStepProperty(boardResetProperty);
				if (result == null) result = caseStepProperty(boardResetProperty);
				if (result == null) result = caseXPacmanProperty(boardResetProperty);
				if (result == null) result = caseProperty(boardResetProperty);
				if (result == null) result = caseXPacmanAbstractProperty(boardResetProperty);
				if (result == null) result = caseAbstractProperty(boardResetProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.PACMAN_DOWN_PROPERTY: {
				PacmanDownProperty pacmanDownProperty = (PacmanDownProperty)theEObject;
				T1 result = casePacmanDownProperty(pacmanDownProperty);
				if (result == null) result = caseXPacmanStepProperty(pacmanDownProperty);
				if (result == null) result = caseStepProperty(pacmanDownProperty);
				if (result == null) result = caseXPacmanProperty(pacmanDownProperty);
				if (result == null) result = caseProperty(pacmanDownProperty);
				if (result == null) result = caseXPacmanAbstractProperty(pacmanDownProperty);
				if (result == null) result = caseAbstractProperty(pacmanDownProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.ENTITY_ENTER_NEXT_TILE_PROPERTY: {
				EntityEnterNextTileProperty entityEnterNextTileProperty = (EntityEnterNextTileProperty)theEObject;
				T1 result = caseEntityEnterNextTileProperty(entityEnterNextTileProperty);
				if (result == null) result = caseXPacmanStepProperty(entityEnterNextTileProperty);
				if (result == null) result = caseStepProperty(entityEnterNextTileProperty);
				if (result == null) result = caseXPacmanProperty(entityEnterNextTileProperty);
				if (result == null) result = caseProperty(entityEnterNextTileProperty);
				if (result == null) result = caseXPacmanAbstractProperty(entityEnterNextTileProperty);
				if (result == null) result = caseAbstractProperty(entityEnterNextTileProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.PACMAN_KILL_PROPERTY: {
				PacmanKillProperty pacmanKillProperty = (PacmanKillProperty)theEObject;
				T1 result = casePacmanKillProperty(pacmanKillProperty);
				if (result == null) result = caseXPacmanStepProperty(pacmanKillProperty);
				if (result == null) result = caseStepProperty(pacmanKillProperty);
				if (result == null) result = caseXPacmanProperty(pacmanKillProperty);
				if (result == null) result = caseProperty(pacmanKillProperty);
				if (result == null) result = caseXPacmanAbstractProperty(pacmanKillProperty);
				if (result == null) result = caseAbstractProperty(pacmanKillProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.BOARD_UPDATE_PROPERTY: {
				BoardUpdateProperty boardUpdateProperty = (BoardUpdateProperty)theEObject;
				T1 result = caseBoardUpdateProperty(boardUpdateProperty);
				if (result == null) result = caseXPacmanStepProperty(boardUpdateProperty);
				if (result == null) result = caseStepProperty(boardUpdateProperty);
				if (result == null) result = caseXPacmanProperty(boardUpdateProperty);
				if (result == null) result = caseProperty(boardUpdateProperty);
				if (result == null) result = caseXPacmanAbstractProperty(boardUpdateProperty);
				if (result == null) result = caseAbstractProperty(boardUpdateProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.GHOST_CHANGE_TARGET_TILE_PROPERTY: {
				GhostChangeTargetTileProperty ghostChangeTargetTileProperty = (GhostChangeTargetTileProperty)theEObject;
				T1 result = caseGhostChangeTargetTileProperty(ghostChangeTargetTileProperty);
				if (result == null) result = caseXPacmanStepProperty(ghostChangeTargetTileProperty);
				if (result == null) result = caseStepProperty(ghostChangeTargetTileProperty);
				if (result == null) result = caseXPacmanProperty(ghostChangeTargetTileProperty);
				if (result == null) result = caseProperty(ghostChangeTargetTileProperty);
				if (result == null) result = caseXPacmanAbstractProperty(ghostChangeTargetTileProperty);
				if (result == null) result = caseAbstractProperty(ghostChangeTargetTileProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.XPACMAN_ABSTRACT_PROPERTY: {
				XPacmanAbstractProperty xPacmanAbstractProperty = (XPacmanAbstractProperty)theEObject;
				T1 result = caseXPacmanAbstractProperty(xPacmanAbstractProperty);
				if (result == null) result = caseAbstractProperty(xPacmanAbstractProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.XPACMAN_TEMPORAL_PROPERTY: {
				XPacmanTemporalProperty xPacmanTemporalProperty = (XPacmanTemporalProperty)theEObject;
				T1 result = caseXPacmanTemporalProperty(xPacmanTemporalProperty);
				if (result == null) result = caseTemporalProperty(xPacmanTemporalProperty);
				if (result == null) result = caseXPacmanAbstractProperty(xPacmanTemporalProperty);
				if (result == null) result = caseAbstractProperty(xPacmanTemporalProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.XPACMAN_PROPERTY: {
				XPacmanProperty xPacmanProperty = (XPacmanProperty)theEObject;
				T1 result = caseXPacmanProperty(xPacmanProperty);
				if (result == null) result = caseProperty(xPacmanProperty);
				if (result == null) result = caseXPacmanAbstractProperty(xPacmanProperty);
				if (result == null) result = caseAbstractProperty(xPacmanProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.XPACMAN_STATE_PROPERTY: {
				XPacmanStateProperty<?> xPacmanStateProperty = (XPacmanStateProperty<?>)theEObject;
				T1 result = caseXPacmanStateProperty(xPacmanStateProperty);
				if (result == null) result = caseStateProperty(xPacmanStateProperty);
				if (result == null) result = caseXPacmanProperty(xPacmanStateProperty);
				if (result == null) result = caseProperty(xPacmanStateProperty);
				if (result == null) result = caseXPacmanAbstractProperty(xPacmanStateProperty);
				if (result == null) result = caseAbstractProperty(xPacmanStateProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.XPACMAN_STEP_PROPERTY: {
				XPacmanStepProperty<?> xPacmanStepProperty = (XPacmanStepProperty<?>)theEObject;
				T1 result = caseXPacmanStepProperty(xPacmanStepProperty);
				if (result == null) result = caseStepProperty(xPacmanStepProperty);
				if (result == null) result = caseXPacmanProperty(xPacmanStepProperty);
				if (result == null) result = caseProperty(xPacmanStepProperty);
				if (result == null) result = caseXPacmanAbstractProperty(xPacmanStepProperty);
				if (result == null) result = caseAbstractProperty(xPacmanStepProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.TILE_PROPERTY: {
				TileProperty<?> tileProperty = (TileProperty<?>)theEObject;
				T1 result = caseTileProperty(tileProperty);
				if (result == null) result = caseXPacmanStateProperty(tileProperty);
				if (result == null) result = caseStateProperty(tileProperty);
				if (result == null) result = caseXPacmanProperty(tileProperty);
				if (result == null) result = caseProperty(tileProperty);
				if (result == null) result = caseXPacmanAbstractProperty(tileProperty);
				if (result == null) result = caseAbstractProperty(tileProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.UNARY_TILE_PROPERTY: {
				UnaryTileProperty unaryTileProperty = (UnaryTileProperty)theEObject;
				T1 result = caseUnaryTileProperty(unaryTileProperty);
				if (result == null) result = caseTileProperty(unaryTileProperty);
				if (result == null) result = caseUnaryProperty(unaryTileProperty);
				if (result == null) result = caseXPacmanStateProperty(unaryTileProperty);
				if (result == null) result = caseStateProperty(unaryTileProperty);
				if (result == null) result = caseXPacmanProperty(unaryTileProperty);
				if (result == null) result = caseProperty(unaryTileProperty);
				if (result == null) result = caseXPacmanAbstractProperty(unaryTileProperty);
				if (result == null) result = caseAbstractProperty(unaryTileProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.BINARY_TILE_PROPERTY: {
				BinaryTileProperty binaryTileProperty = (BinaryTileProperty)theEObject;
				T1 result = caseBinaryTileProperty(binaryTileProperty);
				if (result == null) result = caseTileProperty(binaryTileProperty);
				if (result == null) result = caseBinaryProperty(binaryTileProperty);
				if (result == null) result = caseXPacmanStateProperty(binaryTileProperty);
				if (result == null) result = caseStateProperty(binaryTileProperty);
				if (result == null) result = caseXPacmanProperty(binaryTileProperty);
				if (result == null) result = caseProperty(binaryTileProperty);
				if (result == null) result = caseXPacmanAbstractProperty(binaryTileProperty);
				if (result == null) result = caseAbstractProperty(binaryTileProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.TILE_TOP_PROPERTY: {
				TileTopProperty tileTopProperty = (TileTopProperty)theEObject;
				T1 result = caseTileTopProperty(tileTopProperty);
				if (result == null) result = caseTileProperty(tileTopProperty);
				if (result == null) result = caseSingleReferenceProperty(tileTopProperty);
				if (result == null) result = caseXPacmanStateProperty(tileTopProperty);
				if (result == null) result = caseStateProperty(tileTopProperty);
				if (result == null) result = caseXPacmanProperty(tileTopProperty);
				if (result == null) result = caseProperty(tileTopProperty);
				if (result == null) result = caseXPacmanAbstractProperty(tileTopProperty);
				if (result == null) result = caseAbstractProperty(tileTopProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.TILE_RIGHT_PROPERTY: {
				TileRightProperty tileRightProperty = (TileRightProperty)theEObject;
				T1 result = caseTileRightProperty(tileRightProperty);
				if (result == null) result = caseTileProperty(tileRightProperty);
				if (result == null) result = caseSingleReferenceProperty(tileRightProperty);
				if (result == null) result = caseXPacmanStateProperty(tileRightProperty);
				if (result == null) result = caseStateProperty(tileRightProperty);
				if (result == null) result = caseXPacmanProperty(tileRightProperty);
				if (result == null) result = caseProperty(tileRightProperty);
				if (result == null) result = caseXPacmanAbstractProperty(tileRightProperty);
				if (result == null) result = caseAbstractProperty(tileRightProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.TILE_BOTTOM_PROPERTY: {
				TileBottomProperty tileBottomProperty = (TileBottomProperty)theEObject;
				T1 result = caseTileBottomProperty(tileBottomProperty);
				if (result == null) result = caseTileProperty(tileBottomProperty);
				if (result == null) result = caseSingleReferenceProperty(tileBottomProperty);
				if (result == null) result = caseXPacmanStateProperty(tileBottomProperty);
				if (result == null) result = caseStateProperty(tileBottomProperty);
				if (result == null) result = caseXPacmanProperty(tileBottomProperty);
				if (result == null) result = caseProperty(tileBottomProperty);
				if (result == null) result = caseXPacmanAbstractProperty(tileBottomProperty);
				if (result == null) result = caseAbstractProperty(tileBottomProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.TILE_LEFT_PROPERTY: {
				TileLeftProperty tileLeftProperty = (TileLeftProperty)theEObject;
				T1 result = caseTileLeftProperty(tileLeftProperty);
				if (result == null) result = caseTileProperty(tileLeftProperty);
				if (result == null) result = caseSingleReferenceProperty(tileLeftProperty);
				if (result == null) result = caseXPacmanStateProperty(tileLeftProperty);
				if (result == null) result = caseStateProperty(tileLeftProperty);
				if (result == null) result = caseXPacmanProperty(tileLeftProperty);
				if (result == null) result = caseProperty(tileLeftProperty);
				if (result == null) result = caseXPacmanAbstractProperty(tileLeftProperty);
				if (result == null) result = caseAbstractProperty(tileLeftProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.TILE_XPROPERTY: {
				TileXProperty tileXProperty = (TileXProperty)theEObject;
				T1 result = caseTileXProperty(tileXProperty);
				if (result == null) result = caseTileProperty(tileXProperty);
				if (result == null) result = caseIntegerAttributeProperty(tileXProperty);
				if (result == null) result = caseXPacmanStateProperty(tileXProperty);
				if (result == null) result = caseStateProperty(tileXProperty);
				if (result == null) result = caseXPacmanProperty(tileXProperty);
				if (result == null) result = caseProperty(tileXProperty);
				if (result == null) result = caseXPacmanAbstractProperty(tileXProperty);
				if (result == null) result = caseAbstractProperty(tileXProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.TILE_YPROPERTY: {
				TileYProperty tileYProperty = (TileYProperty)theEObject;
				T1 result = caseTileYProperty(tileYProperty);
				if (result == null) result = caseTileProperty(tileYProperty);
				if (result == null) result = caseIntegerAttributeProperty(tileYProperty);
				if (result == null) result = caseXPacmanStateProperty(tileYProperty);
				if (result == null) result = caseStateProperty(tileYProperty);
				if (result == null) result = caseXPacmanProperty(tileYProperty);
				if (result == null) result = caseProperty(tileYProperty);
				if (result == null) result = caseXPacmanAbstractProperty(tileYProperty);
				if (result == null) result = caseAbstractProperty(tileYProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.TILE_PASSABLE_PROPERTY: {
				TilePassableProperty tilePassableProperty = (TilePassableProperty)theEObject;
				T1 result = caseTilePassableProperty(tilePassableProperty);
				if (result == null) result = caseTileProperty(tilePassableProperty);
				if (result == null) result = caseBooleanAttributeProperty(tilePassableProperty);
				if (result == null) result = caseXPacmanStateProperty(tilePassableProperty);
				if (result == null) result = caseStateProperty(tilePassableProperty);
				if (result == null) result = caseXPacmanProperty(tilePassableProperty);
				if (result == null) result = caseProperty(tilePassableProperty);
				if (result == null) result = caseXPacmanAbstractProperty(tilePassableProperty);
				if (result == null) result = caseAbstractProperty(tilePassableProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.TILE_INITIAL_PELLET_PROPERTY: {
				TileInitialPelletProperty tileInitialPelletProperty = (TileInitialPelletProperty)theEObject;
				T1 result = caseTileInitialPelletProperty(tileInitialPelletProperty);
				if (result == null) result = caseTileProperty(tileInitialPelletProperty);
				if (result == null) result = caseXPacmanStateProperty(tileInitialPelletProperty);
				if (result == null) result = caseStateProperty(tileInitialPelletProperty);
				if (result == null) result = caseXPacmanProperty(tileInitialPelletProperty);
				if (result == null) result = caseProperty(tileInitialPelletProperty);
				if (result == null) result = caseXPacmanAbstractProperty(tileInitialPelletProperty);
				if (result == null) result = caseAbstractProperty(tileInitialPelletProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.TILE_HAS_PELLET_PROPERTY: {
				TileHasPelletProperty tileHasPelletProperty = (TileHasPelletProperty)theEObject;
				T1 result = caseTileHasPelletProperty(tileHasPelletProperty);
				if (result == null) result = caseTileProperty(tileHasPelletProperty);
				if (result == null) result = caseBooleanAttributeProperty(tileHasPelletProperty);
				if (result == null) result = caseXPacmanStateProperty(tileHasPelletProperty);
				if (result == null) result = caseStateProperty(tileHasPelletProperty);
				if (result == null) result = caseXPacmanProperty(tileHasPelletProperty);
				if (result == null) result = caseProperty(tileHasPelletProperty);
				if (result == null) result = caseXPacmanAbstractProperty(tileHasPelletProperty);
				if (result == null) result = caseAbstractProperty(tileHasPelletProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.BOARD_PROPERTY: {
				BoardProperty<?> boardProperty = (BoardProperty<?>)theEObject;
				T1 result = caseBoardProperty(boardProperty);
				if (result == null) result = caseXPacmanStateProperty(boardProperty);
				if (result == null) result = caseStateProperty(boardProperty);
				if (result == null) result = caseXPacmanProperty(boardProperty);
				if (result == null) result = caseProperty(boardProperty);
				if (result == null) result = caseXPacmanAbstractProperty(boardProperty);
				if (result == null) result = caseAbstractProperty(boardProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.UNARY_BOARD_PROPERTY: {
				UnaryBoardProperty unaryBoardProperty = (UnaryBoardProperty)theEObject;
				T1 result = caseUnaryBoardProperty(unaryBoardProperty);
				if (result == null) result = caseBoardProperty(unaryBoardProperty);
				if (result == null) result = caseUnaryProperty(unaryBoardProperty);
				if (result == null) result = caseXPacmanStateProperty(unaryBoardProperty);
				if (result == null) result = caseStateProperty(unaryBoardProperty);
				if (result == null) result = caseXPacmanProperty(unaryBoardProperty);
				if (result == null) result = caseProperty(unaryBoardProperty);
				if (result == null) result = caseXPacmanAbstractProperty(unaryBoardProperty);
				if (result == null) result = caseAbstractProperty(unaryBoardProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.BINARY_BOARD_PROPERTY: {
				BinaryBoardProperty binaryBoardProperty = (BinaryBoardProperty)theEObject;
				T1 result = caseBinaryBoardProperty(binaryBoardProperty);
				if (result == null) result = caseBoardProperty(binaryBoardProperty);
				if (result == null) result = caseBinaryProperty(binaryBoardProperty);
				if (result == null) result = caseXPacmanStateProperty(binaryBoardProperty);
				if (result == null) result = caseStateProperty(binaryBoardProperty);
				if (result == null) result = caseXPacmanProperty(binaryBoardProperty);
				if (result == null) result = caseProperty(binaryBoardProperty);
				if (result == null) result = caseXPacmanAbstractProperty(binaryBoardProperty);
				if (result == null) result = caseAbstractProperty(binaryBoardProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.TILE_BOARD_CONTAINER_PROPERTY: {
				TileBoardContainerProperty tileBoardContainerProperty = (TileBoardContainerProperty)theEObject;
				T1 result = caseTileBoardContainerProperty(tileBoardContainerProperty);
				if (result == null) result = caseTileProperty(tileBoardContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(tileBoardContainerProperty);
				if (result == null) result = caseXPacmanStateProperty(tileBoardContainerProperty);
				if (result == null) result = caseStateProperty(tileBoardContainerProperty);
				if (result == null) result = caseXPacmanProperty(tileBoardContainerProperty);
				if (result == null) result = caseProperty(tileBoardContainerProperty);
				if (result == null) result = caseXPacmanAbstractProperty(tileBoardContainerProperty);
				if (result == null) result = caseAbstractProperty(tileBoardContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.BOARD_TILES_PROPERTY: {
				BoardTilesProperty boardTilesProperty = (BoardTilesProperty)theEObject;
				T1 result = caseBoardTilesProperty(boardTilesProperty);
				if (result == null) result = caseBoardProperty(boardTilesProperty);
				if (result == null) result = caseManyReferenceProperty(boardTilesProperty);
				if (result == null) result = caseXPacmanStateProperty(boardTilesProperty);
				if (result == null) result = caseStateProperty(boardTilesProperty);
				if (result == null) result = caseXPacmanProperty(boardTilesProperty);
				if (result == null) result = caseProperty(boardTilesProperty);
				if (result == null) result = caseXPacmanAbstractProperty(boardTilesProperty);
				if (result == null) result = caseAbstractProperty(boardTilesProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.ENTITY_BOARD_CONTAINER_PROPERTY: {
				EntityBoardContainerProperty entityBoardContainerProperty = (EntityBoardContainerProperty)theEObject;
				T1 result = caseEntityBoardContainerProperty(entityBoardContainerProperty);
				if (result == null) result = caseEntityProperty(entityBoardContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(entityBoardContainerProperty);
				if (result == null) result = caseXPacmanStateProperty(entityBoardContainerProperty);
				if (result == null) result = caseStateProperty(entityBoardContainerProperty);
				if (result == null) result = caseXPacmanProperty(entityBoardContainerProperty);
				if (result == null) result = caseProperty(entityBoardContainerProperty);
				if (result == null) result = caseXPacmanAbstractProperty(entityBoardContainerProperty);
				if (result == null) result = caseAbstractProperty(entityBoardContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.ENTITY_PROPERTY: {
				EntityProperty<?> entityProperty = (EntityProperty<?>)theEObject;
				T1 result = caseEntityProperty(entityProperty);
				if (result == null) result = caseXPacmanStateProperty(entityProperty);
				if (result == null) result = caseStateProperty(entityProperty);
				if (result == null) result = caseXPacmanProperty(entityProperty);
				if (result == null) result = caseProperty(entityProperty);
				if (result == null) result = caseXPacmanAbstractProperty(entityProperty);
				if (result == null) result = caseAbstractProperty(entityProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.UNARY_ENTITY_PROPERTY: {
				UnaryEntityProperty unaryEntityProperty = (UnaryEntityProperty)theEObject;
				T1 result = caseUnaryEntityProperty(unaryEntityProperty);
				if (result == null) result = caseEntityProperty(unaryEntityProperty);
				if (result == null) result = caseUnaryProperty(unaryEntityProperty);
				if (result == null) result = caseXPacmanStateProperty(unaryEntityProperty);
				if (result == null) result = caseStateProperty(unaryEntityProperty);
				if (result == null) result = caseXPacmanProperty(unaryEntityProperty);
				if (result == null) result = caseProperty(unaryEntityProperty);
				if (result == null) result = caseXPacmanAbstractProperty(unaryEntityProperty);
				if (result == null) result = caseAbstractProperty(unaryEntityProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.BINARY_ENTITY_PROPERTY: {
				BinaryEntityProperty binaryEntityProperty = (BinaryEntityProperty)theEObject;
				T1 result = caseBinaryEntityProperty(binaryEntityProperty);
				if (result == null) result = caseEntityProperty(binaryEntityProperty);
				if (result == null) result = caseBinaryProperty(binaryEntityProperty);
				if (result == null) result = caseXPacmanStateProperty(binaryEntityProperty);
				if (result == null) result = caseStateProperty(binaryEntityProperty);
				if (result == null) result = caseXPacmanProperty(binaryEntityProperty);
				if (result == null) result = caseProperty(binaryEntityProperty);
				if (result == null) result = caseXPacmanAbstractProperty(binaryEntityProperty);
				if (result == null) result = caseAbstractProperty(binaryEntityProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.ENTITY_INITIAL_TILE_PROPERTY: {
				EntityInitialTileProperty entityInitialTileProperty = (EntityInitialTileProperty)theEObject;
				T1 result = caseEntityInitialTileProperty(entityInitialTileProperty);
				if (result == null) result = caseEntityProperty(entityInitialTileProperty);
				if (result == null) result = caseSingleReferenceProperty(entityInitialTileProperty);
				if (result == null) result = caseXPacmanStateProperty(entityInitialTileProperty);
				if (result == null) result = caseStateProperty(entityInitialTileProperty);
				if (result == null) result = caseXPacmanProperty(entityInitialTileProperty);
				if (result == null) result = caseProperty(entityInitialTileProperty);
				if (result == null) result = caseXPacmanAbstractProperty(entityInitialTileProperty);
				if (result == null) result = caseAbstractProperty(entityInitialTileProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.ENTITY_SPEED_PROPERTY: {
				EntitySpeedProperty entitySpeedProperty = (EntitySpeedProperty)theEObject;
				T1 result = caseEntitySpeedProperty(entitySpeedProperty);
				if (result == null) result = caseEntityProperty(entitySpeedProperty);
				if (result == null) result = caseIntegerAttributeProperty(entitySpeedProperty);
				if (result == null) result = caseXPacmanStateProperty(entitySpeedProperty);
				if (result == null) result = caseStateProperty(entitySpeedProperty);
				if (result == null) result = caseXPacmanProperty(entitySpeedProperty);
				if (result == null) result = caseProperty(entitySpeedProperty);
				if (result == null) result = caseXPacmanAbstractProperty(entitySpeedProperty);
				if (result == null) result = caseAbstractProperty(entitySpeedProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.ENTITY_DIRECTION_PROPERTY: {
				EntityDirectionProperty entityDirectionProperty = (EntityDirectionProperty)theEObject;
				T1 result = caseEntityDirectionProperty(entityDirectionProperty);
				if (result == null) result = caseEntityProperty(entityDirectionProperty);
				if (result == null) result = caseIntegerAttributeProperty(entityDirectionProperty);
				if (result == null) result = caseXPacmanStateProperty(entityDirectionProperty);
				if (result == null) result = caseStateProperty(entityDirectionProperty);
				if (result == null) result = caseXPacmanProperty(entityDirectionProperty);
				if (result == null) result = caseProperty(entityDirectionProperty);
				if (result == null) result = caseXPacmanAbstractProperty(entityDirectionProperty);
				if (result == null) result = caseAbstractProperty(entityDirectionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.ENTITY_CURRENT_TILE_PROPERTY: {
				EntityCurrentTileProperty entityCurrentTileProperty = (EntityCurrentTileProperty)theEObject;
				T1 result = caseEntityCurrentTileProperty(entityCurrentTileProperty);
				if (result == null) result = caseEntityProperty(entityCurrentTileProperty);
				if (result == null) result = caseSingleReferenceProperty(entityCurrentTileProperty);
				if (result == null) result = caseXPacmanStateProperty(entityCurrentTileProperty);
				if (result == null) result = caseStateProperty(entityCurrentTileProperty);
				if (result == null) result = caseXPacmanProperty(entityCurrentTileProperty);
				if (result == null) result = caseProperty(entityCurrentTileProperty);
				if (result == null) result = caseXPacmanAbstractProperty(entityCurrentTileProperty);
				if (result == null) result = caseAbstractProperty(entityCurrentTileProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.ENTITY_NEXT_TILE_PROPERTY: {
				EntityNextTileProperty entityNextTileProperty = (EntityNextTileProperty)theEObject;
				T1 result = caseEntityNextTileProperty(entityNextTileProperty);
				if (result == null) result = caseEntityProperty(entityNextTileProperty);
				if (result == null) result = caseSingleReferenceProperty(entityNextTileProperty);
				if (result == null) result = caseXPacmanStateProperty(entityNextTileProperty);
				if (result == null) result = caseStateProperty(entityNextTileProperty);
				if (result == null) result = caseXPacmanProperty(entityNextTileProperty);
				if (result == null) result = caseProperty(entityNextTileProperty);
				if (result == null) result = caseXPacmanAbstractProperty(entityNextTileProperty);
				if (result == null) result = caseAbstractProperty(entityNextTileProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.BOARD_ENTITIES_PROPERTY: {
				BoardEntitiesProperty boardEntitiesProperty = (BoardEntitiesProperty)theEObject;
				T1 result = caseBoardEntitiesProperty(boardEntitiesProperty);
				if (result == null) result = caseBoardProperty(boardEntitiesProperty);
				if (result == null) result = caseManyReferenceProperty(boardEntitiesProperty);
				if (result == null) result = caseXPacmanStateProperty(boardEntitiesProperty);
				if (result == null) result = caseStateProperty(boardEntitiesProperty);
				if (result == null) result = caseXPacmanProperty(boardEntitiesProperty);
				if (result == null) result = caseProperty(boardEntitiesProperty);
				if (result == null) result = caseXPacmanAbstractProperty(boardEntitiesProperty);
				if (result == null) result = caseAbstractProperty(boardEntitiesProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.PACMAN_PROPERTY: {
				PacmanProperty<?> pacmanProperty = (PacmanProperty<?>)theEObject;
				T1 result = casePacmanProperty(pacmanProperty);
				if (result == null) result = caseEntityProperty(pacmanProperty);
				if (result == null) result = caseXPacmanStateProperty(pacmanProperty);
				if (result == null) result = caseStateProperty(pacmanProperty);
				if (result == null) result = caseXPacmanProperty(pacmanProperty);
				if (result == null) result = caseProperty(pacmanProperty);
				if (result == null) result = caseXPacmanAbstractProperty(pacmanProperty);
				if (result == null) result = caseAbstractProperty(pacmanProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.UNARY_PACMAN_PROPERTY: {
				UnaryPacmanProperty unaryPacmanProperty = (UnaryPacmanProperty)theEObject;
				T1 result = caseUnaryPacmanProperty(unaryPacmanProperty);
				if (result == null) result = casePacmanProperty(unaryPacmanProperty);
				if (result == null) result = caseUnaryProperty(unaryPacmanProperty);
				if (result == null) result = caseEntityProperty(unaryPacmanProperty);
				if (result == null) result = caseXPacmanStateProperty(unaryPacmanProperty);
				if (result == null) result = caseStateProperty(unaryPacmanProperty);
				if (result == null) result = caseXPacmanProperty(unaryPacmanProperty);
				if (result == null) result = caseProperty(unaryPacmanProperty);
				if (result == null) result = caseXPacmanAbstractProperty(unaryPacmanProperty);
				if (result == null) result = caseAbstractProperty(unaryPacmanProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.BINARY_PACMAN_PROPERTY: {
				BinaryPacmanProperty binaryPacmanProperty = (BinaryPacmanProperty)theEObject;
				T1 result = caseBinaryPacmanProperty(binaryPacmanProperty);
				if (result == null) result = casePacmanProperty(binaryPacmanProperty);
				if (result == null) result = caseBinaryProperty(binaryPacmanProperty);
				if (result == null) result = caseEntityProperty(binaryPacmanProperty);
				if (result == null) result = caseXPacmanStateProperty(binaryPacmanProperty);
				if (result == null) result = caseStateProperty(binaryPacmanProperty);
				if (result == null) result = caseXPacmanProperty(binaryPacmanProperty);
				if (result == null) result = caseProperty(binaryPacmanProperty);
				if (result == null) result = caseXPacmanAbstractProperty(binaryPacmanProperty);
				if (result == null) result = caseAbstractProperty(binaryPacmanProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.PACMAN_INITIAL_TILE_PROPERTY: {
				PacmanInitialTileProperty pacmanInitialTileProperty = (PacmanInitialTileProperty)theEObject;
				T1 result = casePacmanInitialTileProperty(pacmanInitialTileProperty);
				if (result == null) result = casePacmanProperty(pacmanInitialTileProperty);
				if (result == null) result = caseSingleReferenceProperty(pacmanInitialTileProperty);
				if (result == null) result = caseEntityProperty(pacmanInitialTileProperty);
				if (result == null) result = caseXPacmanStateProperty(pacmanInitialTileProperty);
				if (result == null) result = caseStateProperty(pacmanInitialTileProperty);
				if (result == null) result = caseXPacmanProperty(pacmanInitialTileProperty);
				if (result == null) result = caseProperty(pacmanInitialTileProperty);
				if (result == null) result = caseXPacmanAbstractProperty(pacmanInitialTileProperty);
				if (result == null) result = caseAbstractProperty(pacmanInitialTileProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.PACMAN_SPEED_PROPERTY: {
				PacmanSpeedProperty pacmanSpeedProperty = (PacmanSpeedProperty)theEObject;
				T1 result = casePacmanSpeedProperty(pacmanSpeedProperty);
				if (result == null) result = casePacmanProperty(pacmanSpeedProperty);
				if (result == null) result = caseIntegerAttributeProperty(pacmanSpeedProperty);
				if (result == null) result = caseEntityProperty(pacmanSpeedProperty);
				if (result == null) result = caseXPacmanStateProperty(pacmanSpeedProperty);
				if (result == null) result = caseStateProperty(pacmanSpeedProperty);
				if (result == null) result = caseXPacmanProperty(pacmanSpeedProperty);
				if (result == null) result = caseProperty(pacmanSpeedProperty);
				if (result == null) result = caseXPacmanAbstractProperty(pacmanSpeedProperty);
				if (result == null) result = caseAbstractProperty(pacmanSpeedProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.PACMAN_DIRECTION_PROPERTY: {
				PacmanDirectionProperty pacmanDirectionProperty = (PacmanDirectionProperty)theEObject;
				T1 result = casePacmanDirectionProperty(pacmanDirectionProperty);
				if (result == null) result = casePacmanProperty(pacmanDirectionProperty);
				if (result == null) result = caseIntegerAttributeProperty(pacmanDirectionProperty);
				if (result == null) result = caseEntityProperty(pacmanDirectionProperty);
				if (result == null) result = caseXPacmanStateProperty(pacmanDirectionProperty);
				if (result == null) result = caseStateProperty(pacmanDirectionProperty);
				if (result == null) result = caseXPacmanProperty(pacmanDirectionProperty);
				if (result == null) result = caseProperty(pacmanDirectionProperty);
				if (result == null) result = caseXPacmanAbstractProperty(pacmanDirectionProperty);
				if (result == null) result = caseAbstractProperty(pacmanDirectionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.PACMAN_CURRENT_TILE_PROPERTY: {
				PacmanCurrentTileProperty pacmanCurrentTileProperty = (PacmanCurrentTileProperty)theEObject;
				T1 result = casePacmanCurrentTileProperty(pacmanCurrentTileProperty);
				if (result == null) result = casePacmanProperty(pacmanCurrentTileProperty);
				if (result == null) result = caseSingleReferenceProperty(pacmanCurrentTileProperty);
				if (result == null) result = caseEntityProperty(pacmanCurrentTileProperty);
				if (result == null) result = caseXPacmanStateProperty(pacmanCurrentTileProperty);
				if (result == null) result = caseStateProperty(pacmanCurrentTileProperty);
				if (result == null) result = caseXPacmanProperty(pacmanCurrentTileProperty);
				if (result == null) result = caseProperty(pacmanCurrentTileProperty);
				if (result == null) result = caseXPacmanAbstractProperty(pacmanCurrentTileProperty);
				if (result == null) result = caseAbstractProperty(pacmanCurrentTileProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.PACMAN_NEXT_TILE_PROPERTY: {
				PacmanNextTileProperty pacmanNextTileProperty = (PacmanNextTileProperty)theEObject;
				T1 result = casePacmanNextTileProperty(pacmanNextTileProperty);
				if (result == null) result = casePacmanProperty(pacmanNextTileProperty);
				if (result == null) result = caseSingleReferenceProperty(pacmanNextTileProperty);
				if (result == null) result = caseEntityProperty(pacmanNextTileProperty);
				if (result == null) result = caseXPacmanStateProperty(pacmanNextTileProperty);
				if (result == null) result = caseStateProperty(pacmanNextTileProperty);
				if (result == null) result = caseXPacmanProperty(pacmanNextTileProperty);
				if (result == null) result = caseProperty(pacmanNextTileProperty);
				if (result == null) result = caseXPacmanAbstractProperty(pacmanNextTileProperty);
				if (result == null) result = caseAbstractProperty(pacmanNextTileProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.PACMAN_INITIAL_LIVES_PROPERTY: {
				PacmanInitialLivesProperty pacmanInitialLivesProperty = (PacmanInitialLivesProperty)theEObject;
				T1 result = casePacmanInitialLivesProperty(pacmanInitialLivesProperty);
				if (result == null) result = casePacmanProperty(pacmanInitialLivesProperty);
				if (result == null) result = caseIntegerAttributeProperty(pacmanInitialLivesProperty);
				if (result == null) result = caseEntityProperty(pacmanInitialLivesProperty);
				if (result == null) result = caseXPacmanStateProperty(pacmanInitialLivesProperty);
				if (result == null) result = caseStateProperty(pacmanInitialLivesProperty);
				if (result == null) result = caseXPacmanProperty(pacmanInitialLivesProperty);
				if (result == null) result = caseProperty(pacmanInitialLivesProperty);
				if (result == null) result = caseXPacmanAbstractProperty(pacmanInitialLivesProperty);
				if (result == null) result = caseAbstractProperty(pacmanInitialLivesProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.PACMAN_PELLETS_EATEN_PROPERTY: {
				PacmanPelletsEatenProperty pacmanPelletsEatenProperty = (PacmanPelletsEatenProperty)theEObject;
				T1 result = casePacmanPelletsEatenProperty(pacmanPelletsEatenProperty);
				if (result == null) result = casePacmanProperty(pacmanPelletsEatenProperty);
				if (result == null) result = caseIntegerAttributeProperty(pacmanPelletsEatenProperty);
				if (result == null) result = caseEntityProperty(pacmanPelletsEatenProperty);
				if (result == null) result = caseXPacmanStateProperty(pacmanPelletsEatenProperty);
				if (result == null) result = caseStateProperty(pacmanPelletsEatenProperty);
				if (result == null) result = caseXPacmanProperty(pacmanPelletsEatenProperty);
				if (result == null) result = caseProperty(pacmanPelletsEatenProperty);
				if (result == null) result = caseXPacmanAbstractProperty(pacmanPelletsEatenProperty);
				if (result == null) result = caseAbstractProperty(pacmanPelletsEatenProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.PACMAN_LIVES_PROPERTY: {
				PacmanLivesProperty pacmanLivesProperty = (PacmanLivesProperty)theEObject;
				T1 result = casePacmanLivesProperty(pacmanLivesProperty);
				if (result == null) result = casePacmanProperty(pacmanLivesProperty);
				if (result == null) result = caseIntegerAttributeProperty(pacmanLivesProperty);
				if (result == null) result = caseEntityProperty(pacmanLivesProperty);
				if (result == null) result = caseXPacmanStateProperty(pacmanLivesProperty);
				if (result == null) result = caseStateProperty(pacmanLivesProperty);
				if (result == null) result = caseXPacmanProperty(pacmanLivesProperty);
				if (result == null) result = caseProperty(pacmanLivesProperty);
				if (result == null) result = caseXPacmanAbstractProperty(pacmanLivesProperty);
				if (result == null) result = caseAbstractProperty(pacmanLivesProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.GHOST_PROPERTY: {
				GhostProperty<?> ghostProperty = (GhostProperty<?>)theEObject;
				T1 result = caseGhostProperty(ghostProperty);
				if (result == null) result = caseEntityProperty(ghostProperty);
				if (result == null) result = caseXPacmanStateProperty(ghostProperty);
				if (result == null) result = caseStateProperty(ghostProperty);
				if (result == null) result = caseXPacmanProperty(ghostProperty);
				if (result == null) result = caseProperty(ghostProperty);
				if (result == null) result = caseXPacmanAbstractProperty(ghostProperty);
				if (result == null) result = caseAbstractProperty(ghostProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.UNARY_GHOST_PROPERTY: {
				UnaryGhostProperty unaryGhostProperty = (UnaryGhostProperty)theEObject;
				T1 result = caseUnaryGhostProperty(unaryGhostProperty);
				if (result == null) result = caseGhostProperty(unaryGhostProperty);
				if (result == null) result = caseUnaryProperty(unaryGhostProperty);
				if (result == null) result = caseEntityProperty(unaryGhostProperty);
				if (result == null) result = caseXPacmanStateProperty(unaryGhostProperty);
				if (result == null) result = caseStateProperty(unaryGhostProperty);
				if (result == null) result = caseXPacmanProperty(unaryGhostProperty);
				if (result == null) result = caseProperty(unaryGhostProperty);
				if (result == null) result = caseXPacmanAbstractProperty(unaryGhostProperty);
				if (result == null) result = caseAbstractProperty(unaryGhostProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.BINARY_GHOST_PROPERTY: {
				BinaryGhostProperty binaryGhostProperty = (BinaryGhostProperty)theEObject;
				T1 result = caseBinaryGhostProperty(binaryGhostProperty);
				if (result == null) result = caseGhostProperty(binaryGhostProperty);
				if (result == null) result = caseBinaryProperty(binaryGhostProperty);
				if (result == null) result = caseEntityProperty(binaryGhostProperty);
				if (result == null) result = caseXPacmanStateProperty(binaryGhostProperty);
				if (result == null) result = caseStateProperty(binaryGhostProperty);
				if (result == null) result = caseXPacmanProperty(binaryGhostProperty);
				if (result == null) result = caseProperty(binaryGhostProperty);
				if (result == null) result = caseXPacmanAbstractProperty(binaryGhostProperty);
				if (result == null) result = caseAbstractProperty(binaryGhostProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.GHOST_INITIAL_TILE_PROPERTY: {
				GhostInitialTileProperty ghostInitialTileProperty = (GhostInitialTileProperty)theEObject;
				T1 result = caseGhostInitialTileProperty(ghostInitialTileProperty);
				if (result == null) result = caseGhostProperty(ghostInitialTileProperty);
				if (result == null) result = caseSingleReferenceProperty(ghostInitialTileProperty);
				if (result == null) result = caseEntityProperty(ghostInitialTileProperty);
				if (result == null) result = caseXPacmanStateProperty(ghostInitialTileProperty);
				if (result == null) result = caseStateProperty(ghostInitialTileProperty);
				if (result == null) result = caseXPacmanProperty(ghostInitialTileProperty);
				if (result == null) result = caseProperty(ghostInitialTileProperty);
				if (result == null) result = caseXPacmanAbstractProperty(ghostInitialTileProperty);
				if (result == null) result = caseAbstractProperty(ghostInitialTileProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.GHOST_SPEED_PROPERTY: {
				GhostSpeedProperty ghostSpeedProperty = (GhostSpeedProperty)theEObject;
				T1 result = caseGhostSpeedProperty(ghostSpeedProperty);
				if (result == null) result = caseGhostProperty(ghostSpeedProperty);
				if (result == null) result = caseIntegerAttributeProperty(ghostSpeedProperty);
				if (result == null) result = caseEntityProperty(ghostSpeedProperty);
				if (result == null) result = caseXPacmanStateProperty(ghostSpeedProperty);
				if (result == null) result = caseStateProperty(ghostSpeedProperty);
				if (result == null) result = caseXPacmanProperty(ghostSpeedProperty);
				if (result == null) result = caseProperty(ghostSpeedProperty);
				if (result == null) result = caseXPacmanAbstractProperty(ghostSpeedProperty);
				if (result == null) result = caseAbstractProperty(ghostSpeedProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.GHOST_DIRECTION_PROPERTY: {
				GhostDirectionProperty ghostDirectionProperty = (GhostDirectionProperty)theEObject;
				T1 result = caseGhostDirectionProperty(ghostDirectionProperty);
				if (result == null) result = caseGhostProperty(ghostDirectionProperty);
				if (result == null) result = caseIntegerAttributeProperty(ghostDirectionProperty);
				if (result == null) result = caseEntityProperty(ghostDirectionProperty);
				if (result == null) result = caseXPacmanStateProperty(ghostDirectionProperty);
				if (result == null) result = caseStateProperty(ghostDirectionProperty);
				if (result == null) result = caseXPacmanProperty(ghostDirectionProperty);
				if (result == null) result = caseProperty(ghostDirectionProperty);
				if (result == null) result = caseXPacmanAbstractProperty(ghostDirectionProperty);
				if (result == null) result = caseAbstractProperty(ghostDirectionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.GHOST_CURRENT_TILE_PROPERTY: {
				GhostCurrentTileProperty ghostCurrentTileProperty = (GhostCurrentTileProperty)theEObject;
				T1 result = caseGhostCurrentTileProperty(ghostCurrentTileProperty);
				if (result == null) result = caseGhostProperty(ghostCurrentTileProperty);
				if (result == null) result = caseSingleReferenceProperty(ghostCurrentTileProperty);
				if (result == null) result = caseEntityProperty(ghostCurrentTileProperty);
				if (result == null) result = caseXPacmanStateProperty(ghostCurrentTileProperty);
				if (result == null) result = caseStateProperty(ghostCurrentTileProperty);
				if (result == null) result = caseXPacmanProperty(ghostCurrentTileProperty);
				if (result == null) result = caseProperty(ghostCurrentTileProperty);
				if (result == null) result = caseXPacmanAbstractProperty(ghostCurrentTileProperty);
				if (result == null) result = caseAbstractProperty(ghostCurrentTileProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.GHOST_NEXT_TILE_PROPERTY: {
				GhostNextTileProperty ghostNextTileProperty = (GhostNextTileProperty)theEObject;
				T1 result = caseGhostNextTileProperty(ghostNextTileProperty);
				if (result == null) result = caseGhostProperty(ghostNextTileProperty);
				if (result == null) result = caseSingleReferenceProperty(ghostNextTileProperty);
				if (result == null) result = caseEntityProperty(ghostNextTileProperty);
				if (result == null) result = caseXPacmanStateProperty(ghostNextTileProperty);
				if (result == null) result = caseStateProperty(ghostNextTileProperty);
				if (result == null) result = caseXPacmanProperty(ghostNextTileProperty);
				if (result == null) result = caseProperty(ghostNextTileProperty);
				if (result == null) result = caseXPacmanAbstractProperty(ghostNextTileProperty);
				if (result == null) result = caseAbstractProperty(ghostNextTileProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.GHOST_NAME_PROPERTY: {
				GhostNameProperty ghostNameProperty = (GhostNameProperty)theEObject;
				T1 result = caseGhostNameProperty(ghostNameProperty);
				if (result == null) result = caseGhostProperty(ghostNameProperty);
				if (result == null) result = caseStringAttributeProperty(ghostNameProperty);
				if (result == null) result = caseEntityProperty(ghostNameProperty);
				if (result == null) result = caseXPacmanStateProperty(ghostNameProperty);
				if (result == null) result = caseStateProperty(ghostNameProperty);
				if (result == null) result = caseXPacmanProperty(ghostNameProperty);
				if (result == null) result = caseProperty(ghostNameProperty);
				if (result == null) result = caseXPacmanAbstractProperty(ghostNameProperty);
				if (result == null) result = caseAbstractProperty(ghostNameProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.GHOST_PERSONNALITY_PROPERTY: {
				GhostPersonnalityProperty ghostPersonnalityProperty = (GhostPersonnalityProperty)theEObject;
				T1 result = caseGhostPersonnalityProperty(ghostPersonnalityProperty);
				if (result == null) result = caseGhostProperty(ghostPersonnalityProperty);
				if (result == null) result = caseEntityProperty(ghostPersonnalityProperty);
				if (result == null) result = caseXPacmanStateProperty(ghostPersonnalityProperty);
				if (result == null) result = caseStateProperty(ghostPersonnalityProperty);
				if (result == null) result = caseXPacmanProperty(ghostPersonnalityProperty);
				if (result == null) result = caseProperty(ghostPersonnalityProperty);
				if (result == null) result = caseXPacmanAbstractProperty(ghostPersonnalityProperty);
				if (result == null) result = caseAbstractProperty(ghostPersonnalityProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.GHOST_TARGET_TILE_PROPERTY: {
				GhostTargetTileProperty ghostTargetTileProperty = (GhostTargetTileProperty)theEObject;
				T1 result = caseGhostTargetTileProperty(ghostTargetTileProperty);
				if (result == null) result = caseGhostProperty(ghostTargetTileProperty);
				if (result == null) result = caseSingleReferenceProperty(ghostTargetTileProperty);
				if (result == null) result = caseEntityProperty(ghostTargetTileProperty);
				if (result == null) result = caseXPacmanStateProperty(ghostTargetTileProperty);
				if (result == null) result = caseStateProperty(ghostTargetTileProperty);
				if (result == null) result = caseXPacmanProperty(ghostTargetTileProperty);
				if (result == null) result = caseProperty(ghostTargetTileProperty);
				if (result == null) result = caseXPacmanAbstractProperty(ghostTargetTileProperty);
				if (result == null) result = caseAbstractProperty(ghostTargetTileProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.XPACMAN_NEXT_PROPERTY: {
				XPacmanNextProperty xPacmanNextProperty = (XPacmanNextProperty)theEObject;
				T1 result = caseXPacmanNextProperty(xPacmanNextProperty);
				if (result == null) result = caseNextProperty(xPacmanNextProperty);
				if (result == null) result = caseXPacmanTemporalProperty(xPacmanNextProperty);
				if (result == null) result = caseTemporalProperty(xPacmanNextProperty);
				if (result == null) result = caseXPacmanAbstractProperty(xPacmanNextProperty);
				if (result == null) result = caseAbstractProperty(xPacmanNextProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.XPACMAN_UNTIL_PROPERTY: {
				XPacmanUntilProperty xPacmanUntilProperty = (XPacmanUntilProperty)theEObject;
				T1 result = caseXPacmanUntilProperty(xPacmanUntilProperty);
				if (result == null) result = caseUntilProperty(xPacmanUntilProperty);
				if (result == null) result = caseXPacmanTemporalProperty(xPacmanUntilProperty);
				if (result == null) result = caseTemporalProperty(xPacmanUntilProperty);
				if (result == null) result = caseXPacmanAbstractProperty(xPacmanUntilProperty);
				if (result == null) result = caseAbstractProperty(xPacmanUntilProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.XPACMAN_RELEASE_PROPERTY: {
				XPacmanReleaseProperty xPacmanReleaseProperty = (XPacmanReleaseProperty)theEObject;
				T1 result = caseXPacmanReleaseProperty(xPacmanReleaseProperty);
				if (result == null) result = caseReleaseProperty(xPacmanReleaseProperty);
				if (result == null) result = caseXPacmanTemporalProperty(xPacmanReleaseProperty);
				if (result == null) result = caseTemporalProperty(xPacmanReleaseProperty);
				if (result == null) result = caseXPacmanAbstractProperty(xPacmanReleaseProperty);
				if (result == null) result = caseAbstractProperty(xPacmanReleaseProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPacmanPropertyPackage.XPACMAN_NEGATION_TEMPORAL_PROPERTY: {
				XPacmanNegationTemporalProperty xPacmanNegationTemporalProperty = (XPacmanNegationTemporalProperty)theEObject;
				T1 result = caseXPacmanNegationTemporalProperty(xPacmanNegationTemporalProperty);
				if (result == null) result = caseNegationTemporalProperty(xPacmanNegationTemporalProperty);
				if (result == null) result = caseXPacmanTemporalProperty(xPacmanNegationTemporalProperty);
				if (result == null) result = caseTemporalProperty(xPacmanNegationTemporalProperty);
				if (result == null) result = caseXPacmanAbstractProperty(xPacmanNegationTemporalProperty);
				if (result == null) result = caseAbstractProperty(xPacmanNegationTemporalProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman Enter Next Tile Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman Enter Next Tile Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePacmanEnterNextTileProperty(PacmanEnterNextTileProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ghost Enter Next Tile Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ghost Enter Next Tile Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGhostEnterNextTileProperty(GhostEnterNextTileProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Change Direction Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Change Direction Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEntityChangeDirectionProperty(EntityChangeDirectionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman Left Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman Left Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePacmanLeftProperty(PacmanLeftProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman Right Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman Right Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePacmanRightProperty(PacmanRightProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman Eat Pellet Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman Eat Pellet Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePacmanEatPelletProperty(PacmanEatPelletProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman Up Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman Up Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePacmanUpProperty(PacmanUpProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman Initialize Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman Initialize Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePacmanInitializeProperty(PacmanInitializeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Modify Speed Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Modify Speed Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEntityModifySpeedProperty(EntityModifySpeedProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Board Initialize Model Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Board Initialize Model Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBoardInitializeModelProperty(BoardInitializeModelProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Initialize Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Initialize Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEntityInitializeProperty(EntityInitializeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman Change Direction Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman Change Direction Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePacmanChangeDirectionProperty(PacmanChangeDirectionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Update Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Update Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEntityUpdateProperty(EntityUpdateProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Board Reset Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Board Reset Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBoardResetProperty(BoardResetProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman Down Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman Down Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePacmanDownProperty(PacmanDownProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Enter Next Tile Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Enter Next Tile Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEntityEnterNextTileProperty(EntityEnterNextTileProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman Kill Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman Kill Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePacmanKillProperty(PacmanKillProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Board Update Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Board Update Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBoardUpdateProperty(BoardUpdateProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ghost Change Target Tile Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ghost Change Target Tile Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGhostChangeTargetTileProperty(GhostChangeTargetTileProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XPacman Abstract Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XPacman Abstract Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXPacmanAbstractProperty(XPacmanAbstractProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XPacman Temporal Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XPacman Temporal Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXPacmanTemporalProperty(XPacmanTemporalProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XPacman Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XPacman Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXPacmanProperty(XPacmanProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XPacman State Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XPacman State Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseXPacmanStateProperty(XPacmanStateProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XPacman Step Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XPacman Step Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseXPacmanStepProperty(XPacmanStepProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tile Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tile Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Tile> T1 caseTileProperty(TileProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Tile Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Tile Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryTileProperty(UnaryTileProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Tile Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Tile Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryTileProperty(BinaryTileProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tile Top Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tile Top Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTileTopProperty(TileTopProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tile Right Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tile Right Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTileRightProperty(TileRightProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tile Bottom Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tile Bottom Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTileBottomProperty(TileBottomProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tile Left Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tile Left Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTileLeftProperty(TileLeftProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tile XProperty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tile XProperty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTileXProperty(TileXProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tile YProperty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tile YProperty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTileYProperty(TileYProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tile Passable Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tile Passable Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTilePassableProperty(TilePassableProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tile Initial Pellet Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tile Initial Pellet Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTileInitialPelletProperty(TileInitialPelletProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tile Has Pellet Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tile Has Pellet Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTileHasPelletProperty(TileHasPelletProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Board Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Board Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Board> T1 caseBoardProperty(BoardProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Board Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Board Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryBoardProperty(UnaryBoardProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Board Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Board Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryBoardProperty(BinaryBoardProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tile Board Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tile Board Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTileBoardContainerProperty(TileBoardContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Board Tiles Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Board Tiles Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBoardTilesProperty(BoardTilesProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Board Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Board Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEntityBoardContainerProperty(EntityBoardContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Entity> T1 caseEntityProperty(EntityProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Entity Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Entity Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryEntityProperty(UnaryEntityProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Entity Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Entity Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryEntityProperty(BinaryEntityProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Initial Tile Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Initial Tile Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEntityInitialTileProperty(EntityInitialTileProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Speed Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Speed Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEntitySpeedProperty(EntitySpeedProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Direction Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Direction Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEntityDirectionProperty(EntityDirectionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Current Tile Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Current Tile Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEntityCurrentTileProperty(EntityCurrentTileProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Next Tile Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Next Tile Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEntityNextTileProperty(EntityNextTileProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Board Entities Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Board Entities Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBoardEntitiesProperty(BoardEntitiesProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Pacman> T1 casePacmanProperty(PacmanProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Pacman Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Pacman Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryPacmanProperty(UnaryPacmanProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Pacman Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Pacman Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryPacmanProperty(BinaryPacmanProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman Initial Tile Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman Initial Tile Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePacmanInitialTileProperty(PacmanInitialTileProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman Speed Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman Speed Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePacmanSpeedProperty(PacmanSpeedProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman Direction Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman Direction Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePacmanDirectionProperty(PacmanDirectionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman Current Tile Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman Current Tile Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePacmanCurrentTileProperty(PacmanCurrentTileProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman Next Tile Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman Next Tile Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePacmanNextTileProperty(PacmanNextTileProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman Initial Lives Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman Initial Lives Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePacmanInitialLivesProperty(PacmanInitialLivesProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman Pellets Eaten Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman Pellets Eaten Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePacmanPelletsEatenProperty(PacmanPelletsEatenProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman Lives Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman Lives Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePacmanLivesProperty(PacmanLivesProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ghost Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ghost Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Ghost> T1 caseGhostProperty(GhostProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Ghost Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Ghost Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryGhostProperty(UnaryGhostProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Ghost Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Ghost Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryGhostProperty(BinaryGhostProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ghost Initial Tile Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ghost Initial Tile Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGhostInitialTileProperty(GhostInitialTileProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ghost Speed Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ghost Speed Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGhostSpeedProperty(GhostSpeedProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ghost Direction Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ghost Direction Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGhostDirectionProperty(GhostDirectionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ghost Current Tile Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ghost Current Tile Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGhostCurrentTileProperty(GhostCurrentTileProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ghost Next Tile Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ghost Next Tile Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGhostNextTileProperty(GhostNextTileProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ghost Name Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ghost Name Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGhostNameProperty(GhostNameProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ghost Personnality Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ghost Personnality Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGhostPersonnalityProperty(GhostPersonnalityProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ghost Target Tile Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ghost Target Tile Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGhostTargetTileProperty(GhostTargetTileProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XPacman Next Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XPacman Next Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXPacmanNextProperty(XPacmanNextProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XPacman Until Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XPacman Until Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXPacmanUntilProperty(XPacmanUntilProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XPacman Release Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XPacman Release Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXPacmanReleaseProperty(XPacmanReleaseProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XPacman Negation Temporal Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XPacman Negation Temporal Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXPacmanNegationTemporalProperty(XPacmanNegationTemporalProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractProperty(AbstractProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseStepProperty(StepProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTemporalProperty(TemporalProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseStateProperty(StateProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends StateProperty<?>, T> T1 caseUnaryProperty(UnaryProperty<P, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends StateProperty<?>, T> T1 caseBinaryProperty(BinaryProperty<P, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Reference Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Reference Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends StateProperty<?>, T> T1 caseSingleReferenceProperty(SingleReferenceProperty<P, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Attribute Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Attribute Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseIntegerAttributeProperty(IntegerAttributeProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Attribute Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Attribute Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseBooleanAttributeProperty(BooleanAttributeProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Reference Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Reference Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends StateProperty<?>, T> T1 caseContainerReferenceProperty(ContainerReferenceProperty<P, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Many Reference Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Many Reference Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends StateProperty<?>, T> T1 caseManyReferenceProperty(ManyReferenceProperty<P, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Attribute Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Attribute Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseStringAttributeProperty(StringAttributeProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Next Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Next Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends AbstractProperty> T1 caseNextProperty(NextProperty<P> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Until Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Until Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends AbstractProperty> T1 caseUntilProperty(UntilProperty<P> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends AbstractProperty> T1 caseReleaseProperty(ReleaseProperty<P> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negation Temporal Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negation Temporal Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends TemporalProperty> T1 caseNegationTemporalProperty(NegationTemporalProperty<P> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //XPacmanPropertySwitch
