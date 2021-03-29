package dxc.werkstatt;


import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

public abstract class Figur {
    Block block1;
    Block block2;
    Block block3;
    Block block4;
    Color farbe;

    public Figur(){
        super();
    }

    public void fallDown(){
        block1.yPosition += 30;
        block2.yPosition += 30;
        block3.yPosition += 30;
        block4.yPosition += 30;
    }

    public void drawFigur(Canvas xCanvas){
        block1.drawBlock(xCanvas, farbe);
        block2.drawBlock(xCanvas, farbe);
        block3.drawBlock(xCanvas, farbe);
        block4.drawBlock(xCanvas, farbe);
    }

    public void removeFigur(Canvas xCanvas){
        xCanvas.getGraphicsContext2D().clearRect(block1.xPosition, block1.yPosition - 30, block1.width, block1.width);
        xCanvas.getGraphicsContext2D().clearRect(block2.xPosition, block2.yPosition - 30, block2.width, block2.width);
        xCanvas.getGraphicsContext2D().clearRect(block3.xPosition, block3.yPosition - 30, block3.width, block3.width);
        xCanvas.getGraphicsContext2D().clearRect(block4.xPosition, block4.yPosition - 30 , block4.width, block4.width);
    }

    public void moveRight(Canvas xCanvas){
        block1.xPosition += 30;
        block2.xPosition += 30;
        block3.xPosition += 30;
        block4.xPosition += 30;
        xCanvas.getGraphicsContext2D().clearRect(block1.xPosition - 30, block1.yPosition - 30, block1.width, block1.width);
        xCanvas.getGraphicsContext2D().clearRect(block2.xPosition - 30, block2.yPosition - 30, block2.width, block2.width);
        xCanvas.getGraphicsContext2D().clearRect(block3.xPosition - 30, block3.yPosition - 30, block3.width, block3.width);
        xCanvas.getGraphicsContext2D().clearRect(block4.xPosition - 30, block4.yPosition - 30 , block4.width, block4.width);
        this.drawFigur(xCanvas);
    }

    public void moveleft(Canvas xCanvas){
        block1.xPosition -= 30;
        block2.xPosition -= 30;
        block3.xPosition -= 30;
        block4.xPosition -= 30;
        xCanvas.getGraphicsContext2D().clearRect(block1.xPosition + 30, block1.yPosition - 30, block1.width, block1.width);
        xCanvas.getGraphicsContext2D().clearRect(block2.xPosition + 30, block2.yPosition - 30, block2.width, block2.width);
        xCanvas.getGraphicsContext2D().clearRect(block3.xPosition + 30, block3.yPosition - 30, block3.width, block3.width);
        xCanvas.getGraphicsContext2D().clearRect(block4.xPosition + 30, block4.yPosition - 30 , block4.width, block4.width);
        this.drawFigur(xCanvas);
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

