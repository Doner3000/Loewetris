package dxc.werkstatt;

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public class Block {
    public double width;
    public double height;
    public double xPosition;
    public double yPosition;


    public Block(double x, double y){
        width = 30;
        height = 30;
       this.xPosition = x;
       this.yPosition = y;
    }

    public void drawBlock(Canvas xCanvasSpielScene, Color color){
        xCanvasSpielScene.getGraphicsContext2D().setFill(color);
        xCanvasSpielScene.getGraphicsContext2D().fillRect(xPosition, yPosition, width, height);
    }
    public void removeBlock(Canvas xCanvasSpielScene){
        xCanvasSpielScene.getGraphicsContext2D().clearRect(xPosition, yPosition - 30, width, height);
    }
}



