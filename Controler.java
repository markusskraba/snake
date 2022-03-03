import java.awt.event.*;

public class Controler extends KeyAdapter implements Components, Globals
{

    public Controler()
    {
    
    }

    
    @Override
        public void keyPressed(KeyEvent e) {
            
            //gets the key code of the arrow keys and sets the direction to where the snake moves next
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    
                    if (playground.snake.getDirection() != 'R') {
                        playground.snake.setDirection('L');
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (playground.snake.getDirection() != 'L') {
                        playground.snake.setDirection('R');
                    }
                    break;
                case KeyEvent.VK_UP:
                    
                    if (playground.snake.getDirection() != 'D') {
                        playground.snake.setDirection('U');
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (playground.snake.getDirection() != 'U') {
                        playground.snake.setDirection('D');
                    }
                    break;
            }
        }
}
