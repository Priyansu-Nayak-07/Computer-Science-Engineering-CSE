// Write a method to find the largest element present in the Array. The method header is given below.
// public static int max(int[] array)
// Write a java program that prompts the user to enter 5 numbers, invokes this method to return the maximum value, and displays the maximum value.
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        
        int maximum = max(numbers);
        
        System.out.println("The maximum value is: " + maximum);
    }
    
    public static int max(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        
        return max;
    }
}

// Enter five numbers:
// 9 5 7 2 3
// The maximum value is: 9