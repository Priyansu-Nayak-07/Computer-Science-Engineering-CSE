package assignment3;
import java.util.*;

public class q8 {
    // Method to check if two strings are anagrams
    public static boolean isAnagram(String a, String b) {
        // Check if lengths of the strings are different
        if (a.length() != b.length()) {
            return false; // Return false if lengths are different
        }
        
        // Create a HashMap to store character frequencies in string a
        HashMap<Character, Integer> map = new HashMap<>();
        // Convert string a to char array
        char[] c = a.toCharArray();
        // Iterate through the char array and update character frequencies in the map
        for (char i : c) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        // Convert string b to char array
        char[] d = b.toCharArray();
        // Iterate through the char array of string b
        for (char i : d) {
            // Get the count of current character in map
            int count = map.getOrDefault(i, 0);
            // If count is 1, remove the character from the map
            if (count == 1) {
                map.remove(i);
            } else {
                // Otherwise, update the count in the map
                map.put(i, count - 1);
            }
        }
        
        // Check if the map is empty, which indicates that both strings are anagrams
        return map.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the first word
        System.out.println("Enter the first word: ");
        String str1 = sc.nextLine();
        // Input the second word
        System.out.println("Enter the second word: ");
        String str2 = sc.nextLine();
        
        // Check if the two input strings are anagrams
        if (isAnagram(str1, str2)) {
            System.out.println("Two strings are anagrams");
        } else {
            System.out.println("Two strings are not anagrams");
        }
        
        sc.close(); // Closing scanner
    }
}
