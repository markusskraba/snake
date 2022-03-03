import java.awt.*;
import javax.swing.*;

public interface Components

{
    ControlPanel controlpanel = new ControlPanel();
    Playground playground = new Playground();
    BorderLayout borderlayout = new BorderLayout();
    CardLayout cardlayout = new CardLayout();
    Menu menu = new Menu();
    GameContainer spiel = new GameContainer();
    Place container = new Place(); 
    //Options optio = new Options();
    //Score score = new Score();
}
