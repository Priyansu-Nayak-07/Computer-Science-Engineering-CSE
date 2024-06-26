package ass6;


//Java implementation of simple method to find
//minimum difference between any pair

class Q4 {
	// Returns minimum difference between any pair
	static int findMinDiff(int[] arr, int n)
	{
		// Initialize difference as infinite
		int diff = Integer.MAX_VALUE;

		// Find the min diff by comparing difference
		// of all possible pairs in given array
		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j < n; j++)
				if (Math.abs((arr[i] - arr[j])) < diff)
					diff = Math.abs((arr[i] - arr[j]));

		// Return min diff
		return diff;
	}

	// Driver code
	public static void main(String[] args)
	{
		int arr[] = new int[] { 1, 5, 3, 19, 18, 25 };

		// Function call
		System.out.println("Minimum difference is "
						+ findMinDiff(arr, arr.length));
	}
}

