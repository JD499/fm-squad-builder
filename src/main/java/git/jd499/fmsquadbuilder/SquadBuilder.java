package git.jd499.fmsquadbuilder;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;


public class SquadBuilder extends Application {
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


    public static void main(String[] args) {
        launch(args);
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

        createPositionBox(pane, 100, 100); // Top-left
        createPositionBox(pane, 300, 100); // Top-center
        createPositionBox(pane, 500, 100); // Top-right
        createPositionBox(pane, 100, 300); // Middle-left
        createPositionBox(pane, 300, 300); // Middle-center
        createPositionBox(pane, 500, 300); // Middle-right
        createPositionBox(pane, 100, 500); // Bottom-left
        createPositionBox(pane, 300, 500); // Bottom-center
        createPositionBox(pane, 500, 500); // Bottom-right






    }

    protected void onFileChooserButtonClick() {
        File selectedFile = selectFile();
        if (selectedFile != null) {
            String csvFilePath = "src/main/resources/Squad.csv";
            if (convertHtmlToCsv(selectedFile.getPath(), csvFilePath)) {

            }
        } else {

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