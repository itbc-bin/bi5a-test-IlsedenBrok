package afvink4;

import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Afvink4 {
    int beurt = 1;
    JButton button;
    JButton eerstebutton;
    JPanel panel;
    JFrame frame;
    JLabel label;
    
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bio-informatica Tic Tac Toe");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(new Dimension(350,500));
        frame.setLayout(null);
         
        JLabel label = new JLabel("Tic Tac Toe van 599721");
        label.setLocation(10,10);
        label.setSize(250,10);
        frame.add(label);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setLocation(10,50);
        panel.setSize(300,300);
        frame.add(panel);
        
        JButton button = new JButton("Button: X=0 Y=2");
        button.setLocation(75,375);
        button.setSize(150,25);
        frame.add(button);
        

        
        frame.setVisible(true);
    }

}
