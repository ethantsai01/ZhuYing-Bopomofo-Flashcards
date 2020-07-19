import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;


public class GUI implements ActionListener {
    private JFrame frame;
    private JButton addButton;
    private JButton subtractButton;

    private JLabel label;
    private JPanel panel;

    private ImageIcon image;

    private JLabel label2;

    private int count = 1;

    public GUI() {
        frame = new JFrame();

        addButton = new JButton("Next");
        addButton.addActionListener(this);
        addButton.setVerticalAlignment(JButton.BOTTOM);

        subtractButton = new JButton("Previous");
        subtractButton.addActionListener(this);
        subtractButton.setVerticalAlignment(JButton.BOTTOM);

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
        panel.add(addButton);
        panel.add(subtractButton);
        

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
        if(e.getSource() == addButton) {
            count++;
            image = new ImageIcon(getClass().getResource("character/image" + Integer.toString(count) + ".jpg"));
            label.setIcon(image);
            //label2.setText("" + count);

            if(count == 37) {
                addButton.setVisible(false);
                subtractButton.setVisible(true);
            }
            else {
                addButton.setVisible(true);
                subtractButton.setVisible(true);
            }
        }
        else if (e.getSource() == subtractButton) {
            count--;
            image = new ImageIcon(getClass().getResource("character/image" + Integer.toString(count) + ".jpg"));
            label.setIcon(image);
            //label2.setText("" + count);

            if(count == 1) {
                addButton.setVisible(true);
                subtractButton.setVisible(false);
            }
            else {
                addButton.setVisible(true);
                subtractButton.setVisible(true);
            }
        }
    }
}