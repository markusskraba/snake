
public class BadApple extends Apple
{ 

    public BadApple(String imagePath, int x, int y)
    {
        super(imagePath, x, y);
    }

    
     @Override
    public void checkApple() {

        if ((playground.snake.getX(0) == playground.badapple.getX()) && (playground.snake.getY(0) == playground.badapple.getY())) {
            playground.snake.setBodyParts(playground.snake.getBodyParts()-1);
            playground.applesEaten--;
            if(playground.applesEaten < 0) { 
                playground.running = false;
                playground.applesEaten=0;
            }
            controlpanel.applesEatenLabel.setText(playground.applesEaten.toString());
            playground.badapple = new BadApple(PATH_BADAPPLE,playground.random.nextInt((int) ((WINDOW_SIZE_X / UNIT_SIZE)-4))*UNIT_SIZE, playground.random.nextInt((int) (WINDOW_SIZE_Y / UNIT_SIZE)-4)*UNIT_SIZE);
        }
    }
}
