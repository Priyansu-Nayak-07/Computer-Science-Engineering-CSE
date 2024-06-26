import java.util.*;
class Q7 {
    static int power(int N, int P)
    {
        if (P == 0)
            return 1;
        else
            return N * power(N, P - 1);
    }
 
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the number");
        int N =sc.nextInt();
        System.out.println("enter the power");
        int P =sc.nextInt();
 
        System.out.println(power(N, P));
    }
}

