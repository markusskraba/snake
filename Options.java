import javax.swing.*;
import java.awt.*;

public class Options extends JPanel implements Components
{
    MenuButton red = new MenuButton(" rot ",6);
    MenuButton blue = new MenuButton(" blau ",6);
    MenuButton green = new MenuButton(" grün ",6);
    GridLayout layout = new GridLayout();
    MenuButton back = new MenuButton(" Zurück zum Menü ",5);

    public Options()
    {
        setLayout(layout);
        
        red.addActionListener((actionEvent)->{
        playground.snake.setColor('r');
        container.menuCard();
        
        });
        
        blue.addActionListener((actionEvent)->{
        playground.snake.setColor('b');
        container.menuCard();
        
        });
        
        green.addActionListener((actionEvent)->{
        playground.snake.setColor('g');
        container.menuCard();
        
        });
        
        add(red);
        add(blue);
        add(green);
        add(back);
    }

}
