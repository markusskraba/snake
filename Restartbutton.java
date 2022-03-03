import javax.swing.*;
import java.awt.event.*;

public class Restartbutton extends Buttons implements Components, Globals, MouseListener
{

    public Restartbutton()
    {
        super(" Restart ");
        addMouseListener(this);
        setFocusable(false);
    }

    @Override
    public void mouseClicked(MouseEvent e){

        playground.snake.setX(0,WINDOW_SIZE_X/2);
        playground.snake.setY(0,WINDOW_SIZE_Y/2);
        playground.snake.setBodyParts(4);
        playground.applesEaten = 0;
        controlpanel.applesEatenLabel.setText("0");
        playground.startGame();

    }



    
}
