
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JTextField;

public class Form {
    public static void main(String[] args) {
        JLabel label = new JLabel();
        label.setText("Please fill up the form");
        label.setBounds(0, 0, 240, 40);
    

        JTextField textf = new JTextField("FullName");
        textf.setBounds(0, 28, 280, 35);

        
        JTextField textNum = new JTextField("Phone Number");
        textNum.setBounds(0, 70, 280, 35);


        JTextField textEmail= new JTextField("Email");
        textEmail.setBounds(0,  115, 280, 35);


        JButton button = new JButton();
        button.setText("Submit");
        button.setBounds(0, 155, 90, 35);
        
        button.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button){
                    System.out.println("Name - "+textf.getText());
                    System.out.println("Phone number  - "+textNum.getText());
                    System.out.println("Email - "+textEmail.getText());
                    JOptionPane.showMessageDialog(null,"Thanks for using our form" ,"Thanks",JOptionPane.DEFAULT_OPTION);  
                }
            }   
        });  
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 270);
        frame.setLayout(null);
        frame.add(textf);
        frame.add(textEmail);
        frame.add(textNum);
        frame.add(button);
        frame.add(label);
    }
}
