package git.jd499.fmsquadbuilder;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

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
        File selectedFile = selectFile();
        if (selectedFile != null) {
            String csvFilePath = "src/main/resources/Squad.csv";
            if (convertHtmlToCsv(selectedFile.getPath(), csvFilePath)) {
                printPlayers(csvFilePath);
            }
        } else {
            welcomeText.setText("File selection cancelled.");
        }
    }

    private File selectFile() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("HTML Files", "*.html")
        );
        File selectedFile = fileChooser.showOpenDialog(null);
        if (selectedFile != null) {
            welcomeText.setText("File selected: " + selectedFile.getName());
        }
        return selectedFile;
    }

    private boolean convertHtmlToCsv(String htmlFilePath, String csvFilePath) {
        try {
            HtmlTableToCsv.convertHtmlTableToCsv(htmlFilePath, csvFilePath);
            welcomeText.setText("File converted: " + csvFilePath);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            welcomeText.setText("Error converting file.");
            return false;
        }
    }

    private void printPlayers(String csvFilePath) {
        Optional<List<Player>> playersOpt = PlayerFactory.createPlayers(csvFilePath);
        if (playersOpt.isPresent()) {
            List<Player> players = playersOpt.get();
            for (Player player : players) {
                System.out.println("Player name: " + player.getName());
                System.out.println("Player age: " + player.getAge());
            }
        } else {
            System.out.println("Error reading players from CSV file.");
        }
    }

}

