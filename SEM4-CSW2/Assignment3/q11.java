package assignment3;

import java.util.HashMap;
import java.util.Map;

public class q11 {
    public static int findSmallestMissingPositive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
         for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i = 1; i <= 10; i++) {
            if (!map.containsKey(i)) {
                return i; // Found the smallest missing positive number
            }
        }
        return 11;
    }

    public static void main(String[] args) {
    	
        int[] array = {3, 4, 2, 7, 1, 10, 6, 9, 8};
        int smallestMissing = findSmallestMissingPositive(array);
        System.out.println("The smallest missing positive number is: " + smallestMissing);
    }
}
