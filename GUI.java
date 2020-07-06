import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;


public class GUI implements ActionListener {
    private JFrame frame;
    private JLabel label;
    private JPanel panel;

    private ImageIcon image;

    private int count = 1;

    public GUI() {
        frame = new JFrame();

        JButton button = new JButton("Next");
        button.addActionListener(this);
        button.setVerticalAlignment(JButton.BOTTOM);

        

        image = new ImageIcon(getClass().getResource("characters/image" + Integer.toString(count) + ".jpg"));
        label = new JLabel(image);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        //panel.setLayout(new GridLayout(0, 1));
        
        
        panel.add(label);
        panel.add(button);

        
        frame.add(panel);
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Bopomofo");
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        image = new ImageIcon(getClass().getResource("characters/image" + Integer.toString(count) + ".jpg"));
        label.setIcon(image);
    }
}