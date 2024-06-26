// Write a java program to create an array of size N and store the random values between 1 to 100 in it 
// and print the number of prime numbers present in the array. 

import java.util.Random;

public class Question2 {
    public static void main(String[] args) {
    	
    	System.out.println("enter the number");
    	int N=20;
       
        int[] array = new int[N];
        Random random = new Random();
        
        // Fill the array with random values between 1 and 100
        for (int i = 0; i < N; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        
        // Display the array
        System.out.println("Array elements:");
        for (int i = 0; i < N; i++) {
            System.out.print( array[i] + " ");
        }
        System.out.println(); // Print a new line
        
        // Count the number of prime numbers in the array
        int primeCount = 0;
        for (int value : array) {
            if (isPrime(value)) {
                primeCount++;
            }
        }
        
        // Print the number of prime numbers
        System.out.println("Number of prime numbers in the array: " + primeCount);
    }
    
    // Helper function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}


	// Array elements:
    // 21 100 41 17 20 16 80 20 10 37 20 51 9 56 47 13 66 36 33 59 
    // Number of prime numbers in the array: 6
