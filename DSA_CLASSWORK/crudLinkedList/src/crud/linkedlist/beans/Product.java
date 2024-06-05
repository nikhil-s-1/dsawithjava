package crud.linkedlist.beans;

public class Product {

	private int id ;
	private String name ;
	private float price;
	private short ratings;
	public Product() {
		super();
	}
	
	public Product(int id ) {
		this.id = id;
	}
	
	public Product(String nm ) {
		this.name = nm;
	}
	
	public Product(int id, String name, float price, short ratings) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.ratings = ratings;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public short getRatings() {
		return ratings;
	}

	public void setRatings(short ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", ratings=" + ratings + "]";
	}
	
	
	
	
	
	
}
