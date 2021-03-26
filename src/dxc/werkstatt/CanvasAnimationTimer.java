package dxc.werkstatt;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;

import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

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
        if (now - zeit > 1000000000) {
            canvas.getGraphicsContext2D().clearRect(0,0, canvas.getWidth(), canvas.getHeight());
            f.draw(canvas);
            f.moveDown();
            zeit = now;
        }
    }

}
