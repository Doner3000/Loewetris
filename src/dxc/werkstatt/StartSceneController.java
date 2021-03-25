package dxc.werkstatt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class StartSceneController {

    @FXML
    private Pane startScreenPane;

    @FXML
    private Button btnStartStartScene;

    @FXML
    private Button btnRegelnStartScene;

    @FXML
    private Button btnAboutStartScene;

    @FXML
    private Label lblFilledHighScore;

    @FXML
    void btnStartPressed(ActionEvent event)
    {
        SceneManager.getInstance().showScene(SceneEnum.SPIEL_SCENE);
    }

    @FXML
    void btnRegelnPressed(ActionEvent event)
    {
        SceneManager.getInstance().showScene(SceneEnum.REGELN_SCENE);
    }

    @FXML
    void btnAboutPressed(ActionEvent event)
    {
        SceneManager.getInstance().showScene(SceneEnum.ABOUT_SCENE);
    }


}
