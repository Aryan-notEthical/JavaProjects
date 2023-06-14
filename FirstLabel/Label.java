import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Label {
    public static void main(String[] args) {

        JLabel label = new JLabel();
        label.setText("HELLO FRIEND");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setIconTextGap(-39);

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.YELLOW);
        ImageIcon icon = new ImageIcon("images.jpg");
        label.setIcon(icon);
        label.setOpaque(true);
        label.setBackground(Color.black);
        label.setBounds(0, 0, 250, 250);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.add(label);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setResizable(false);

    }

}
