// Write a method to find the second smallest element present in the Array. The method header is given below.
// public static double sec_small(double[] array)
// Write a java program that prompts the user to enter ten numbers, invokes this method to return the second minimum value, and displays the second minimum value. 
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextDouble();
        }
        
        double secondSmallest = sec_small(numbers);
        
        System.out.println("The second smallest value is: " + secondSmallest);
    }
    
    public static double sec_small(double[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array should have at least two elements");
        }
        
        double smallest = Math.min(array[0], array[1]);
        double secondSmallest = Math.max(array[0], array[1]);
        
        for (int i = 2; i < array.length; i++) {
            if (array[i] < smallest) {
                secondSmallest = smallest;
                smallest = array[i];
            } else if (array[i] < secondSmallest && array[i] != smallest) {
                secondSmallest = array[i];
            }
        }
        
        return secondSmallest;
    }
}

// Enter ten numbers:
// 1.9 2.5 3.7 2 1.5 6 3 4 5 2
// The second smallest value is: 1.9

