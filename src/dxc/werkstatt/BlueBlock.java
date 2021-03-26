package dxc.werkstatt;

import javafx.scene.canvas.Canvas;

import static javafx.scene.paint.Color.BLUE;

public class BlueBlock extends Block{
    double yPosition2;

    private BlueBlock(double xxPosition, double yyPosition, double yyPosition2){
        this.xPosition = xxPosition;
        this.yPosition = yyPosition;
        this.yPosition2 = yyPosition2;
    }

    public void draw(Canvas xCanvasSpielScene){
      /*  double height = 0;
        double width = 90;
        double yyPosition2 = yPosition2 + 30;*/

        xCanvasSpielScene.getGraphicsContext2D().setFill(BLUE);
        xCanvasSpielScene.getGraphicsContext2D().fillRect(xPosition, yPosition, 30, 30);
        xCanvasSpielScene.getGraphicsContext2D().fillRect(xPosition, yPosition2, 90, 30);
    }
}