import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FirstGUI {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 500);;
        ImageIcon icon = new ImageIcon("download.jpg");
        frame.setIconImage(icon.getImage());
        frame.getContentPane().setBackground(Color.BLACK);
    }
}
