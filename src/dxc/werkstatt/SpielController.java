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
import javafx.scene.paint.Color;

import static javafx.scene.paint.Color.CYAN;
import static javafx.scene.paint.Color.RED;

public class SpielController {

    private int score;


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
        Color c = Color.rgb(0,255,255);
        gc.setStroke(c);
        double x = width + 120;
        gc.strokeRect(x, 0, 120, 30);
        drawI();
    }

    public void drawI(){
        double height = 0;
        double width = 90;
        Color c = Color.rgb(0,255,255);

        canvasSpielScene.getGraphicsContext2D().setStroke(c);
        canvasSpielScene.getGraphicsContext2D().setFill(CYAN);
        canvasSpielScene.getGraphicsContext2D().fillRect(width, height, 120, 30);
    }

}

