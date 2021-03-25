package dxc.werkstatt;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class RegelController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Pane regelscenepane;

    @FXML
    private ImageView regelscenepng;

    @FXML
    private Label regelscenelabel;

    @FXML
    private TextArea regelscenetxt;

    @FXML
    private Button btnZurueckRegelnScene;

    @FXML
    void btnBackPressed(ActionEvent event)
    {
        SceneManager.getInstance().showScene(SceneEnum.START_SCENE);
    }
}
