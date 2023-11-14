package lab01_java;
import javax.swing.JOptionPane;
public class Divide {
public static void main(String[] args) {
        
        String input1 = JOptionPane.showInputDialog("Enter the first double number:");
        double num1 = Double.parseDouble(input1);

        
        String input2 = JOptionPane.showInputDialog("Enter the second double number:");
        double num2 = Double.parseDouble(input2);

        
        double sum = num1 + num2;
        JOptionPane.showMessageDialog(null, "Sum: " + sum);

        
        double difference = num1 - num2;
        JOptionPane.showMessageDialog(null, "Difference: " + difference);

        
        double product = num1 * num2;
        JOptionPane.showMessageDialog(null, "Product: " + product);

        // Kiem tra neu so thu 2 bang 0 truoc khi thuc hien phep chia
        if (num2 != 0) {
            
            double quotient = num1 / num2;
            JOptionPane.showMessageDialog(null, "Quotient: " + quotient);
        } else {
            JOptionPane.showMessageDialog(null, "Cannot divide by zero. Quotient is undefined.");
        }
    }

}
