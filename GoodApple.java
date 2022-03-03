
public class GoodApple extends Apple
{

    public GoodApple(String imagePath, int x, int y)
    {
        super(imagePath, x, y);
    }

    @Override
    public void checkApple() {
        
        if ((playground.snake.getX(0) == playground.goodapple.getX()) && (playground.snake.getY(0) == playground.goodapple.getY())) {
            playground.snake.setBodyParts(playground.snake.getBodyParts()+1);
            playground.applesEaten++;
            controlpanel.applesEatenLabel.setText(playground.applesEaten.toString());
            playground.goodapple = new GoodApple(PATH_GOODAPPLE,playground.random.nextInt((int) ((WINDOW_SIZE_X / UNIT_SIZE)-4))*UNIT_SIZE, playground.random.nextInt((int) (WINDOW_SIZE_Y / UNIT_SIZE)-4)*UNIT_SIZE);
        }
    }
}
