package assignment1;

class rectangle{
	private double length;
	private double width;
	
	public rectangle(double length, double width) {
		this.length=length;
		this.width=width;
	}
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}	
	public void setWidth(double width) {
		this.width = width;
		}
	
	 public double calculateArea() {
	   return length * width;
	   }
	 public double calculatePerimeter() {
	   return 2 * (length + width);
	 }
	 }
public class q2 {
	public static void main(String args[]) {
        rectangle rect=new rectangle(6,4);
         System.out.println("Area = "+rect.calculateArea());
         System.out.println("Pereimeter = "+rect.calculatePerimeter());	
	}
	}
