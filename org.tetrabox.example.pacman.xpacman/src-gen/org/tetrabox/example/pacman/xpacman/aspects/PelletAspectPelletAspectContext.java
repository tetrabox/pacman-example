package org.tetrabox.example.pacman.xpacman.aspects;

import java.util.Map;
import org.tetrabox.example.pacman.xpacman.aspects.PelletAspectPelletAspectProperties;
import org.tetrabox.example.pacman.xpacman.pacman.Pellet;

@SuppressWarnings("all")
public class PelletAspectPelletAspectContext {
  public final static PelletAspectPelletAspectContext INSTANCE = new PelletAspectPelletAspectContext();
  
  public static PelletAspectPelletAspectProperties getSelf(final Pellet _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.example.pacman.xpacman.aspects.PelletAspectPelletAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Pellet, PelletAspectPelletAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.example.pacman.xpacman.pacman.Pellet, org.tetrabox.example.pacman.xpacman.aspects.PelletAspectPelletAspectProperties>();
  
  public Map<Pellet, PelletAspectPelletAspectProperties> getMap() {
    return map;
  }
}
