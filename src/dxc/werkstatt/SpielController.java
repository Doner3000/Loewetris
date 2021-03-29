package dxc.werkstatt;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.security.Key;
import java.util.Timer;

import static javafx.scene.paint.Color.*;
import java.awt.*;
import java.awt.event.*;

public class SpielController {

    private int score;
    private CanvasAnimationTimer ant;


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
    void keyTyped(KeyEvent event){
        ant.move(event);
        System.out.println(event);
    }


    @FXML
    private void initialize() throws InterruptedException {
//        CyanBlock.drawCyanBlock(canvasSpielScene);
//        RedBlock.drawRedBlock(canvasSpielScene);
//        GreenBlock.drawGreenBlock(canvasSpielScene);
//        PurpleBlock.drawPurpleBlock(canvasSpielScene);
//        BlueBlock.drawBlueBlock(canvasSpielScene);
//        OrangeBlock.drawOrangeBlock(canvasSpielScene);
//        YellowBlock.drawYellowBlock(canvasSpielScene);
//        YellowBlock Pascal = new YellowBlock(120, 0, 30);
//        Pascal.drawYellowBlock(canvasSpielScene);
        ant = new CanvasAnimationTimer(canvasSpielScene);
        ant.start();


        //test.moveDown(canvasSpielScene);
    }


}

