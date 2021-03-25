package dxc.werkstatt;

import javafx.scene.canvas.Canvas;

import static javafx.scene.paint.Color.ORANGE;

public class OrangeBlock extends Figur{
    double width2;
    double height2;

    private OrangeBlock(double xWidth, double xHeight, double xWidth2, double xHeight2){
        this.width = xWidth;
        this.height = xHeight;
        this.width2 = xWidth2;
        this.height2 = xHeight2;
    }

    public void drawOrangeBlock(Canvas xCanvasSpielScene){
        double height = 0;
        double width = 150;
        double height2 = height + 30;
        double width2 = width - 60;

        xCanvasSpielScene.getGraphicsContext2D().setFill(ORANGE);
        xCanvasSpielScene.getGraphicsContext2D().fillRect(width, height, 30, 30);
        xCanvasSpielScene.getGraphicsContext2D().fillRect(width2, height2, 90, 30);
    }
}