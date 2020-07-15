import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;


public class GUI implements ActionListener {
    private JFrame frame;
    private JLabel label;
    private JPanel panel;

    private ImageIcon image;

    private JLabel label2;

    private int count = 1;

    public GUI() {
        frame = new JFrame();

        JButton button = new JButton("Next");
        button.addActionListener(this);
        button.setVerticalAlignment(JButton.BOTTOM);

        

        image = new ImageIcon(getClass().getResource("character/image" + Integer.toString(count) + ".jpg"));
        label = new JLabel(image);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);

        label2 = new JLabel();
        //label2.setText("" + count);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        //panel.setLayout(new GridLayout(0, 1));
        
        
        panel.add(label);
        panel.add(button);

        panel.add(label2);
        
        frame.add(panel);
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Bopomofo");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }
    
    public void actionPerformed(ActionEvent e) {
        if(count <= 37) {
            count++;
            image = new ImageIcon(getClass().getResource("character/image" + Integer.toString(count) + ".jpg"));
            label.setIcon(image);
            //label2.setText("" + count);
        }
        
    }
}