package assignment5;

public class q1 {
    public static void main(String[] args) {
        // Using string literals
        String str1 = "hello";
        String str2 = "hello";

        // Using new keyword
        String str3 = new String("hello");
        String str4 = new String("hello");

        // Comparing string literals
        System.out.println("Comparing string literals:");
        System.out.println("str1 == str2: " + (str1 == str2)); // Should be true
        System.out.println("str1 == str3: " + (str1 == str3)); // Should be false

        // Comparing strings created with new keyword
        System.out.println("\nComparing strings created with new keyword:");
        System.out.println("str3 == str4: " + (str3 == str4)); // Should be false

        // Comparing string contents
        System.out.println("\nComparing string contents:");
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // Should be true
    }
}
