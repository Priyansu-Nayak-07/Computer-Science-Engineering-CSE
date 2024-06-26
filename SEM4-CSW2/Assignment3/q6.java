package assignment3;

import java.util.Scanner;
import java.util.TreeSet;

public class q6 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        treeSet.add(5);
        treeSet.add(10);
        treeSet.add(15);
        treeSet.add(20);
        treeSet.add(25);

        // (a) Display the TreeSet
        System.out.println("TreeSet elements: " + treeSet);

        // (b) Searching for a number
        System.out.print("Enter a number to search in the TreeSet: ");
        int numberToSearch = sc.nextInt();
        if (treeSet.contains(numberToSearch)) {
            System.out.println(numberToSearch + " is present in the TreeSet.");
        } else {
            System.out.println(numberToSearch + " is not present in the TreeSet.");
        }

        // (c) Removing an element from the TreeSet
        System.out.print("Enter the number to remove from the TreeSet: ");
        int numberToRemove = sc.nextInt();
        if (treeSet.contains(numberToRemove)) {
            treeSet.remove(numberToRemove);
            System.out.println(numberToRemove + " removed from the TreeSet.");
            System.out.println("Updated TreeSet: " + treeSet);
        } else {
            System.out.println(numberToRemove + " is not present in the TreeSet.");
        }
    }
}
