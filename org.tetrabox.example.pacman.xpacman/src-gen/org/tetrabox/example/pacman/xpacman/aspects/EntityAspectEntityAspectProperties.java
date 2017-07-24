package org.tetrabox.example.pacman.xpacman.aspects;

import org.tetrabox.example.pacman.xpacman.pacman.Tile;

@SuppressWarnings("all")
public class EntityAspectEntityAspectProperties {
  public int speed = 100;
  
  public int direction = 0;
  
  public Tile currentTile;
  
  public Tile nextTile;
  
  public final int baseMoveTime = 500000000;
  
  public int moveProgress = 0;
}
