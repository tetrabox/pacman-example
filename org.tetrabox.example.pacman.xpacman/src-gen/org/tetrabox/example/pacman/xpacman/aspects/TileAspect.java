package org.tetrabox.example.pacman.xpacman.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.tetrabox.example.pacman.xpacman.aspects.TileAspectTileAspectProperties;
import org.tetrabox.example.pacman.xpacman.pacman.PelletType;
import org.tetrabox.example.pacman.xpacman.pacman.Tile;

@Aspect(className = Tile.class)
@SuppressWarnings("all")
public class TileAspect {
  public static void initialize(final Tile _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.TileAspectTileAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.TileAspectTileAspectContext
			.getSelf(_self);
	_privk3_initialize(_self_, _self);
	;
}
  
  public static boolean hasPellet(final Tile _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.TileAspectTileAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.TileAspectTileAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_hasPellet(_self_, _self);
	;
	return (boolean) result;
}
  
  public static void hasPellet(final Tile _self, final boolean hasPellet) {
	final org.tetrabox.example.pacman.xpacman.aspects.TileAspectTileAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.TileAspectTileAspectContext
			.getSelf(_self);
	_privk3_hasPellet(_self_, _self, hasPellet);
	;
}
  
  protected static void _privk3_initialize(final TileAspectTileAspectProperties _self_, final Tile _self) {
    PelletType _initialPellet = _self.getInitialPellet();
    boolean _notEquals = (!Objects.equal(_initialPellet, PelletType.NO_PELLET));
    if (_notEquals) {
      TileAspect.hasPellet(_self, true);
    }
  }
  
  protected static boolean _privk3_hasPellet(final TileAspectTileAspectProperties _self_, final Tile _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getHasPellet") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.hasPellet;
  }
  
  protected static void _privk3_hasPellet(final TileAspectTileAspectProperties _self_, final Tile _self, final boolean hasPellet) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setHasPellet")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, hasPellet);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.hasPellet = hasPellet;
    }
  }
}
