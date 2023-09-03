package git.jd499.fmsquadbuilder;

import git.jd499.fmsquadbuilder.domain.PlayerService;
import git.jd499.fmsquadbuilder.presentation.SquadUI;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainApplication extends Application {


  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {



    startUI(primaryStage);
  }



  private void startUI(Stage primaryStage) {
    PlayerService playerService = new PlayerService();
    SquadUI squadUI = new SquadUI(playerService, primaryStage);
    squadUI.start();
  }
}
