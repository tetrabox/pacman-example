package org.tetrabox.example.pacman.xpacman.aspects;

import java.util.Map;
import org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties;
import org.tetrabox.example.pacman.xpacman.pacman.Entity;

@SuppressWarnings("all")
public class EntityAspectEntityAspectContext {
  public final static EntityAspectEntityAspectContext INSTANCE = new EntityAspectEntityAspectContext();
  
  public static EntityAspectEntityAspectProperties getSelf(final Entity _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Entity, EntityAspectEntityAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.example.pacman.xpacman.pacman.Entity, org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties>();
  
  public Map<Entity, EntityAspectEntityAspectProperties> getMap() {
    return map;
  }
}
