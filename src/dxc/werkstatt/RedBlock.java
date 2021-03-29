package dxc.werkstatt;

import javafx.scene.canvas.Canvas;

import static javafx.scene.paint.Color.RED;

public class RedBlock extends Figur{

    public RedBlock(double x, double y){
        this.block1 = new Block(x, y);
        this.block2 = new Block(x + 30, y);
        this.block3 = new Block(x + 30,y + 30);
        this.block4 = new Block(x + 60, y + 30 );
        this.farbe = RED;
    }
}
