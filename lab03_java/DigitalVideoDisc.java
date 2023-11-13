//Le Quoc Viet 20215165 
package lab03_java;

public class DigitalVideoDisc {
	private static int nbDigitalVideoDiscs = 0;

	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int id;
	
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		updateDiscCountAndId();
	}
	
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		updateDiscCountAndId();
	}

	

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		updateDiscCountAndId();
	}

	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		updateDiscCountAndId();
	}
	
	
	
	public void setTitle(String title) {
		this.title = title;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public void setCost(float cost) {
		this.cost = cost;
	}


	public String getTitle() {
		return title;
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

	// Phương thức hỗ trợ để cập nhật thuộc tính của lớp và gán giá trị phù hợp cho "id"
	private void updateDiscCountAndId() {
	    nbDigitalVideoDiscs++;
	    id = nbDigitalVideoDiscs;
	}

	// Phương thức mới để kiểm tra xem tiêu đề có khớp với một mẫu cho trước hay không
	public boolean isMatch(String pattern) {
	    // Sử dụng phương thức contains để kiểm tra xem tiêu đề có chứa mẫu được chỉ định hay không
	    return title.toLowerCase().contains(pattern.toLowerCase());
	}

	
	// ham in ra thong tin dia
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Cost: $" + cost;
    }

	
}