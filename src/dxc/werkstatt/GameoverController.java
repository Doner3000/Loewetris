package dxc.werkstatt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class GameoverController {

    @FXML
    private Pane labelGameoverScene;

    @FXML
    private Label GameoverSceneLabel;

    @FXML
    private Label gameoverSceneLabelHighscore;

    @FXML
    private Label gameoverSceneLabelScore;

    @FXML
    private Button btnRestartGameOverScene;

    @FXML
    private Button btnBeendenGameOverScene;

    @FXML
    void btnRestartPressed(ActionEvent event)
    {
        SceneManager.getInstance().showScene(SceneEnum.SPIEL_SCENE);
    }

    @FXML
    void btnBeendenPressed(ActionEvent event)
    {
        SceneManager.getInstance().showScene(SceneEnum.START_SCENE);
    }

}
