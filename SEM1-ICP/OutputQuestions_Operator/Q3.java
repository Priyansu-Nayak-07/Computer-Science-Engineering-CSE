
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2,b=5,c;
		a=a*a++ - --a;
		c=b++ - b--;
		System.out.println("a="+a+",b="+b+",c="+c);
		System.out.println(a++ + ++a * a--);
		System.out.println(b=b++ * b--);
		System.out.println("a="+a+",b="+b+",c="+c);

	}

}

//output
// a=2,b=5,c=-1
//18
//30
//a=3,b=30,c=-1