// Write a method to find the element present in the Array using Linear Search. The method header is given below.
// public static int Lsearch(int[] array, item)
// The method will return the index of the item if the element is present in the array. Otherwise it will return -1. Write a java program that prompts the user to enter 5 numbers, and the item to search, then invokes this method to display whether the element is present in the array.
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("Enter the item to search:");
        int item = sc.nextInt();
        
        int result = Lsearch(numbers, item);
        
        if (result != -1) {
            System.out.println("Item " + item + " found at index " + result);
        } else {
            System.out.println("Item " + item + " not found in the array.");
        }
    }
    
    public static int Lsearch(int[] array, int item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }
}

// Enter five numbers:
// 9 5 7 2 6
// Enter the item to search:
// 7
// Item 7 found at index 2

