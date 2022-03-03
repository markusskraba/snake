import javax.swing.*;

public class ControlPanel extends JPanel implements Components, Globals
{
    
    private Restartbutton restartbutton = new Restartbutton();
    private JLabel scoreLabel = new JLabel();
    protected JLabel applesEatenLabel= new JLabel();
    private MenuButton returnbtn = new MenuButton(" Hauptmenu ",5);

    public ControlPanel()
        {   
        add(returnbtn);
        
        add(scoreLabel); //for score in running game
        scoreLabel.setText("Score:");
        scoreLabel.setFont(HEADER_FONT);
        
        add(applesEatenLabel);
        applesEatenLabel.setText("0");
        applesEatenLabel.setFont(HEADER_FONT);
        
        add(restartbutton);
        
        setVisible(true);
        setFocusable(false);
    }

}
