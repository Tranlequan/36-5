package sample.Terminal.src;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Game game = new Game();
        game.start(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}
