
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NewWindow {


    public static void Window(){
        JLabel label = new JLabel("PAGAL BEKAR BUTTONS PE CLICK MAT KIYA KAR HACK HO JAYE GA EK DIN");


        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(label);
        frame.setLocation(690, 150);


    }

    public static void main(String[] args) {
        JButton button = new JButton("Click to know yourself");
        button.setBounds(90, 70, 350, 50);


        button.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                if (e.getSource()==button) {
                    Window();
                    
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(button);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setAlwaysOnTop(true);
        frame.add(button);
        frame.add(panel);
        
    }
    
}
