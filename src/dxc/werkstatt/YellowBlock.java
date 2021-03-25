package dxc.werkstatt;

import javafx.scene.canvas.Canvas;

import static javafx.scene.paint.Color.YELLOW;

public class YellowBlock extends Figur{
    double width2;
    double height2;

    public YellowBlock(double xWidth, double xHeight, double xHeight2){
        this.width = xWidth;
        this.height = xHeight;
        this.height2 = xHeight2;
    }

    public void drawYellowBlock(Canvas xCanvasSpielScene){
/*        double height = 0;
        double width = 120;
        double height2 = height + 30;*/

        xCanvasSpielScene.getGraphicsContext2D().setFill(YELLOW);
        xCanvasSpielScene.getGraphicsContext2D().fillRect(width, height, 60, 30);
        xCanvasSpielScene.getGraphicsContext2D().fillRect(width, height2, 60, 30);
    }
}