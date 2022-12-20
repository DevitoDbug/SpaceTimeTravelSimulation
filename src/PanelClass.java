import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PanelClass extends JPanel implements ActionListener {
    Timer timer;
    Handler handler  = new Handler();
    final int NUMBER_OF_STARS = 500 ;

    PanelClass()
    {
        for (int i = 0 ; i < NUMBER_OF_STARS ; i++)
        {
            handler.addStar();
        }

        timer = new Timer (10 , this);
        timer.start();

        this.setLayout(null);
        this.setBackground(Color.BLACK);
        this.setVisible(true);
    }

    @Override
    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        handler.draw(g);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        handler.updatePosition();
        repaint();
    }
}
