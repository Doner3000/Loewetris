package dxc.werkstatt;

import javafx.scene.canvas.Canvas;

import static javafx.scene.paint.Color.ORANGE;

public class OrangeBlock extends Figur{

    private OrangeBlock(double x, double y){
        this.block1 = new Block(x, y);
        this.block2 = new Block(x, y + 30);
        this.block3 = new Block(x - 30, y + 30);
        this.block4 = new Block(x - 60, y + 30);
    }

    public void drawOrange(Canvas xCanvasSpielScene)
    {
        xCanvasSpielScene.getGraphicsContext2D().setFill(ORANGE);
        xCanvasSpielScene.getGraphicsContext2D().fillRect(block1.xPosition, block1.yPosition, 30, 30);
        xCanvasSpielScene.getGraphicsContext2D().fillRect(block2.xPosition, block2.yPosition, 30, 30);
        xCanvasSpielScene.getGraphicsContext2D().fillRect(block3.xPosition, block3.yPosition, 30, 30);
        xCanvasSpielScene.getGraphicsContext2D().fillRect(block4.xPosition, block4.yPosition, 30, 30);
    }
}