package assignment5;
public class q4 {
	public static void main (String args[]) {
		StringBuilder sb=new StringBuilder("Html");
		System.out.println(sb);
		sb.insert(2, "jk");
		System.out.println(sb);
		sb.delete(2 , 4);
		System.out.println(sb);
		sb.setCharAt(2,'k');
		System.out.println(sb);
		sb.append(" Hyper Text Mark Up Language");
		System.out.println(sb);
	}

}
