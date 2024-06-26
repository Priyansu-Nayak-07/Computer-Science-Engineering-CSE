import java.util.Arrays;
public class Q6 {
    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 10, 9, 7, 8,  3, 2, 1};
        System.out.println("Original array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        reverseArray(arr);
         System.out.println("Reversed array: " + Arrays.toString(arr));
    }
    public static void reverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }
}
