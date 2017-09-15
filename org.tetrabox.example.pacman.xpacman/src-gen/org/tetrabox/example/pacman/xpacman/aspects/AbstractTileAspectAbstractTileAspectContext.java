package org.tetrabox.example.pacman.xpacman.aspects;

import java.util.Map;
import org.tetrabox.example.pacman.xpacman.aspects.AbstractTileAspectAbstractTileAspectProperties;
import org.tetrabox.example.pacman.xpacman.pacman.AbstractTile;

@SuppressWarnings("all")
public class AbstractTileAspectAbstractTileAspectContext {
  public final static AbstractTileAspectAbstractTileAspectContext INSTANCE = new AbstractTileAspectAbstractTileAspectContext();
  
  public static AbstractTileAspectAbstractTileAspectProperties getSelf(final AbstractTile _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.example.pacman.xpacman.aspects.AbstractTileAspectAbstractTileAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AbstractTile, AbstractTileAspectAbstractTileAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.example.pacman.xpacman.pacman.AbstractTile, org.tetrabox.example.pacman.xpacman.aspects.AbstractTileAspectAbstractTileAspectProperties>();
  
  public Map<AbstractTile, AbstractTileAspectAbstractTileAspectProperties> getMap() {
    return map;
  }
}
