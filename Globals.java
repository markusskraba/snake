import java.awt.Color;
import javax.swing.*;
import java.awt.Font;

public interface Globals
{   
    int WINDOW_SIZE_X = 1200;
    int WINDOW_SIZE_Y = 700;

    //unit size = size of one field in the grid
    int UNIT_SIZE = 25;
    //total number of fields in the grid
    int GAME_UNITS = (WINDOW_SIZE_X * WINDOW_SIZE_Y) / UNIT_SIZE;
    int DELAY = 75;
    
    Color BACKGROUND_MENU = new Color (220, 220, 220);
    Color BACKGROUND_GAME = new Color (0, 0, 0);
    Color BACKGROUND_GAMEOVER = new Color (34, 72, 112);
    
    Color BUTTON_BACKGROUND = new Color (34, 72, 112);
    Color BUTTON_HOVER = new Color (53, 110, 172);
    Color TEXT_COLOR = new Color (255, 255, 255);
    
    Font GAMEOVER_FONT = new Font("Monospaced",Font.BOLD,100);
    Font SCORE_FONT = new Font("Monospaced",Font.BOLD,50);
    Font HEADER_FONT = new Font("Monospaced",Font.BOLD,18);

    String PATH_GOODAPPLE= "graphics/apple.png";
    String PATH_BADAPPLE = "graphics/badapple.png";


}
