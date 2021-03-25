package dxc.werkstatt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class AboutController {

    @FXML
    private Pane aboutScenePane;

    @FXML
    private TextField aboutSceneTitle;

    @FXML
    private TextField aboutSceneCopyright;

    @FXML
    private Button btnBackAboutScene;

    @FXML
    void btnBackPressed(ActionEvent event)
    {
        SceneManager.getInstance().showScene(SceneEnum.START_SCENE);
    }

}
