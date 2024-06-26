
public class Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		int b=5;
		int x=(a++ < b)?a:b;//5 : 5
		int y=a+b-x;
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}

// x=5
// y=5
