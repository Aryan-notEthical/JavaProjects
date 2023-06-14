import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FunGui {
    public static void main(String[] args) {

        JLabel label = new JLabel();
        label.setText("AUR BETE KYA HAL HAI");
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setVerticalTextPosition(JLabel.TOP);
        ImageIcon icon = new ImageIcon("images.jpg");
        label.setIcon(icon);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setTitle("hehe");
        frame.setSize(500, 269);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        // frame.pack();
    }
    
}
