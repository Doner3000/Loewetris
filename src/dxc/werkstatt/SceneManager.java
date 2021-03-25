package dxc.werkstatt;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SceneManager {
    private Stage ersteStage;

    private final Map<SceneEnum, Scene> sceneMap = new HashMap<SceneEnum, Scene>();
    private final Map<SceneEnum, Object> controllerMap = new HashMap<>();

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
        for (SceneEnum value : SceneEnum.values()){
            loadScene(value);
        }
        //lol
    }

    private void loadScene(SceneEnum sceneKey) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getClassLoader().getResource(sceneKey.getFullPath()));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Object controller = fxmlLoader.getController();

        sceneMap.put(sceneKey, scene);
        controllerMap.put(sceneKey, controller);
    }

    public void showScene(SceneEnum scenekey){
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
