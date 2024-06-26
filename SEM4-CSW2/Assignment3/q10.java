package assignment3;
import java.util.*;

public class q10 {
    public static void main(String[] args) {
        // Input string
        String input = "This is a sample string. This string contains some sample words. "
        		+ "Let's find the most occurring words in this string.";
        // Create a HashMap to store word frequencies
        Map<String, Integer> wordFrequency = new HashMap<>();
        // Split the input string into words using space as delimiter
        String[] words = input.split("\\s+");        
        // Iterate through each word in the array
        for (String word : words) {
            // If word is already in the map, increment its frequency
            if (wordFrequency.containsKey(word)) {
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            } else { // Otherwise, add it to the map with frequency 1
                wordFrequency.put(word, 1); }}        
        // Variables to store maximum frequency and list of most occurring words
        int maxFrequency = 0;
        List<String> mostOccurringWords = new ArrayList<>();
        // Iterate through the entries of the word frequency map
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {            
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostOccurringWords.clear();
                mostOccurringWords.add(entry.getKey());
            } else if (entry.getValue() == maxFrequency) { // If frequency is equal to maxFrequency
                // Add the current word to the list of most occurring words
                mostOccurringWords.add(entry.getKey());
            }
        }
        
        // Print the most occurring words in the string
        System.out.println("The most occurring words in the string are:");
        for (String word : mostOccurringWords) {
            System.out.println(word);
        }
    }
}
