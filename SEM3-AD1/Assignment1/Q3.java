import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Prompt the user to enter the elements of the array
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Prompt the user to enter the number of positions to rotate
        System.out.print("Enter the number of positions to rotate (k): ");
        int k = scanner.nextInt();

        // Perform the rotation
        rotateArray(arr, k);

        // Display the rotated array
        System.out.println("Rotated Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        int[] rotatedArr = new int[n];

        // Copy the last k elements to the beginning of the rotated array
        for (int i = 0; i < k; i++) {
            rotatedArr[i] = arr[n - k + i];
        }

        // Copy the remaining elements to the rotated array
        for (int i = k; i < n; i++) {
            rotatedArr[i] = arr[i - k];
        }

        // Copy the rotated array back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = rotatedArr[i];
        }
    }
}

