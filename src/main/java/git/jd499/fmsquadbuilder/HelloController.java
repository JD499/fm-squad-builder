package git.jd499.fmsquadbuilder;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.util.*;

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
            printAdvancedForwardAbilities(players); // Call the new function here
        } else {
            System.out.println("Error reading players from CSV file.");
        }
    }

    private void printAdvancedForwardAbilities(List<Player> players) {
        PlayerAbilityCalculator abilityCalculator = new PlayerAbilityCalculator();

        // Create a list of players with their abilities as advanced forwards
        List<Map.Entry<Player, Double>> playerAbilities = new ArrayList<>();
        for (Player player : players) {
            double ability = abilityCalculator.calculateAdvancedForwardAbility(player);
            playerAbilities.add(new AbstractMap.SimpleEntry<>(player, ability));
        }

        // Sort the list by ability in descending order
        playerAbilities.sort((entry1, entry2) -> Double.compare(entry2.getValue(), entry1.getValue()));

        // Print the sorted players and their abilities
        System.out.println("Advanced Forward Abilities:");
        for (Map.Entry<Player, Double> entry : playerAbilities) {
            Player player = entry.getKey();
            double ability = entry.getValue();
            System.out.println("Player name: " + player.getName() + ", Ability as Advanced Forward: " + ability);
        }
    }




}

