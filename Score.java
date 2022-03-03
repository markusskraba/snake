import javax.swing.*;
import java.awt.*;

public class Score extends JPanel implements Components, Globals
{
    //class for personal highscore in the menu
    JLabel highscore = new JLabel("");
    MenuButton back = new MenuButton(" Zurück zum Menü ",5);
    BorderLayout layout = new BorderLayout();
    
    public Score()
    {
        this.setLayout(layout);
        add(highscore,layout.CENTER);
        add(back,layout.NORTH);
        
        highscore.setText("Noch kein Highscore vorhanden");
        // System.out.println("test");
        
        highscore.setHorizontalAlignment(this.getWidth()/2);
        highscore.setVerticalAlignment(this.getHeight()/2);
        highscore.setFont(SCORE_FONT);
        setBackground(BACKGROUND_MENU);
    }
    
    
    public void setScore(String newScore) {
        highscore.setText(newScore);
    }

    
}
