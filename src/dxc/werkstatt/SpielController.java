package dxc.werkstatt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SpielController {

    @FXML
    private Button btnBackSpielScene;

    @FXML
    void btnBackPressed(ActionEvent event)
    {
        SceneManager.getInstance().showScene(SceneEnum.START_SCENE);
    }

}
