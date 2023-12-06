// Le Quoc Viet - 20215165
package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.*;
import hust.soict.dsai.aims.disc.*;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Aims {
	public static void main(String[] args) {
		// tao doi tuong gio hang
		Cart anOrder = new Cart();

		// tao cac dia moi va them vao cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		anOrder.removeDigitalVideoDisc(dvd1);
		// in tong so tien
		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());

		System.out.println(anOrder.toString());
	}

}
