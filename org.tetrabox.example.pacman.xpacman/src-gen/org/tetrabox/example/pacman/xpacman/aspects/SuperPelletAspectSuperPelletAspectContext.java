package org.tetrabox.example.pacman.xpacman.aspects;

import java.util.Map;
import org.tetrabox.example.pacman.xpacman.aspects.SuperPelletAspectSuperPelletAspectProperties;
import org.tetrabox.example.pacman.xpacman.pacman.SuperPellet;

@SuppressWarnings("all")
public class SuperPelletAspectSuperPelletAspectContext {
  public final static SuperPelletAspectSuperPelletAspectContext INSTANCE = new SuperPelletAspectSuperPelletAspectContext();
  
  public static SuperPelletAspectSuperPelletAspectProperties getSelf(final SuperPellet _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.example.pacman.xpacman.aspects.SuperPelletAspectSuperPelletAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<SuperPellet, SuperPelletAspectSuperPelletAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.example.pacman.xpacman.pacman.SuperPellet, org.tetrabox.example.pacman.xpacman.aspects.SuperPelletAspectSuperPelletAspectProperties>();
  
  public Map<SuperPellet, SuperPelletAspectSuperPelletAspectProperties> getMap() {
    return map;
  }
}
