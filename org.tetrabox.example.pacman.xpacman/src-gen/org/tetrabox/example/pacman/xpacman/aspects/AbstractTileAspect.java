package org.tetrabox.example.pacman.xpacman.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.tetrabox.example.pacman.xpacman.aspects.AbstractTileAspectAbstractTileAspectProperties;
import org.tetrabox.example.pacman.xpacman.pacman.AbstractTile;

@Aspect(className = AbstractTile.class)
@SuppressWarnings("all")
public class AbstractTileAspect {
  public static void initialize(final AbstractTile _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.AbstractTileAspectAbstractTileAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.AbstractTileAspectAbstractTileAspectContext
			.getSelf(_self);
	if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.WallTile) {
		org.tetrabox.example.pacman.xpacman.aspects.AbstractTileAspect._privk3_initialize(_self_,
				(org.tetrabox.example.pacman.xpacman.pacman.WallTile) _self);
	} else if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Tile) {
		org.tetrabox.example.pacman.xpacman.aspects.TileAspect
				.initialize((org.tetrabox.example.pacman.xpacman.pacman.Tile) _self);
	} else if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.GhostHouseTile) {
		org.tetrabox.example.pacman.xpacman.aspects.AbstractTileAspect._privk3_initialize(_self_,
				(org.tetrabox.example.pacman.xpacman.pacman.GhostHouseTile) _self);
	} else if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.PassableTile) {
		org.tetrabox.example.pacman.xpacman.aspects.AbstractTileAspect._privk3_initialize(_self_,
				(org.tetrabox.example.pacman.xpacman.pacman.PassableTile) _self);
	} else if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.AbstractTile) {
		org.tetrabox.example.pacman.xpacman.aspects.AbstractTileAspect._privk3_initialize(_self_,
				(org.tetrabox.example.pacman.xpacman.pacman.AbstractTile) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  protected static void _privk3_initialize(final AbstractTileAspectAbstractTileAspectProperties _self_, final AbstractTile _self) {
  }
}
