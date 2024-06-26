public class Q2 {

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 3, 15, 30};
        int n = arr.length;
        
        // Find the maximum and minimum using recursion
        int max = findMax(arr, 0, n - 1);
        int min = findMin(arr, 0, n - 1);

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }

    // Recursive function to find the maximum element in the array
    public static int findMax(int[] arr, int start, int end) {
        if (start == end) {
            return arr[start];
        } else {
            int mid = (start + end) / 2;
            int leftMax = findMax(arr, start, mid);
            int rightMax = findMax(arr, mid + 1, end);
            return Math.max(leftMax, rightMax);
        }
    }

    // Recursive function to find the minimum element in the array
    public static int findMin(int[] arr, int start, int end) {
        if (start == end) {
            return arr[start];
        } else {
            int mid = (start + end) / 2;
            int leftMin = findMin(arr, start, mid);
            int rightMin = findMin(arr, mid + 1, end);
            return Math.min(leftMin, rightMin);
        }
    }
}

