package org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory;
import org.tetrabox.example.pacman.xpacman.pacman.Board;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Entity;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Tile;

@SuppressWarnings("all")
public class BoardAdapter extends EObjectAdapter<Board> implements org.tetrabox.example.pacman.xpacmanmt.pacman.Board {
  private XPacmanMTAdaptersFactory adaptersFactory;
  
  public BoardAdapter() {
    super(org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory.getInstance();
  }
  
  private EList<Tile> tiles_;
  
  @Override
  public EList<Tile> getTiles() {
    if (tiles_ == null)
    	tiles_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTiles(), adaptersFactory, eResource);
    return tiles_;
  }
  
  private EList<Entity> entities_;
  
  @Override
  public EList<Entity> getEntities() {
    if (entities_ == null)
    	entities_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getEntities(), adaptersFactory, eResource);
    return entities_;
  }
  
  @Override
  public void initializeModel(final org.eclipse.emf.common.util.EList<java.lang.String> args) {
    org.tetrabox.example.pacman.xpacman.aspects.BoardAspect.initializeModel(adaptee, args
    );
  }
  
  @Override
  public void reset() {
    org.tetrabox.example.pacman.xpacman.aspects.BoardAspect.reset(adaptee);
  }
  
  @Override
  public void run() {
    org.tetrabox.example.pacman.xpacman.aspects.BoardAspect.run(adaptee);
  }
  
  @Override
  public void update(final long deltaTime) {
    org.tetrabox.example.pacman.xpacman.aspects.BoardAspect.update(adaptee, deltaTime
    );
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.eINSTANCE.getBoard();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.BOARD__TILES:
    		return getTiles();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.BOARD__ENTITIES:
    		return getEntities();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.BOARD__TILES:
    		return getTiles() != null && !getTiles().isEmpty();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.BOARD__ENTITIES:
    		return getEntities() != null && !getEntities().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.BOARD__TILES:
    		getTiles().clear();
    		getTiles().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.BOARD__ENTITIES:
    		getEntities().clear();
    		getEntities().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
