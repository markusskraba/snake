import javax.swing.*;
import java.awt.*;

public class Menu extends JPanel implements Globals
{
    BorderLayout layout = new BorderLayout();
    JLabel labelTitle = new JLabel();
    JPanel btns = new JPanel();
    MenuButton start = new MenuButton(" Start ",1);
    MenuButton optionen = new MenuButton(" Optionen ",2);
    MenuButton scores = new MenuButton(" Highscores ",3);
    MenuButton exit = new MenuButton(" Spiel Verlassen ",4);
    
    public Menu()
    {
        setBackground(BACKGROUND_MENU);
        setLayout(layout);
        labelTitle.setText("Willkommen im Snake Spielemenü!");
        labelTitle.setHorizontalAlignment(this.getWidth()/2);
        labelTitle.setFont(HEADER_FONT);
        // btns =  Panel where Buttons are inside
        btns.setLayout(new GridLayout());
        
        btns.add(start);
        btns.add(optionen);
        btns.add(scores);
        btns.add(exit);
        add(labelTitle,layout.NORTH);
        add(btns,layout.CENTER);
    
    }


}
