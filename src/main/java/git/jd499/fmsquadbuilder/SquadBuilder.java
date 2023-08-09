package git.jd499.fmsquadbuilder;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
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
        VBox root = new VBox(20);
        Scene scene = new Scene(root, 600, 800);

        // Create the soccer field
        Pane soccerFieldPane = new Pane();
        createSoccerField(soccerFieldPane);

        // Create the "Choose File" button
        Button fileChooserButton = new Button("Choose File");
        fileChooserButton.setOnAction(event -> onFileChooserButtonClick());

        // Add the button and soccer field to the root layout
        root.getChildren().addAll(fileChooserButton, soccerFieldPane);

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
}