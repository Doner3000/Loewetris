package dxc.werkstatt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class SpielController {

    @FXML
    private Label lblTitelSpielScene;

    @FXML
    private Label lblCopyright;

    @FXML
    private Pane paneSpielScene;

    @FXML
    private Button btnBackSpielScene;

    @FXML
    void btnBackPressed(ActionEvent event)
    {
        SceneManager.getInstance().showScene(SceneEnum.START_SCENE);
    }

}
