package git.jd499.fmsquadbuilder;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import java.io.File;
import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button fileChooserButton;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onFileChooserButtonClick() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("HTML Files", "*.html")
        );
        File selectedFile = fileChooser.showOpenDialog(null);

        if (selectedFile != null) {
            welcomeText.setText("File selected: " + selectedFile.getName());

            // Convert the HTML file to a CSV file
            String htmlFilePath = selectedFile.getPath();
            String csvFilePath = "src/main/resources/Squad.csv";
            try {
                HtmlTableToCsv.convertHtmlTableToCsv(htmlFilePath, csvFilePath);
                welcomeText.setText("File converted: " + csvFilePath);
            } catch (IOException e) {
                e.printStackTrace();
                welcomeText.setText("Error converting file.");
            }
        } else {
            welcomeText.setText("File selection cancelled.");
        }
    }
}
