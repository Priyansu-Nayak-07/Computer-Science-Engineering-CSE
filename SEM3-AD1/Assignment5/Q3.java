class Q3 {
	int binarySearch(int arr[], int x)
	{

		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;
			if (arr[m] == x)
				return m;

			if (arr[m] < x)
				l = m + 1;

			else
				r = m - 1;
		}
		return -1;
	}

	public static void main(String args[])
	{

		Q3 ob = new Q3 ();
		int arr[] = { 2,6,5,9,7,35,67,89 };
//		
//		int n = arr.length;
		int x = 35;
		int result = ob.binarySearch(arr, x);

		if (result == -1)

			System.out.println("Element not present");

		else
			System.out.println("Element found at index "
							+ result);
	}
}
