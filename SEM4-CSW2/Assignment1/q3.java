package assignment1;

class point{
	double x;
	double y;
	public point(double x, double y) {
		this.x=x;
		this.y=y;	}
	public point(point obj) {
		this.x=obj.x;
		this.y=obj.y;}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;	}}
public class q3{
	public static void main(String args[]) {
		point point1= new point(6,4);
		point point2=new point(point1);
		point1.setX(8);
		point1.setY(2);	
	    System.out.println(" Point 1 after modification: " + point1.getX() + ", " + point1.getY() );
	    System.out.println("Point 2 remain unchanged: " + point2.getX() + ", " + point2.getY() );

	}

}
