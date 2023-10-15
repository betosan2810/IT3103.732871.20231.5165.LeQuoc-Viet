package lab01_java;
import javax.swing.JOptionPane;
public class PtBacI {
	public static void main(String[] args) {
        // nhap a va b
        String inputA = JOptionPane.showInputDialog("Nhap he so 'a':");
        String inputB = JOptionPane.showInputDialog("Nhap he so 'b':");

        // chuyen tu string sang double
        double a = Double.parseDouble(inputA);
        double b = Double.parseDouble(inputB);

        // kiem tra xem a co khac 0 khong
        if (a != 0) {
            double x = -b / a;

            JOptionPane.showMessageDialog(null, "Nghiem la: " + x);
        } else {
            // neu a = 0 thi day khong phai la phuong trinh bac 1
            JOptionPane.showMessageDialog(null, "Day khong phai phuong trinh bac 1");
        }
    }

}
