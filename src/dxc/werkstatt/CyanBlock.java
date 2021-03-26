package dxc.werkstatt;

import javafx.scene.canvas.Canvas;

import static javafx.scene.paint.Color.CYAN;

public class CyanBlock extends Block {

    public CyanBlock(double xxPosition, double yyPosition){
        this.xPosition = xxPosition;
        this.yPosition = yyPosition;
    }

    public void draw(Canvas xCanvasSpielScene){
    /*this.xPosition = xxPosition;
    double width = 90;*/

    xCanvasSpielScene.getGraphicsContext2D().setFill(CYAN);
    xCanvasSpielScene.getGraphicsContext2D().fillRect(xPosition, yPosition, 120, 30);
    }
}





/*   public void removeCyanBlock(Canvas canvasSpielScene, double height){
        this.xPosition = height;
        double width = 90;

        canvasSpielScene.getGraphicsContext2D().clearRect(width, height, 120, 30);*/

    /*public void moveDown(Canvas xSpielCanvas){
        int aktuelleZeit = 1;
        double height3 = 0;
        while(height3 < 600){
            int vergleichendeZeit = 59; //LocalTime.now().getNano();
            if(vergleichendeZeit != aktuelleZeit){
                height3 = height + 30;
                CyanBlock e = new CyanBlock(width, height3);
                e.drawCyanBlock(xSpielCanvas);
            }
        }
    }*/

