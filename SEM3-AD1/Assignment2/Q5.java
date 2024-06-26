import java.util.Scanner;

public class Q5{

    // Recursive method to find GCD
    public static int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return findGCD(num2, num1 % num2);
        }
    }

    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter the number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int gcd = findGCD(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        sc.close();
    }
}
