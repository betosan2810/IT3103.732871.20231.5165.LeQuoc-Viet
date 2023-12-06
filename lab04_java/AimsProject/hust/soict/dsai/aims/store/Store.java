//Le Quoc Viet - 20215165
package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.*;
import java.util.ArrayList;
public class Store {

	private ArrayList<media> itemsInStore = new ArrayList<media>();

	public void addMedia(media media) {
		if (itemsInStore.contains(media)) {
			System.out.println("Item already in store.");
		} else {
			itemsInStore.add(media);
			System.out.println("Added " + media.toString() + " to store.");
		}
	}

	public void removeMedia(media media) {
		if (itemsInStore.remove(media)) {
			System.out.println("Removed " + media.toString() + " from store.");
		} else {
			System.out.println("Couldn't find this item.");
		}
	}
	
	public void displayItems() {
		System.out.println("\n***********************STORE***********************");
		for (media m: itemsInStore) {
			System.out.println(m.toString());
		}
		System.out.println("***************************************************");
	}
	public media fetchMedia(String title) {
		for (media m : itemsInStore) {
			if (m.isMatch(title))
				return m;
		}
		return null;
	}
}
