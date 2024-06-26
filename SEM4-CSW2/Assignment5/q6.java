package assignment5;
public class q6 {
	public static void main(String args[]) {
		String first="Java";
		String second="java";
		
		String s1=first.toLowerCase();
		String s2=first.toUpperCase();
		String s3=second.toLowerCase();
		String s4=second.toUpperCase();
		
		boolean str=s1.equals(s3);
		
		System.out.println("first string lower "+s1);
		System.out.println("first string upper "+s2);
		System.out.println("second string lower "+s3);
		System.out.println("second string upper "+s4);
		System.out.println("Case-insensitive Equality: "+s1==s3);
	}

}
