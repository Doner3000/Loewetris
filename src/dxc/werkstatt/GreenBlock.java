package dxc.werkstatt;

import javafx.scene.canvas.Canvas;

import static javafx.scene.paint.Color.GREEN;

    public class GreenBlock extends Figur{
        double width2;
        double height2;

        private GreenBlock(double xWidth, double xHeight, double xWidth2, double xHeight2){
            this.width = xWidth;
            this.height = xHeight;
            this.width2 = xWidth2;
            this.height2 = xHeight2;
        }

        public static void drawGreenBlock(Canvas xCanvasSpielScene){
            double height = 0;
            double width = 120;
            double height2 = height + 30;
            double width2 = width - 30;

            xCanvasSpielScene.getGraphicsContext2D().setFill(GREEN);
            xCanvasSpielScene.getGraphicsContext2D().fillRect(width, height, 60, 30);
            xCanvasSpielScene.getGraphicsContext2D().fillRect(width2, height2, 60, 30);
        }
    }

