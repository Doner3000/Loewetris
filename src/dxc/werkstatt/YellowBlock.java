package dxc.werkstatt;

import javafx.scene.canvas.Canvas;

import static javafx.scene.paint.Color.YELLOW;

public class YellowBlock extends Block{
    double yPosition2;

    public YellowBlock(double xxPosition, double yyPosition, double yyPosition2){
        this.xPosition = xxPosition;
        this.yPosition = yyPosition;
        this.yPosition2 = yyPosition2;
    }

    public void draw(Canvas xCanvasSpielScene){
/*        double height = 0;
        double width = 120;
        double height2 = height + 30;*/

        xCanvasSpielScene.getGraphicsContext2D().setFill(YELLOW);
        xCanvasSpielScene.getGraphicsContext2D().fillRect(xPosition, yPosition, 60, 30);
        xCanvasSpielScene.getGraphicsContext2D().fillRect(xPosition, yPosition2, 60, 30);
    }
}