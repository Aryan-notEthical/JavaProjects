import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class button {
    public static void main(String[] args) {
        JButton button = new JButton("Click");
        button.setBounds(250, 200, 140, 55);
        

        JPanel panButton = new JPanel();
        panButton.add(button);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(750,600 );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.add(panButton);
    }
}
