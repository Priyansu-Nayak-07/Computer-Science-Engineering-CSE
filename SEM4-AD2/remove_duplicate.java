import java.util.HashMap;
import java.util.Map;

public class remove_duplicate {

    public static String removeDuplicates(String str1, String str2) {
        // Create a HashMap to store the frequency of characters in str1
        Map<Character, Integer> frequencyMap = new HashMap<>();
        StringBuilder result = new StringBuilder();

        // Count the frequency of characters in str1
        for (char c : str1.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Append characters from str2 to result string while removing duplicates
        for (char c : str2.toCharArray()) {
            if (!frequencyMap.containsKey(c)) {
                result.append(c);
            } else {
                int count = frequencyMap.get(c);
                if (count > 0) {
                    result.append(c);
                    frequencyMap.put(c, count - 1);
                }
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "geeks";

        String result = removeDuplicates(str1, str2);
        System.out.println("String after removing duplicates: " + result);
    }
}
