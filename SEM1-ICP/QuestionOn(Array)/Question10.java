// Design and develop a menu driven java program for the following array operations.
// a. Create an array of N integers
// b. Display the array elements
// c. Insert an element at specific position
// d. Delete an element at a given position
// e. Exit

import java.util.*;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = null; // Initialize array to null
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("a. Create an array of N integers");
            System.out.println("b. Display the array elements");
            System.out.println("c. Insert an element at specific position");
            System.out.println("d. Delete an element at a given position");
            System.out.println("e. Exit");
            System.out.print("Enter your choice: ");
            
            char choice = sc.next().charAt(0);
            
            switch (choice) {
                case 'a':
                    System.out.print("Enter the size of the array: ");
                    int size = sc.nextInt();
                    array = new int[size];
                    for (int i = 0; i < size; i++) {
                        System.out.print("Enter element " + (i + 1) + ": ");
                        array[i] = sc.nextInt();
                    }
                    System.out.println("Array created.");
                    break;
                
                case 'b':
                    if (array == null) {
                        System.out.println("Array is not created yet.");
                    } else {
                        System.out.println("Array elements:");
                        for (int num : array) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                    }
                    break;
                
                case 'c':
                    if (array == null) {
                        System.out.println("Array is not created yet.");
                    } else {
                        System.out.print("Enter the position to insert: ");
                        int position = sc.nextInt();
                        if (position < 1 || position > array.length + 1) {
                            System.out.println("Invalid position.");
                        } else {
                            System.out.print("Enter the element to insert: ");
                            int element = sc.nextInt();
                            int[] newArray = new int[array.length + 1];
                            for (int i = 0, j = 0; i < newArray.length; i++) {
                                if (i == position - 1) {
                                    newArray[i] = element;
                                } else {
                                    newArray[i] = array[j++];
                                }
                            }
                            array = newArray;
                            System.out.println("Element inserted.");
                        }
                    }
                    break;
                
                case 'd':
                    if (array == null) {
                        System.out.println("Array is not created yet.");
                    } else {
                        System.out.print("Enter the position to delete: ");
                        int delPosition = sc.nextInt();
                        if (delPosition < 1 || delPosition > array.length) {
                            System.out.println("Invalid position.");
                        } else {
                            int[] newArray = new int[array.length - 1];
                            for (int i = 0, j = 0; i < array.length; i++) {
                                if (i != delPosition - 1) {
                                    newArray[j++] = array[i];
                                }
                            }
                            array = newArray;
                            System.out.println("Element deleted.");
                        }
                    }
                    break;
                
                case 'e':
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
