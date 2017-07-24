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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.tetrabox.example.pacman.xpacman.pacman.Board;
import org.tetrabox.example.pacman.xpacman.pacman.Entity;
import org.tetrabox.example.pacman.xpacman.pacman.Ghost;
import org.tetrabox.example.pacman.xpacman.pacman.Pacman;
import org.tetrabox.example.pacman.xpacman.pacman.Tile;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyPackage
 * @generated
 */
public class XPacmanPropertyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XPacmanPropertyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanPropertyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XPacmanPropertyPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XPacmanPropertySwitch<Adapter> modelSwitch =
		new XPacmanPropertySwitch<Adapter>() {
			@Override
			public Adapter casePacmanEnterNextTileProperty(PacmanEnterNextTileProperty object) {
				return createPacmanEnterNextTilePropertyAdapter();
			}
			@Override
			public Adapter caseGhostEnterNextTileProperty(GhostEnterNextTileProperty object) {
				return createGhostEnterNextTilePropertyAdapter();
			}
			@Override
			public Adapter caseEntityChangeDirectionProperty(EntityChangeDirectionProperty object) {
				return createEntityChangeDirectionPropertyAdapter();
			}
			@Override
			public Adapter casePacmanLeftProperty(PacmanLeftProperty object) {
				return createPacmanLeftPropertyAdapter();
			}
			@Override
			public Adapter casePacmanRightProperty(PacmanRightProperty object) {
				return createPacmanRightPropertyAdapter();
			}
			@Override
			public Adapter casePacmanEatPelletProperty(PacmanEatPelletProperty object) {
				return createPacmanEatPelletPropertyAdapter();
			}
			@Override
			public Adapter casePacmanUpProperty(PacmanUpProperty object) {
				return createPacmanUpPropertyAdapter();
			}
			@Override
			public Adapter casePacmanInitializeProperty(PacmanInitializeProperty object) {
				return createPacmanInitializePropertyAdapter();
			}
			@Override
			public Adapter caseEntityModifySpeedProperty(EntityModifySpeedProperty object) {
				return createEntityModifySpeedPropertyAdapter();
			}
			@Override
			public Adapter caseBoardInitializeModelProperty(BoardInitializeModelProperty object) {
				return createBoardInitializeModelPropertyAdapter();
			}
			@Override
			public Adapter caseEntityInitializeProperty(EntityInitializeProperty object) {
				return createEntityInitializePropertyAdapter();
			}
			@Override
			public Adapter casePacmanChangeDirectionProperty(PacmanChangeDirectionProperty object) {
				return createPacmanChangeDirectionPropertyAdapter();
			}
			@Override
			public Adapter caseEntityUpdateProperty(EntityUpdateProperty object) {
				return createEntityUpdatePropertyAdapter();
			}
			@Override
			public Adapter caseBoardResetProperty(BoardResetProperty object) {
				return createBoardResetPropertyAdapter();
			}
			@Override
			public Adapter casePacmanDownProperty(PacmanDownProperty object) {
				return createPacmanDownPropertyAdapter();
			}
			@Override
			public Adapter caseEntityEnterNextTileProperty(EntityEnterNextTileProperty object) {
				return createEntityEnterNextTilePropertyAdapter();
			}
			@Override
			public Adapter casePacmanKillProperty(PacmanKillProperty object) {
				return createPacmanKillPropertyAdapter();
			}
			@Override
			public Adapter caseBoardUpdateProperty(BoardUpdateProperty object) {
				return createBoardUpdatePropertyAdapter();
			}
			@Override
			public Adapter caseGhostChangeTargetTileProperty(GhostChangeTargetTileProperty object) {
				return createGhostChangeTargetTilePropertyAdapter();
			}
			@Override
			public Adapter caseXPacmanAbstractProperty(XPacmanAbstractProperty object) {
				return createXPacmanAbstractPropertyAdapter();
			}
			@Override
			public Adapter caseXPacmanTemporalProperty(XPacmanTemporalProperty object) {
				return createXPacmanTemporalPropertyAdapter();
			}
			@Override
			public Adapter caseXPacmanProperty(XPacmanProperty object) {
				return createXPacmanPropertyAdapter();
			}
			@Override
			public <T> Adapter caseXPacmanStateProperty(XPacmanStateProperty<T> object) {
				return createXPacmanStatePropertyAdapter();
			}
			@Override
			public <T> Adapter caseXPacmanStepProperty(XPacmanStepProperty<T> object) {
				return createXPacmanStepPropertyAdapter();
			}
			@Override
			public <T extends Tile> Adapter caseTileProperty(TileProperty<T> object) {
				return createTilePropertyAdapter();
			}
			@Override
			public Adapter caseUnaryTileProperty(UnaryTileProperty object) {
				return createUnaryTilePropertyAdapter();
			}
			@Override
			public Adapter caseBinaryTileProperty(BinaryTileProperty object) {
				return createBinaryTilePropertyAdapter();
			}
			@Override
			public Adapter caseTileTopProperty(TileTopProperty object) {
				return createTileTopPropertyAdapter();
			}
			@Override
			public Adapter caseTileRightProperty(TileRightProperty object) {
				return createTileRightPropertyAdapter();
			}
			@Override
			public Adapter caseTileBottomProperty(TileBottomProperty object) {
				return createTileBottomPropertyAdapter();
			}
			@Override
			public Adapter caseTileLeftProperty(TileLeftProperty object) {
				return createTileLeftPropertyAdapter();
			}
			@Override
			public Adapter caseTileXProperty(TileXProperty object) {
				return createTileXPropertyAdapter();
			}
			@Override
			public Adapter caseTileYProperty(TileYProperty object) {
				return createTileYPropertyAdapter();
			}
			@Override
			public Adapter caseTilePassableProperty(TilePassableProperty object) {
				return createTilePassablePropertyAdapter();
			}
			@Override
			public Adapter caseTileInitialPelletProperty(TileInitialPelletProperty object) {
				return createTileInitialPelletPropertyAdapter();
			}
			@Override
			public Adapter caseTileHasPelletProperty(TileHasPelletProperty object) {
				return createTileHasPelletPropertyAdapter();
			}
			@Override
			public <T extends Board> Adapter caseBoardProperty(BoardProperty<T> object) {
				return createBoardPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryBoardProperty(UnaryBoardProperty object) {
				return createUnaryBoardPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryBoardProperty(BinaryBoardProperty object) {
				return createBinaryBoardPropertyAdapter();
			}
			@Override
			public Adapter caseTileBoardContainerProperty(TileBoardContainerProperty object) {
				return createTileBoardContainerPropertyAdapter();
			}
			@Override
			public Adapter caseBoardTilesProperty(BoardTilesProperty object) {
				return createBoardTilesPropertyAdapter();
			}
			@Override
			public Adapter caseEntityBoardContainerProperty(EntityBoardContainerProperty object) {
				return createEntityBoardContainerPropertyAdapter();
			}
			@Override
			public <T extends Entity> Adapter caseEntityProperty(EntityProperty<T> object) {
				return createEntityPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryEntityProperty(UnaryEntityProperty object) {
				return createUnaryEntityPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryEntityProperty(BinaryEntityProperty object) {
				return createBinaryEntityPropertyAdapter();
			}
			@Override
			public Adapter caseEntityInitialTileProperty(EntityInitialTileProperty object) {
				return createEntityInitialTilePropertyAdapter();
			}
			@Override
			public Adapter caseEntitySpeedProperty(EntitySpeedProperty object) {
				return createEntitySpeedPropertyAdapter();
			}
			@Override
			public Adapter caseEntityDirectionProperty(EntityDirectionProperty object) {
				return createEntityDirectionPropertyAdapter();
			}
			@Override
			public Adapter caseEntityCurrentTileProperty(EntityCurrentTileProperty object) {
				return createEntityCurrentTilePropertyAdapter();
			}
			@Override
			public Adapter caseEntityNextTileProperty(EntityNextTileProperty object) {
				return createEntityNextTilePropertyAdapter();
			}
			@Override
			public Adapter caseBoardEntitiesProperty(BoardEntitiesProperty object) {
				return createBoardEntitiesPropertyAdapter();
			}
			@Override
			public <T extends Pacman> Adapter casePacmanProperty(PacmanProperty<T> object) {
				return createPacmanPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryPacmanProperty(UnaryPacmanProperty object) {
				return createUnaryPacmanPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryPacmanProperty(BinaryPacmanProperty object) {
				return createBinaryPacmanPropertyAdapter();
			}
			@Override
			public Adapter casePacmanInitialTileProperty(PacmanInitialTileProperty object) {
				return createPacmanInitialTilePropertyAdapter();
			}
			@Override
			public Adapter casePacmanSpeedProperty(PacmanSpeedProperty object) {
				return createPacmanSpeedPropertyAdapter();
			}
			@Override
			public Adapter casePacmanDirectionProperty(PacmanDirectionProperty object) {
				return createPacmanDirectionPropertyAdapter();
			}
			@Override
			public Adapter casePacmanCurrentTileProperty(PacmanCurrentTileProperty object) {
				return createPacmanCurrentTilePropertyAdapter();
			}
			@Override
			public Adapter casePacmanNextTileProperty(PacmanNextTileProperty object) {
				return createPacmanNextTilePropertyAdapter();
			}
			@Override
			public Adapter casePacmanInitialLivesProperty(PacmanInitialLivesProperty object) {
				return createPacmanInitialLivesPropertyAdapter();
			}
			@Override
			public Adapter casePacmanPelletsEatenProperty(PacmanPelletsEatenProperty object) {
				return createPacmanPelletsEatenPropertyAdapter();
			}
			@Override
			public Adapter casePacmanLivesProperty(PacmanLivesProperty object) {
				return createPacmanLivesPropertyAdapter();
			}
			@Override
			public <T extends Ghost> Adapter caseGhostProperty(GhostProperty<T> object) {
				return createGhostPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryGhostProperty(UnaryGhostProperty object) {
				return createUnaryGhostPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryGhostProperty(BinaryGhostProperty object) {
				return createBinaryGhostPropertyAdapter();
			}
			@Override
			public Adapter caseGhostInitialTileProperty(GhostInitialTileProperty object) {
				return createGhostInitialTilePropertyAdapter();
			}
			@Override
			public Adapter caseGhostSpeedProperty(GhostSpeedProperty object) {
				return createGhostSpeedPropertyAdapter();
			}
			@Override
			public Adapter caseGhostDirectionProperty(GhostDirectionProperty object) {
				return createGhostDirectionPropertyAdapter();
			}
			@Override
			public Adapter caseGhostCurrentTileProperty(GhostCurrentTileProperty object) {
				return createGhostCurrentTilePropertyAdapter();
			}
			@Override
			public Adapter caseGhostNextTileProperty(GhostNextTileProperty object) {
				return createGhostNextTilePropertyAdapter();
			}
			@Override
			public Adapter caseGhostNameProperty(GhostNameProperty object) {
				return createGhostNamePropertyAdapter();
			}
			@Override
			public Adapter caseGhostPersonnalityProperty(GhostPersonnalityProperty object) {
				return createGhostPersonnalityPropertyAdapter();
			}
			@Override
			public Adapter caseGhostTargetTileProperty(GhostTargetTileProperty object) {
				return createGhostTargetTilePropertyAdapter();
			}
			@Override
			public Adapter caseXPacmanNextProperty(XPacmanNextProperty object) {
				return createXPacmanNextPropertyAdapter();
			}
			@Override
			public Adapter caseXPacmanUntilProperty(XPacmanUntilProperty object) {
				return createXPacmanUntilPropertyAdapter();
			}
			@Override
			public Adapter caseXPacmanReleaseProperty(XPacmanReleaseProperty object) {
				return createXPacmanReleasePropertyAdapter();
			}
			@Override
			public Adapter caseXPacmanNegationTemporalProperty(XPacmanNegationTemporalProperty object) {
				return createXPacmanNegationTemporalPropertyAdapter();
			}
			@Override
			public Adapter caseAbstractProperty(AbstractProperty object) {
				return createAbstractPropertyAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public <T> Adapter caseStepProperty(StepProperty<T> object) {
				return createStepPropertyAdapter();
			}
			@Override
			public Adapter caseTemporalProperty(TemporalProperty object) {
				return createTemporalPropertyAdapter();
			}
			@Override
			public <T> Adapter caseStateProperty(StateProperty<T> object) {
				return createStatePropertyAdapter();
			}
			@Override
			public <P extends StateProperty<?>, T> Adapter caseUnaryProperty(UnaryProperty<P, T> object) {
				return createUnaryPropertyAdapter();
			}
			@Override
			public <P extends StateProperty<?>, T> Adapter caseBinaryProperty(BinaryProperty<P, T> object) {
				return createBinaryPropertyAdapter();
			}
			@Override
			public <P extends StateProperty<?>, T> Adapter caseSingleReferenceProperty(SingleReferenceProperty<P, T> object) {
				return createSingleReferencePropertyAdapter();
			}
			@Override
			public <T> Adapter caseIntegerAttributeProperty(IntegerAttributeProperty<T> object) {
				return createIntegerAttributePropertyAdapter();
			}
			@Override
			public <T> Adapter caseBooleanAttributeProperty(BooleanAttributeProperty<T> object) {
				return createBooleanAttributePropertyAdapter();
			}
			@Override
			public <P extends StateProperty<?>, T> Adapter caseContainerReferenceProperty(ContainerReferenceProperty<P, T> object) {
				return createContainerReferencePropertyAdapter();
			}
			@Override
			public <P extends StateProperty<?>, T> Adapter caseManyReferenceProperty(ManyReferenceProperty<P, T> object) {
				return createManyReferencePropertyAdapter();
			}
			@Override
			public <T> Adapter caseStringAttributeProperty(StringAttributeProperty<T> object) {
				return createStringAttributePropertyAdapter();
			}
			@Override
			public <P extends AbstractProperty> Adapter caseNextProperty(NextProperty<P> object) {
				return createNextPropertyAdapter();
			}
			@Override
			public <P extends AbstractProperty> Adapter caseUntilProperty(UntilProperty<P> object) {
				return createUntilPropertyAdapter();
			}
			@Override
			public <P extends AbstractProperty> Adapter caseReleaseProperty(ReleaseProperty<P> object) {
				return createReleasePropertyAdapter();
			}
			@Override
			public <P extends TemporalProperty> Adapter caseNegationTemporalProperty(NegationTemporalProperty<P> object) {
				return createNegationTemporalPropertyAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanEnterNextTileProperty <em>Pacman Enter Next Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanEnterNextTileProperty
	 * @generated
	 */
	public Adapter createPacmanEnterNextTilePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostEnterNextTileProperty <em>Ghost Enter Next Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostEnterNextTileProperty
	 * @generated
	 */
	public Adapter createGhostEnterNextTilePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityChangeDirectionProperty <em>Entity Change Direction Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityChangeDirectionProperty
	 * @generated
	 */
	public Adapter createEntityChangeDirectionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanLeftProperty <em>Pacman Left Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanLeftProperty
	 * @generated
	 */
	public Adapter createPacmanLeftPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanRightProperty <em>Pacman Right Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanRightProperty
	 * @generated
	 */
	public Adapter createPacmanRightPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanEatPelletProperty <em>Pacman Eat Pellet Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanEatPelletProperty
	 * @generated
	 */
	public Adapter createPacmanEatPelletPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanUpProperty <em>Pacman Up Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanUpProperty
	 * @generated
	 */
	public Adapter createPacmanUpPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanInitializeProperty <em>Pacman Initialize Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanInitializeProperty
	 * @generated
	 */
	public Adapter createPacmanInitializePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityModifySpeedProperty <em>Entity Modify Speed Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityModifySpeedProperty
	 * @generated
	 */
	public Adapter createEntityModifySpeedPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardInitializeModelProperty <em>Board Initialize Model Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardInitializeModelProperty
	 * @generated
	 */
	public Adapter createBoardInitializeModelPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityInitializeProperty <em>Entity Initialize Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityInitializeProperty
	 * @generated
	 */
	public Adapter createEntityInitializePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanChangeDirectionProperty <em>Pacman Change Direction Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanChangeDirectionProperty
	 * @generated
	 */
	public Adapter createPacmanChangeDirectionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityUpdateProperty <em>Entity Update Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityUpdateProperty
	 * @generated
	 */
	public Adapter createEntityUpdatePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardResetProperty <em>Board Reset Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardResetProperty
	 * @generated
	 */
	public Adapter createBoardResetPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanDownProperty <em>Pacman Down Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanDownProperty
	 * @generated
	 */
	public Adapter createPacmanDownPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityEnterNextTileProperty <em>Entity Enter Next Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityEnterNextTileProperty
	 * @generated
	 */
	public Adapter createEntityEnterNextTilePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanKillProperty <em>Pacman Kill Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanKillProperty
	 * @generated
	 */
	public Adapter createPacmanKillPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardUpdateProperty <em>Board Update Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardUpdateProperty
	 * @generated
	 */
	public Adapter createBoardUpdatePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostChangeTargetTileProperty <em>Ghost Change Target Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostChangeTargetTileProperty
	 * @generated
	 */
	public Adapter createGhostChangeTargetTilePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanAbstractProperty <em>XPacman Abstract Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanAbstractProperty
	 * @generated
	 */
	public Adapter createXPacmanAbstractPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanTemporalProperty <em>XPacman Temporal Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanTemporalProperty
	 * @generated
	 */
	public Adapter createXPacmanTemporalPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanProperty <em>XPacman Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanProperty
	 * @generated
	 */
	public Adapter createXPacmanPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanStateProperty <em>XPacman State Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanStateProperty
	 * @generated
	 */
	public Adapter createXPacmanStatePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanStepProperty <em>XPacman Step Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanStepProperty
	 * @generated
	 */
	public Adapter createXPacmanStepPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileProperty <em>Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileProperty
	 * @generated
	 */
	public Adapter createTilePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.UnaryTileProperty <em>Unary Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.UnaryTileProperty
	 * @generated
	 */
	public Adapter createUnaryTilePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BinaryTileProperty <em>Binary Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BinaryTileProperty
	 * @generated
	 */
	public Adapter createBinaryTilePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileTopProperty <em>Tile Top Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileTopProperty
	 * @generated
	 */
	public Adapter createTileTopPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileRightProperty <em>Tile Right Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileRightProperty
	 * @generated
	 */
	public Adapter createTileRightPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileBottomProperty <em>Tile Bottom Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileBottomProperty
	 * @generated
	 */
	public Adapter createTileBottomPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileLeftProperty <em>Tile Left Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileLeftProperty
	 * @generated
	 */
	public Adapter createTileLeftPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileXProperty <em>Tile XProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileXProperty
	 * @generated
	 */
	public Adapter createTileXPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileYProperty <em>Tile YProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileYProperty
	 * @generated
	 */
	public Adapter createTileYPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TilePassableProperty <em>Tile Passable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TilePassableProperty
	 * @generated
	 */
	public Adapter createTilePassablePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileInitialPelletProperty <em>Tile Initial Pellet Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileInitialPelletProperty
	 * @generated
	 */
	public Adapter createTileInitialPelletPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileHasPelletProperty <em>Tile Has Pellet Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileHasPelletProperty
	 * @generated
	 */
	public Adapter createTileHasPelletPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardProperty <em>Board Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardProperty
	 * @generated
	 */
	public Adapter createBoardPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.UnaryBoardProperty <em>Unary Board Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.UnaryBoardProperty
	 * @generated
	 */
	public Adapter createUnaryBoardPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BinaryBoardProperty <em>Binary Board Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BinaryBoardProperty
	 * @generated
	 */
	public Adapter createBinaryBoardPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileBoardContainerProperty <em>Tile Board Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileBoardContainerProperty
	 * @generated
	 */
	public Adapter createTileBoardContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardTilesProperty <em>Board Tiles Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardTilesProperty
	 * @generated
	 */
	public Adapter createBoardTilesPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityBoardContainerProperty <em>Entity Board Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityBoardContainerProperty
	 * @generated
	 */
	public Adapter createEntityBoardContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityProperty <em>Entity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityProperty
	 * @generated
	 */
	public Adapter createEntityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.UnaryEntityProperty <em>Unary Entity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.UnaryEntityProperty
	 * @generated
	 */
	public Adapter createUnaryEntityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BinaryEntityProperty <em>Binary Entity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BinaryEntityProperty
	 * @generated
	 */
	public Adapter createBinaryEntityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityInitialTileProperty <em>Entity Initial Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityInitialTileProperty
	 * @generated
	 */
	public Adapter createEntityInitialTilePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntitySpeedProperty <em>Entity Speed Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntitySpeedProperty
	 * @generated
	 */
	public Adapter createEntitySpeedPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityDirectionProperty <em>Entity Direction Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityDirectionProperty
	 * @generated
	 */
	public Adapter createEntityDirectionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityCurrentTileProperty <em>Entity Current Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityCurrentTileProperty
	 * @generated
	 */
	public Adapter createEntityCurrentTilePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityNextTileProperty <em>Entity Next Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityNextTileProperty
	 * @generated
	 */
	public Adapter createEntityNextTilePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardEntitiesProperty <em>Board Entities Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardEntitiesProperty
	 * @generated
	 */
	public Adapter createBoardEntitiesPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanProperty <em>Pacman Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanProperty
	 * @generated
	 */
	public Adapter createPacmanPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.UnaryPacmanProperty <em>Unary Pacman Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.UnaryPacmanProperty
	 * @generated
	 */
	public Adapter createUnaryPacmanPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BinaryPacmanProperty <em>Binary Pacman Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BinaryPacmanProperty
	 * @generated
	 */
	public Adapter createBinaryPacmanPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanInitialTileProperty <em>Pacman Initial Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanInitialTileProperty
	 * @generated
	 */
	public Adapter createPacmanInitialTilePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanSpeedProperty <em>Pacman Speed Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanSpeedProperty
	 * @generated
	 */
	public Adapter createPacmanSpeedPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanDirectionProperty <em>Pacman Direction Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanDirectionProperty
	 * @generated
	 */
	public Adapter createPacmanDirectionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanCurrentTileProperty <em>Pacman Current Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanCurrentTileProperty
	 * @generated
	 */
	public Adapter createPacmanCurrentTilePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanNextTileProperty <em>Pacman Next Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanNextTileProperty
	 * @generated
	 */
	public Adapter createPacmanNextTilePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanInitialLivesProperty <em>Pacman Initial Lives Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanInitialLivesProperty
	 * @generated
	 */
	public Adapter createPacmanInitialLivesPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanPelletsEatenProperty <em>Pacman Pellets Eaten Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanPelletsEatenProperty
	 * @generated
	 */
	public Adapter createPacmanPelletsEatenPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanLivesProperty <em>Pacman Lives Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanLivesProperty
	 * @generated
	 */
	public Adapter createPacmanLivesPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostProperty <em>Ghost Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostProperty
	 * @generated
	 */
	public Adapter createGhostPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.UnaryGhostProperty <em>Unary Ghost Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.UnaryGhostProperty
	 * @generated
	 */
	public Adapter createUnaryGhostPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BinaryGhostProperty <em>Binary Ghost Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BinaryGhostProperty
	 * @generated
	 */
	public Adapter createBinaryGhostPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostInitialTileProperty <em>Ghost Initial Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostInitialTileProperty
	 * @generated
	 */
	public Adapter createGhostInitialTilePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostSpeedProperty <em>Ghost Speed Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostSpeedProperty
	 * @generated
	 */
	public Adapter createGhostSpeedPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostDirectionProperty <em>Ghost Direction Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostDirectionProperty
	 * @generated
	 */
	public Adapter createGhostDirectionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostCurrentTileProperty <em>Ghost Current Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostCurrentTileProperty
	 * @generated
	 */
	public Adapter createGhostCurrentTilePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostNextTileProperty <em>Ghost Next Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostNextTileProperty
	 * @generated
	 */
	public Adapter createGhostNextTilePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostNameProperty <em>Ghost Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostNameProperty
	 * @generated
	 */
	public Adapter createGhostNamePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostPersonnalityProperty <em>Ghost Personnality Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostPersonnalityProperty
	 * @generated
	 */
	public Adapter createGhostPersonnalityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostTargetTileProperty <em>Ghost Target Tile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostTargetTileProperty
	 * @generated
	 */
	public Adapter createGhostTargetTilePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanNextProperty <em>XPacman Next Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanNextProperty
	 * @generated
	 */
	public Adapter createXPacmanNextPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanUntilProperty <em>XPacman Until Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanUntilProperty
	 * @generated
	 */
	public Adapter createXPacmanUntilPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanReleaseProperty <em>XPacman Release Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanReleaseProperty
	 * @generated
	 */
	public Adapter createXPacmanReleasePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanNegationTemporalProperty <em>XPacman Negation Temporal Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanNegationTemporalProperty
	 * @generated
	 */
	public Adapter createXPacmanNegationTemporalPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.AbstractProperty <em>Abstract Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.AbstractProperty
	 * @generated
	 */
	public Adapter createAbstractPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.StepProperty <em>Step Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.StepProperty
	 * @generated
	 */
	public Adapter createStepPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.TemporalProperty <em>Temporal Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.TemporalProperty
	 * @generated
	 */
	public Adapter createTemporalPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.StateProperty <em>State Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.StateProperty
	 * @generated
	 */
	public Adapter createStatePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.UnaryProperty <em>Unary Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.UnaryProperty
	 * @generated
	 */
	public Adapter createUnaryPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.BinaryProperty <em>Binary Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.BinaryProperty
	 * @generated
	 */
	public Adapter createBinaryPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.SingleReferenceProperty <em>Single Reference Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.SingleReferenceProperty
	 * @generated
	 */
	public Adapter createSingleReferencePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.IntegerAttributeProperty <em>Integer Attribute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.IntegerAttributeProperty
	 * @generated
	 */
	public Adapter createIntegerAttributePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.BooleanAttributeProperty <em>Boolean Attribute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.BooleanAttributeProperty
	 * @generated
	 */
	public Adapter createBooleanAttributePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.ContainerReferenceProperty <em>Container Reference Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.ContainerReferenceProperty
	 * @generated
	 */
	public Adapter createContainerReferencePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.ManyReferenceProperty <em>Many Reference Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.ManyReferenceProperty
	 * @generated
	 */
	public Adapter createManyReferencePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.StringAttributeProperty <em>String Attribute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.StringAttributeProperty
	 * @generated
	 */
	public Adapter createStringAttributePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.NextProperty <em>Next Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.NextProperty
	 * @generated
	 */
	public Adapter createNextPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.UntilProperty <em>Until Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.UntilProperty
	 * @generated
	 */
	public Adapter createUntilPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.ReleaseProperty <em>Release Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.ReleaseProperty
	 * @generated
	 */
	public Adapter createReleasePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.NegationTemporalProperty <em>Negation Temporal Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.NegationTemporalProperty
	 * @generated
	 */
	public Adapter createNegationTemporalPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XPacmanPropertyAdapterFactory
