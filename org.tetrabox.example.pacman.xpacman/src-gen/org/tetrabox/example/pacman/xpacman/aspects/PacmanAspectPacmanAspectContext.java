package org.tetrabox.example.pacman.xpacman.aspects;

import java.util.Map;
import org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties;
import org.tetrabox.example.pacman.xpacman.pacman.Pacman;

@SuppressWarnings("all")
public class PacmanAspectPacmanAspectContext {
  public final static PacmanAspectPacmanAspectContext INSTANCE = new PacmanAspectPacmanAspectContext();
  
  public static PacmanAspectPacmanAspectProperties getSelf(final Pacman _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Pacman, PacmanAspectPacmanAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.example.pacman.xpacman.pacman.Pacman, org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties>();
  
  public Map<Pacman, PacmanAspectPacmanAspectProperties> getMap() {
    return map;
  }
}
