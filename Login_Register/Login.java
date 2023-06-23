import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JTextField;

public class Login {

    private static void Register() {
        JLabel label = new JLabel();
        label.setText("Email:");
        label.setBounds(59, 59, 150, 90);
        label.setFont(new Font("Consolas", Font.PLAIN, 35));

        JTextField textUser = new JTextField();
        textUser.setBounds(170, 35, 380, 40);
        textUser.setFont(new Font("Consolas", Font.PLAIN, 28));

        JLabel labelUser = new JLabel();
        labelUser.setText("Username:");
        labelUser.setBounds(7, 9, 250, 90);
        labelUser.setFont(new Font("Consolas", Font.PLAIN, 35));

        JLabel labelpassword = new JLabel();
        labelpassword.setText("Password:");
        labelpassword.setBounds(0, 110, 250, 90);
        labelpassword.setFont(new Font("Consolas", Font.PLAIN, 35));

        JTextField textEmail = new JTextField();
        textEmail.setBounds(170, 84, 380, 40);
        textEmail.setFont(new Font("Consolas", Font.PLAIN, 28));
        JTextField textPass = new JTextField();
        textPass.setBounds(170, 130, 380, 40);
        textPass.setFont(new Font("Consolas", Font.PLAIN, 28));

        JButton button = new JButton();
        button.setBounds(50, 280, 90, 40);
        button.setText("Register");
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button) {
                    try {
                        FileWriter file = new FileWriter("Register.txt", true);
                        BufferedWriter write = new BufferedWriter(file);

                        write.write(textUser.getText());
                        write.newLine();
                        write.write(textEmail.getText());
                        write.newLine();
                        write.write(textPass.getText());
                        write.newLine();
                        write.newLine();
                        write.close();

                    } catch (IOException i) {
                        System.out.println("hel");
                    }
                }
            }

        });

        JFrame frame = new JFrame();
        frame.setSize(700, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(label);
        frame.add(labelUser);
        frame.add(button);
        frame.add(labelpassword);
        frame.add(textEmail);
        frame.add(textPass);
        frame.add(textUser);

    }

    public static void WelcomeFrame() {
        JFrame frame = new JFrame();
        frame.setSize(700, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
    }

    public static void main(String[] args) {
        JLabel label = new JLabel();
        label.setText("Email:");
        label.setBounds(59, 59, 150, 90);

        label.setFont(new Font("Consolas", Font.PLAIN, 35));
        JTextField textUser = new JTextField();
        textUser.setBounds(170, 35, 380, 40);
        textUser.setFont(new Font("Consolas", Font.PLAIN, 28));

        JLabel labelUser = new JLabel();
        labelUser.setText("Username:");
        labelUser.setBounds(7, 9, 250, 90);
        labelUser.setFont(new Font("Consolas", Font.PLAIN, 35));
        JLabel labelpassword = new JLabel();

        labelpassword.setText("Password:");
        labelpassword.setBounds(0, 110, 250, 90);
        labelpassword.setFont(new Font("Consolas", Font.PLAIN, 35));
        JTextField textEmail = new JTextField();

        textEmail.setBounds(170, 84, 380, 40);
        textEmail.setFont(new Font("Consolas", Font.PLAIN, 28));
        JTextField textPass = new JTextField();

        textPass.setBounds(170, 130, 380, 40);
        textPass.setFont(new Font("Consolas", Font.PLAIN, 28));
        JButton button = new JButton();

        button.setBounds(50, 280, 90, 40);
        button.setText("Login");
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button) {
                    String filePath = "D:/EVERY THING$/Starting java/Login_Register/Register.txt";
                    textUser.getText();
                    String targetEmail = textEmail.getText();
                    textPass.getText();
                    boolean containsWord = false;
                    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            if (line.contains(targetEmail)) {
                                containsWord = true;
                                break;
                            }
                        }
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                    if (containsWord) {
                        WelcomeFrame();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error please register", "Error", 0);
                        Register();

                    }
                }
            }
        });

        JFrame frame = new JFrame();
        frame.setSize(700, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(label);
        frame.add(labelUser);
        frame.add(button);
        frame.add(labelpassword);
        frame.add(textEmail);
        frame.add(textPass);
        frame.add(textUser);
    }
}
