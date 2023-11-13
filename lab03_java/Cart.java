package lab03_java;

public class Cart {
public static final int MAX_NUMBERS_ORDERED = 20;
    
    // khởi tạo giỏ hàng
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    // khởi tạo số đĩa đã thêm vào giỏ
    private int qtyOrdered;
    
    // hàm thêm đĩa vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
    	// nếu giỏ chưa đầy thì thêm đĩa vào
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
        	// giỏ đầy thì không thêm
            System.out.println("The cart is almost full. Cannot add more discs.");
        }
    }

    // New method with a different type of parameter (array of DVDs)
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        // Add a list of DVDs to the current cart
        for (DigitalVideoDisc dvd : dvdList) {
            addDigitalVideoDisc(dvd); // Reuse the existing method
        }
    }

    // // Another method allowing an arbitrary number of DVD arguments
    // public void addDigitalVideoDisc(DigitalVideoDisc... dvdArray) {
    //     // Add an arbitrary number of DVDs to the current cart
    //     for (DigitalVideoDisc dvd : dvdArray) {
    //         addDigitalVideoDisc(dvd); // Reuse the existing method
    //     }
    // }

    // Overloading by differing the number of parameters
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        // Add two DVDs to the current cart
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
    	// khởi tạo biến found 
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
        	// tìm thấy đĩa cần xóa trong giỏ hàng
            if (itemsOrdered[i].equals(disc)) {
                // nâng chỉ số của các đĩa đứng sau đĩa vừa tìm thấy lên 1
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                // xóa đĩa ở vị trí đó
                itemsOrdered[qtyOrdered - 1] = null; // Set the last element to null
                qtyOrdered--;
                found = true;
                System.out.println("The disc has been removed.");
                break; // thoát chương trình khi đã tìm và xóa đĩa
            }
        }
        // không tìm thấy đĩa
        if (!found) {
            System.out.println("Disc not found in the cart. Cannot remove.");
        }
    }
    
    // hàm tính tổng tiền
    public float totalCost() {
    	// khởi tạo biến total
        float total = 0.0f;
        // lặp qua giỏ hàng để cộng các cost lại
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    
    // New method to print the list of ordered items, their details, and the total cost
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:\n");

        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". DVD - " + itemsOrdered[i].toString());
        }

        System.out.println("\nTotal cost: " + totalCost() + " $\n");
        System.out.println("***************************************************");
    }

    // New method to search for DVDs in the cart by ID and display the search results
    public void searchByID(int id) {
        System.out.println("Search Result for DVD with ID " + id + ":");

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println("DVD - " + itemsOrdered[i].toString());
                return; // Found a match, no need to continue searching
            }
        }

        System.out.println("No match found for DVD with ID " + id);
    }

    // New method to search for DVDs in the cart by title and print the results
    public void searchByTitle(String title) {
        System.out.println("Search Result for DVDs with Title '" + title + "':");

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println("DVD - " + itemsOrdered[i].toString());
            }
        }

        if (noMatchFound(title)) {
            System.out.println("No match found for DVDs with Title '" + title + "'");
        }
    }

    // Helper method to check if there is no match for the given title
    private boolean noMatchFound(String title) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                return false; // Found a match, no need to continue checking
            }
        }
        return true; // No match found
    }
    // hàm in thông tin tất cả các đĩa trong giỏ hàng (để kiểm tra sau khi xóa đĩa khỏi giỏ)
    public String toString() {
    	String result = "";
        for (int i = 0; i < qtyOrdered; i++) {
            result += itemsOrdered[i].toString();
            result += "\n";
        }
        return result;
    }

}
