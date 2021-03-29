package dxc.werkstatt;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

import static javafx.scene.paint.Color.CYAN;

public class CanvasAnimationTimer extends AnimationTimer {

    private List<Figur> figuren = new ArrayList<>();
    private final Canvas canvas;
    private long zeit = 0;
    private SplittableRandom rng = new SplittableRandom();
    private Figur f = randomBlockErstellen();
    private List<Block> bloeckeUnten = new ArrayList<>();

    public CanvasAnimationTimer(Canvas canvas){
        super();
        this.canvas = canvas;
    }

    public void move(KeyEvent event) {
        if (f.block1.xPosition >= 30 && event.getCode() == KeyCode.A) {
            f.moveleft(canvas);
        }
        else if (f.block4.xPosition <= 240 && event.getCode() == KeyCode.D)
        {
            f.moveRight(canvas);
        }
    }

    private Figur randomBlockErstellen(){
        CyanBlock c = new CyanBlock(90, 0);
        RedBlock r = new RedBlock(90,0);
        BlueBlock b = new BlueBlock(90,0);
        OrangeBlock o = new OrangeBlock(150, 0);
        GreenBlock g = new GreenBlock(120,0);
        PurpleBlock p = new PurpleBlock(120, 0);
        YellowBlock y = new YellowBlock(150,0);

        figuren.addAll(List.of(c, r, b, o, g, p, y));

        int random = rng.nextInt(7);

        return figuren.get(random);
    }




    @Override
    public void handle(long now){

        if (f.block4.yPosition <= canvas.getHeight() - 30)
        {

            if (now - zeit > 500000000)
            {
                f.removeFigur(canvas);
                f.drawFigur(canvas);
                f.fallDown();
                zeit = now;
            }
            bloeckeUnten.add(f.block1);
            bloeckeUnten.add(f.block2);
            bloeckeUnten.add(f.block3);
            bloeckeUnten.add(f.block4);
        } else f = randomBlockErstellen();
    }

}
