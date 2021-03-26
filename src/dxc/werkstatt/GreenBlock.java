package dxc.werkstatt;

import javafx.scene.canvas.Canvas;

import static javafx.scene.paint.Color.GREEN;

    public class GreenBlock extends Figur{

        private GreenBlock(double x, double y){
            this.block1 = new Block(x, y);
            this.block2 = new Block(x + 30, y);
            this.block3 = new Block(x, y + 30);
            this.block4 = new Block(x - 30, y + 30);
        }

        public void drawGreen(Canvas xCanvasSpielScene){
            xCanvasSpielScene.getGraphicsContext2D().setFill(GREEN);
            xCanvasSpielScene.getGraphicsContext2D().fillRect(block1.xPosition, block1.yPosition, 30, 30);
            xCanvasSpielScene.getGraphicsContext2D().fillRect(block2.xPosition, block2.yPosition, 30, 30);
            xCanvasSpielScene.getGraphicsContext2D().fillRect(block3.xPosition, block3.yPosition, 30, 30);
            xCanvasSpielScene.getGraphicsContext2D().fillRect(block4.xPosition, block4.yPosition, 30, 30);
        }
    }

