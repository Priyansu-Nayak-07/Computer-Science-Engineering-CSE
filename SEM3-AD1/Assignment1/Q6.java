import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        int[] inputArray = {2,4,6,8,10};
        int[] outputArray = rearrangeMaxMin(inputArray);

        System.out.println("Original Array: " + Arrays.toString(inputArray));
        System.out.println("Rearranged Array: " + Arrays.toString(outputArray));
    }

    public static int[] rearrangeMaxMin(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        Arrays.sort(arr); // Sort the array in ascending order

        int left = 0; // Pointer for the left end of the array
        int right = n - 1; // Pointer for the right end of the array
        int index = 0; // Index for placing elements in the result array

        // Traverse the array in zigzag fashion, starting with the maximum element
        while (left <= right) {
            if (index % 2 == 0) {
                // Place the maximum element at even indices
                result[index] = arr[right];
                right--;
            } else {
                // Place the minimum element at odd indices
                result[index] = arr[left];
                left++;
            }
            index++;
        }

        return result;
    }
}
