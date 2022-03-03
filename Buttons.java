import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.border.*;

public class Buttons extends JButton implements MouseListener, Globals
{
    // Button Styling Class
    
    public Buttons(String content) {
        content = content.toUpperCase();
        this.setFocusPainted(false);
        this.setText(content);
        this.setBorder(null);
        this.setForeground(TEXT_COLOR);
        this.setBackground(BUTTON_BACKGROUND);
        this.setFont(HEADER_FONT);
        this.setOpaque(true);
        
        addMouseListener(this);
    }


    @Override public void mouseClicked(MouseEvent me) {}
    @Override public void mouseReleased(MouseEvent me) {}
    @Override public void mousePressed(MouseEvent me) {}
    
    
    @Override
    public void mouseEntered(MouseEvent e) { 
        if (e.getSource()==this) {  
            this.setBackground(BUTTON_HOVER); 
        }
    }
    @Override
    public void mouseExited(MouseEvent e) { 
        if (e.getSource()==this) { 
            this.setBackground(BUTTON_BACKGROUND); 
        }
    }
}

