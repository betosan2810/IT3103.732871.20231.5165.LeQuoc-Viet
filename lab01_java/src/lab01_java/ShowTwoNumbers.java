package lab01_java;
import javax.swing.JOptionPane;
public class ShowTwoNumbers {
	public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "Le Quoc Viet 5165 - You've just entered: ";

        strNum1 = JOptionPane.showInputDialog(null, "Le Quoc Viet 5165 - Please input the first number: ", "Le Quoc Viet 5165 - Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";
        strNum2 = JOptionPane.showInputDialog(null, "Le Quoc Viet 5165 - Please input the second number: ", "Le Quoc Viet 5165 - Input the second number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;

        JOptionPane.showMessageDialog(null, strNotification, "Le Quoc Viet 5165 - Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}
