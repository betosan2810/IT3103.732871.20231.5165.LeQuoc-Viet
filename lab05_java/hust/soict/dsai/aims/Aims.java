//Le Quoc Viet - 20215165
package hust.soict.dsai.aims;

import java.util.Scanner;

import javax.swing.JOptionPane;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.exception.DuplicatedItemException;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Track;
import hust.soict.dsai.aims.screen.CartScreen;
import hust.soict.dsai.aims.screen.StoreScreen;
import hust.soict.dsai.aims.store.Store;

public class Aims {

	private static Scanner sc;
	private static Store store;
	private static Cart cart;
	private static StoreScreen storeScreen;
	private static CartScreen cartScreen;

	public static void main(String[] args) {
		store = new Store();
		cart = new Cart();

		Media[] sampleMedia = new Media[] {
			new DigitalVideoDisc("Book2", "Sci-fi", "Walter Jackson", 125, 12f),
			new DigitalVideoDisc("Book1", "Romance", "Maria McPeek", 91, 13f),
			new DigitalVideoDisc("Title2", "Horror", "Jimmy Blair", 96, 6.5f),
			new CompactDisc("Title1", "Pop", "Kim Evans", "Hope Sullivan", 70.18f) {{
				addTrack(new Track("Sleep And Memories", 5));
				addTrack(new Track("Brave And Story", 5));
				addTrack(new Track("Easy And Smile", 5));
			}},
			new CompactDisc("Aladin", "Electronic", "Bruce Doty", "Jesse Keenan", 93.03f) {{
				addTrack(new Track("Lazy And Dreams", 3));
				addTrack(new Track("Bomb And Night", 4));
			}},
			new Book("The Lion King", "Mystery", 26.07f) {{
				addAuthor("Mark Castilleja");
			}},
//			new Book("Scent Of Lust", "Romance", 37.82f) {{
//				addAuthor("Caroline Garcia");
//				addAuthor("Liane Ferland");
//			}},
//			new CompactDisc("22", "Pop", "MONO", "Onionn", 22.22f) {{
//				addTrack(new Track("Intro", 1));
//				addTrack(new Track("Em La", 3));
//				addTrack(new Track("Waiting For You", 4));
//			}},
//			new Book("R.E.I.N.A", "Oneshot", 69.96f) {{
//				addAuthor("Hiten");
//			}}
		};
		
		for (Media m : sampleMedia) {
			try {
				store.addMedia(m);
			} catch (DuplicatedItemException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		openStoreScreen();
	}

	public static Store getStore() {
		return store;
	}

	public static Cart getCart() {
		return cart;
	}

	public static StoreScreen getStoreScreen() {
		return storeScreen;
	}

	public static CartScreen getCartScreen() {
		return cartScreen;
	}
	
	public static void openStoreScreen() {
		storeScreen = new StoreScreen(store);
	}
	
	public static void closeStoreScreen() {
		storeScreen.setVisible(false);
		storeScreen = null;
	}
	
	public static void openCartScreen() {
		cartScreen = new CartScreen(cart);
	}
	
	public static void closeCartScreen() {
		cartScreen.setVisible(false);
		cartScreen = null;
	}
	
}
