 package assignment5;


public class q3 {
	public static void main (String args[]) {
		StringBuffer sb=new StringBuffer("Java ");
		StringBuffer s1=new StringBuffer("HTML");
		System.out.println(sb);
		sb.append("Java Application");
		System.out.println(sb);
		sb.insert(5, "html ");
		System.out.println(sb);
		s1.delete(2, 4);
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		sb.replace(5, 9, "css");
		System.out.println(sb);
		
	}
}

