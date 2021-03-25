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

import static javafx.scene.paint.Color.*;

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
//        CyanBlock.drawCyanBlock(canvasSpielScene);
//        RedBlock.drawRedBlock(canvasSpielScene);
//        GreenBlock.drawGreenBlock(canvasSpielScene);
//        PurpleBlock.drawPurpleBlock(canvasSpielScene);
//        BlueBlock.drawBlueBlock(canvasSpielScene);
//        OrangeBlock.drawOrangeBlock(canvasSpielScene);
//        YellowBlock.drawYellowBlock(canvasSpielScene);
//        YellowBlock Pascal = new YellowBlock(120, 0, 30);
//        Pascal.drawYellowBlock(canvasSpielScene);
        CyanBlock test = new CyanBlock(90,0);
        test.drawCyanBlock(canvasSpielScene);
        test.moveDown(canvasSpielScene);
    }
}

