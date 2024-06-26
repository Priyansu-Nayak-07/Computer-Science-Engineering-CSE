package assignment6;

import java.util.*;


public class q6{
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // Print initial memory status
        System.out.println("Timestamp: " + new Date() + ", Initial Total Memory: " + Runtime.getRuntime().totalMemory() + " bytes");
        System.out.println("Timestamp: " + new Date() + ", Initial Free Memory: " + Runtime.getRuntime().freeMemory() + " bytes");

        // Create a lot of objects
        ArrayList<Object> objects = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            objects.add(new Object());
        }

        // Print memory status after creating objects
        System.out.println("Timestamp: " + new Date() + ", Memory after creating objects: Total Memory: " + Runtime.getRuntime().totalMemory() + " bytes");
        System.out.println("Timestamp: " + new Date() + ", Memory after creating objects: Free Memory: " + Runtime.getRuntime().freeMemory() + " bytes");

        // Clear the objects to make them eligible for garbage collection
        objects.clear();

        // Request garbage collection
        System.gc();

        // Print memory status after garbage collection
        System.out.println("Timestamp: " + new Date() + ", Memory after garbage collection: Total Memory: " + Runtime.getRuntime().totalMemory() + " bytes");
        System.out.println("Timestamp: " + new Date() + ", Memory after garbage collection: Free Memory: " + Runtime.getRuntime().freeMemory() + " bytes");

        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) + " milliseconds");
    }
}
