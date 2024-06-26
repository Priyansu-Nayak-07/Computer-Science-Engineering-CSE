package assignment1;
class Laptop{
	private String model;
	private double price;
	public Laptop(String model, double price) {
		this.model=model;
		this.price=price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "laptop [model=" + model + ", price=" + price + "]";
	}
	
}
public class q4 {
	public static void main(String args[]) {
	        Laptop laptop = new Laptop("asus",60000);

	        System.out.println(laptop.toString());

	}

}
