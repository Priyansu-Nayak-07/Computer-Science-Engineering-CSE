import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Initialize a variable to store the sum
        int sum = 0;

        // Prompt the user to enter n numbers and calculate the sum
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = scanner.nextInt();
            sum += num;
        }

        // Display the sum
        System.out.println("The sum of the " + n + " numbers is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
