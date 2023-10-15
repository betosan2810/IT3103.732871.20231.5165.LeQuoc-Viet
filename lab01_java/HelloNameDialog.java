//Le Quoc Viet 20215165
package lab01_java;
import javax.swing.JOptionPane;
public class HelloNameDialog {
	public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog("please enter your name: ");
        JOptionPane.showMessageDialog(null, "Toi la Java, Hi " + result + "!");
        System.exit(0);
    }

}
