package lab01_java;
import javax.swing.JOptionPane;
//su dung phuong phap dinh thuc Cramer de giai he phuong trinh bac 1
public class HeptBac1 {
	public static void main(String[] args) {
        // nhap he so phuong trinh 1
        double a1 = Double.parseDouble(JOptionPane.showInputDialog("Nhap he so a cua phuong trinh 1"));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog("Nhap he so b cua phuong trinh 1"));
        double c1 = Double.parseDouble(JOptionPane.showInputDialog("Nhap he so c cua phuong trinh 1"));

        // nhap he so phuong trinh 2
        double a2 = Double.parseDouble(JOptionPane.showInputDialog("Nhap he so a cua phuong trinh 2"));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog("Nhap he so b cua phuong trinh 2"));
        double c2 = Double.parseDouble(JOptionPane.showInputDialog("Nhap he so c cua phuong trinh 2"));

        // tinh dinh thuc 
        double det = a1 * b2 - a2 * b1;

        // kiem tra neu phuong trinh co nghiem duy nhat khong
        if (det != 0) {
            // tinh nghiem
            double x = (c1 * b2 - c2 * b1) / det;
            double y = (a1 * c2 - a2 * c1) / det;

            JOptionPane.showMessageDialog(null, "nghiem x la: " + x + "\nNghiem y la: " + y);
        } else {
            // kiem tra xem co vo so nghiem khong
            if (a1 / a2 == b1 / b2 && b1 / b2 == c1 / c2) {
                JOptionPane.showMessageDialog(null, "He vo so nghiem");
            } else {
                // vo nghiem
                JOptionPane.showMessageDialog(null, "He vo nghiem");
            }
        }
    }

}
