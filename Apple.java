import java.awt.image.*;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.*;

public abstract class Apple implements Globals, Components
{
    //x,y position of apple element
    private int x, y;
    private String imagePath;

    public Apple(String imagePath, int x, int y)
    {
        this.x = x;
        this.y = y;
        this.imagePath = imagePath;

    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x=x;
    }

    public void setY(int y){
        this.y=y;
    }

    public BufferedImage drawApple(){

        ImageIcon icon = new ImageIcon(imagePath);
        Image image = icon.getImage();
        BufferedImage bufferedImage = new BufferedImage(1188,1188,BufferedImage.TYPE_INT_ARGB);
        bufferedImage.getGraphics().drawImage(image,0,0,UNIT_SIZE,UNIT_SIZE,null);
        return bufferedImage;
    }
    
    public void checkApple() {

    }
}
