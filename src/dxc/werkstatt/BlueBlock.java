package dxc.werkstatt;

import javafx.scene.canvas.Canvas;

import static javafx.scene.paint.Color.BLUE;

public class BlueBlock extends Figur{
    double height2;

    private BlueBlock(double xWidth, double xHeight, double xHeight2){
        this.width = xWidth;
        this.height = xHeight;
        this.height2 = xHeight2;
    }

    public void drawBlueBlock(Canvas xCanvasSpielScene){
        double height = 0;
        double width = 90;
        double height2 = height + 30;

        xCanvasSpielScene.getGraphicsContext2D().setFill(BLUE);
        xCanvasSpielScene.getGraphicsContext2D().fillRect(width, height, 30, 30);
        xCanvasSpielScene.getGraphicsContext2D().fillRect(width, height2, 90, 30);
    }
}