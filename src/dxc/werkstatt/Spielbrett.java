package dxc.werkstatt;

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;


public class Spielbrett {
    private int score;
    private Canvas canvas;

    public void handle(long now){
        drawI();
    }

    public void drawI(){
        double height = 80;
        double width = 200;
        Color c = Color.rgb(0,255,255);

        canvas.getGraphicsContext2D().setStroke(c);
        canvas.getGraphicsContext2D().strokeRect(width, height, 30, 30);
    }
}
