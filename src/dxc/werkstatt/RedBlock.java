package dxc.werkstatt;

import javafx.scene.canvas.Canvas;

import static javafx.scene.paint.Color.RED;

public class RedBlock extends Figur{
    double width2;
    double height2;

    private RedBlock(double xWidth, double xHeight, double xWidth2, double xHeight2){
        this.width = xWidth;
        this.height = xHeight;
        this.width2 = xWidth2;
        this.height2 = xHeight2;
    }

    public static void drawRedBlock(Canvas xCanvasSpielScene){
        double height = 0;
        double width = 90;
        double height2 = height + 30;
        double width2 = width + 30;

        xCanvasSpielScene.getGraphicsContext2D().setFill(RED);
        xCanvasSpielScene.getGraphicsContext2D().fillRect(width, height, 60, 30);
        xCanvasSpielScene.getGraphicsContext2D().fillRect(width2, height2, 60, 30);
    }
}
