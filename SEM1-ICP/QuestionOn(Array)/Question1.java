// Question-1:
// Write a java program to create an array of size N and store the random values between 1 to N in it and 
// find the sum and average.

		import java.util.Random;

		public class Question1 {
		    public static void main(String[] args) {
		        int N = 10; // Change N to the desired size of the array
		        
		        int[] array = new int[N];
		        Random random = new Random();
		        
		        // Fill the array with random values between 1 and N
		        for (int i = 0; i < N; i++) {
		            array[i] = random.nextInt(N) + 1;
		        }
		        
		        // Calculate the sum of the array elements
		        int sum = 0;
		        for (int value : array) {
		            sum += value;
		        }
		        
		        // Calculate the average
		        double average = (double) sum / N;
		        
		        // Display the array, sum, and average
		        System.out.println("Array elements:");
		        for (int value : array) {
		            System.out.print(value + " ");
		        }
		        System.out.println("\nSum: " + sum);
		        System.out.println("Average: " + average);
		    }
		}

		// Array elements:
		// 1 5 2 7 8 8 2 7 1 6 
		// Sum: 47
		// Average: 4.7

	



