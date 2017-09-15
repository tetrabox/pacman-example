package org.tetrabox.example.pacman.xpacman.aspects;

import org.tetrabox.example.pacman.xpacman.pacman.PassableTile;

@SuppressWarnings("all")
public class EntityAspectEntityAspectProperties {
  public int speed;
  
  public int direction;
  
  public PassableTile currentTile;
  
  public PassableTile nextTile;
  
  public int xMoveProgress;
  
  public int yMoveProgress;
  
  public final int baseMoveTime = 125000000;
}
