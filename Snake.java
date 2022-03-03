import java.awt.*;

public class Snake implements Globals, Components
{
    
    //x and y position of each snake body part is saved in array x[],y[]
    private final int[] x = new int[GAME_UNITS];
    private final int[] y = new int[GAME_UNITS];
    
    //number of body parts
    private int bodyParts;
    
    //direction in which snake is moving
    private char direction;
 
    private char color;

    public Snake()
    {
        //default snake specs
        this.color = color;
        this.direction = 'R';
        this.bodyParts = 4;
        x[0] = WINDOW_SIZE_X/2;
        y[0] = WINDOW_SIZE_Y/2;
        
        //remove after implenting color value from menu
        this.color = 'b';
    }

    public int getX(int i){
        return x[i];
    }

    public int getY(int i){
        return y[i];
    }

    public int setX(int i, int value){
        return x[i] = value;
    }

    public int setY(int i, int value){
        return y[i] = value;
    }

    public char getColor(){
        return color;
    }
    
    public void setColor(char newColor){
        color = newColor;
    }

    public char getDirection(){
        return direction;
    }

    public void setDirection(char d){
        direction = d;
    }

    public int getBodyParts(){
        return bodyParts;
    }
    
    public void setBodyParts(int bp){
        bodyParts = bp;
    }

    public void move() {

        //replaces array elements with the previous element in the list
        for (int i = bodyParts; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }

        //changes postition of the first array element to the next position in the grid according to the direction (Up, Down, Left, Right)
        switch (direction) {
            case 'U':
                y[0] = y[0] - UNIT_SIZE;
                break;

            case 'D':
                y[0] = y[0] + UNIT_SIZE;
                break;

            case 'L':
                x[0] = x[0] - UNIT_SIZE;
                break;

            case 'R':
                x[0] = x[0] + UNIT_SIZE;
                break;

        }

    }

    public void checkCollisions() {
        
        //checks if head collides with body
        for (int i = bodyParts; i > 0; i--) {
            if ((x[0] == x[i]) && (y[0] == y[i])) {
                playground.running = false;
            }
        }

        //check if head touches left border
        if (x[0] < 0) {
            playground.running = false;
        }

        //check if head touches right border
        if (x[0] > WINDOW_SIZE_X) {
            playground.running = false;
        }

        //check if head touches top border
        if (y[0] < 0) {
            playground.running = false;
        }

        //check if head touches bottom border
        if (y[0] > WINDOW_SIZE_Y) {
            playground.running = false;
        }

        if (!playground.running) {
            playground.timer.stop();
        }

    }
}
