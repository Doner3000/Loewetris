package dxc.werkstatt;

import javafx.scene.canvas.Canvas;

import static javafx.scene.paint.Color.GREEN;

    public class GreenBlock extends Block{
        double xPosition2;
        double yPosition2;

        private GreenBlock(double xxPosition, double yyPosition, double xxPosition2, double yyPosition2){
            this.xPosition = xxPosition;
            this.yPosition = yyPosition;
            this.xPosition2 = xxPosition2;
            this.yPosition2 = yyPosition2;
        }

        public void draw(Canvas xCanvasSpielScene){
         /*   double height = 0;
            double width = 120;
            double height2 = height + 30;
            double width2 = width - 30;*/

            xCanvasSpielScene.getGraphicsContext2D().setFill(GREEN);
            xCanvasSpielScene.getGraphicsContext2D().fillRect(xPosition, yPosition, 60, 30);
            xCanvasSpielScene.getGraphicsContext2D().fillRect(xPosition2, yPosition2, 60, 30);
        }
    }

