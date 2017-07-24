package org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Board;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Pacman;
import org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanFactory;
import org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Tile;

@SuppressWarnings("all")
public class PacmanFactoryAdapter extends EFactoryImpl implements PacmanFactory {
  private XPacmanMTAdaptersFactory adaptersFactory = org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory.getInstance();
  
  private org.tetrabox.example.pacman.xpacman.pacman.PacmanFactory pacmanAdaptee = org.tetrabox.example.pacman.xpacman.pacman.PacmanFactory.eINSTANCE;
  
  @Override
  public Tile createTile() {
    return adaptersFactory.createTileAdapter(pacmanAdaptee.createTile(), null);
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
  public EPackage getEPackage() {
    return getPacmanPackage();
  }
  
  public PacmanPackage getPacmanPackage() {
    return org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.eINSTANCE;
  }
}
