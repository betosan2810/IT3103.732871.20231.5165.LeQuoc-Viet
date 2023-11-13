//Le Quoc Viet 20215165 
package lab03_java;

public class CartTest {
	public static void main(String[] args) {
        //tao cart 
        Cart cart = new Cart();
        
        //tao dia moi
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Matrix", "Science Fiction", 25.65f);
        cart.addDigitalVideoDisc(dvd4);

        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Inception", "Science Fiction", 12.54f);
        cart.addDigitalVideoDisc(dvd5);

        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Titanic", "Romantic", 15.25f);
        cart.addDigitalVideoDisc(dvd6);

        //in cart
        cart.printCart();

        // search by id
        cart.searchByID(1);
        cart.searchByID(3);

        // search by title
        cart.searchByTitle("the matrix");
        cart.searchByTitle("titanic");

    }
	

}
