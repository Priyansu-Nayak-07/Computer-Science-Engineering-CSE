// Write a method to find the second largest element present in the Array. The method header is given below.
// public static int sec_max(int[] array)
// Write a java program that prompts the user to enter 5 numbers, invokes this method to return the maximum value, and displays the maximum value.
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc	 = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        
        int secondLargest = sec_max(numbers);
        
        System.out.println("The second largest value is: " + secondLargest);
    }
    
    public static int sec_max(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array should have at least two elements");
        }
        
        int largest = Math.max(array[0], array[1]);
        int secondLargest = Math.min(array[0], array[1]);
        
        for (int i = 2; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        
        return secondLargest;
    }
}

// Enter five numbers:
// 9 5 7 2 3
// The second largest value is: 7
