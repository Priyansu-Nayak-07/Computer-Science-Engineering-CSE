class Q4 {
	int binarySearch(int arr[], int l, int r, int x)
	{
		if (r >= l && l <= arr.length - 1) {

			int mid = l + (r - l) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);
			return binarySearch(arr, mid + 1, r, x);
		}

		return -1;
	}
	public static void main(String args[])
	{
		Q4 ob = new Q4();
		int arr[] = {5,8,9,0,20,15};
		int n = arr.length;
		int x = 20;
		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");

		else

			System.out.println("Element found at index "
							+ result);
	}
}
