package git.jd499.fmsquadbuilder.presentation;


import static git.jd499.fmsquadbuilder.domain.Constants.*;
import static git.jd499.fmsquadbuilder.domain.StaticMappings.DOT_TO_SimplifiedPositions;

import git.jd499.fmsquadbuilder.data.HtmlToCsvConverter;
import git.jd499.fmsquadbuilder.domain.*;
import java.io.File;
import java.io.IOException;
import java.util.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class SquadUI {
    final List<Label> playerLabels = new ArrayList<>();
    private final List<Circle> playerCircles = new ArrayList<>();


    private final Map<String, Player> CircleToPlayerMap = new HashMap<>();

    private final Rectangle boundary = new Rectangle();
    private final List<ComboBox<String>> comboBoxes = new ArrayList<>();
    private final Map<SimplifiedPositions, List<Player>> SimplifiedPositionToPlayersMap = new HashMap<>();
    private final PlayerService playerService;
    private final Stage primaryStage;
    private int playerCircleCount;
    private int blueCirclesCount;

    public SquadUI(PlayerService playerService, Stage primaryStage) {
        this.playerService = playerService;
        this.primaryStage = primaryStage;
    }

    public void start() {
        GridPane root = initializeGridPane();
        configureButtonArea(root);
        configureSoccerFieldArea(root);
        configureSelectionArea(root);
        configurePlayerListArea(root);

        setColumnConstraints(root);
        setRowConstraints(root);

        initializeScene(primaryStage, root);
    }

    private GridPane initializeGridPane() {
        GridPane root = new GridPane();
        root.setPadding(new Insets(10, 10, 10, 10));
        root.setHgap(10);
        root.setVgap(10);
        root.setStyle("-fx-background-color: " + DARK_COLOR + ";");
        return root;
    }

    private void setColumnConstraints(GridPane root) {
        ColumnConstraints col1Constraints = new ColumnConstraints();
        col1Constraints.setPercentWidth(20);

        ColumnConstraints col2Constraints = new ColumnConstraints();
        col2Constraints.setPercentWidth(60);

        ColumnConstraints col3Constraints = new ColumnConstraints();
        col3Constraints.setPercentWidth(20);

        root.getColumnConstraints().addAll(col1Constraints, col2Constraints, col3Constraints);
    }

    private void setRowConstraints(GridPane root) {
        RowConstraints row1Constraints = new RowConstraints();
        row1Constraints.setPercentHeight(20);

        RowConstraints row2Constraints = new RowConstraints();
        row2Constraints.setPercentHeight(80);

        root.getRowConstraints().addAll(row1Constraints, row2Constraints);
    }

    private void initializeScene(Stage primaryStage, GridPane root) {
        Scene scene = new Scene(root, 920, 750);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FM Squad Builder");
        primaryStage.show();
    }

    private void configureButtonArea(GridPane root) {
        Pane area1 = createPaneWithBackground();
        Button myButton = createStyledButton(event -> {
            try {
                onFileChooserButtonClick();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        centerNodeInPane(myButton, area1);
        area1.getChildren().add(myButton);
        root.add(area1, 0, 0);
    }

    private void centerNodeInPane(Node node, Pane pane) {
        if (node instanceof Region region) {
            region
                    .layoutXProperty()
                    .bind(pane.widthProperty().subtract(region.widthProperty()).divide(2));
            region
                    .layoutYProperty()
                    .bind(pane.heightProperty().subtract(region.heightProperty()).divide(2));
        }
    }

    private Pane createPaneWithBackground() {
        Pane pane = new Pane();
        pane.setStyle(
                "-fx-background-color: " + Constants.LIGHT_COLOR + "; -fx-background-radius: 10;");
        return pane;
    }

    private Button createStyledButton(EventHandler<ActionEvent> eventHandler) {
        Button button = new Button("Upload View");
        button.setFont(new Font(FONT_SIZE));
        button.setStyle(BUTTON_STYLE);
        button.setPadding(new Insets(BUTTON_PADDING, 30, BUTTON_PADDING, 30));
        button.setEffect(SHADOW_EFFECT);
        button.setOnAction(eventHandler);
        return button;
    }

    private void configureSoccerFieldArea(GridPane root) {
        Pane area2 = createPaneWithBackground();
        createSoccerField(area2);
        root.add(area2, 1, 0, 1, 4);
    }

    private void createBoundary(Pane pane) {

        bindRectangleToPaneProportions(boundary, pane, 0.05, 0.05, 0.9, 0.9);
        boundary.setStroke(Color.web(LIGHT_COLOR));
        boundary.setFill(Color.web(LIGHT_COLOR));
        pane.getChildren().add(boundary);
    }

    private void createMidfieldLine(Pane pane) {
        Line midfieldLine = new Line();
        midfieldLine.startXProperty().bind(pane.widthProperty().multiply(0.05));
        midfieldLine.endXProperty().bind(pane.widthProperty().multiply(0.95));
        midfieldLine.startYProperty().bind(pane.heightProperty().multiply(0.5));
        midfieldLine.endYProperty().bind(midfieldLine.startYProperty());
        midfieldLine.setStroke(Color.web(DARK_COLOR));
        pane.getChildren().add(midfieldLine);
    }

    private void createGoalAreas(Pane pane) {
        createGoalArea(pane, 0.85, true);
        createGoalArea(pane, 0.95, false);
    }

    private void createGoalArea(Pane pane, double yFactor, boolean fromTop) {
        Rectangle goalArea = new Rectangle();
        bindRectangleToPaneProportions(goalArea, pane, 0.3, fromTop ? yFactor : 1 - yFactor, 0.4, 0.1);
        goalArea.setFill(Color.TRANSPARENT);
        goalArea.setStroke(Color.web(DARK_COLOR));
        pane.getChildren().add(goalArea);
    }

    private void createPenaltyAreas(Pane pane) {
        createPenaltyArea(pane, 0.75, true);
        createPenaltyArea(pane, 0.95, false);
    }

    private void createPenaltyArea(Pane pane, double yFactor, boolean fromTop) {
        Rectangle penaltyArea = new Rectangle();
        bindRectangleToPaneProportions(
                penaltyArea, pane, 0.2, fromTop ? yFactor : 1 - yFactor, 0.6, 0.2);
        penaltyArea.setFill(Color.TRANSPARENT);
        penaltyArea.setStroke(Color.web(DARK_COLOR));
        pane.getChildren().add(penaltyArea);
    }

    private void bindRectangleToPaneProportions(
            Rectangle rect,
            Pane pane,
            double xFactor,
            double yFactor,
            double widthFactor,
            double heightFactor) {
        rect.xProperty().bind(pane.widthProperty().multiply(xFactor));
        rect.yProperty().bind(pane.heightProperty().multiply(yFactor));
        rect.widthProperty().bind(pane.widthProperty().multiply(widthFactor));
        rect.heightProperty().bind(pane.heightProperty().multiply(heightFactor));
    }

    private void createCenterCircle(Pane pane) {
        Circle centerCircle = new Circle();
        centerCircle.centerXProperty().bind(pane.widthProperty().divide(2));
        centerCircle.centerYProperty().bind(pane.heightProperty().divide(2));
        centerCircle.radiusProperty().bind(pane.widthProperty().multiply(0.15));
        centerCircle.setStroke(Color.web(DARK_COLOR));
        centerCircle.setFill(Color.TRANSPARENT);
        pane.getChildren().add(centerCircle);
    }

    private void createPlayerPositions(Pane pane) {
        for (double[] playerCirclePosition : playerCirclePositions) {
            Circle playerCircle = createPlayerCircle();
            bindCircleToPosition(playerCircle, playerCirclePosition);
            pane.getChildren().add(playerCircle);
        }
    }

    private void bindCircleToPosition(Circle player, double[] position) {
        player
                .centerXProperty()
                .bind(boundary.widthProperty().multiply(position[0]).add(boundary.xProperty()));
        player
                .centerYProperty()
                .bind(boundary.heightProperty().multiply(position[1]).add(boundary.yProperty()));
    }

    private Circle createPlayerCircle() {
        Circle circle = new Circle();
        circle.radiusProperty().setValue(10);
        circle.setFill(Color.web(DARK_COLOR));
        circle.setStroke(Color.web(LIGHT_COLOR));
        circle.setId(String.valueOf(playerCircleCount));
        playerCircleCount++;
        circle.setOnMouseClicked(event -> handlePlayerCircleClick(circle));
        playerCircles.add(circle);
        return circle;
    }

    private void configureSelectionArea(GridPane root) {
        Pane area3 = createPaneWithBackground();
        configureComboBoxes(area3);
        root.add(area3, 2, 0, 1, 4);
        area3
                .heightProperty()
                .addListener((observable, oldValue, newValue) -> adjustComboBoxSpacing(comboBoxes, area3));
    }

    private void configurePlayerListArea(GridPane root) {
        Pane area4 = createPaneWithBackground();
        addPlayerLabelsToArea4(area4);
        List<String> DefaultPlayerPositions =
                Arrays.asList(
                        "Position 1",
                        "Position 2",
                        "Position 3",
                        "Position 4",
                        "Position 5",
                        "Position 6",
                        "Position 7",
                        "Position 8",
                        "Position 9",
                        "Position 10",
                        "Position 11");

        updatePlayerLabels(DefaultPlayerPositions);

        root.add(area4, 0, 1, 1, 4);
    }

    private void handlePlayerCircleClick(Circle circle) {
        Color currentColor = (Color) circle.getFill();
        if (currentColor.equals(Color.web(DARK_COLOR)) && blueCirclesCount < 11) {
            System.out.println("Circle was DARK_COLOR. Now turning it BLUE_COLOR.");
            circle.setFill(Color.web(BLUE_COLOR));
            blueCirclesCount++;
            populateNextAvailableComboBox(circle.getId());
        } else if (currentColor.equals(Color.web(BLUE_COLOR))) {
            System.out.println("Circle was BLUE_COLOR. Now turning it DARK_COLOR.");
            CircleToPlayerMap.clear();
            resetAllComboBoxes();
            resetAllPlayerLabels();
            resetAllPlayerCircles();
            blueCirclesCount = 0;
        }
    }

    private void resetAllPlayerCircles() {
        for (Circle circle : playerCircles) {
            circle.setFill(Color.web(DARK_COLOR));
        }
    }

    private void resetAllPlayerLabels() {
        List<String> DefaultPlayerPositions =
                Arrays.asList(
                        "Position 1",
                        "Position 2",
                        "Position 3",
                        "Position 4",
                        "Position 5",
                        "Position 6",
                        "Position 7",
                        "Position 8",
                        "Position 9",
                        "Position 10",
                        "Position 11");
        updatePlayerLabels(DefaultPlayerPositions);
    }

    private void adjustComboBoxSpacing(List<ComboBox<String>> comboBoxes, Pane container) {
        double comboBoxHeight = 25;
        int numberOfComboBoxes = comboBoxes.size();

        double totalComboBoxesHeight = numberOfComboBoxes * comboBoxHeight;
        double spacing = (container.getHeight() - totalComboBoxesHeight) / (numberOfComboBoxes + 1);

        double yOffset = container.getHeight() * -0.01;

        for (int i = 0; i < numberOfComboBoxes; i++) {
            ComboBox<String> comboBox = comboBoxes.get(i);
            double yPos = yOffset + spacing + (i * (comboBoxHeight + spacing));

            comboBox.setLayoutY(yPos);
        }
    }

    private void configureComboBoxes(Pane container) {
        for (int i = 0; i < 11; i++) {
            ComboBox<String> comboBox = new ComboBox<>();
            comboBox
                    .layoutXProperty()
                    .bind(container.widthProperty().subtract(comboBox.widthProperty()).divide(2));

            comboBox.maxWidthProperty().bind(container.widthProperty());
            comboBox.maxHeightProperty().bind(container.heightProperty());

            comboBox.setOnAction(
                    event -> {
                        if (comboBox.getValue() != null) {
                            displayPlayersForPosition(comboBox.getValue(), comboBox.getId());
                        }
                    });

            comboBoxes.add(comboBox);
            styleComboBox(comboBox);
            container.getChildren().add(comboBox);
        }
    }

    private void populateNextAvailableComboBox(String circleID) {
        System.out.println("Populating ComboBox for circleID: " + circleID);
        SimplifiedPositions position = DOT_TO_SimplifiedPositions.get(Integer.parseInt(circleID));
        System.out.println("Populating ComboBox for position: " + position);
        List<PlayerRole> roles = StaticMappings.SimplifiedPositions_TO_ROLES.get(position);
        System.out.println("Roles for position: " + roles);
        for (ComboBox<String> comboBox : comboBoxes) {
            if (comboBox.isDisable()) {
                System.out.println("Populating ComboBox with roles: " + roles);
                comboBox.getItems().clear();
                comboBox.setId(circleID);
                for (PlayerRole role : roles) {
                    comboBox.getItems().add(role.name());
                }
                comboBox.setDisable(false);
                break;
            }
        }
    }

    private void addPlayerLabelsToArea4(Pane area4) {
        final int marginTop = 20;
        for (int i = 0; i < 11; i++) {
            Label label = new Label("Player " + (i + 1));
            label.setStyle("-fx-text-fill: white; -fx-font-size: 16;");
            playerLabels.add(label);
            area4.getChildren().add(label);
        }
        for (int i = 0; i < playerLabels.size(); i++) {
            Label label = playerLabels.get(i);
            label.layoutXProperty().bind(area4.widthProperty().subtract(label.widthProperty()).divide(2));
            label.setLayoutY(marginTop + i * 60);
        }
    }

    private void styleComboBox(ComboBox<String> comboBox) {
        comboBox.setStyle(COMBO_BOX_STYLE);
        comboBox.setEffect(SHADOW_EFFECT);
        comboBox.setDisable(true);
    }

    private void updatePlayerLabels(List<String> names) {
        for (int i = 0; i < playerLabels.size() && i < names.size(); i++) {
            playerLabels.get(i).setText(names.get(i));
        }
    }

    private void createSoccerField(Pane pane) {
        createBoundary(pane);
        createMidfieldLine(pane);
        createCenterCircle(pane);
        createGoalAreas(pane);
        createPenaltyAreas(pane);
        createPlayerPositions(pane);
    }

    private void displayPlayersForPosition(String role, String id) {
        SimplifiedPositions position = DOT_TO_SimplifiedPositions.get(Integer.parseInt(id));
        List<Player> players = SimplifiedPositionToPlayersMap.get(position);
        Map<Player, Double> playerAbilityMap = new HashMap<>();
        System.out.println("Initialized empty playerAbilityMap.");
        if (blueCirclesCount <= playerLabels.size()) {
            System.out.println("Valid blueCirclesCount: " + blueCirclesCount);
            if (!players.isEmpty()) {
                System.out.println("Players available for position: " + role);
                ComboBox<String> currentComboBox = comboBoxes.get(blueCirclesCount - 1);
                String selectedItem = currentComboBox.getSelectionModel().getSelectedItem();
                if (selectedItem == null) {
                    System.out.println("Role not selected for position: " + role);
                    playerLabels.get(blueCirclesCount - 1).setText("Role not selected for " + role);
                    return;
                }
                try {
                    role = String.valueOf(PlayerRole.valueOf(role));
                    System.out.println("Valid role selected: " + role);
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid role for position: " + role);
                    playerLabels.get(blueCirclesCount - 1).setText("Invalid role for " + role);
                    return;
                }
                for (Player player : players) {
                        double ability = playerService.calculateAbility(player, PlayerRole.valueOf(role));
                        System.out.println("Calculated ability for player: " + player.getBasicInfo().name() + ", Ability: " + ability);
                        playerAbilityMap.put(player, ability);

                }
                Player bestPlayer = playerAbilityMap.entrySet().stream()
                        .filter(entry -> !CircleToPlayerMap.containsValue(entry.getKey()))
                        .max(Map.Entry.comparingByValue())
                        .map(Map.Entry::getKey)
                        .orElse(null);
                if (bestPlayer != null) {
                    System.out.println("Best player found: " + bestPlayer.getBasicInfo().name());
                    playerLabels.get(blueCirclesCount - 1).setText(bestPlayer.getBasicInfo().name());
                    CircleToPlayerMap.put(id, bestPlayer);
                } else {
                    System.out.println("No player available for role: " + role);
                    playerLabels.get(blueCirclesCount - 1).setText("No Player for " + role + " in role " + role);
                }
            } else {
                System.out.println("No players available for position: " + role);
                playerLabels.get(blueCirclesCount - 1).setText("N/A");
            }
        }
    }
    protected void onFileChooserButtonClick() throws IOException {
        File selectedFile = selectFile();
        if (selectedFile != null) {
            HtmlToCsvConverter.convertHtmlTableToCsv(selectedFile.getAbsolutePath());
            List<Player> players = playerService.getAllPlayers();
            SimplifiedPositionToPlayersMap.clear();
            for (Player player : players) {
                String[] primaryPositions = player.getBasicInfo().position().split(",\\s*");
                String[] secondaryPositions = player.getBasicInfo().secondaryPosition().split(",\\s*");
                populateSimplifiedPositionToPlayersMap(primaryPositions, player);
                populateSimplifiedPositionToPlayersMap(secondaryPositions, player);
            }

        } else {
            System.out.println("No file selected");
        }
    }

    private void populateSimplifiedPositionToPlayersMap(String[] positions, Player player) {
        for (String position : positions) {
            List<SimplifiedPositions> soccerPositions = StaticMappings.PLAYER_POSITION_TO_SimplifiedPositions.get(position);
            if (soccerPositions != null) {
                for (SimplifiedPositions soccerPosition : soccerPositions) {
                    SimplifiedPositionToPlayersMap.computeIfAbsent(soccerPosition, k -> new ArrayList<>()).add(player);
                }
            }
        }
    }

    private File selectFile() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("HTML Files", "*.html"));
        return fileChooser.showOpenDialog(null);
    }



    private void resetAllComboBoxes() {
        for (ComboBox<String> comboBox : comboBoxes) {
            comboBox.getItems().clear();
            comboBox.setDisable(true);
        }
    }

}
