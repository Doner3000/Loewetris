package dxc.werkstatt;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SceneManager {
    private static final String FXML_PATH = "fxml/";
    public static final String START_SCENE = "startScene.fxml";
    public static final String REGELN_SCENE = "regelnScene.fxml";
    public static final String SPIEL_SCENE = "spielScene.fxml";
    public static final String GAMEOVER_SCENE = "gameoverScene.fxml";
    private Stage ersteStage;

    private final Map<String, Scene> sceneMap = new HashMap<>();
    private final Map<String, Object> controllerMap = new HashMap<>();

    private static SceneManager instance;

    private SceneManager(){

    }

    public static SceneManager getInstance(){
        if (instance == null){
            instance = new SceneManager();
            try {
                instance.initScenes();
            } catch (IOException exception) {
                exception.printStackTrace();
                System.exit(1);
            }
        }
        return instance;
    }

    public void initScenes() throws IOException{
        loadScene(START_SCENE);
        loadScene(REGELN_SCENE);
        loadScene(SPIEL_SCENE);
        loadScene(GAMEOVER_SCENE);
    }

    private void loadScene(String sceneKey) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getClassLoader().getResource(FXML_PATH + sceneKey));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Object controller = fxmlLoader.getController();

        sceneMap.put(sceneKey, scene);
        controllerMap.put(sceneKey, controller);
    }

    public void showScene(String scenekey){
        Scene scene = sceneMap.get(scenekey);
        ersteStage.setScene(scene);
        ersteStage.show();
    }

    public void setPrimaryStage(Stage ersteStage){
        this.ersteStage = ersteStage;
    }
    public Object getController(String sceneKey){
        return controllerMap.get(sceneKey);
    }
}
