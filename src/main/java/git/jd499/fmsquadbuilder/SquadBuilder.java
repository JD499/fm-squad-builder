package git.jd499.fmsquadbuilder;

import static git.jd499.fmsquadbuilder.Constants.*;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class SquadBuilder extends Application {
  private static final DropShadow shadow = Constants.SHADOW_EFFECT;
  final List<Label> playerLabels = new ArrayList<>();
  final List<ComboBox<String>> comboBoxes = new ArrayList<>();
  private final Map<Circle, List<String>> circleToPositionMap = new HashMap<>();
  private final Rectangle boundary = new Rectangle();
  private final Map<String, List<String>> positionToRolesMap =
      new HashMap<>() {
        {
          put(
              "ST (C)",
              Arrays.asList(
                  "DEEP_LYING_FORWARD_SUPPORT",
                  "DEEP_LYING_FORWARD_ATTACK",
                  "ADVANCED_FORWARD_ATTACK",
                  "TARGET_FORWARD_SUPPORT",
                  "TARGET_FORWARD_ATTACK",
                  "POACHER_ATTACK",
                  "COMPLETE_FORWARD_SUPPORT",
                  "COMPLETE_FORWARD_ATTACK",
                  "PRESSING_FORWARD_DEFEND",
                  "PRESSING_FORWARD_SUPPORT",
                  "PRESSING_FORWARD_ATTACK",
                  "TREQUARTISTA_ATTACK",
                  "FALSE_NINE_SUPPORT"));
          put(
              "AM (C)",
              Arrays.asList(
                  "ATTACKING_MIDFIELDER_SUPPORT",
                  "ATTACKING_MIDFIELDER_ATTACK",
                  "ADVANCED_PLAYMAKER_SUPPORT",
                  "ADVANCED_PLAYMAKER_ATTACK",
                  "ENGANCHE_SUPPORT",
                  "SHADOW_STRIKER_ATTACK"));
          put(
              "AM (L)",
              Arrays.asList(
                  "WINGER_SUPPORT",
                  "WINGER_ATTACK",
                  "INSIDE_FORWARD_SUPPORT",
                  "INSIDE_FORWARD_ATTACK",
                  "WIDE_TARGET_FORWARD_SUPPORT",
                  "WIDE_TARGET_FORWARD_ATTACK",
                  "RAMDEUTER_ATTACK",
                  "INVERTED_WINGER_SUPPORT",
                  "INVERTED_WINGER_ATTACK"));
          put(
              "AM (R)",
              Arrays.asList(
                  "WINGER_SUPPORT",
                  "WINGER_ATTACK",
                  "INSIDE_FORWARD_SUPPORT",
                  "INSIDE_FORWARD_ATTACK",
                  "WIDE_TARGET_FORWARD_SUPPORT",
                  "WIDE_TARGET_FORWARD_ATTACK",
                  "RAMDEUTER_ATTACK",
                  "INVERTED_WINGER_SUPPORT",
                  "INVERTED_WINGER_ATTACK"));
          put(
              "M (C)",
              Arrays.asList(
                  "CENTRAL_MIDFIELDER_DEFEND",
                  "CENTRAL_MIDFIELDER_SUPPORT",
                  "CENTRAL_MIDFIELDER_ATTACK",
                  "CENTRAL_MIDFIELDER_AUTOMATIC",
                  "DEEP_LYING_PLAYMAKER_DEFEND",
                  "DEEP_LYING_PLAYMAKER_SUPPORT",
                  "BOX_TO_BOX_MIDFIELDER_SUPPORT",
                  "BALL_WINNING_MIDFIELDER_DEFEND",
                  "BALL_WINNING_MIDFIELDER_SUPPORT",
                  "ROAMING_PLAYMAKER_SUPPORT",
                  "MEZZALA_SUPPORT",
                  "MEZZALA_ATTACK",
                  "CARRILERO_SUPPORT"));
          put(
              "M (L)",
              Arrays.asList(
                  "WIDE_MIDFIELDER_DEFEND",
                  "WIDE_MIDFIELDER_SUPPORT",
                  "WIDE_MIDFIELDER_ATTACK",
                  "WIDE_MIDFIELDER_AUTOMATIC",
                  "WINGER_SUPPORT",
                  "WINGER_ATTACK",
                  "DEFENSIVE_WINGER_DEFEND",
                  "DEFENSIVE_WINGER_SUPPORT",
                  "WIDE_PLAYMAKER_SUPPORT",
                  "WIDE_PLAYMAKER_ATTACK",
                  "INVERTED_WINGER_SUPPORT",
                  "INVERTED_WINGER_ATTACK"));
          put(
              "M (R)",
              Arrays.asList(
                  "WIDE_MIDFIELDER_DEFEND",
                  "WIDE_MIDFIELDER_SUPPORT",
                  "WIDE_MIDFIELDER_ATTACK",
                  "WIDE_MIDFIELDER_AUTOMATIC",
                  "WINGER_SUPPORT",
                  "WINGER_ATTACK",
                  "DEFENSIVE_WINGER_DEFEND",
                  "DEFENSIVE_WINGER_SUPPORT",
                  "WIDE_PLAYMAKER_SUPPORT",
                  "WIDE_PLAYMAKER_ATTACK",
                  "INVERTED_WINGER_SUPPORT",
                  "INVERTED_WINGER_ATTACK"));
          put(
              "DM",
              Arrays.asList(
                  "DEFENSIVE_MIDFIELDER_DEFEND",
                  "DEFENSIVE_MIDFIELDER_SUPPORT",
                  "DEEP_LYING_PLAYMAKER_DEFEND",
                  "DEEP_LYING_PLAYMAKER_SUPPORT",
                  "BALL_WINNING_MIDFIELDER_DEFEND",
                  "BALL_WINNING_MIDFIELDER_SUPPORT",
                  "ANCHOR_DEFEND",
                  "HALF_BACK_DEFEND",
                  "REGISTA_SUPPORT",
                  "SEGUNDO_VOLANTE_SUPPORT",
                  "SEGUNDO_VOLANTE_ATTACK"));
          put(
              "WB (L)",
              Arrays.asList(
                  "WING_BACK_DEFEND",
                  "WING_BACK_SUPPORT",
                  "WING_BACK_ATTACK",
                  "WING_BACK_AUTOMATIC",
                  "COMPLETE_WING_BACK_SUPPORT",
                  "COMPLETE_WING_BACK_ATTACK",
                  "INVERTED_WING_BACK_DEFEND",
                  "INVERTED_WING_BACK_SUPPORT",
                  "INVERTED_WING_BACK_ATTACK",
                  "INVERTED_WING_BACK_AUTOMATIC"));
          put(
              "WB (R)",
              Arrays.asList(
                  "WING_BACK_DEFEND",
                  "WING_BACK_SUPPORT",
                  "WING_BACK_ATTACK",
                  "WING_BACK_AUTOMATIC",
                  "COMPLETE_WING_BACK_SUPPORT",
                  "COMPLETE_WING_BACK_ATTACK",
                  "INVERTED_WING_BACK_DEFEND",
                  "INVERTED_WING_BACK_SUPPORT",
                  "INVERTED_WING_BACK_ATTACK",
                  "INVERTED_WING_BACK_AUTOMATIC"));
          put(
              "D (C)",
              Arrays.asList(
                  "CENTRAL_DEFENDER_DEFEND",
                  "CENTRAL_DEFENDER_STOPPER",
                  "CENTRAL_DEFENDER_COVER",
                  "LIBERO_SUPPORT",
                  "LIBERO_ATTACK",
                  "BALL_PLAYING_DEFENDER_DEFEND",
                  "BALL_PLAYING_DEFENDER_STOPPER",
                  "NO_NONSENSE_CENTRE_BACK_COVER",
                  "NO_NONSENSE_CENTRE_BACK_DEFEND",
                  "NO_NONSENSE_CENTRE_BACK_STOPPER",
                  "NO_NONSENSE_CENTRE_BACK_COVER",
                  "WIDE_CENTER_BACK_DEFEND",
                  "WIDE_CENTER_BACK_SUPPORT",
                  "WIDE_CENTER_BACK_ATTACK"));
          put(
              "D (L)",
              Arrays.asList(
                  "FULL_BACK_DEFEND",
                  "FULL_BACK_SUPPORT",
                  "FULL_BACK_ATTACK",
                  "FULL_BACK_AUTOMATIC",
                  "WING_BACK_DEFEND",
                  "WING_BACK_SUPPORT",
                  "WING_BACK_ATTACK",
                  "WING_BACK_AUTOMATIC",
                  "NO_NONSENSE_FULL_BACK_DEFEND",
                  "INVERTED_WING_BACK_DEFEND",
                  "INVERTED_WING_BACK_SUPPORT",
                  "INVERTED_WING_BACK_ATTACK",
                  "INVERTED_WING_BACK_AUTOMATIC"));
          put(
              "D (R)",
              Arrays.asList(
                  "FULL_BACK_DEFEND",
                  "FULL_BACK_SUPPORT",
                  "FULL_BACK_ATTACK",
                  "FULL_BACK_AUTOMATIC",
                  "WING_BACK_DEFEND",
                  "WING_BACK_SUPPORT",
                  "WING_BACK_ATTACK",
                  "WING_BACK_AUTOMATIC",
                  "NO_NONSENSE_FULL_BACK_DEFEND",
                  "INVERTED_WING_BACK_DEFEND",
                  "INVERTED_WING_BACK_SUPPORT",
                  "INVERTED_WING_BACK_ATTACK",
                  "INVERTED_WING_BACK_AUTOMATIC"));
          put(
              "GK",
              Arrays.asList(
                  "GOALKEEPER_DEFEND",
                  "SWEEPER_KEEPER_DEFEND",
                  "SWEEPER_KEEPER_SUPPORT",
                  "SWEEPER_KEEPER_ATTACK"));
        }
      };
  private final PlayerAbilityCalculator abilityCalculator = new PlayerAbilityCalculator();
  private int blueCirclesCount = 0;
  private int playerCircleCount = 0;
  private List<Player> players; // List of players loaded from the CSV or other data source

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
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
    Button myButton = createStyledButton(event -> onFileChooserButtonClick());
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
    button.setEffect(shadow);
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
    double[][] playerCirclePositions = {
      {0.42, 0.2},
      {0.5, 0.2},
      {0.58, 0.2}, // Strikers
      {0.42, 0.35},
      {0.5, 0.35},
      {0.58, 0.35}, // Attacking Midfielders
      {0.1, 0.35},
      {0.9, 0.35},
      {0.1, 0.5},
      {0.9, 0.5}, // Wing Midfielders
      {0.42, 0.5},
      {0.5, 0.5},
      {0.58, 0.5}, // Central Midfielders
      {0.42, 0.65},
      {0.5, 0.65},
      {0.58, 0.65}, // Defensive Midfielders
      {0.1, 0.65},
      {0.9, 0.65},
      {0.1, 0.8},
      {0.9, 0.8}, // Wingbacks
      {0.42, 0.8},
      {0.5, 0.8},
      {0.58, 0.8}, // Defensive Centers
      {0.5, 0.9} // Goalkeeper
    };

    List<List<String>> playerPositions =
        Arrays.asList(
            List.of("ST (C)"),
            List.of("ST (C)"),
            List.of("ST (C)"), // Strikers
            Arrays.asList("AM (RLC)", "AM (LC)", "AM (RC)", "AM (C)"),
            Arrays.asList("AM (RLC)", "AM (LC)", "AM (RC)", "AM (C)"),
            Arrays.asList("AM (RLC)", "AM (LC)", "AM (RC)", "AM (C)"), // Attacking Midfielders
            Arrays.asList("AM (RLC)", "AM (LC)", "AM (L)", "M/AM (L)"), // Wing Midfielders (AML)
            Arrays.asList("AM (RLC)", "AM (RC)", "AM (R)", "M/AM (R)"), // Wing Midfielders (AMR)
            Arrays.asList("M (L)", "M/AM (L)"), // Central Midfielders (WML)
            Arrays.asList("M (R)", "M/AM (R)"), // Central Midfielders (WMR)
            Arrays.asList("M (C)", "M (RC)", "M (LC)", "M/AM"),
            Arrays.asList("M (C)", "M (RC)", "M (LC)", "M/AM"),
            Arrays.asList("M (C)", "M (RC)", "M (LC)", "M/AM"), // Central Midfielders (CM)
            List.of("DM"),
            List.of("DM"),
            List.of("DM"), // Defensive Midfielders
            List.of("WB (L)"), // Wingback left
            List.of("WB (R)"), // Wingback right
            Arrays.asList("D (L)", "D (RL)", "D (RLC)"), // Wingbacks (DWL)
            Arrays.asList("D (R)", "D (RL)", "D (RLC)"), // Wingbacks (DWR)
            List.of("D (C)"),
            List.of("D (C)"),
            List.of("D (C)"), // Defensive Centers
            List.of("GK") // Goalkeeper
            );

    for (int i = 0; i < playerCirclePositions.length; i++) {
      double[] position = playerCirclePositions[i];
      Circle player = createPlayerCircle();
      bindCircleToPosition(player, position);
      pane.getChildren().add(player);

      // Adjust the roles in the map
      circleToPositionMap.put(player, playerPositions.get(i));
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
    circle.setId("circle_" + playerCircleCount);

    List<String> rolesForCircle = Collections.singletonList("Role_" + playerCircleCount);
    System.out.println(
        "Created circle with ID: " + circle.getId() + " and roles: " + rolesForCircle);
    circleToPositionMap.put(circle, rolesForCircle);

    playerCircleCount++;

    circle.setOnMouseClicked(event -> handlePlayerCircleClick(circle));

    return circle;
  }

  private void configureSelectionArea(GridPane root) {
    Pane area3 = createPaneWithBackground();

    configureComboBoxes(area3); // Create and style ComboBoxes

    root.add(area3, 2, 0, 1, 4);

    // Add a listener to adjust ComboBox spacing when the area's height changes
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
      populateNextAvailableComboBox(circleToPositionMap.get(circle));

      // New functionality
      List<String> positions = circleToPositionMap.get(circle);
      List<Player> playersForPosition =
          players.stream()
              .filter(
                  player -> {
                    String[] playerPositions = player.getBasicInfo().position().split(",\\s*");
                    for (String pos : playerPositions) {
                      if (positions.contains(pos)
                          || positions.contains(player.getBasicInfo().secondaryPosition())) {
                        return true;
                      }
                    }
                    return false;
                  })
              .collect(Collectors.toList());

      System.out.println("Checking for positions: " + positions);
      System.out.println("Number of players found: " + playersForPosition.size());
      displayPlayersForPosition(playersForPosition, String.join("/", positions));

    } else if (currentColor.equals(Color.web(BLUE_COLOR))) {
      System.out.println("Circle was BLUE_COLOR. Now turning it DARK_COLOR.");
      circle.setFill(Color.web(DARK_COLOR));
      blueCirclesCount--;
      resetAllComboBoxes();
      repopulateComboBoxesForSelectedCircles();

      // If you have a label associated with this circle, you can also reset it here:
      if (blueCirclesCount < playerLabels.size()) {
        playerLabels.get(blueCirclesCount).setText("Player " + (blueCirclesCount + 1));
      }
    }
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

      comboBox.setOnAction(
          event -> {
            if (comboBox.getValue() != null) {
              displayPlayersForPosition(players, comboBox.getValue());
            }
          });

      comboBoxes.add(comboBox);
      styleComboBox(comboBox);
      container.getChildren().add(comboBox);
    }
  }

  private void populateNextAvailableComboBox(List<String> roles) {
    for (ComboBox<String> comboBox : comboBoxes) {
      if (comboBox.isDisable()) {
        System.out.println("Populating ComboBox with roles: " + roles);
        comboBox.getItems().clear();
        for (String role : roles) {
          comboBox
              .getItems()
              .addAll(positionToRolesMap.getOrDefault(role, Collections.emptyList()));
        }
        comboBox.setDisable(false); // enable the comboBox
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

    // Adjust positioning of the labels
    for (int i = 0; i < playerLabels.size(); i++) {
      Label label = playerLabels.get(i);
      label.layoutXProperty().bind(area4.widthProperty().subtract(label.widthProperty()).divide(2));
      label.setLayoutY(marginTop + i * 60);
    }
  }

  private void styleComboBox(ComboBox<String> comboBox) {
    comboBox.setStyle(COMBO_BOX_STYLE);
    comboBox.setEffect(shadow);
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

  private void displayPlayersForPosition(List<Player> playersForPosition, String position) {
    if (blueCirclesCount <= playerLabels.size()) {
      if (!playersForPosition.isEmpty()) {
        // Get the selected role from the ComboBox
        ComboBox<String> currentComboBox = comboBoxes.get(blueCirclesCount - 1);
        String selectedItem = currentComboBox.getSelectionModel().getSelectedItem();

        if (selectedItem == null) {
          playerLabels.get(blueCirclesCount - 1).setText("Role not selected for " + position);
          return;
        }

        PlayerAbilityCalculator.PlayerRole selectedRole;
        try {
          selectedRole = PlayerAbilityCalculator.PlayerRole.valueOf(selectedItem);
        } catch (IllegalArgumentException e) {
          playerLabels.get(blueCirclesCount - 1).setText("Invalid role for " + position);
          return;
        }

        // Calculate ability for each player for the selected role
        Map<Player, Double> playerAbilityMap = new HashMap<>();
        for (Player player : playersForPosition) {
          double ability = abilityCalculator.calculateAbility(player, selectedRole);
          playerAbilityMap.put(player, ability);
        }

        // Find the player with the highest ability for the selected role
        Player bestPlayer =
            playerAbilityMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        // Display the best player for the selected role
        if (bestPlayer != null) {
          playerLabels.get(blueCirclesCount - 1).setText(bestPlayer.getBasicInfo().name());
        } else {
          playerLabels
              .get(blueCirclesCount - 1)
              .setText("No Player for " + position + " in role " + selectedRole.name());
        }
      } else {
        playerLabels.get(blueCirclesCount - 1).setText("No Player for " + position);
      }
    }
  }

  protected void onFileChooserButtonClick() {
    File selectedFile = selectFile();
    if (selectedFile != null) {
      String csvFilePath = "src/main/resources/Squad.csv";
      if (convertHtmlToCsv(selectedFile.getPath(), csvFilePath)) {
        players =
            PlayerFactory.createPlayers(csvFilePath)
                .orElseThrow(() -> new RuntimeException("Could not create players"));
      }
    } else {

      System.out.println("No file selected");
    }
  }

  private File selectFile() {
    FileChooser fileChooser = new FileChooser();
    fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("HTML Files", "*.html"));

    return fileChooser.showOpenDialog(null);
  }

  private boolean convertHtmlToCsv(String htmlFilePath, String csvFilePath) {
    try {
      HtmlTableToCsv.convertHtmlTableToCsv(htmlFilePath, csvFilePath);

      return true;
    } catch (IOException e) {
      e.printStackTrace();

      return false;
    }
  }

  private void resetAllComboBoxes() {
    for (ComboBox<String> comboBox : comboBoxes) {
      comboBox.getItems().clear();
      comboBox.setDisable(true);
    }
  }

  private void repopulateComboBoxesForSelectedCircles() {
    for (Circle activeCircle : circleToPositionMap.keySet()) {
      Color circleColor = (Color) activeCircle.getFill();
      if (circleColor.equals(Color.web(BLUE_COLOR))) {
        populateNextAvailableComboBox(circleToPositionMap.get(activeCircle));
      }
    }
  }
}
