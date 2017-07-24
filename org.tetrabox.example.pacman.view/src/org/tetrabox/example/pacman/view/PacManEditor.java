package org.tetrabox.example.pacman.view;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.tetrabox.example.pacman.xpacman.pacman.Board;
import org.tetrabox.example.pacman.xpacman.pacman.Entity;
import org.tetrabox.example.pacman.xpacman.pacman.Ghost;
import org.tetrabox.example.pacman.xpacman.pacman.GhostPersonality;
import org.tetrabox.example.pacman.xpacman.pacman.Pacman;
import org.tetrabox.example.pacman.xpacman.pacman.PacmanFactory;
import org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage;
import org.tetrabox.example.pacman.xpacman.pacman.PelletType;
import org.tetrabox.example.pacman.xpacman.pacman.Tile;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class PacManEditor extends Application {

	private static final int tileSize = 20;
	
	private int width = 28;
	private int height = 36;

	private Rectangle[][] tileViews = new Rectangle[28][36];
	private Map<Tile, Circle> tileToPellet = new HashMap<>();
	private Map<Tile, Entity> tileToEntity = new HashMap<>();
	private Map<Entity, ImageView> entityToView = new HashMap<>();

	private Image blue = new Image("blue.png");
	private Image orange = new Image("orange.png");
	private Image pink = new Image("pink.png");
	private Image red = new Image("red.png");
	private Image pacman = new Image("pacman.png");

	private Tile[][] tiles = new Tile[28][36];
	private Board board = PacmanFactory.eINSTANCE.createBoard();

	@Override
	public void start(Stage primaryStage) throws Exception {

		PacmanPackage pkg = PacmanPackage.eINSTANCE;
		pkg.eClass();
		
		BorderPane root = new BorderPane();

		Pane boardPane = new Pane();
		boardPane.setPrefWidth(width * tileSize);
		boardPane.setPrefHeight(height * tileSize);

		for (int i = 0; i < 28; i++) {
			for (int j = 0; j < 36; j++) {
				final Tile tile = PacmanFactory.eINSTANCE.createTile();
				tile.setX(i);
				tile.setY(j);
				tile.setPassable(true);
				board.getTiles().add(tile);
				tiles[i][j] = tile;
				Rectangle rectangle = new Rectangle(tileSize * i, tileSize * j, tileSize, tileSize);
				rectangle.setFill(Color.BLACK);
				tileViews[i][j] = rectangle;
				boardPane.getChildren().add(rectangle);
			}
		}

		Label xSizeLabel = new Label("width");
		Label ySizeLabel = new Label("height");
		TextField xSizeField = new TextField();
		xSizeField.setText("28");
		TextField ySizeField = new TextField();
		ySizeField.setText("36");
		VBox xSizeBox = new VBox(xSizeLabel, xSizeField);
		VBox ySizeBox = new VBox(ySizeLabel, ySizeField);
		HBox sizeBox = new HBox(xSizeBox, ySizeBox);

		TextField ghostField = new TextField();
		ComboBox<Personnality> ghostComboBox = new ComboBox<Personnality>();
		ghostComboBox.getItems().addAll(Arrays.asList(Personnality.values()));
		ghostComboBox.setValue(Personnality.SHADOW);
		HBox ghostBox = new HBox(ghostField, ghostComboBox);
		ghostBox.setVisible(false);

		ToggleGroup pelletGroup = new ToggleGroup();
		ToggleButton npelletBrush = new ToggleButton("normal pellet");
		npelletBrush.setToggleGroup(pelletGroup);
		npelletBrush.setSelected(true);
		ToggleButton spelletBrush = new ToggleButton("super pellet");
		spelletBrush.setToggleGroup(pelletGroup);
		BorderPane pelletBox = new BorderPane();
		pelletBox.setLeft(npelletBrush);
		pelletBox.setRight(spelletBrush);
		pelletBox.setVisible(false);

		ToggleGroup brushGroup = new ToggleGroup();
		ToggleButton wallBrush = new ToggleButton("wall");
		wallBrush.setToggleGroup(brushGroup);
		wallBrush.setOnAction(e -> {
			ghostBox.setVisible(false);
			pelletBox.setVisible(false);
		});
		ToggleButton pacmanBrush = new ToggleButton("pacman");
		pacmanBrush.setToggleGroup(brushGroup);
		pacmanBrush.setOnAction(e -> {
			ghostBox.setVisible(false);
			pelletBox.setVisible(false);
		});
		ToggleButton ghostBrush = new ToggleButton("ghost");
		ghostBrush.setToggleGroup(brushGroup);
		ghostBrush.setOnAction(e -> {
			ghostBox.setVisible(true);
			pelletBox.setVisible(false);
		});
		ToggleButton pelletBrush = new ToggleButton("pellet");
		pelletBrush.setToggleGroup(brushGroup);
		pelletBrush.setOnAction(e -> {
			ghostBox.setVisible(false);
			pelletBox.setVisible(true);
		});
		HBox brushBox = new HBox(wallBrush, pacmanBrush, ghostBrush, pelletBrush);

		Button newButton = new Button("new");
		newButton.setOnAction(evt -> {
			tileViews = new Rectangle[28][36];
			tileToPellet = new HashMap<>();
			tileToEntity = new HashMap<>();
			entityToView = new HashMap<>();
			tiles = new Tile[28][36];
			board = PacmanFactory.eINSTANCE.createBoard();
			boardPane.getChildren().clear();
			for (int i = 0; i < 28; i++) {
				for (int j = 0; j < 36; j++) {
					final Tile tile = PacmanFactory.eINSTANCE.createTile();
					tile.setX(i);
					tile.setY(j);
					tile.setPassable(true);
					board.getTiles().add(tile);
					tiles[i][j] = tile;
					Rectangle rectangle = new Rectangle(tileSize * i, tileSize * j, tileSize, tileSize);
					rectangle.setFill(Color.BLACK);
					tileViews[i][j] = rectangle;
					boardPane.getChildren().add(rectangle);
				}
			}
		});
		Button loadButton = new Button("load");
		loadButton.setOnAction(evt -> {
			FileChooser fileChooser = new FileChooser();
			fileChooser.setTitle("Open Pac-Man Game");
			fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Pac-Man Files", "*.xpacman"));
			File selectedFile = fileChooser.showOpenDialog(primaryStage);
			if (selectedFile != null) {
				String path = selectedFile.getAbsolutePath();
				ResourceSet rs = new ResourceSetImpl();
				Resource resource = createAndAddResource(path, new String[] { "xpacman", "xml" }, rs);
				try {
					resource.load(null);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				EObject o = resource.getContents().get(0);
				
				if (o != null && o instanceof Board) {
					board = (Board) o;
					tileViews = new Rectangle[28][36];
					tileToPellet = new HashMap<>();
					tileToEntity = new HashMap<>();
					entityToView = new HashMap<>();
					tiles = new Tile[28][36];
					boardPane.getChildren().clear();
					board.getTiles().forEach(tile -> {
						int x = tile.getX();
						int y = tile.getY();
						tiles[x][y] = tile;
						Rectangle rectangle = new Rectangle(tileSize * x, tileSize * y, tileSize, tileSize);
						rectangle.setFill(tile.isPassable() ? Color.BLACK : Color.BLUE);
						tileViews[x][y] = rectangle;
						boardPane.getChildren().add(rectangle);
						
						Circle pellet = null;
						switch (tile.getInitialPellet()) {
						case PELLET:
							pellet = new Circle(tileSize * x + tileSize / 2, tileSize * y + tileSize / 2 - tileSize / 16, tileSize / 8, Color.YELLOW);
							break;
						case SUPER_PELLET:
							pellet = new Circle(tileSize * x + tileSize / 2, tileSize * y + tileSize / 2 - tileSize / 8, tileSize / 4, Color.ORANGE);
						default:
							break;
						}
						tileToPellet.put(tile, pellet);
					});
					board.getEntities().forEach(e -> {
						int x = e.getInitialTile().getX();
						int y = e.getInitialTile().getY();
						if (e instanceof Pacman) {
							ImageView pacmanView = new ImageView(pacman);
							pacmanView.setFitWidth(tileSize * 1.5);
							pacmanView.setFitHeight(tileSize * 1.5);
							pacmanView.setX(tileSize * x - tileSize / 3);
							pacmanView.setY(tileSize * y - tileSize / 3);
							tileToEntity.put(e.getInitialTile(), e);
							entityToView.put(e, pacmanView);
						} else if (e instanceof Ghost) {
							ImageView ghostView = null;
							switch (((Ghost) e).getPersonnality()) {
							case SHADOW:
								ghostView = new ImageView(red);
								break;
							case SPEEDY:
								ghostView = new ImageView(pink);
								break;
							case BASHFUL:
								ghostView = new ImageView(blue);
								break;
							case POKEY:
								ghostView = new ImageView(orange);
								break;
							}
							ghostView.setFitWidth(tileSize * 1.5);
							ghostView.setFitHeight(tileSize * 1.5);
							ghostView.setX(tileSize * x - tileSize / 3);
							ghostView.setY(tileSize * y - tileSize / 3);
							tileToEntity.put(e.getInitialTile(), e);
							entityToView.put(e, ghostView);
						}
						
					});
					boardPane.getChildren().addAll(tileToPellet.values().stream().filter(p -> p != null).collect(Collectors.toList()));
					boardPane.getChildren().addAll(entityToView.values().stream().filter(e -> e != null).collect(Collectors.toList()));
					
				}
			}
		});
		Button saveButton = new Button("save");
		saveButton.setOnAction(evt -> {
			FileChooser fileChooser = new FileChooser();
			fileChooser.setTitle("Save Pac-Man Game");
			fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Pac-Man Files", "*.xpacman"));
			File selectedFile = fileChooser.showSaveDialog(primaryStage);
			if (selectedFile != null) {
				String path = selectedFile.getAbsolutePath();
				setupAndSaveEMFInstanceResource(path);
			}
		});
		HBox fileBox = new HBox(newButton, loadButton, saveButton);

		VBox formBox = new VBox(sizeBox, brushBox, ghostBox, pelletBox, fileBox);

		root.setBottom(formBox);
		root.setCenter(boardPane);

		Tile[] lastChangedTile = new Tile[1];

		boardPane.setOnMouseDragged(evt -> {
			if (wallBrush.isSelected()) {
				double xClick = evt.getX();
				int x = (int) Math.floor(xClick / tileSize);
				double yClick = evt.getY();
				int y = (int) Math.floor(yClick / tileSize);
				Tile tile = tiles[x][y];
				if (tile != lastChangedTile[0]) {
					if (tile.isPassable()) {
						tile.setPassable(false);
						tileViews[x][y].setFill(Color.BLUE);
					} else {
						tile.setPassable(true);
						tileViews[x][y].setFill(Color.BLACK);
					}
					lastChangedTile[0] = tile;
				}
			} else if (pelletBrush.isSelected()) {
				double xClick = evt.getX();
				int x = (int) Math.floor(xClick / tileSize);
				double yClick = evt.getY();
				int y = (int) Math.floor(yClick / tileSize);
				Tile tile = tiles[x][y];
				if (tile != lastChangedTile[0]) {
					if (tile.isPassable()) {
						if (tile.getInitialPellet() != PelletType.NO_PELLET) {
							tile.setInitialPellet(PelletType.NO_PELLET);
							boardPane.getChildren().remove(tileToPellet.remove(tile));
						} else {
							Circle pellet = null;
							if (npelletBrush.isSelected()) {
								tile.setInitialPellet(PelletType.PELLET);
								pellet = new Circle(tileSize * x + tileSize / 2, tileSize * y + tileSize / 2 - tileSize / 16, tileSize / 8, Color.YELLOW);
							} else {
								tile.setInitialPellet(PelletType.SUPER_PELLET);
								pellet = new Circle(tileSize * x + tileSize / 2, tileSize * y + tileSize / 2 - tileSize / 8, tileSize / 4, Color.ORANGE);
							}
							tileToPellet.put(tile, pellet);
							boardPane.getChildren().add(pellet);
						}
						lastChangedTile[0] = tile;
					}
				}
			}
		});

		boardPane.setOnMouseDragReleased(evt -> {
			lastChangedTile[0] = null;
		});

		boardPane.setOnMouseClicked(evt -> {
			double xClick = evt.getX();
			int x = (int) Math.floor(xClick / tileSize);
			double yClick = evt.getY();
			int y = (int) Math.floor(yClick / tileSize);
			Tile tile = tiles[x][y];
			if (wallBrush.isSelected()) {
				if (tile.isPassable()) {
					tile.setPassable(false);
					tileViews[x][y].setFill(Color.BLUE);
				} else {
					tile.setPassable(true);
					tileViews[x][y].setFill(Color.BLACK);
				}
			} else if (tile.isPassable()) {
				if (pelletBrush.isSelected()) {
					if (tile.getInitialPellet() != PelletType.NO_PELLET) {
						tile.setInitialPellet(PelletType.NO_PELLET);
						boardPane.getChildren().remove(tileToPellet.remove(tile));
					} else {
						Circle pellet = null;
						if (npelletBrush.isSelected()) {
							tile.setInitialPellet(PelletType.PELLET);
							pellet = new Circle(tileSize * x + tileSize / 2, tileSize * y + tileSize / 2 - tileSize / 16, tileSize / 8, Color.YELLOW);
						} else {
							tile.setInitialPellet(PelletType.SUPER_PELLET);
							pellet = new Circle(tileSize * x + tileSize / 2, tileSize * y + tileSize / 2 - tileSize / 8, tileSize / 4, Color.ORANGE);
						}
						tileToPellet.put(tile, pellet);
						boardPane.getChildren().add(pellet);
					}
				} else if (ghostBrush.isSelected()) {
					Entity e = tileToEntity.remove(tile);
					if (e != null) {
						board.getEntities().remove(e);
						boardPane.getChildren().remove(entityToView.remove(e));
					} else {
						Ghost ghost = PacmanFactory.eINSTANCE.createGhost();
						ghost.setInitialTile(tile);
						ImageView ghostView = null;
						switch (ghostComboBox.getValue()) {
						case SHADOW:
							ghost.setPersonnality(GhostPersonality.SHADOW);
							ghostView = new ImageView(red);
							break;
						case SPEEDY:
							ghost.setPersonnality(GhostPersonality.SPEEDY);
							ghostView = new ImageView(pink);
							break;
						case BASHFUL:
							ghost.setPersonnality(GhostPersonality.BASHFUL);
							ghostView = new ImageView(blue);
							break;
						case POKEY:
							ghost.setPersonnality(GhostPersonality.POKEY);
							ghostView = new ImageView(orange);
							break;
						}
						board.getEntities().add(ghost);
						ghostView.setFitWidth(tileSize * 1.5);
						ghostView.setFitHeight(tileSize * 1.5);
						ghostView.setX(tileSize * x - tileSize / 3);
						ghostView.setY(tileSize * y - tileSize / 3);
						boardPane.getChildren().add(ghostView);
						tileToEntity.put(tile, ghost);
						entityToView.put(ghost, ghostView);
					}
				} else if (pacmanBrush.isSelected()) {
					Entity e = tileToEntity.remove(tile);
					;
					if (e != null) {
						board.getEntities().remove(e);
						boardPane.getChildren().remove(entityToView.remove(e));
					} else {
						Pacman p = PacmanFactory.eINSTANCE.createPacman();
						p.setInitialLives(3);
						p.setInitialTile(tile);
						board.getEntities().add(p);
						ImageView pacmanView = new ImageView(pacman);
						pacmanView.setFitWidth(tileSize * 1.5);
						pacmanView.setFitHeight(tileSize * 1.5);
						pacmanView.setX(tileSize * x - tileSize / 3);
						pacmanView.setY(tileSize * y - tileSize / 3);
						boardPane.getChildren().add(pacmanView);
						tileToEntity.put(tile, p);
						entityToView.put(p, pacmanView);
					}
				}
			}
		});

		Scene scene = new Scene(root, width * tileSize, height * tileSize + 200);

		primaryStage.setTitle("Pac-Man with GEMOC!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void setupAndSaveEMFInstanceResource(String path) {
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = createAndAddResource(path, new String[] { "xpacman", "xml" }, rs);
		resource.getContents().add(board);
		saveResource(resource);
	}

	public Resource createAndAddResource(String outputFile, String[] fileextensions, ResourceSet rs) {
		for (String fileext : fileextensions) {
			rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(fileext, new XMLResourceFactoryImpl());
		}
		URI uri = URI.createFileURI(outputFile);
		Resource resource = rs.createResource(uri);
		return resource;
	}

	public void saveResource(Resource resource) {
		try {
			resource.save(null);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	enum Personnality {
		SHADOW, SPEEDY, BASHFUL, POKEY
	}
}
