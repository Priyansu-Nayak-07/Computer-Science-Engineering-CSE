import java.util.*;
public class anagram {
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        char[] c = a.toCharArray();
        for (char i : c) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        char[] d = b.toCharArray();
        for (char i : d) {
            int count = map.getOrDefault(i, 0);
            if (count == 1) {
                map.remove(i);
            } else {
                map.put(i, count - 1);
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first word: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second word: ");
        String str2 = sc.nextLine();
        if (isAnagram(str1, str2)) {
            System.out.println("Two strings are anagrams");
        } else {
            System.out.println("Two strings are not anagrams");
        }
    }
}
