package org.tetrabox.example.pacman.xpacman.aspects;

import java.util.Map;
import org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties;
import org.tetrabox.example.pacman.xpacman.pacman.Ghost;

@SuppressWarnings("all")
public class GhostAspectGhostAspectContext {
  public final static GhostAspectGhostAspectContext INSTANCE = new GhostAspectGhostAspectContext();
  
  public static GhostAspectGhostAspectProperties getSelf(final Ghost _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Ghost, GhostAspectGhostAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.example.pacman.xpacman.pacman.Ghost, org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties>();
  
  public Map<Ghost, GhostAspectGhostAspectProperties> getMap() {
    return map;
  }
}
