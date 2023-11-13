//Le Quoc Viet - 20215165
package lab02_java;

public class Cart {
public static final int MAX_NUMBERS_ORDERED = 20;
    
    // init cart
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    // init so dia them vao cart
    private int qtyOrdered;
    
    // them dia vao cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
    	// chua day cart thi them dia vao
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
        	// cart day thi in ra thong bao k them duoc
            System.out.println("The cart is almost full. Cannot add more discs.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
        	// tim dia can xoa trong cart
            if (itemsOrdered[i].equals(disc)) {
                // tang chi so cua dia dung sau len 1 don vi
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                // xoa dia o vi tri do 
                itemsOrdered[qtyOrdered - 1] = null; // gan null cho phan tu cuoi
                qtyOrdered--;
                found = true;
                System.out.println("The disc has been removed.");
                break; // thoat chuong trinh va xoa dia
            }
        }
        // khong tim thay dia
        if (!found) {
            System.out.println("Disc not found in the cart. Cannot remove.");
        }
    }
    
    // tinh tong tien
    public float totalCost() {
    	// init total
        float total = 0.0f;
        // duyet qua cart de tinh tong
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    
    // in thong tin cac dia con lai trong gio
    public String toString() {
    	String result = "";
        for (int i = 0; i < qtyOrdered; i++) {
            result += itemsOrdered[i].toString();
            result += "\n";
        }
        return result;
    }

}
