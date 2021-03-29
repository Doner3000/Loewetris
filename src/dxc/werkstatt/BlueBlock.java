package dxc.werkstatt;

import javafx.scene.canvas.Canvas;

import static javafx.scene.paint.Color.BLUE;

public class BlueBlock extends Figur{

    public BlueBlock(double x, double y)
    {
        this.block1 = new Block(x, y);
        this.block2 = new Block(x, y + 30);
        this.block3 = new Block(x + 30, y + 30);
        this.block4 = new Block(x + 60, y + 30);
        this.farbe = BLUE;
    }
}