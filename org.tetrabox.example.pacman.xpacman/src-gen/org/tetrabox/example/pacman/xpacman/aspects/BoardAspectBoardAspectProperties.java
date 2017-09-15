package org.tetrabox.example.pacman.xpacman.aspects;

@SuppressWarnings("all")
public class BoardAspectBoardAspectProperties {
  public long elapsedTime;
  
  public long previousTime;
  
  public final long targetFps = 30;
  
  public final long targetFrameRate = (1000000000l / this.targetFps);
  
  public long modeChangeTimer = 5000000000l;
  
  public boolean scatterMode = true;
  
  public long frightenedTimer = 0l;
  
  public int totalPellets;
}
