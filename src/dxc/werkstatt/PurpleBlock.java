package dxc.werkstatt;

import javafx.scene.canvas.Canvas;

import static javafx.scene.paint.Color.PURPLE;

public class PurpleBlock extends Block{
    double xPosition2;
    double yPosition2;

    private PurpleBlock(double xxPosition, double yyPosition, double xxPosition2, double yyPosition2){
        this.xPosition = xxPosition;
        this.yPosition = yyPosition;
        this.xPosition2 = xxPosition2;
        this.yPosition2 = yyPosition2;
    }

    public void draw(Canvas xCanvasSpielScene){
        /*double height = 0;
        double width = 120;
        double height2 = height + 30;
        double width2 = width - 30;*/

        xCanvasSpielScene.getGraphicsContext2D().setFill(PURPLE);
        xCanvasSpielScene.getGraphicsContext2D().fillRect(xPosition, yPosition, 30, 30);
        xCanvasSpielScene.getGraphicsContext2D().fillRect(xPosition2, yPosition2, 90, 30);
    }
}