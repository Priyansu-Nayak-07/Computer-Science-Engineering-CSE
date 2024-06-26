package ass6;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 3, 8, 1, 4, 6, 5};
        int firstRepeated = findRepeat(arr);
        if (firstRepeated != -1) {
            System.out.println("First repeated entry: " + firstRepeated);
        } else {
            System.out.println("No repeated entry found.");
        }
    }
    private static int findRepeat(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}