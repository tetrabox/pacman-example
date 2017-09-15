package org.tetrabox.example.pacman.xpacman.aspects;

import java.util.Map;
import org.tetrabox.example.pacman.xpacman.aspects.TileAspectTileAspectProperties;
import org.tetrabox.example.pacman.xpacman.pacman.Tile;

@SuppressWarnings("all")
public class TileAspectTileAspectContext {
  public final static TileAspectTileAspectContext INSTANCE = new TileAspectTileAspectContext();
  
  public static TileAspectTileAspectProperties getSelf(final Tile _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.example.pacman.xpacman.aspects.TileAspectTileAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Tile, TileAspectTileAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.example.pacman.xpacman.pacman.Tile, org.tetrabox.example.pacman.xpacman.aspects.TileAspectTileAspectProperties>();
  
  public Map<Tile, TileAspectTileAspectProperties> getMap() {
    return map;
  }
}
