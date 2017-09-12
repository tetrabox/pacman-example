package org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory;
import org.tetrabox.example.pacman.xpacman.pacman.GhostHouseTile;
import org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile;

@SuppressWarnings("all")
public class GhostHouseTileAdapter extends EObjectAdapter<GhostHouseTile> implements org.tetrabox.example.pacman.xpacmanmt.pacman.GhostHouseTile {
  private XPacmanMTAdaptersFactory adaptersFactory;
  
  public GhostHouseTileAdapter() {
    super(org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory.getInstance();
  }
  
  @Override
  public int getX() {
    return adaptee.getX();
  }
  
  @Override
  public void setX(final int o) {
    adaptee.setX(o);
  }
  
  @Override
  public int getY() {
    return adaptee.getY();
  }
  
  @Override
  public void setY(final int o) {
    adaptee.setY(o);
  }
  
  @Override
  public AbstractTile getTop() {
    return (AbstractTile) adaptersFactory.createAdapter(adaptee.getTop(), eResource);
  }
  
  @Override
  public void setTop(final AbstractTile o) {
    if (o != null)
    	adaptee.setTop(((org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.AbstractTileAdapter) o).getAdaptee());
    else adaptee.setTop(null);
  }
  
  @Override
  public AbstractTile getRight() {
    return (AbstractTile) adaptersFactory.createAdapter(adaptee.getRight(), eResource);
  }
  
  @Override
  public void setRight(final AbstractTile o) {
    if (o != null)
    	adaptee.setRight(((org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.AbstractTileAdapter) o).getAdaptee());
    else adaptee.setRight(null);
  }
  
  @Override
  public AbstractTile getBottom() {
    return (AbstractTile) adaptersFactory.createAdapter(adaptee.getBottom(), eResource);
  }
  
  @Override
  public void setBottom(final AbstractTile o) {
    if (o != null)
    	adaptee.setBottom(((org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.AbstractTileAdapter) o).getAdaptee());
    else adaptee.setBottom(null);
  }
  
  @Override
  public AbstractTile getLeft() {
    return (AbstractTile) adaptersFactory.createAdapter(adaptee.getLeft(), eResource);
  }
  
  @Override
  public void setLeft(final AbstractTile o) {
    if (o != null)
    	adaptee.setLeft(((org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.AbstractTileAdapter) o).getAdaptee());
    else adaptee.setLeft(null);
  }
  
  @Override
  public void initialize() {
    org.tetrabox.example.pacman.xpacman.aspects.AbstractTileAspect.initialize(adaptee);
  }
  
  protected final static int X_EDEFAULT = 0;
  
  protected final static int Y_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.eINSTANCE.getGhostHouseTile();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST_HOUSE_TILE__TOP:
    		return getTop();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST_HOUSE_TILE__RIGHT:
    		return getRight();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST_HOUSE_TILE__BOTTOM:
    		return getBottom();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST_HOUSE_TILE__LEFT:
    		return getLeft();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST_HOUSE_TILE__X:
    		return new java.lang.Integer(getX());
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST_HOUSE_TILE__Y:
    		return new java.lang.Integer(getY());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST_HOUSE_TILE__TOP:
    		return getTop() != null;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST_HOUSE_TILE__RIGHT:
    		return getRight() != null;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST_HOUSE_TILE__BOTTOM:
    		return getBottom() != null;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST_HOUSE_TILE__LEFT:
    		return getLeft() != null;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST_HOUSE_TILE__X:
    		return getX() != X_EDEFAULT;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST_HOUSE_TILE__Y:
    		return getY() != Y_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST_HOUSE_TILE__TOP:
    		setTop(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST_HOUSE_TILE__RIGHT:
    		setRight(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST_HOUSE_TILE__BOTTOM:
    		setBottom(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST_HOUSE_TILE__LEFT:
    		setLeft(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST_HOUSE_TILE__X:
    		setX(((java.lang.Integer) newValue).intValue());
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST_HOUSE_TILE__Y:
    		setY(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
