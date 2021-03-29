package dxc.werkstatt;

import javafx.scene.canvas.Canvas;

import static javafx.scene.paint.Color.CYAN;

public class CyanBlock extends Figur {

    public CyanBlock(double x, double y){
        this.block1 = new Block(x, y);
        this.block2 = new Block(x + 30, y);
        this.block3 = new Block(x + 60, y);
        this.block4 = new Block(x + 90, y);
        this.farbe = CYAN;
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

