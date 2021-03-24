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
    private Button regelsceneback;

    @FXML
    void initialize() {
        assert regelscenepane != null : "fx:id=\"regelscenepane\" was not injected: check your FXML file 'Untitled'.";
        assert regelscenepng != null : "fx:id=\"regelscenepng\" was not injected: check your FXML file 'Untitled'.";
        assert regelscenelabel != null : "fx:id=\"regelscenelabel\" was not injected: check your FXML file 'Untitled'.";
        assert regelscenetxt != null : "fx:id=\"regelscenetxt\" was not injected: check your FXML file 'Untitled'.";
        assert regelsceneback != null : "fx:id=\"regelsceneback\" was not injected: check your FXML file 'Untitled'.";

    }
}
