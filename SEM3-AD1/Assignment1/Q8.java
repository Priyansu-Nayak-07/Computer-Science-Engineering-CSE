import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        long fib = calculateFibonacciIterative(n);
        System.out.println("The " + n + "th Fibonacci number is: " + fib);
        sc.close();
    }

    public static long calculateFibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }

        long prev = 0;
        long current = 1;
        long fib = 0;

        for (int i = 2; i <= n; i++) {
            fib = prev + current;
            prev = current;
            current = fib;
        }

        return fib;
    }
}
