package org.tetrabox.example.pacman.xpacman.aspects;

import java.util.Random;
import org.tetrabox.example.pacman.xpacman.pacman.AbstractTile;
import org.tetrabox.example.pacman.xpacman.pacman.Board;
import org.tetrabox.example.pacman.xpacman.pacman.PassableTile;
import org.tetrabox.example.pacman.xpacman.pacman.Tile;

@SuppressWarnings("all")
public class GhostAspectGhostAspectProperties {
  public AbstractTile targetTile;
  
  public boolean frightenedMode;
  
  public Board board;
  
  public PassableTile previousTile;
  
  public AbstractTile scatterTile;
  
  public boolean activated;
  
  public Tile ghostHouseExit;
  
  public boolean scatterMode;
  
  public final Random rand = new Random();
}
