package dxc.werkstatt;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;

import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

import static javafx.scene.paint.Color.CYAN;

public class CanvasAnimationTimer extends AnimationTimer {

    private final Canvas canvas;
    private long zeit = 0;
    CyanBlock f = new CyanBlock(90, 0);

    public CanvasAnimationTimer(Canvas canvas){
        super();
        this.canvas = canvas;
    }
    @Override
    public void handle(long now){
        canvas.getGraphicsContext2D().clearRect(0,0, canvas.getWidth(), canvas.getHeight());
        f.drawFigur(canvas, CYAN);
        if (f.block4.yPosition < canvas.getHeight() - 30)
        {
            if (now - zeit > 500000000)
            {
                f.fallDown();
                zeit = now;
            }
        }
    }

}
