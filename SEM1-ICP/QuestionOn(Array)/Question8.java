// Write a java program that implements the array reversal algorithm suggested in Note 1.
// Note 1: There is a simpler algorithm for array reversal that starts out with two indices, i=0 and j=n-1. With each iteration i is increased and j is decreased for i<j.
import java.util.Arrays;

public class Question8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Change the array elements as needed
        
        System.out.println("Original Array: " + Arrays.toString(array));
        
        reverseArray(array);
        
        System.out.println("Reversed Array: " + Arrays.toString(array));
    }
    
    public static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++;
            j--;
        }
    }
}
// Original Array: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
// Reversed Array: [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]

