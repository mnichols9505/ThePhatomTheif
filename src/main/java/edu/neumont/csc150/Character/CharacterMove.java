package edu.neumont.csc150.Character;

import com.sun.webkit.dom.KeyboardEventImpl;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class CharacterMove implements EventHandler <KeyEvent> {

    @FXML
    private Canvas mainCanvas;

    private int ballx = 50,bally = 50,ballwidth =80,ballheight=80;

    private int vX = 8 , vY = 8;

    public void init() {
        Timeline timer = new Timeline(new KeyFrame(Duration.millis(10), e -> draw()));

        timer.setCycleCount(Timeline.INDEFINITE);
        timer.play();
    }

    public void draw() {
        GraphicsContext gc = mainCanvas.getGraphicsContext2D();

        gc.setFill(Color.WHITE);
        gc.fillRect(0,0,this.mainCanvas.getWidth(),this.mainCanvas.getHeight());

        gc.setFill(Color.BLUE);
        gc.fillOval(ballx,bally,ballwidth,ballheight);


    }

    @Override
    public void handle(KeyEvent e) {
            if(e.getCode().equals(KeyCode.UP)) {
                System.out.println("UP key was pressed");
                bally -=10;
            }
            if(e.getCode().equals(KeyCode.DOWN)){
                System.out.println("Down key was pressed");
                bally +=10;
            }
             if(e.getCode().equals(KeyCode.LEFT)){
            System.out.println("Left key was pressed");
                ballx-=10;
            }
             if(e.getCode().equals(KeyCode.RIGHT)){
            System.out.println("Right key was pressed");
                ballx+=10;
            }


    }
}
