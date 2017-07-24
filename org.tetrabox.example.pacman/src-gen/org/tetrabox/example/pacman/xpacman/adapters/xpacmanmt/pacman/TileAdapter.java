package org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory;
import org.tetrabox.example.pacman.xpacman.pacman.Tile;
import org.tetrabox.example.pacman.xpacmanmt.pacman.PelletType;

@SuppressWarnings("all")
public class TileAdapter extends EObjectAdapter<Tile> implements org.tetrabox.example.pacman.xpacmanmt.pacman.Tile {
  private XPacmanMTAdaptersFactory adaptersFactory;
  
  public TileAdapter() {
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
  public boolean isPassable() {
    return adaptee.isPassable();
  }
  
  @Override
  public void setPassable(final boolean o) {
    adaptee.setPassable(o);
  }
  
  @Override
  public PelletType getInitialPellet() {
    return org.tetrabox.example.pacman.xpacmanmt.pacman.PelletType.get(adaptee.getInitialPellet().getValue());
  }
  
  @Override
  public void setInitialPellet(final PelletType o) {
    adaptee.setInitialPellet(org.tetrabox.example.pacman.xpacman.pacman.PelletType.get(o.getValue()));
  }
  
  @Override
  public org.tetrabox.example.pacman.xpacmanmt.pacman.Tile getTop() {
    return (org.tetrabox.example.pacman.xpacmanmt.pacman.Tile) adaptersFactory.createAdapter(adaptee.getTop(), eResource);
  }
  
  @Override
  public void setTop(final org.tetrabox.example.pacman.xpacmanmt.pacman.Tile o) {
    if (o != null)
    	adaptee.setTop(((org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.TileAdapter) o).getAdaptee());
    else adaptee.setTop(null);
  }
  
  @Override
  public org.tetrabox.example.pacman.xpacmanmt.pacman.Tile getRight() {
    return (org.tetrabox.example.pacman.xpacmanmt.pacman.Tile) adaptersFactory.createAdapter(adaptee.getRight(), eResource);
  }
  
  @Override
  public void setRight(final org.tetrabox.example.pacman.xpacmanmt.pacman.Tile o) {
    if (o != null)
    	adaptee.setRight(((org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.TileAdapter) o).getAdaptee());
    else adaptee.setRight(null);
  }
  
  @Override
  public org.tetrabox.example.pacman.xpacmanmt.pacman.Tile getBottom() {
    return (org.tetrabox.example.pacman.xpacmanmt.pacman.Tile) adaptersFactory.createAdapter(adaptee.getBottom(), eResource);
  }
  
  @Override
  public void setBottom(final org.tetrabox.example.pacman.xpacmanmt.pacman.Tile o) {
    if (o != null)
    	adaptee.setBottom(((org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.TileAdapter) o).getAdaptee());
    else adaptee.setBottom(null);
  }
  
  @Override
  public org.tetrabox.example.pacman.xpacmanmt.pacman.Tile getLeft() {
    return (org.tetrabox.example.pacman.xpacmanmt.pacman.Tile) adaptersFactory.createAdapter(adaptee.getLeft(), eResource);
  }
  
  @Override
  public void setLeft(final org.tetrabox.example.pacman.xpacmanmt.pacman.Tile o) {
    if (o != null)
    	adaptee.setLeft(((org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.TileAdapter) o).getAdaptee());
    else adaptee.setLeft(null);
  }
  
  @Override
  public boolean isHasPellet() {
    return org.tetrabox.example.pacman.xpacman.aspects.TileAspect.hasPellet(adaptee);
  }
  
  @Override
  public void setHasPellet(final boolean hasPellet) {
    org.tetrabox.example.pacman.xpacman.aspects.TileAspect.hasPellet(adaptee, hasPellet
    );
  }
  
  @Override
  public void initialize() {
    org.tetrabox.example.pacman.xpacman.aspects.TileAspect.initialize(adaptee);
  }
  
  protected final static int X_EDEFAULT = 0;
  
  protected final static int Y_EDEFAULT = 0;
  
  protected final static boolean PASSABLE_EDEFAULT = false;
  
  protected final static PelletType INITIAL_PELLET_EDEFAULT = org.tetrabox.example.pacman.xpacmanmt.pacman.PelletType.NO_PELLET;
  
  protected final static boolean HAS_PELLET_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.eINSTANCE.getTile();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__TOP:
    		return getTop();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__RIGHT:
    		return getRight();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__BOTTOM:
    		return getBottom();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__LEFT:
    		return getLeft();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__X:
    		return new java.lang.Integer(getX());
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__Y:
    		return new java.lang.Integer(getY());
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__PASSABLE:
    		return isPassable() ? Boolean.TRUE : Boolean.FALSE;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__INITIAL_PELLET:
    		return getInitialPellet();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__HAS_PELLET:
    		return isHasPellet() ? Boolean.TRUE : Boolean.FALSE;
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__TOP:
    		return getTop() != null;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__RIGHT:
    		return getRight() != null;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__BOTTOM:
    		return getBottom() != null;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__LEFT:
    		return getLeft() != null;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__X:
    		return getX() != X_EDEFAULT;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__Y:
    		return getY() != Y_EDEFAULT;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__PASSABLE:
    		return isPassable() != PASSABLE_EDEFAULT;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__INITIAL_PELLET:
    		return getInitialPellet() != INITIAL_PELLET_EDEFAULT;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__HAS_PELLET:
    		return isHasPellet() != HAS_PELLET_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__TOP:
    		setTop(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.Tile)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__RIGHT:
    		setRight(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.Tile)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__BOTTOM:
    		setBottom(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.Tile)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__LEFT:
    		setLeft(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.Tile)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__X:
    		setX(((java.lang.Integer) newValue).intValue());
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__Y:
    		setY(((java.lang.Integer) newValue).intValue());
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__PASSABLE:
    		setPassable(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__INITIAL_PELLET:
    		setInitialPellet(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.PelletType)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__HAS_PELLET:
    		setHasPellet(((java.lang.Boolean) newValue).booleanValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
