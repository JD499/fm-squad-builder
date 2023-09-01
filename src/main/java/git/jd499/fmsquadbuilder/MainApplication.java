package git.jd499.fmsquadbuilder;

import git.jd499.fmsquadbuilder.data.CsvDataRepository;
import git.jd499.fmsquadbuilder.domain.PlayerService;
import git.jd499.fmsquadbuilder.presentation.SquadUI;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainApplication extends Application {
  public static PlayerService playerService;
  public static CsvDataRepository csvDataRepository;

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    csvDataRepository = new CsvDataRepository();
    playerService = new PlayerService(csvDataRepository);
    SquadUI squadUI = new SquadUI(playerService, primaryStage);
    squadUI.start();
  }
}
