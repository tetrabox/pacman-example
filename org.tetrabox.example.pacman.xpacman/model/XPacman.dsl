DSL org.tetrabox.example.pacman.XPacman {
	abstract-syntax {
		ecore = "platform:/resource/org.tetrabox.example.pacman.xpacman/model/XPacman.ecore"
	}
	semantic {
		k3 = "org.tetrabox.example.pacman.xpacman.aspects.BoardAspect",
		"org.tetrabox.example.pacman.xpacman.aspects.PelletAspect",
		"org.tetrabox.example.pacman.xpacman.aspects.TileAspect",
		"org.tetrabox.example.pacman.xpacman.aspects.AbstractTileAspect",
		"org.tetrabox.example.pacman.xpacman.aspects.GhostAspect",
		"org.tetrabox.example.pacman.xpacman.aspects.EntityAspect",
		"org.tetrabox.example.pacman.xpacman.aspects.SuperPelletAspect",
		"org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect"
	}
}
