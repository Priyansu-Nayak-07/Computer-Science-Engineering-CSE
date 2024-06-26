package assignment3;

import java.util.*;

public class q9 {
    public static void printRepeatingIntegers(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> repeatingElements = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                // If the number is already present in the set, it's a repeating element
                repeatingElements.add(num);
            }
        }

        // Print repeating elements
        if (!repeatingElements.isEmpty()) {
            System.out.println("Repeating integers in the array:");
            for (int num : repeatingElements) {
                System.out.println(num);
            }
        } else {
            System.out.println("No repeating integers found in the array.");
        }
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        printRepeatingIntegers(array);
    }
}
