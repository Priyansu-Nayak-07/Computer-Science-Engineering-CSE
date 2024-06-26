package assignment9;

import java.util.*;

public class q2 {
    public static void main(String[] args) {
    	List<String> strings = new ArrayList<>();
    	strings.add("apple");
    	strings.add("banana");
    	strings.add("cherry");
    	strings.add("blueberry");
    	strings.add("grapefruit");
        // Sort the list using a lambda expression to compare string lengths in descending order
        strings.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));

        System.out.println("Sorted list: " + strings);
    }
}
