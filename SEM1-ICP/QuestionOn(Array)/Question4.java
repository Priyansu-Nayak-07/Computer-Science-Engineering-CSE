// Write a method to find the smallest element present in the Array. The method header is given below. 
// public static double min(double[] array)
// Write a java program that prompts the user to enter ten numbers, invokes this method to return the minimum value, and displays the minimum value


import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextDouble();
        }
        
        double minimum = min(numbers);
        
        System.out.println("The minimum value is: " + minimum);
    }
    
    public static double min(double[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        
        return min;
    }
}

// Enter ten numbers:
// 1.9 2.5 3.7 2 1.5 6 3 4 5 2
// The minimum value is: 1.5
