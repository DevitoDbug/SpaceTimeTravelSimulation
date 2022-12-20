import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Star time travel simulation");
        PanelClass panel = new PanelClass();
        panel.setBounds(0, 0 , 700 , 700);

        frame.add(panel);

        frame.setLayout(null);
        frame.setBounds(350, 0 , 700 , 700);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}