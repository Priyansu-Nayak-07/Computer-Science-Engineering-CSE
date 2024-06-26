package ass6;

public class Q3 {
    public static void main(String[] args) {
        int[] array = {10,11,13,14,15,16};
        int missingNumber = findMissingNumber(array,array.length);
        System.out.println("The missing number is: " + missingNumber);
    }
    public static int findMissingNumber(int[] arr, int size) {
    	int i, j, found = 0;
    	for (i = 1; i <= size; i++) {
    	found = 0;
    	for (j = 0; j < size; j++) {
    	if (arr[j] == i) {
    	found = 1;
    	break;
    	}
    	}
    	if (found == 0) {
    	return i;
    	}
    	}
    	return Integer.MAX_VALUE;
    	}
}
