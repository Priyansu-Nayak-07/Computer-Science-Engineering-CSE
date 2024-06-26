package assignment1;

class Car{
	private String make;
	private String model;

	public Car(String make, String model) {
		this.make=make;
		this.model=model;
	}
	public String getMake() {
	return make;	
	}
	public void setMake(String make) {
		this.make=make;
	}
	public String getModel() {
		return model;	
		}
		public void setModel(String model) {
			this.model=model;
		}
	}

public class q1cartester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar1=new Car("TATA","Nexon");
		Car mycar2=new Car(null, null);
		System.out.println("initial "+mycar1.getMake()+","+mycar1.getModel());
		System.out.println("initial "+mycar2.getMake()+","+mycar2.getModel());
		System.out.println();
		mycar2.setMake("Toyota");
		mycar2.setModel("Supra");
		System.out.println("updated "+mycar1.getMake()+","+mycar1.getModel());
		System.out.println("updated "+mycar2.getMake()+","+mycar2.getModel());
	}

}
