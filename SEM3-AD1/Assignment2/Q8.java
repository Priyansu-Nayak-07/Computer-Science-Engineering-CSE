public class Q8 {
    public static int missing_num(int[] arr, int start, int end) {
        if (start > end) {
            return end + 1;
        }
        if (start != arr[start]) {
            return start;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == mid) {
            return missing_num(arr, mid + 1, end);
        }
        return missing_num(arr, start, mid);
    }
    public static void main(String[] args) {
        int[] arr = {0, -1,2,4,6,5,8,-9};
        int n = arr.length;
        System.out.println("The smallest missing number is: " + missing_num(arr, 0, n - 1));
    }
}