package org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory;
import org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Board;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost;
import org.tetrabox.example.pacman.xpacmanmt.pacman.GhostHouseTile;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Pacman;
import org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanFactory;
import org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage;
import org.tetrabox.example.pacman.xpacmanmt.pacman.PassableTile;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Pellet;
import org.tetrabox.example.pacman.xpacmanmt.pacman.SuperPellet;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Tile;
import org.tetrabox.example.pacman.xpacmanmt.pacman.WallTile;

@SuppressWarnings("all")
public class PacmanFactoryAdapter extends EFactoryImpl implements PacmanFactory {
  private XPacmanMTAdaptersFactory adaptersFactory = org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory.getInstance();
  
  private org.tetrabox.example.pacman.xpacman.pacman.PacmanFactory pacmanAdaptee = org.tetrabox.example.pacman.xpacman.pacman.PacmanFactory.eINSTANCE;
  
  @Override
  public AbstractTile createAbstractTile() {
    return adaptersFactory.createAbstractTileAdapter(pacmanAdaptee.createAbstractTile(), null);
  }
  
  @Override
  public Board createBoard() {
    return adaptersFactory.createBoardAdapter(pacmanAdaptee.createBoard(), null);
  }
  
  @Override
  public Pacman createPacman() {
    return adaptersFactory.createPacmanAdapter(pacmanAdaptee.createPacman(), null);
  }
  
  @Override
  public Ghost createGhost() {
    return adaptersFactory.createGhostAdapter(pacmanAdaptee.createGhost(), null);
  }
  
  @Override
  public PassableTile createPassableTile() {
    return adaptersFactory.createPassableTileAdapter(pacmanAdaptee.createPassableTile(), null);
  }
  
  @Override
  public Tile createTile() {
    return adaptersFactory.createTileAdapter(pacmanAdaptee.createTile(), null);
  }
  
  @Override
  public GhostHouseTile createGhostHouseTile() {
    return adaptersFactory.createGhostHouseTileAdapter(pacmanAdaptee.createGhostHouseTile(), null);
  }
  
  @Override
  public WallTile createWallTile() {
    return adaptersFactory.createWallTileAdapter(pacmanAdaptee.createWallTile(), null);
  }
  
  @Override
  public Pellet createPellet() {
    return adaptersFactory.createPelletAdapter(pacmanAdaptee.createPellet(), null);
  }
  
  @Override
  public SuperPellet createSuperPellet() {
    return adaptersFactory.createSuperPelletAdapter(pacmanAdaptee.createSuperPellet(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getPacmanPackage();
  }
  
  public PacmanPackage getPacmanPackage() {
    return org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.eINSTANCE;
  }
}
