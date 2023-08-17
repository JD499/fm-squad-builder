package git.jd499.fmsquadbuilder;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class SquadBuilder extends Application {
    private List<Player> players;  // List of players loaded from the CSV or other data source

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);

        // Create spacer to push content to the center
        Region spacerTop = new Region();
        VBox.setVgrow(spacerTop, Priority.ALWAYS);

        // Create the "Choose File" button
        Button fileChooserButton = new Button("Choose File");
        fileChooserButton.setOnAction(event -> onFileChooserButtonClick());

        // Create the soccer field
        Pane soccerFieldPane = new Pane();
        createSoccerField(soccerFieldPane);

        // Create spacer to push content to the center
        Region spacerBottom = new Region();
        VBox.setVgrow(spacerBottom, Priority.ALWAYS);

        // Add the spacers, button, and soccer field to the root layout
        root.getChildren().addAll(spacerTop, fileChooserButton, soccerFieldPane, spacerBottom);

        Scene scene = new Scene(root, 600, 800);
        primaryStage.setTitle("Soccer Field");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void createSoccerField(Pane pane) {
        // Outer boundary
        Rectangle boundary = new Rectangle(50, 50, 500, 700);
        boundary.setFill(Color.GREEN);
        pane.getChildren().add(boundary);

        // Midfield line
        Line midfieldLine = new Line(50, 400, 550, 400);
        midfieldLine.setStroke(Color.WHITE);
        pane.getChildren().add(midfieldLine);

        // Center circle
        Circle centerCircle = new Circle(300, 400, 50);
        centerCircle.setStroke(Color.WHITE);
        centerCircle.setFill(Color.TRANSPARENT);
        pane.getChildren().add(centerCircle);

        // Goal areas
        Rectangle goalAreaTop = new Rectangle(200, 50, 200, 50);
        goalAreaTop.setFill(Color.TRANSPARENT);
        goalAreaTop.setStroke(Color.WHITE);
        pane.getChildren().add(goalAreaTop);

        Rectangle goalAreaBottom = new Rectangle(200, 700, 200, 50);
        goalAreaBottom.setFill(Color.TRANSPARENT);
        goalAreaBottom.setStroke(Color.WHITE);
        pane.getChildren().add(goalAreaBottom);

        // Penalty areas
        Rectangle penaltyAreaTop = new Rectangle(150, 50, 300, 100);
        penaltyAreaTop.setFill(Color.TRANSPARENT);
        penaltyAreaTop.setStroke(Color.WHITE);
        pane.getChildren().add(penaltyAreaTop);

        Rectangle penaltyAreaBottom = new Rectangle(150, 650, 300, 100);
        penaltyAreaBottom.setFill(Color.TRANSPARENT);
        penaltyAreaBottom.setStroke(Color.WHITE);
        pane.getChildren().add(penaltyAreaBottom);

        // Strikers
        createPositionCircle(pane, 300, 150, List.of("ST (C)"));  // ST Center
        createPositionCircle(pane, 250, 150, List.of("ST (C)"));  // ST Left
        createPositionCircle(pane, 350, 150, List.of("ST (C)"));  // ST Right

        // Attacking Midfielders
        createPositionCircle(pane, 250, 250, Arrays.asList("AM (RLC)", "AM (LC)", "AM (RL)"));  // AMC Left
        createPositionCircle(pane, 300, 250, Arrays.asList("AM (RLC)", "AM (LC)"));  // AMC Center
        createPositionCircle(pane, 350, 250, Arrays.asList("AM (RLC)", "AM (LC)", "AM (RL)"));  // AMC Right

        // Wing Midfielders
        createPositionCircle(pane, 150, 250, Arrays.asList("AM (RLC)", "AM (LC)", "AM (L)"));  // AML
        createPositionCircle(pane, 450, 250, Arrays.asList("AM (RLC)", "AM (RC)", "AM (R)", "M/AM (R)"));  // AMR
        createPositionCircle(pane, 150, 350, Arrays.asList("M (L)", "M/AM (L)"));  // WML
        createPositionCircle(pane, 450, 350, Arrays.asList("M (R)", "M/AM (R)"));  // WMR

        // Central Midfielders
        createPositionCircle(pane, 250, 350, Arrays.asList("M (C)", "M (RC)", "M (LC)", "M/AM"));  // CM Left
        createPositionCircle(pane, 300, 350, Arrays.asList("M (C)", "M (RC)", "M (LC)", "M/AM"));  // CM Center
        createPositionCircle(pane, 350, 350, Arrays.asList("M (C)", "M (RC)", "M (LC)", "M/AM"));  // CM Right

        // Defensive Midfielders
        createPositionCircle(pane, 250, 450, List.of("DM"));  // DM Left
        createPositionCircle(pane, 300, 450, List.of("DM"));  // DM Center
        createPositionCircle(pane, 350, 450, List.of("DM"));  // DM Right

        // Wingbacks
        createPositionCircle(pane, 150, 450, List.of("WB (L)"));  // AWL
        createPositionCircle(pane, 450, 450, List.of("WB (R)"));  // AWR
        createPositionCircle(pane, 150, 550, Arrays.asList("D (L)", "D (RL)", "D (RLC)"));  // DWL
        createPositionCircle(pane, 450, 550, Arrays.asList("D (R)", "D (RL)", "D (RLC)"));  // DWR

        // Defensive Centers
        createPositionCircle(pane, 250, 550, List.of("D (C)"));  // DC Left
        createPositionCircle(pane, 300, 550, List.of("D (C)"));  // DC Center
        createPositionCircle(pane, 350, 550, List.of("D (C)"));  // DC Right

        // Goalkeeper
        createPositionCircle(pane, 300, 650, List.of("GK"));  // GK

    }

    private void createPositionCircle(Pane pane, double x, double y, List<String> positions) {
        Circle positionCircle = new Circle(x, y, 15);  // 15 is the radius
        positionCircle.setFill(Color.TRANSPARENT);
        positionCircle.setStroke(Color.WHITE);
        positionCircle.setOnMouseClicked(event -> onPositionClicked(event, positions));
        pane.getChildren().add(positionCircle);
    }

    private void onPositionClicked(MouseEvent event, List<String> positions) {
        List<Player> playersForPosition = players.stream()
                .filter(player -> {
                    String[] playerPositions = player.getBasicInfo().getPosition().split(",\\s*");
                    for (String pos : playerPositions) {
                        if (positions.contains(pos) || positions.contains(player.getBasicInfo().getSecondaryPosition())) {
                            return true;
                        }
                    }
                    return false;
                })
                .collect(Collectors.toList());

        System.out.println("Checking for positions: " + positions);
        System.out.println("Number of players found: " + playersForPosition.size());

        displayPlayersForPosition(playersForPosition, String.join("/", positions));
    }


    private void displayPlayersForPosition(List<Player> playersForPosition, String position) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Players for " + position);
        alert.setHeaderText(null);
        alert.setContentText(playersForPosition.stream()
                .map(player -> player.getBasicInfo().getName())
                .collect(Collectors.joining(", ")));

        alert.showAndWait();
    }


    protected void onFileChooserButtonClick() {
        File selectedFile = selectFile();
        if (selectedFile != null) {
            String csvFilePath = "src/main/resources/Squad.csv";
            if (convertHtmlToCsv(selectedFile.getPath(), csvFilePath)) {
                PlayerFactory playerFactory = new PlayerFactory();
                players = PlayerFactory.createPlayers(csvFilePath).orElseThrow(() -> new RuntimeException("Could not create players"));

            }
        } else {

            System.out.println("No file selected");

        }
    }

    private File selectFile() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("HTML Files", "*.html")
        );
        File selectedFile = fileChooser.showOpenDialog(null);
        if (selectedFile != null) {

        }
        return selectedFile;
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

    private void createPositionBox(Pane pane, double x, double y) {
        Rectangle positionBox = new Rectangle(x, y, 50, 50);
        positionBox.setFill(Color.TRANSPARENT);
        positionBox.setStroke(Color.WHITE);

        // Add drag-and-drop functionality (optional)
        positionBox.setOnDragOver(event -> onPositionBoxDragOver(event));
        positionBox.setOnDragDropped(event -> onPositionBoxDragDropped(event));

        pane.getChildren().add(positionBox);
    }

    private void onPositionBoxDragOver(DragEvent event) {
        if (event.getGestureSource() != event.getTarget() &&
                event.getDragboard().hasString()) {
            event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
        }
        event.consume();
    }

    private void onPositionBoxDragDropped(DragEvent event) {
        // Handle the drop, e.g., place the player in the slot
        // You can access the data using event.getDragboard().getString()
        event.consume();
    }
}