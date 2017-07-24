package org.tetrabox.example.pacman.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tetrabox.example.pacman.xpacman.eventmanager.XPacmanEventManager;
import org.tetrabox.example.pacman.xpacman.pacman.Board;
import org.tetrabox.example.pacman.xpacman.pacman.Entity;
import org.tetrabox.example.pacman.xpacman.pacman.Ghost;
import org.tetrabox.example.pacman.xpacman.pacman.Pacman;
import org.tetrabox.example.pacman.xpacman.pacman.Tile;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class BoardView extends Pane {

	private Board board;

	private XPacmanEventManager eventManager;

	private List<Rectangle> tiles = new ArrayList<>();
	private Map<Tile, Circle> tileToPellet = new HashMap<>();
	private Map<Entity, ImageView> entityToView = new HashMap<>();

	private boolean initialized = false;

	private Image blue = new Image("orange.png");
	private Image orange = new Image("orange.png");
	private Image pink = new Image("pink.png");
	private Image red = new Image("red.png");
	private Image pacman = new Image("pacman.png");

	public BoardView(Board board, XPacmanEventManager eventManager) {
		this.board = board;
		this.eventManager = eventManager;
	}

	public void update() {
		if (!initialized) {
			board.getTiles().forEach(t -> {
				final Rectangle r = new Rectangle(8 * t.getX(), 8 * t.getY(), 8, 8);
				tiles.add(r);
				r.setFill(t.isPassable() ? Color.BLACK : Color.BLUE);
				switch (t.getInitialPellet()) {
				case NO_PELLET:
					break;
				case PELLET:
					tileToPellet.put(t, new Circle(8 * t.getX(), 8 * t.getY(), 1, Color.YELLOW));
					break;
				case SUPER_PELLET:
					tileToPellet.put(t, new Circle(8 * t.getX(), 8 * t.getY(), 2, Color.ORANGE));
					break;
				}
			});
			board.getEntities().forEach(e -> {
				if (e instanceof Ghost) {
					final Ghost ghost = (Ghost) e;
					ImageView ghostView = new ImageView();
					switch (ghost.getPersonnality()) {
					case SHADOW:
						ghostView.setImage(red);
						break;
					case SPEEDY:
						ghostView.setImage(pink);
						break;
					case BASHFUL:
						ghostView.setImage(blue);
						break;
					case POKEY:
						ghostView.setImage(orange);
						break;
					}
					ghostView.setFitWidth(12);
					ghostView.setFitHeight(12);
					ghostView.setTranslateX(8 * ghost.getInitialTile().getX());
					ghostView.setTranslateY(8 * ghost.getInitialTile().getY());
					entityToView.put(ghost, ghostView);
				} else if (e instanceof Pacman) {
					final Pacman p = (Pacman) e;
					int angle = 0;
					switch (p.getDirection()) {
					case 0:
						angle = 90;
						break;
					case 1:
						angle = 180;
						break;
					case 2:
						angle = 270;
						break;
					}
					ImageView pacmanView = new ImageView(pacman);
					pacmanView.setFitWidth(12);
					pacmanView.setFitHeight(12);
					pacmanView.setRotate(angle);
					pacmanView.setTranslateX(8 * p.getInitialTile().getX());
					pacmanView.setTranslateY(8 * p.getInitialTile().getY());
					entityToView.put(p, pacmanView);
				}
			});
			getChildren().addAll(tiles);
			getChildren().addAll(tileToPellet.values());
			getChildren().addAll(entityToView.values());
			initialized = true;
		}
		board.getTiles().forEach(t -> {
			if (tileToPellet.containsKey(t) && !t.isHasPellet()) {
				final Circle c = tileToPellet.remove(t);
				getChildren().remove(c);
			}
		});
		board.getEntities().forEach(e -> {
			Node n = entityToView.get(e);
			if (n != null) {
				n.setTranslateX(8 * e.getCurrentTile().getX());
				n.setTranslateY(8 * e.getCurrentTile().getY());
			}
		});
	}
}
