package org.tetrabox.example.pacman.xpacman.aspects;

import java.util.Map;
import org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectProperties;
import org.tetrabox.example.pacman.xpacman.pacman.Board;

@SuppressWarnings("all")
public class BoardAspectBoardAspectContext {
  public final static BoardAspectBoardAspectContext INSTANCE = new BoardAspectBoardAspectContext();
  
  public static BoardAspectBoardAspectProperties getSelf(final Board _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Board, BoardAspectBoardAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.example.pacman.xpacman.pacman.Board, org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectProperties>();
  
  public Map<Board, BoardAspectBoardAspectProperties> getMap() {
    return map;
  }
}
