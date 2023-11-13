package lab03_java;

public class Store {
	private DigitalVideoDisc[] itemsInStore;
	private int itemCount;

	// Constructor để khởi tạo cửa hàng với kích thước tối đa
	public Store(int maxSize) {
	    itemsInStore = new DigitalVideoDisc[maxSize];
	    itemCount = 0;
	}

	// Phương thức để thêm một DVD vào cửa hàng
	public void addDVD(DigitalVideoDisc dvd) {
	    if (itemCount < itemsInStore.length) {
	        itemsInStore[itemCount] = dvd;
	        itemCount++;
	        System.out.println("DVD được thêm vào cửa hàng: " + dvd.getTitle());
	    } else {
	        System.out.println("Cửa hàng đầy. Không thể thêm DVD nữa.");
	    }
	}

	// Phương thức để loại bỏ một DVD khỏi cửa hàng
	public void removeDVD(int index) {
	    if (index >= 0 && index < itemCount) {
	        System.out.println("DVD được loại bỏ khỏi cửa hàng: " + itemsInStore[index].getTitle());
	        // Dịch chuyển DVDs để điền vào khoảng trống
	        for (int i = index; i < itemCount - 1; i++) {
	            itemsInStore[i] = itemsInStore[i + 1];
	        }
	        itemsInStore[itemCount - 1] = null; // Đặt phần tử cuối cùng thành null
	        itemCount--;
	    } else {
	        System.out.println("Chỉ số không hợp lệ. Không thể loại bỏ DVD.");
	    }
	}

	// Phương thức getter để trả về các mục trong cửa hàng
	public DigitalVideoDisc[] getItemsInStore() {
	    return itemsInStore;
	}

	// Phương thức getter để trả về số lượng mục trong cửa hàng
	public int getItemCount() {
	    return itemCount;
	}


}
