import javax.swing.*;
import java.awt.*;


public class GameContainer extends JPanel implements Globals, Components
{
    BorderLayout layout = new BorderLayout();
    public GameContainer()
    {
        setLayout(layout);
        add(controlpanel,layout.NORTH);
        add(playground,layout.CENTER);
        setFocusable(false);
        

    }


}
