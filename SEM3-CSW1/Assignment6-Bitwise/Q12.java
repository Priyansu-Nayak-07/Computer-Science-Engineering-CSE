
import java.util.Scanner;
public class Q12 {
    public static int mergeNumbers(int num1, int num2) {
        // Extracting the first two digits of num1
        int firstPart = num1 / 100;

        // Extracting the last two digits of num2
        int lastPart = num2 % 100;

        return firstPart * 100 + lastPart;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second integer number: ");
        int number2 = scanner.nextInt();

        int mergedNumber = mergeNumbers(number1, number2);
        System.out.println("Merged number: " + mergedNumber);

        scanner.close();
    }
}
