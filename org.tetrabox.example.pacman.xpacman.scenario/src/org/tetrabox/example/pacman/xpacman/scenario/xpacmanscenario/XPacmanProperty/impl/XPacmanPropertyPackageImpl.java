/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.impl;

import fr.inria.diverse.event.commons.model.property.PropertyPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiterPackage;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.impl.XPacmanArbiterPackageImpl;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.XPacmanEventPackage;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.impl.XPacmanEventPackageImpl;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BinaryBoardProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BinaryEntityProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BinaryGhostProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BinaryPacmanProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BinaryTileProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardEntitiesProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardInitializeModelProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardResetProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardTilesProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.BoardUpdateProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityBoardContainerProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityChangeDirectionProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityCurrentTileProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityDirectionProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityEnterNextTileProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityInitialTileProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityInitializeProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityModifySpeedProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityNextTileProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntitySpeedProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.EntityUpdateProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostChangeTargetTileProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostCurrentTileProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostDirectionProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostEnterNextTileProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostInitialTileProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostNameProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostNextTileProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostPersonnalityProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostSpeedProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.GhostTargetTileProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanChangeDirectionProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanCurrentTileProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanDirectionProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanDownProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanEatPelletProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanEnterNextTileProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanInitialLivesProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanInitialTileProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanInitializeProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanKillProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanLeftProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanLivesProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanNextTileProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanPelletsEatenProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanRightProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanSpeedProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.PacmanUpProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileBoardContainerProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileBottomProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileHasPelletProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileInitialPelletProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileLeftProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TilePassableProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileRightProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileTopProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileXProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.TileYProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.UnaryBoardProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.UnaryEntityProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.UnaryGhostProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.UnaryPacmanProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.UnaryTileProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanAbstractProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanNegationTemporalProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanNextProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyFactory;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyPackage;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanReleaseProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanStateProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanStepProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanTemporalProperty;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanUntilProperty;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.XPacmanProviderPackage;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderPackageImpl;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.XPacmanScenarioPackage;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.impl.XPacmanScenarioPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XPacmanPropertyPackageImpl extends EPackageImpl implements XPacmanPropertyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanEnterNextTilePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ghostEnterNextTilePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityChangeDirectionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanLeftPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanRightPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanEatPelletPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanUpPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanInitializePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityModifySpeedPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boardInitializeModelPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityInitializePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanChangeDirectionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityUpdatePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boardResetPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanDownPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEnterNextTilePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanKillPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boardUpdatePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ghostChangeTargetTilePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPacmanAbstractPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPacmanTemporalPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPacmanPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPacmanStatePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPacmanStepPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tilePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryTilePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryTilePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tileTopPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tileRightPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tileBottomPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tileLeftPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tileXPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tileYPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tilePassablePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tileInitialPelletPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tileHasPelletPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boardPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryBoardPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryBoardPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tileBoardContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boardTilesPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityBoardContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryEntityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryEntityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityInitialTilePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entitySpeedPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityDirectionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityCurrentTilePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityNextTilePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boardEntitiesPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryPacmanPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryPacmanPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanInitialTilePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanSpeedPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanDirectionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanCurrentTilePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanNextTilePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanInitialLivesPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanPelletsEatenPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanLivesPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ghostPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryGhostPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryGhostPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ghostInitialTilePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ghostSpeedPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ghostDirectionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ghostCurrentTilePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ghostNextTilePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ghostNamePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ghostPersonnalityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ghostTargetTilePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPacmanNextPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPacmanUntilPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPacmanReleasePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPacmanNegationTemporalPropertyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanPropertyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XPacmanPropertyPackageImpl() {
		super(eNS_URI, XPacmanPropertyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link XPacmanPropertyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XPacmanPropertyPackage init() {
		if (isInited) return (XPacmanPropertyPackage)EPackage.Registry.INSTANCE.getEPackage(XPacmanPropertyPackage.eNS_URI);

		// Obtain or create and register package
		XPacmanPropertyPackageImpl theXPacmanPropertyPackage = (XPacmanPropertyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XPacmanPropertyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XPacmanPropertyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PacmanPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		XPacmanArbiterPackageImpl theXPacmanArbiterPackage = (XPacmanArbiterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XPacmanArbiterPackage.eNS_URI) instanceof XPacmanArbiterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XPacmanArbiterPackage.eNS_URI) : XPacmanArbiterPackage.eINSTANCE);
		XPacmanEventPackageImpl theXPacmanEventPackage = (XPacmanEventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XPacmanEventPackage.eNS_URI) instanceof XPacmanEventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XPacmanEventPackage.eNS_URI) : XPacmanEventPackage.eINSTANCE);
		XPacmanProviderPackageImpl theXPacmanProviderPackage = (XPacmanProviderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XPacmanProviderPackage.eNS_URI) instanceof XPacmanProviderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XPacmanProviderPackage.eNS_URI) : XPacmanProviderPackage.eINSTANCE);
		XPacmanScenarioPackageImpl theXPacmanScenarioPackage = (XPacmanScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XPacmanScenarioPackage.eNS_URI) instanceof XPacmanScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XPacmanScenarioPackage.eNS_URI) : XPacmanScenarioPackage.eINSTANCE);

		// Create package meta-data objects
		theXPacmanPropertyPackage.createPackageContents();
		theXPacmanArbiterPackage.createPackageContents();
		theXPacmanEventPackage.createPackageContents();
		theXPacmanProviderPackage.createPackageContents();
		theXPacmanScenarioPackage.createPackageContents();

		// Initialize created meta-data
		theXPacmanPropertyPackage.initializePackageContents();
		theXPacmanArbiterPackage.initializePackageContents();
		theXPacmanEventPackage.initializePackageContents();
		theXPacmanProviderPackage.initializePackageContents();
		theXPacmanScenarioPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXPacmanPropertyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XPacmanPropertyPackage.eNS_URI, theXPacmanPropertyPackage);
		return theXPacmanPropertyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanEnterNextTileProperty() {
		return pacmanEnterNextTilePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGhostEnterNextTileProperty() {
		return ghostEnterNextTilePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityChangeDirectionProperty() {
		return entityChangeDirectionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanLeftProperty() {
		return pacmanLeftPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanRightProperty() {
		return pacmanRightPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanEatPelletProperty() {
		return pacmanEatPelletPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanUpProperty() {
		return pacmanUpPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanInitializeProperty() {
		return pacmanInitializePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityModifySpeedProperty() {
		return entityModifySpeedPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoardInitializeModelProperty() {
		return boardInitializeModelPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityInitializeProperty() {
		return entityInitializePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanChangeDirectionProperty() {
		return pacmanChangeDirectionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityUpdateProperty() {
		return entityUpdatePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoardResetProperty() {
		return boardResetPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanDownProperty() {
		return pacmanDownPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityEnterNextTileProperty() {
		return entityEnterNextTilePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanKillProperty() {
		return pacmanKillPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoardUpdateProperty() {
		return boardUpdatePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGhostChangeTargetTileProperty() {
		return ghostChangeTargetTilePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXPacmanAbstractProperty() {
		return xPacmanAbstractPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXPacmanTemporalProperty() {
		return xPacmanTemporalPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXPacmanProperty() {
		return xPacmanPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXPacmanStateProperty() {
		return xPacmanStatePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXPacmanStepProperty() {
		return xPacmanStepPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTileProperty() {
		return tilePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryTileProperty() {
		return unaryTilePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryTileProperty() {
		return binaryTilePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTileTopProperty() {
		return tileTopPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTileRightProperty() {
		return tileRightPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTileBottomProperty() {
		return tileBottomPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTileLeftProperty() {
		return tileLeftPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTileXProperty() {
		return tileXPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTileYProperty() {
		return tileYPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTilePassableProperty() {
		return tilePassablePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTileInitialPelletProperty() {
		return tileInitialPelletPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTileHasPelletProperty() {
		return tileHasPelletPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoardProperty() {
		return boardPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryBoardProperty() {
		return unaryBoardPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryBoardProperty() {
		return binaryBoardPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTileBoardContainerProperty() {
		return tileBoardContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoardTilesProperty() {
		return boardTilesPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityBoardContainerProperty() {
		return entityBoardContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityProperty() {
		return entityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryEntityProperty() {
		return unaryEntityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryEntityProperty() {
		return binaryEntityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityInitialTileProperty() {
		return entityInitialTilePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntitySpeedProperty() {
		return entitySpeedPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityDirectionProperty() {
		return entityDirectionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityCurrentTileProperty() {
		return entityCurrentTilePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityNextTileProperty() {
		return entityNextTilePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoardEntitiesProperty() {
		return boardEntitiesPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanProperty() {
		return pacmanPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryPacmanProperty() {
		return unaryPacmanPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryPacmanProperty() {
		return binaryPacmanPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanInitialTileProperty() {
		return pacmanInitialTilePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanSpeedProperty() {
		return pacmanSpeedPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanDirectionProperty() {
		return pacmanDirectionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanCurrentTileProperty() {
		return pacmanCurrentTilePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanNextTileProperty() {
		return pacmanNextTilePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanInitialLivesProperty() {
		return pacmanInitialLivesPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanPelletsEatenProperty() {
		return pacmanPelletsEatenPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacmanLivesProperty() {
		return pacmanLivesPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGhostProperty() {
		return ghostPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryGhostProperty() {
		return unaryGhostPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryGhostProperty() {
		return binaryGhostPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGhostInitialTileProperty() {
		return ghostInitialTilePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGhostSpeedProperty() {
		return ghostSpeedPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGhostDirectionProperty() {
		return ghostDirectionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGhostCurrentTileProperty() {
		return ghostCurrentTilePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGhostNextTileProperty() {
		return ghostNextTilePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGhostNameProperty() {
		return ghostNamePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGhostPersonnalityProperty() {
		return ghostPersonnalityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGhostTargetTileProperty() {
		return ghostTargetTilePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXPacmanNextProperty() {
		return xPacmanNextPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXPacmanUntilProperty() {
		return xPacmanUntilPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXPacmanReleaseProperty() {
		return xPacmanReleasePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXPacmanNegationTemporalProperty() {
		return xPacmanNegationTemporalPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPacmanPropertyFactory getXPacmanPropertyFactory() {
		return (XPacmanPropertyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pacmanEnterNextTilePropertyEClass = createEClass(PACMAN_ENTER_NEXT_TILE_PROPERTY);

		ghostEnterNextTilePropertyEClass = createEClass(GHOST_ENTER_NEXT_TILE_PROPERTY);

		entityChangeDirectionPropertyEClass = createEClass(ENTITY_CHANGE_DIRECTION_PROPERTY);

		pacmanLeftPropertyEClass = createEClass(PACMAN_LEFT_PROPERTY);

		pacmanRightPropertyEClass = createEClass(PACMAN_RIGHT_PROPERTY);

		pacmanEatPelletPropertyEClass = createEClass(PACMAN_EAT_PELLET_PROPERTY);

		pacmanUpPropertyEClass = createEClass(PACMAN_UP_PROPERTY);

		pacmanInitializePropertyEClass = createEClass(PACMAN_INITIALIZE_PROPERTY);

		entityModifySpeedPropertyEClass = createEClass(ENTITY_MODIFY_SPEED_PROPERTY);

		boardInitializeModelPropertyEClass = createEClass(BOARD_INITIALIZE_MODEL_PROPERTY);

		entityInitializePropertyEClass = createEClass(ENTITY_INITIALIZE_PROPERTY);

		pacmanChangeDirectionPropertyEClass = createEClass(PACMAN_CHANGE_DIRECTION_PROPERTY);

		entityUpdatePropertyEClass = createEClass(ENTITY_UPDATE_PROPERTY);

		boardResetPropertyEClass = createEClass(BOARD_RESET_PROPERTY);

		pacmanDownPropertyEClass = createEClass(PACMAN_DOWN_PROPERTY);

		entityEnterNextTilePropertyEClass = createEClass(ENTITY_ENTER_NEXT_TILE_PROPERTY);

		pacmanKillPropertyEClass = createEClass(PACMAN_KILL_PROPERTY);

		boardUpdatePropertyEClass = createEClass(BOARD_UPDATE_PROPERTY);

		ghostChangeTargetTilePropertyEClass = createEClass(GHOST_CHANGE_TARGET_TILE_PROPERTY);

		xPacmanAbstractPropertyEClass = createEClass(XPACMAN_ABSTRACT_PROPERTY);

		xPacmanTemporalPropertyEClass = createEClass(XPACMAN_TEMPORAL_PROPERTY);

		xPacmanPropertyEClass = createEClass(XPACMAN_PROPERTY);

		xPacmanStatePropertyEClass = createEClass(XPACMAN_STATE_PROPERTY);

		xPacmanStepPropertyEClass = createEClass(XPACMAN_STEP_PROPERTY);

		tilePropertyEClass = createEClass(TILE_PROPERTY);

		unaryTilePropertyEClass = createEClass(UNARY_TILE_PROPERTY);

		binaryTilePropertyEClass = createEClass(BINARY_TILE_PROPERTY);

		tileTopPropertyEClass = createEClass(TILE_TOP_PROPERTY);

		tileRightPropertyEClass = createEClass(TILE_RIGHT_PROPERTY);

		tileBottomPropertyEClass = createEClass(TILE_BOTTOM_PROPERTY);

		tileLeftPropertyEClass = createEClass(TILE_LEFT_PROPERTY);

		tileXPropertyEClass = createEClass(TILE_XPROPERTY);

		tileYPropertyEClass = createEClass(TILE_YPROPERTY);

		tilePassablePropertyEClass = createEClass(TILE_PASSABLE_PROPERTY);

		tileInitialPelletPropertyEClass = createEClass(TILE_INITIAL_PELLET_PROPERTY);

		tileHasPelletPropertyEClass = createEClass(TILE_HAS_PELLET_PROPERTY);

		boardPropertyEClass = createEClass(BOARD_PROPERTY);

		unaryBoardPropertyEClass = createEClass(UNARY_BOARD_PROPERTY);

		binaryBoardPropertyEClass = createEClass(BINARY_BOARD_PROPERTY);

		tileBoardContainerPropertyEClass = createEClass(TILE_BOARD_CONTAINER_PROPERTY);

		boardTilesPropertyEClass = createEClass(BOARD_TILES_PROPERTY);

		entityBoardContainerPropertyEClass = createEClass(ENTITY_BOARD_CONTAINER_PROPERTY);

		entityPropertyEClass = createEClass(ENTITY_PROPERTY);

		unaryEntityPropertyEClass = createEClass(UNARY_ENTITY_PROPERTY);

		binaryEntityPropertyEClass = createEClass(BINARY_ENTITY_PROPERTY);

		entityInitialTilePropertyEClass = createEClass(ENTITY_INITIAL_TILE_PROPERTY);

		entitySpeedPropertyEClass = createEClass(ENTITY_SPEED_PROPERTY);

		entityDirectionPropertyEClass = createEClass(ENTITY_DIRECTION_PROPERTY);

		entityCurrentTilePropertyEClass = createEClass(ENTITY_CURRENT_TILE_PROPERTY);

		entityNextTilePropertyEClass = createEClass(ENTITY_NEXT_TILE_PROPERTY);

		boardEntitiesPropertyEClass = createEClass(BOARD_ENTITIES_PROPERTY);

		pacmanPropertyEClass = createEClass(PACMAN_PROPERTY);

		unaryPacmanPropertyEClass = createEClass(UNARY_PACMAN_PROPERTY);

		binaryPacmanPropertyEClass = createEClass(BINARY_PACMAN_PROPERTY);

		pacmanInitialTilePropertyEClass = createEClass(PACMAN_INITIAL_TILE_PROPERTY);

		pacmanSpeedPropertyEClass = createEClass(PACMAN_SPEED_PROPERTY);

		pacmanDirectionPropertyEClass = createEClass(PACMAN_DIRECTION_PROPERTY);

		pacmanCurrentTilePropertyEClass = createEClass(PACMAN_CURRENT_TILE_PROPERTY);

		pacmanNextTilePropertyEClass = createEClass(PACMAN_NEXT_TILE_PROPERTY);

		pacmanInitialLivesPropertyEClass = createEClass(PACMAN_INITIAL_LIVES_PROPERTY);

		pacmanPelletsEatenPropertyEClass = createEClass(PACMAN_PELLETS_EATEN_PROPERTY);

		pacmanLivesPropertyEClass = createEClass(PACMAN_LIVES_PROPERTY);

		ghostPropertyEClass = createEClass(GHOST_PROPERTY);

		unaryGhostPropertyEClass = createEClass(UNARY_GHOST_PROPERTY);

		binaryGhostPropertyEClass = createEClass(BINARY_GHOST_PROPERTY);

		ghostInitialTilePropertyEClass = createEClass(GHOST_INITIAL_TILE_PROPERTY);

		ghostSpeedPropertyEClass = createEClass(GHOST_SPEED_PROPERTY);

		ghostDirectionPropertyEClass = createEClass(GHOST_DIRECTION_PROPERTY);

		ghostCurrentTilePropertyEClass = createEClass(GHOST_CURRENT_TILE_PROPERTY);

		ghostNextTilePropertyEClass = createEClass(GHOST_NEXT_TILE_PROPERTY);

		ghostNamePropertyEClass = createEClass(GHOST_NAME_PROPERTY);

		ghostPersonnalityPropertyEClass = createEClass(GHOST_PERSONNALITY_PROPERTY);

		ghostTargetTilePropertyEClass = createEClass(GHOST_TARGET_TILE_PROPERTY);

		xPacmanNextPropertyEClass = createEClass(XPACMAN_NEXT_PROPERTY);

		xPacmanUntilPropertyEClass = createEClass(XPACMAN_UNTIL_PROPERTY);

		xPacmanReleasePropertyEClass = createEClass(XPACMAN_RELEASE_PROPERTY);

		xPacmanNegationTemporalPropertyEClass = createEClass(XPACMAN_NEGATION_TEMPORAL_PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PacmanPackage thePacmanPackage = (PacmanPackage)EPackage.Registry.INSTANCE.getEPackage(PacmanPackage.eNS_URI);
		PropertyPackage thePropertyPackage = (PropertyPackage)EPackage.Registry.INSTANCE.getEPackage(PropertyPackage.eNS_URI);

		// Create type parameters
		ETypeParameter xPacmanStatePropertyEClass_T = addETypeParameter(xPacmanStatePropertyEClass, "T");
		ETypeParameter xPacmanStepPropertyEClass_T = addETypeParameter(xPacmanStepPropertyEClass, "T");
		ETypeParameter tilePropertyEClass_T = addETypeParameter(tilePropertyEClass, "T");
		ETypeParameter boardPropertyEClass_T = addETypeParameter(boardPropertyEClass, "T");
		ETypeParameter entityPropertyEClass_T = addETypeParameter(entityPropertyEClass, "T");
		ETypeParameter pacmanPropertyEClass_T = addETypeParameter(pacmanPropertyEClass, "T");
		ETypeParameter ghostPropertyEClass_T = addETypeParameter(ghostPropertyEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(thePacmanPackage.getTile());
		tilePropertyEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(thePacmanPackage.getBoard());
		boardPropertyEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(thePacmanPackage.getEntity());
		entityPropertyEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(thePacmanPackage.getPacman());
		pacmanPropertyEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(thePacmanPackage.getGhost());
		ghostPropertyEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getXPacmanStepProperty());
		EGenericType g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanEnterNextTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanStepProperty());
		g2 = createEGenericType(thePacmanPackage.getGhost());
		g1.getETypeArguments().add(g2);
		ghostEnterNextTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanStepProperty());
		g2 = createEGenericType(thePacmanPackage.getEntity());
		g1.getETypeArguments().add(g2);
		entityChangeDirectionPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanStepProperty());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanLeftPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanStepProperty());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanRightPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanStepProperty());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanEatPelletPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanStepProperty());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanUpPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanStepProperty());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanInitializePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanStepProperty());
		g2 = createEGenericType(thePacmanPackage.getEntity());
		g1.getETypeArguments().add(g2);
		entityModifySpeedPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanStepProperty());
		g2 = createEGenericType(thePacmanPackage.getBoard());
		g1.getETypeArguments().add(g2);
		boardInitializeModelPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanStepProperty());
		g2 = createEGenericType(thePacmanPackage.getEntity());
		g1.getETypeArguments().add(g2);
		entityInitializePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanStepProperty());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanChangeDirectionPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanStepProperty());
		g2 = createEGenericType(thePacmanPackage.getEntity());
		g1.getETypeArguments().add(g2);
		entityUpdatePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanStepProperty());
		g2 = createEGenericType(thePacmanPackage.getBoard());
		g1.getETypeArguments().add(g2);
		boardResetPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanStepProperty());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanDownPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanStepProperty());
		g2 = createEGenericType(thePacmanPackage.getEntity());
		g1.getETypeArguments().add(g2);
		entityEnterNextTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanStepProperty());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanKillPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanStepProperty());
		g2 = createEGenericType(thePacmanPackage.getBoard());
		g1.getETypeArguments().add(g2);
		boardUpdatePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanStepProperty());
		g2 = createEGenericType(thePacmanPackage.getGhost());
		g1.getETypeArguments().add(g2);
		ghostChangeTargetTilePropertyEClass.getEGenericSuperTypes().add(g1);
		xPacmanAbstractPropertyEClass.getESuperTypes().add(thePropertyPackage.getAbstractProperty());
		xPacmanTemporalPropertyEClass.getESuperTypes().add(thePropertyPackage.getTemporalProperty());
		xPacmanTemporalPropertyEClass.getESuperTypes().add(this.getXPacmanAbstractProperty());
		xPacmanPropertyEClass.getESuperTypes().add(thePropertyPackage.getProperty());
		xPacmanPropertyEClass.getESuperTypes().add(this.getXPacmanAbstractProperty());
		g1 = createEGenericType(thePropertyPackage.getStateProperty());
		g2 = createEGenericType(xPacmanStatePropertyEClass_T);
		g1.getETypeArguments().add(g2);
		xPacmanStatePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanProperty());
		xPacmanStatePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getStepProperty());
		g2 = createEGenericType(xPacmanStepPropertyEClass_T);
		g1.getETypeArguments().add(g2);
		xPacmanStepPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanProperty());
		xPacmanStepPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanStateProperty());
		g2 = createEGenericType(tilePropertyEClass_T);
		g1.getETypeArguments().add(g2);
		tilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTileProperty());
		g2 = createEGenericType(thePacmanPackage.getTile());
		g1.getETypeArguments().add(g2);
		unaryTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getUnaryProperty());
		g2 = createEGenericType(this.getTileProperty());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(thePacmanPackage.getTile());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getTile());
		g1.getETypeArguments().add(g2);
		unaryTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTileProperty());
		g2 = createEGenericType(thePacmanPackage.getTile());
		g1.getETypeArguments().add(g2);
		binaryTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getBinaryProperty());
		g2 = createEGenericType(this.getTileProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getTile());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getTile());
		g1.getETypeArguments().add(g2);
		binaryTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTileProperty());
		g2 = createEGenericType(thePacmanPackage.getTile());
		g1.getETypeArguments().add(g2);
		tileTopPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getSingleReferenceProperty());
		g2 = createEGenericType(this.getTileProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getTile());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getTile());
		g1.getETypeArguments().add(g2);
		tileTopPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTileProperty());
		g2 = createEGenericType(thePacmanPackage.getTile());
		g1.getETypeArguments().add(g2);
		tileRightPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getSingleReferenceProperty());
		g2 = createEGenericType(this.getTileProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getTile());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getTile());
		g1.getETypeArguments().add(g2);
		tileRightPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTileProperty());
		g2 = createEGenericType(thePacmanPackage.getTile());
		g1.getETypeArguments().add(g2);
		tileBottomPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getSingleReferenceProperty());
		g2 = createEGenericType(this.getTileProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getTile());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getTile());
		g1.getETypeArguments().add(g2);
		tileBottomPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTileProperty());
		g2 = createEGenericType(thePacmanPackage.getTile());
		g1.getETypeArguments().add(g2);
		tileLeftPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getSingleReferenceProperty());
		g2 = createEGenericType(this.getTileProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getTile());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getTile());
		g1.getETypeArguments().add(g2);
		tileLeftPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTileProperty());
		g2 = createEGenericType(thePacmanPackage.getTile());
		g1.getETypeArguments().add(g2);
		tileXPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getIntegerAttributeProperty());
		g2 = createEGenericType(thePacmanPackage.getTile());
		g1.getETypeArguments().add(g2);
		tileXPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTileProperty());
		g2 = createEGenericType(thePacmanPackage.getTile());
		g1.getETypeArguments().add(g2);
		tileYPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getIntegerAttributeProperty());
		g2 = createEGenericType(thePacmanPackage.getTile());
		g1.getETypeArguments().add(g2);
		tileYPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTileProperty());
		g2 = createEGenericType(thePacmanPackage.getTile());
		g1.getETypeArguments().add(g2);
		tilePassablePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getBooleanAttributeProperty());
		g2 = createEGenericType(thePacmanPackage.getTile());
		g1.getETypeArguments().add(g2);
		tilePassablePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTileProperty());
		g2 = createEGenericType(thePacmanPackage.getTile());
		g1.getETypeArguments().add(g2);
		tileInitialPelletPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTileProperty());
		g2 = createEGenericType(thePacmanPackage.getTile());
		g1.getETypeArguments().add(g2);
		tileHasPelletPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getBooleanAttributeProperty());
		g2 = createEGenericType(thePacmanPackage.getTile());
		g1.getETypeArguments().add(g2);
		tileHasPelletPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanStateProperty());
		g2 = createEGenericType(boardPropertyEClass_T);
		g1.getETypeArguments().add(g2);
		boardPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBoardProperty());
		g2 = createEGenericType(thePacmanPackage.getBoard());
		g1.getETypeArguments().add(g2);
		unaryBoardPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getUnaryProperty());
		g2 = createEGenericType(this.getBoardProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getBoard());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getBoard());
		g1.getETypeArguments().add(g2);
		unaryBoardPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBoardProperty());
		g2 = createEGenericType(thePacmanPackage.getBoard());
		g1.getETypeArguments().add(g2);
		binaryBoardPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getBinaryProperty());
		g2 = createEGenericType(this.getBoardProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getBoard());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getBoard());
		g1.getETypeArguments().add(g2);
		binaryBoardPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTileProperty());
		g2 = createEGenericType(thePacmanPackage.getTile());
		g1.getETypeArguments().add(g2);
		tileBoardContainerPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getContainerReferenceProperty());
		g2 = createEGenericType(this.getBoardProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getBoard());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getTile());
		g1.getETypeArguments().add(g2);
		tileBoardContainerPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBoardProperty());
		g2 = createEGenericType(thePacmanPackage.getBoard());
		g1.getETypeArguments().add(g2);
		boardTilesPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getManyReferenceProperty());
		g2 = createEGenericType(this.getTileProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getTile());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getBoard());
		g1.getETypeArguments().add(g2);
		boardTilesPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getEntityProperty());
		g2 = createEGenericType(thePacmanPackage.getEntity());
		g1.getETypeArguments().add(g2);
		entityBoardContainerPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getContainerReferenceProperty());
		g2 = createEGenericType(this.getBoardProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getBoard());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getEntity());
		g1.getETypeArguments().add(g2);
		entityBoardContainerPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanStateProperty());
		g2 = createEGenericType(entityPropertyEClass_T);
		g1.getETypeArguments().add(g2);
		entityPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getEntityProperty());
		g2 = createEGenericType(thePacmanPackage.getEntity());
		g1.getETypeArguments().add(g2);
		unaryEntityPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getUnaryProperty());
		g2 = createEGenericType(this.getEntityProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getEntity());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getEntity());
		g1.getETypeArguments().add(g2);
		unaryEntityPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getEntityProperty());
		g2 = createEGenericType(thePacmanPackage.getEntity());
		g1.getETypeArguments().add(g2);
		binaryEntityPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getBinaryProperty());
		g2 = createEGenericType(this.getEntityProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getEntity());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getEntity());
		g1.getETypeArguments().add(g2);
		binaryEntityPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getEntityProperty());
		g2 = createEGenericType(thePacmanPackage.getEntity());
		g1.getETypeArguments().add(g2);
		entityInitialTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getSingleReferenceProperty());
		g2 = createEGenericType(this.getTileProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getTile());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getEntity());
		g1.getETypeArguments().add(g2);
		entityInitialTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getEntityProperty());
		g2 = createEGenericType(thePacmanPackage.getEntity());
		g1.getETypeArguments().add(g2);
		entitySpeedPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getIntegerAttributeProperty());
		g2 = createEGenericType(thePacmanPackage.getEntity());
		g1.getETypeArguments().add(g2);
		entitySpeedPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getEntityProperty());
		g2 = createEGenericType(thePacmanPackage.getEntity());
		g1.getETypeArguments().add(g2);
		entityDirectionPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getIntegerAttributeProperty());
		g2 = createEGenericType(thePacmanPackage.getEntity());
		g1.getETypeArguments().add(g2);
		entityDirectionPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getEntityProperty());
		g2 = createEGenericType(thePacmanPackage.getEntity());
		g1.getETypeArguments().add(g2);
		entityCurrentTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getSingleReferenceProperty());
		g2 = createEGenericType(this.getTileProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getTile());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getEntity());
		g1.getETypeArguments().add(g2);
		entityCurrentTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getEntityProperty());
		g2 = createEGenericType(thePacmanPackage.getEntity());
		g1.getETypeArguments().add(g2);
		entityNextTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getSingleReferenceProperty());
		g2 = createEGenericType(this.getTileProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getTile());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getEntity());
		g1.getETypeArguments().add(g2);
		entityNextTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBoardProperty());
		g2 = createEGenericType(thePacmanPackage.getBoard());
		g1.getETypeArguments().add(g2);
		boardEntitiesPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getManyReferenceProperty());
		g2 = createEGenericType(this.getEntityProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getEntity());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getBoard());
		g1.getETypeArguments().add(g2);
		boardEntitiesPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getEntityProperty());
		g2 = createEGenericType(pacmanPropertyEClass_T);
		g1.getETypeArguments().add(g2);
		pacmanPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPacmanProperty());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		unaryPacmanPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getUnaryProperty());
		g2 = createEGenericType(this.getPacmanProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getPacman());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		unaryPacmanPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPacmanProperty());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		binaryPacmanPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getBinaryProperty());
		g2 = createEGenericType(this.getPacmanProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getPacman());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		binaryPacmanPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPacmanProperty());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanInitialTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getSingleReferenceProperty());
		g2 = createEGenericType(this.getTileProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getTile());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanInitialTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPacmanProperty());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanSpeedPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getIntegerAttributeProperty());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanSpeedPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPacmanProperty());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanDirectionPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getIntegerAttributeProperty());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanDirectionPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPacmanProperty());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanCurrentTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getSingleReferenceProperty());
		g2 = createEGenericType(this.getTileProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getTile());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanCurrentTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPacmanProperty());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanNextTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getSingleReferenceProperty());
		g2 = createEGenericType(this.getTileProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getTile());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanNextTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPacmanProperty());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanInitialLivesPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getIntegerAttributeProperty());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanInitialLivesPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPacmanProperty());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanPelletsEatenPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getIntegerAttributeProperty());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanPelletsEatenPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPacmanProperty());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanLivesPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getIntegerAttributeProperty());
		g2 = createEGenericType(thePacmanPackage.getPacman());
		g1.getETypeArguments().add(g2);
		pacmanLivesPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getEntityProperty());
		g2 = createEGenericType(ghostPropertyEClass_T);
		g1.getETypeArguments().add(g2);
		ghostPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGhostProperty());
		g2 = createEGenericType(thePacmanPackage.getGhost());
		g1.getETypeArguments().add(g2);
		unaryGhostPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getUnaryProperty());
		g2 = createEGenericType(this.getGhostProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getGhost());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getGhost());
		g1.getETypeArguments().add(g2);
		unaryGhostPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGhostProperty());
		g2 = createEGenericType(thePacmanPackage.getGhost());
		g1.getETypeArguments().add(g2);
		binaryGhostPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getBinaryProperty());
		g2 = createEGenericType(this.getGhostProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getGhost());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getGhost());
		g1.getETypeArguments().add(g2);
		binaryGhostPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGhostProperty());
		g2 = createEGenericType(thePacmanPackage.getGhost());
		g1.getETypeArguments().add(g2);
		ghostInitialTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getSingleReferenceProperty());
		g2 = createEGenericType(this.getTileProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getTile());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getGhost());
		g1.getETypeArguments().add(g2);
		ghostInitialTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGhostProperty());
		g2 = createEGenericType(thePacmanPackage.getGhost());
		g1.getETypeArguments().add(g2);
		ghostSpeedPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getIntegerAttributeProperty());
		g2 = createEGenericType(thePacmanPackage.getGhost());
		g1.getETypeArguments().add(g2);
		ghostSpeedPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGhostProperty());
		g2 = createEGenericType(thePacmanPackage.getGhost());
		g1.getETypeArguments().add(g2);
		ghostDirectionPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getIntegerAttributeProperty());
		g2 = createEGenericType(thePacmanPackage.getGhost());
		g1.getETypeArguments().add(g2);
		ghostDirectionPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGhostProperty());
		g2 = createEGenericType(thePacmanPackage.getGhost());
		g1.getETypeArguments().add(g2);
		ghostCurrentTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getSingleReferenceProperty());
		g2 = createEGenericType(this.getTileProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getTile());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getGhost());
		g1.getETypeArguments().add(g2);
		ghostCurrentTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGhostProperty());
		g2 = createEGenericType(thePacmanPackage.getGhost());
		g1.getETypeArguments().add(g2);
		ghostNextTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getSingleReferenceProperty());
		g2 = createEGenericType(this.getTileProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getTile());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getGhost());
		g1.getETypeArguments().add(g2);
		ghostNextTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGhostProperty());
		g2 = createEGenericType(thePacmanPackage.getGhost());
		g1.getETypeArguments().add(g2);
		ghostNamePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getStringAttributeProperty());
		g2 = createEGenericType(thePacmanPackage.getGhost());
		g1.getETypeArguments().add(g2);
		ghostNamePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGhostProperty());
		g2 = createEGenericType(thePacmanPackage.getGhost());
		g1.getETypeArguments().add(g2);
		ghostPersonnalityPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGhostProperty());
		g2 = createEGenericType(thePacmanPackage.getGhost());
		g1.getETypeArguments().add(g2);
		ghostTargetTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getSingleReferenceProperty());
		g2 = createEGenericType(this.getTileProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(thePacmanPackage.getTile());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(thePacmanPackage.getGhost());
		g1.getETypeArguments().add(g2);
		ghostTargetTilePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getNextProperty());
		g2 = createEGenericType(this.getXPacmanAbstractProperty());
		g1.getETypeArguments().add(g2);
		xPacmanNextPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanTemporalProperty());
		xPacmanNextPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getUntilProperty());
		g2 = createEGenericType(this.getXPacmanAbstractProperty());
		g1.getETypeArguments().add(g2);
		xPacmanUntilPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanTemporalProperty());
		xPacmanUntilPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getReleaseProperty());
		g2 = createEGenericType(this.getXPacmanAbstractProperty());
		g1.getETypeArguments().add(g2);
		xPacmanReleasePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanTemporalProperty());
		xPacmanReleasePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getNegationTemporalProperty());
		g2 = createEGenericType(this.getXPacmanTemporalProperty());
		g1.getETypeArguments().add(g2);
		xPacmanNegationTemporalPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXPacmanTemporalProperty());
		xPacmanNegationTemporalPropertyEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(pacmanEnterNextTilePropertyEClass, PacmanEnterNextTileProperty.class, "PacmanEnterNextTileProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(pacmanEnterNextTilePropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ghostEnterNextTilePropertyEClass, GhostEnterNextTileProperty.class, "GhostEnterNextTileProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(ghostEnterNextTilePropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityChangeDirectionPropertyEClass, EntityChangeDirectionProperty.class, "EntityChangeDirectionProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(entityChangeDirectionPropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pacmanLeftPropertyEClass, PacmanLeftProperty.class, "PacmanLeftProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(pacmanLeftPropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pacmanRightPropertyEClass, PacmanRightProperty.class, "PacmanRightProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(pacmanRightPropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pacmanEatPelletPropertyEClass, PacmanEatPelletProperty.class, "PacmanEatPelletProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(pacmanEatPelletPropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pacmanUpPropertyEClass, PacmanUpProperty.class, "PacmanUpProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(pacmanUpPropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pacmanInitializePropertyEClass, PacmanInitializeProperty.class, "PacmanInitializeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(pacmanInitializePropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityModifySpeedPropertyEClass, EntityModifySpeedProperty.class, "EntityModifySpeedProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(entityModifySpeedPropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(boardInitializeModelPropertyEClass, BoardInitializeModelProperty.class, "BoardInitializeModelProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(boardInitializeModelPropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityInitializePropertyEClass, EntityInitializeProperty.class, "EntityInitializeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(entityInitializePropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pacmanChangeDirectionPropertyEClass, PacmanChangeDirectionProperty.class, "PacmanChangeDirectionProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(pacmanChangeDirectionPropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityUpdatePropertyEClass, EntityUpdateProperty.class, "EntityUpdateProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(entityUpdatePropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(boardResetPropertyEClass, BoardResetProperty.class, "BoardResetProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(boardResetPropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pacmanDownPropertyEClass, PacmanDownProperty.class, "PacmanDownProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(pacmanDownPropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityEnterNextTilePropertyEClass, EntityEnterNextTileProperty.class, "EntityEnterNextTileProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(entityEnterNextTilePropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pacmanKillPropertyEClass, PacmanKillProperty.class, "PacmanKillProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(pacmanKillPropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(boardUpdatePropertyEClass, BoardUpdateProperty.class, "BoardUpdateProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(boardUpdatePropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ghostChangeTargetTilePropertyEClass, GhostChangeTargetTileProperty.class, "GhostChangeTargetTileProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(ghostChangeTargetTilePropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xPacmanAbstractPropertyEClass, XPacmanAbstractProperty.class, "XPacmanAbstractProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xPacmanTemporalPropertyEClass, XPacmanTemporalProperty.class, "XPacmanTemporalProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xPacmanPropertyEClass, XPacmanProperty.class, "XPacmanProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xPacmanStatePropertyEClass, XPacmanStateProperty.class, "XPacmanStateProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xPacmanStepPropertyEClass, XPacmanStepProperty.class, "XPacmanStepProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tilePropertyEClass, TileProperty.class, "TileProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryTilePropertyEClass, UnaryTileProperty.class, "UnaryTileProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryTilePropertyEClass, BinaryTileProperty.class, "BinaryTileProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tileTopPropertyEClass, TileTopProperty.class, "TileTopProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(tileTopPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tileRightPropertyEClass, TileRightProperty.class, "TileRightProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(tileRightPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tileBottomPropertyEClass, TileBottomProperty.class, "TileBottomProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(tileBottomPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tileLeftPropertyEClass, TileLeftProperty.class, "TileLeftProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(tileLeftPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tileXPropertyEClass, TileXProperty.class, "TileXProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(tileXPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tileYPropertyEClass, TileYProperty.class, "TileYProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(tileYPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tilePassablePropertyEClass, TilePassableProperty.class, "TilePassableProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(tilePassablePropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tileInitialPelletPropertyEClass, TileInitialPelletProperty.class, "TileInitialPelletProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(tileInitialPelletPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tileHasPelletPropertyEClass, TileHasPelletProperty.class, "TileHasPelletProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(tileHasPelletPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(boardPropertyEClass, BoardProperty.class, "BoardProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryBoardPropertyEClass, UnaryBoardProperty.class, "UnaryBoardProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryBoardPropertyEClass, BinaryBoardProperty.class, "BinaryBoardProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tileBoardContainerPropertyEClass, TileBoardContainerProperty.class, "TileBoardContainerProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(tileBoardContainerPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(boardTilesPropertyEClass, BoardTilesProperty.class, "BoardTilesProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(boardTilesPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityBoardContainerPropertyEClass, EntityBoardContainerProperty.class, "EntityBoardContainerProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(entityBoardContainerPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityPropertyEClass, EntityProperty.class, "EntityProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryEntityPropertyEClass, UnaryEntityProperty.class, "UnaryEntityProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryEntityPropertyEClass, BinaryEntityProperty.class, "BinaryEntityProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityInitialTilePropertyEClass, EntityInitialTileProperty.class, "EntityInitialTileProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(entityInitialTilePropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entitySpeedPropertyEClass, EntitySpeedProperty.class, "EntitySpeedProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(entitySpeedPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityDirectionPropertyEClass, EntityDirectionProperty.class, "EntityDirectionProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(entityDirectionPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityCurrentTilePropertyEClass, EntityCurrentTileProperty.class, "EntityCurrentTileProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(entityCurrentTilePropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityNextTilePropertyEClass, EntityNextTileProperty.class, "EntityNextTileProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(entityNextTilePropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(boardEntitiesPropertyEClass, BoardEntitiesProperty.class, "BoardEntitiesProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(boardEntitiesPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pacmanPropertyEClass, PacmanProperty.class, "PacmanProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryPacmanPropertyEClass, UnaryPacmanProperty.class, "UnaryPacmanProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryPacmanPropertyEClass, BinaryPacmanProperty.class, "BinaryPacmanProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pacmanInitialTilePropertyEClass, PacmanInitialTileProperty.class, "PacmanInitialTileProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(pacmanInitialTilePropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pacmanSpeedPropertyEClass, PacmanSpeedProperty.class, "PacmanSpeedProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(pacmanSpeedPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pacmanDirectionPropertyEClass, PacmanDirectionProperty.class, "PacmanDirectionProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(pacmanDirectionPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pacmanCurrentTilePropertyEClass, PacmanCurrentTileProperty.class, "PacmanCurrentTileProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(pacmanCurrentTilePropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pacmanNextTilePropertyEClass, PacmanNextTileProperty.class, "PacmanNextTileProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(pacmanNextTilePropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pacmanInitialLivesPropertyEClass, PacmanInitialLivesProperty.class, "PacmanInitialLivesProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(pacmanInitialLivesPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pacmanPelletsEatenPropertyEClass, PacmanPelletsEatenProperty.class, "PacmanPelletsEatenProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(pacmanPelletsEatenPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pacmanLivesPropertyEClass, PacmanLivesProperty.class, "PacmanLivesProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(pacmanLivesPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ghostPropertyEClass, GhostProperty.class, "GhostProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryGhostPropertyEClass, UnaryGhostProperty.class, "UnaryGhostProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryGhostPropertyEClass, BinaryGhostProperty.class, "BinaryGhostProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ghostInitialTilePropertyEClass, GhostInitialTileProperty.class, "GhostInitialTileProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(ghostInitialTilePropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ghostSpeedPropertyEClass, GhostSpeedProperty.class, "GhostSpeedProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(ghostSpeedPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ghostDirectionPropertyEClass, GhostDirectionProperty.class, "GhostDirectionProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(ghostDirectionPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ghostCurrentTilePropertyEClass, GhostCurrentTileProperty.class, "GhostCurrentTileProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(ghostCurrentTilePropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ghostNextTilePropertyEClass, GhostNextTileProperty.class, "GhostNextTileProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(ghostNextTilePropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ghostNamePropertyEClass, GhostNameProperty.class, "GhostNameProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(ghostNamePropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ghostPersonnalityPropertyEClass, GhostPersonnalityProperty.class, "GhostPersonnalityProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(ghostPersonnalityPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ghostTargetTilePropertyEClass, GhostTargetTileProperty.class, "GhostTargetTileProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(ghostTargetTilePropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xPacmanNextPropertyEClass, XPacmanNextProperty.class, "XPacmanNextProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xPacmanUntilPropertyEClass, XPacmanUntilProperty.class, "XPacmanUntilProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xPacmanReleasePropertyEClass, XPacmanReleaseProperty.class, "XPacmanReleaseProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xPacmanNegationTemporalPropertyEClass, XPacmanNegationTemporalProperty.class, "XPacmanNegationTemporalProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //XPacmanPropertyPackageImpl
