// Write a java program using an array that reads the integers between 1 and 100 and counts the
// occurrences of each. Assume the input ends with 0.

		import java.util.Scanner;

		public class Question3 {
		    public static void main(String[] args) {
		        int[] occurrences = new int[101]; // Index 0 is not used, indices 1 to 100 represent numbers
		        
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.println("Enter integers between 1 and 100 (end with 0):");
		        
		        int num;
		        do {
		            num = sc.nextInt();
		            if (num >= 1 && num <= 100) {
		                occurrences[num]++;
		            }
		        } while (num != 0);
		        
		        System.out.println("Number\tOccurrences");
		        for (int i = 1; i <= 100; i++) {
		            if (occurrences[i] > 0) {
		                System.out.println(i + "\t" + occurrences[i]);
		            }
		        }
		    }
		}

	// Enter integers between 1 and 100 (end with 0):
	//	2 5 6 5 4 3 23 43 2 0
	//	Number	Occurrences
	//	2	2
	//	3	1
	//	4	1
	//	5	2
	//	6	1
	//	23	1
	//	43	1
