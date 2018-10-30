package afvink4;
import javax.swing.*;
import java.awt.*;

public class TicTacToe {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(500,500));
        frame.setLayout(new FlowLayout());
        
        JLabel label = new JLabel("afvink 4, Tic Tac Toe");
        frame.add(label);
        
        frame.setVisible(true);
    }

}
