package ass6;

import java.util.Arrays;
public class Q5 {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 2, 3, 8, 1, 4, 6, 5 };
        Arrays.sort(arr);
        int repeat = repeats(arr);
        if (repeat != 0) {
            System.out.println("Number of repeated entry: " + repeat);
        } else {
            System.out.println("No repeated entry found.");
        }
    }
    public static int repeats(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}