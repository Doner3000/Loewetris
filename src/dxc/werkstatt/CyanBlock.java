package dxc.werkstatt;

import javafx.scene.canvas.Canvas;

import java.time.LocalTime;

import static javafx.scene.paint.Color.CYAN;

public class CyanBlock extends Figur {

    public CyanBlock(double xWidth, double xHeight){
        this.width = xWidth;
        this.height = xHeight;
    }

    public void drawCyanBlock(Canvas canvasSpielScene){
    double height = 0;
    double width = 90;

    canvasSpielScene.getGraphicsContext2D().setFill(CYAN);
    canvasSpielScene.getGraphicsContext2D().fillRect(width, height, 120, 30);
}

    public void moveDown(Canvas xSpielCanvas){
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
    }
}
