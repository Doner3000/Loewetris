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
//        drawCyanBlock();
//        drawRedBlock();
//        drawGreenBlock();
//        drawPurpleBlock();
//        drawBlueBlock();
//        drawOrangeBlock();
//        drawYellowBlock();
    }

    private void drawRedBlock(){
        double height = 0;
        double width = 90;
        double height2 = height + 30;
        double width2 = width + 30;

        canvasSpielScene.getGraphicsContext2D().setFill(RED);
        canvasSpielScene.getGraphicsContext2D().fillRect(width, height, 60, 30);
        canvasSpielScene.getGraphicsContext2D().fillRect(width2, height2, 60, 30);
    }

    private void drawCyanBlock(){
        double height = 0;
        double width = 90;

        canvasSpielScene.getGraphicsContext2D().setFill(CYAN);
        canvasSpielScene.getGraphicsContext2D().fillRect(width, height, 120, 30);
    }

    private void drawGreenBlock(){
        double height = 0;
        double width = 120;
        double height2 = height + 30;
        double width2 = width - 30;

        canvasSpielScene.getGraphicsContext2D().setFill(GREEN);
        canvasSpielScene.getGraphicsContext2D().fillRect(width, height, 60, 30);
        canvasSpielScene.getGraphicsContext2D().fillRect(width2, height2, 60, 30);
    }

    private void drawPurpleBlock() {
        double height = 0;
        double width = 120;
        double height2 = height + 30;
        double width2 = width - 30;

        canvasSpielScene.getGraphicsContext2D().setFill(PURPLE);
        canvasSpielScene.getGraphicsContext2D().fillRect(width, height, 30, 30);
        canvasSpielScene.getGraphicsContext2D().fillRect(width2, height2, 90, 30);
    }

    private void drawBlueBlock() {
        double height = 0;
        double width = 90;
        double height2 = height + 30;

        canvasSpielScene.getGraphicsContext2D().setFill(BLUE);
        canvasSpielScene.getGraphicsContext2D().fillRect(width, height, 30, 30);
        canvasSpielScene.getGraphicsContext2D().fillRect(width, height2, 90, 30);
    }

    private void drawOrangeBlock() {
        double height = 0;
        double width = 150;
        double height2 = height + 30;
        double width2 = width - 60;

        canvasSpielScene.getGraphicsContext2D().setFill(ORANGE);
        canvasSpielScene.getGraphicsContext2D().fillRect(width, height, 30, 30);
        canvasSpielScene.getGraphicsContext2D().fillRect(width2, height2, 90, 30);
    }

    private void drawYellowBlock(){ //by Pascal
        double height = 0;
        double width = 120;
        double height2 = height + 30;

        canvasSpielScene.getGraphicsContext2D().setFill(YELLOW);
        canvasSpielScene.getGraphicsContext2D().fillRect(width, height, 60, 30);
        canvasSpielScene.getGraphicsContext2D().fillRect(width, height2, 60, 30);
    }
}

