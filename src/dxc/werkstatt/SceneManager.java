package dxc.werkstatt;

import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.HashMap;
import java.util.Map;

public class SceneManager {
    private static final String FXML_PATH = "fxml/";
    public static final String START_SCENE = "startScene.fxml";
    public static final String REGELN_SCENE = "regelnScene.fxml";
    public static final String SPIEL_SCENE = "spielScene.fxml";
    public static final String GAMEOVER_SCENE = "gameoverScene.fxml";
    private final Stage erstesStage;

    private final Map<String, Scene> sceneMap = new HashMap<>();
}
