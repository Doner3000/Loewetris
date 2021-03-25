package dxc.werkstatt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class SpielController {

    @FXML
    private Pane paneSpielScene;

    @FXML
    private Label lblTitelSpielScene;

    @FXML
    private Button btnBackSpielScene;

    @FXML
    private Canvas canvasSpielScene;

    @FXML
    private GridPane gridSpielScene;

    @FXML
    void btnBackPressed(ActionEvent event) {
        SceneManager.getInstance().showScene(SceneEnum.START_SCENE);
    }

    @FXML
    private void initialize(){
        GraphicsContext gc = canvasSpielScene.getGraphicsContext2D();
        double width = canvasSpielScene.getWidth();
        double height = canvasSpielScene.getHeight();

        gc.strokeRect(0, 0, 30, 30);
    }

}

