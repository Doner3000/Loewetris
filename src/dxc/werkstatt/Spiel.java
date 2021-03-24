package dxc.werkstatt;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Spiel extends Application{

    public void start(Stage ersteStage) throws IOException {
        System.out.println("App startet...");

        SceneManager sceneManager = SceneManager.getInstance();
        sceneManager.setPrimaryStage(ersteStage);
        System.out.println("Laden erfolgreich");

        sceneManager.showScene(SceneManager.START_SCENE);
    }
}
