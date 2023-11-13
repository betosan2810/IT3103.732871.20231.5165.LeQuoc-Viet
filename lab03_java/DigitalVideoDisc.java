//Le Quoc Viet - 20215165
package lab03_java;

public class DigitalVideoDisc {
	private static int nbDigitalVideoDiscs = 0;
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int id;

	// Cac ham constructer
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public float getCost() {
		return cost;
	}

	// Phương thức getter bổ sung cho thuộc tính "id"
	public int getId() {
		return id;
	}

	// Phương thức hỗ trợ để cập nhật thuộc tính của lớp và gán giá trị phù hợp cho
	// "id"
	private void updateDiscCountAndId() {
		nbDigitalVideoDiscs++;
		id = nbDigitalVideoDiscs;
	}

	// ham in ra thong tin dia
	public String toString() {
		return "Title: " + title + ", Cost: $" + cost;
	}

}
