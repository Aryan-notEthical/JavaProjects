
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Text {
    public static void main(String[] args) {
        JLabel label = new JLabel();
        label.setText("Enter something");
        label.setBounds(0, 0, 157,36);


        
        JTextField text = new JTextField();
        text.setBounds(0, 28, 157, 35);
        text.setFocusable(true);
        
        JPanel textPan = new JPanel();
        textPan.add(text);

        JButton button = new JButton("Submit");
        button.setBounds(160, 28, 158, 35);
        
        JPanel buttonPan = new JPanel();
        buttonPan.add(button);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(314,100);
        frame.setLayout(null);
        frame.add(label);
        frame.add(text);
        frame.add(textPan);
        frame.add(button);
        frame.add(buttonPan);
        
        
    }
}
