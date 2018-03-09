package org.tetrabox.example.pacman.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gemoc.executionframework.event.manager.EventManager;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.tetrabox.example.pacman.xpacman.event.xpacmanevent.PacmanEvent;
import org.tetrabox.example.pacman.xpacman.event.xpacmanevent.XPacmanDSLEvent;
import org.tetrabox.example.pacman.xpacman.event.xpacmanevent.XpacmaneventFactory;
import org.tetrabox.example.pacman.xpacman.event.xpacmanevent.XpacmaneventPackage;
import org.tetrabox.example.pacman.xpacman.pacman.Board;
import org.tetrabox.example.pacman.xpacman.pacman.Entity;
import org.tetrabox.example.pacman.xpacman.pacman.Ghost;
import org.tetrabox.example.pacman.xpacman.pacman.Pacman;
import org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage;
import org.tetrabox.example.pacman.xpacman.pacman.Pellet;
import org.tetrabox.example.pacman.xpacman.pacman.Tile;
import org.tetrabox.example.pacman.xpacman.pacman.WallTile;

import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class PacManRenderer extends Pane implements IEngineAddon, KeyListener {

	private static final int tileSize = 20;

	private Board board;

	private XpacmaneventFactory eventFactory = XpacmaneventFactory.eINSTANCE;

	private EventManager eventInterpreter;

	private List<Rectangle> tiles = new ArrayList<>();
	private Map<Tile, Circle> tileToPellet = new HashMap<>();
	private Map<Entity, ImageView> entityToView = new HashMap<>();

	private Image frightened = new Image("frightened.png");
	private Image blue = new Image("blue.png");
	private Image orange = new Image("orange.png");
	private Image pink = new Image("pink.png");
	private Image red = new Image("red.png");
	private Image pacman = new Image("pacman.png");

	public PacManRenderer(Board board) {
		this.board = board;
	}

	@Override
	public void aboutToExecuteStep(IExecutionEngine engine, Step<?> stepToExecute) {
		if (eventInterpreter == null)
			eventInterpreter = engine.getAddonsTypedBy(EventManager.class).stream().findFirst().orElse(null);
		Platform.runLater(() -> update());
	}

	public void initialize() {
		board.getTiles().forEach(t -> {
			final int x = t.getX();
			final int y = t.getY();
			final Rectangle r = new Rectangle(tileSize * x, tileSize * y, tileSize, tileSize);
			tiles.add(r);
			r.setFill(t instanceof WallTile ? Color.BLUE : Color.BLACK);
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
				ghostView.setFitWidth(tileSize * 1.5);
				ghostView.setFitHeight(tileSize * 1.5);
				ghostView.setX(tileSize * ghost.getInitialTile().getX() - tileSize / 3);
				ghostView.setY(tileSize * ghost.getInitialTile().getY() - tileSize / 3);
				entityToView.put(ghost, ghostView);
			} else if (e instanceof Pacman) {
				final Pacman p = (Pacman) e;
				ImageView pacmanView = new ImageView(pacman);
				pacmanView.setFitWidth(tileSize * 1.5);
				pacmanView.setFitHeight(tileSize * 1.5);
				pacmanView.setX(tileSize * p.getInitialTile().getX() - tileSize / 3);
				pacmanView.setY(tileSize * p.getInitialTile().getY() - tileSize / 3);
				pacmanView.setRotate(-90 - p.getDirection() * 90);
				entityToView.put(p, pacmanView);
			}
		});
		getChildren().addAll(tiles);
		getChildren().addAll(tileToPellet.values());
		getChildren().addAll(entityToView.values());
	}

	private void update() {
		board.getTiles().forEach(t -> {
			if (t.eClass() == PacmanPackage.Literals.TILE) {
				if (tileToPellet.containsKey(t)) {
					if (((Tile) t).getPellet() == null) {
						final Circle c = tileToPellet.remove(t);
						getChildren().remove(c);
					}
				} else {
					final Tile tile = (Tile) t;
					final Pellet p = tile.getPellet();
					if (p != null) {
						final Circle c;
						if (p.eClass() == PacmanPackage.Literals.PELLET) {
							c = new Circle(tileSize * tile.getX() + tileSize / 2, tileSize * tile.getY() + tileSize / 2 - tileSize / 16, tileSize / 8, Color.YELLOW);
							tileToPellet.put(tile, c);
						} else {
							c = new Circle(tileSize * tile.getX() + tileSize / 2, tileSize * tile.getY() + tileSize / 2 - tileSize / 8, tileSize / 4, Color.ORANGE);
							tileToPellet.put(tile, c);
						}
						tileToPellet.put(tile, c);
						getChildren().add(tiles.size(), c);
					}
				}
			}
		});
		board.getEntities().forEach(e -> {
			ImageView n = entityToView.get(e);
			if (n != null) {
				if (e.getCurrentTile() != null) {
					double x = tileSize * e.getCurrentTile().getX() - tileSize / 3;
					double y = tileSize * e.getCurrentTile().getY() - tileSize / 3;
					double tx = (e.getXMoveProgress() / 250000000.0) * tileSize;
					double ty = (e.getYMoveProgress() / 250000000.0) * tileSize;
					n.setX(x+tx);
					n.setY(y+ty);
				}
			}
			if (e instanceof Pacman) {
				n.setRotate(-90 - ((Pacman) e).getDirection() * 90);
			} else {
				final Ghost ghost = (Ghost) e;
				if (ghost.isFrightenedMode()) {
					if (n.getImage() != frightened) {
						n.setImage(frightened);
					}
				} else {
					if (n.getImage() == frightened) {
						switch (ghost.getPersonnality()) {
						case SHADOW:
							n.setImage(red);
							break;
						case SPEEDY:
							n.setImage(pink);
							break;
						case BASHFUL:
							n.setImage(blue);
							break;
						case POKEY:
							n.setImage(orange);
							break;
						}
					}
				}
			}
		});
	}

	@Override
	public void keyPressed(KeyEvent e) {
		XPacmanDSLEvent event = null;
		final Map<EStructuralFeature, Object> parameters = new HashMap<>();
		final Pacman p = board.getEntities().stream().filter(entity -> entity instanceof Pacman)
				.map(entity -> (Pacman) entity).findFirst().orElse(null);
		switch (e.keyCode) {
		case SWT.ARROW_UP:
			parameters.put(XpacmaneventPackage.Literals.PACMAN_EVENT__PACMAN, p);
			event = eventFactory.createPacmanUpEvent();
			((PacmanEvent) event).setPacman(p);
			break;
		case SWT.ARROW_LEFT:
			parameters.put(XpacmaneventPackage.Literals.PACMAN_EVENT__PACMAN, p);
			event = eventFactory.createPacmanLeftEvent();
			((PacmanEvent) event).setPacman(p);
			break;
		case SWT.ARROW_DOWN:
			parameters.put(XpacmaneventPackage.Literals.PACMAN_EVENT__PACMAN, p);
			event = eventFactory.createPacmanDownEvent();
			((PacmanEvent) event).setPacman(p);
			break;
		case SWT.ARROW_RIGHT:
			parameters.put(XpacmaneventPackage.Literals.PACMAN_EVENT__PACMAN, p);
			event = eventFactory.createPacmanRightEvent();
			((PacmanEvent) event).setPacman(p);
			break;
//		case SWT.SPACE:
//			parameters.put(XpacmaneventPackage.Literals.ENTITY_EVENT__ENTITY, p);
//			parameters.put(XpacmaneventPackage.Literals.ENTITY_MODIFY_SPEED_EVENT__SPEED, 10);
//			event = eventFactory.createEntityModifySpeedEvent();
//			((EntityEvent) event).setEntity(p);
//			break;
		}
		if (event != null) {
			eventInterpreter.queueEvent(event);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
}
