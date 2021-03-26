package dxc.werkstatt;


import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public abstract class Figur {
    Block block1;
    Block block2;
    Block block3;
    Block block4;

    public Figur(){
        super();
    }

    public void fallDown(){
        block1.yPosition += 30;
        block2.yPosition += 30;
        block3.yPosition += 30;
        block4.yPosition += 30;
    }

    public void drawFigur(Canvas xCanvas, Color xColor){
        block1.drawBlock(xCanvas, xColor);
        block2.drawBlock(xCanvas, xColor);
        block3.drawBlock(xCanvas, xColor);
        block4.drawBlock(xCanvas, xColor);
    }

    public void moveRight(){
        block1.xPosition += 30;
        block2.xPosition += 30;
        block3.xPosition += 30;
        block4.xPosition += 30;
    }

    public void moveleft(){
        block1.xPosition -= 30;
        block2.xPosition -= 30;
        block3.xPosition -= 30;
        block4.xPosition -= 30;
    }
}

/*    public void moveDown() {
        if (this.getyPosition() < 600) {
            this.yPosition += 30;
        }
    }

    public abstract void draw(Canvas canvas);

/*    public void moveDown(Canvas xSpielCanvas){
        int aktuelleZeit = LocalTime.now().getNano();
        while(this.getHeight() < 600){
            int vergleichendeZeit = 59; //LocalTime.now().getNano();
            if(vergleichendeZeit != aktuelleZeit){
                setHeight(this.getHeight() + 30);
            }
        }
    }
*/
    /*

        Orange: orangeBlock = rgb(255,165,0) #FFA500 hsl(39,100%,50%)
        Gelb: yellowBlock = rgb(255,255,0) #FFFF00 hsl(60,100%,50%)
        Grün: greenBlock = rgb(255,255,255) #008000 hsl(120,100%,25%)
        Rot: redBlock = rgb(255,0,0) #FF0000 hsl(0,100%,50%)
        Blau: blueBlock = rgb(0,0,255) #0000FF hsl(240,100%,50%)
        Violett: purpleBlock = rgb(238,130,238) #EE82EE hsl(300,76%,72%)
        Zyan:  cyanBlock = rgb(0,255,255) #00FFFF hsl(180,100%,50%)
     */

