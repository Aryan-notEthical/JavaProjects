
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Message {


    public static void main(String[] args) {
    ImageIcon icon = new ImageIcon("images.png");
    String No[] = {"Yes","Yes"};

     String input = JOptionPane.showInputDialog(null, "What is your name");
     JOptionPane.showOptionDialog(null, "There is something watching you "+input,input, JOptionPane.DEFAULT_OPTION,0, icon,No,0);
     
    }
}
  