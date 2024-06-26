package assignment5;
import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Convert to lowercase");
            System.out.println("2. Convert to uppercase");
            System.out.println("3. Search for a character");
            System.out.println("4. Search for an index");
            System.out.println("5. Concatenate with another string");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Lowercase string: " + inputString.toLowerCase());
                    break;
                case 2:
                    System.out.println("Uppercase string: " + inputString.toUpperCase());
                    break;
                case 3:
                    System.out.print("Enter a character to search for: ");
                    char searchChar = scanner.nextLine().charAt(0);
                    int charIndex = inputString.indexOf(searchChar);
                    if (charIndex != -1) {
                        System.out.println("Character '" + searchChar + "' found at index: " + charIndex);
                    } else {
                        System.out.println("Character '" + searchChar + "' not found in the string.");
                    }
                    break;
                case 4:
                    System.out.print("Enter an index to search for: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < inputString.length()) {
                        System.out.println("Character at index " + index + ": " + inputString.charAt(index));
                    } else {
                        System.out.println("Invalid index. Index must be within the range of the string.");
                    }
                    break;
                case 5:
                    System.out.print("Enter another string to concatenate: ");
                    String anotherString = scanner.nextLine();
                    System.out.println("Concatenated string: " + inputString.concat(anotherString));
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}

