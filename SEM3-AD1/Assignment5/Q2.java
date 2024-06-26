class Q2 {

    static int linearsearch(int arr[], int size, int key)
    {
        if (size == 0) {
            return -1;
        }
        else if (arr[size - 1] == key) {
            return size - 1;
        }
        return linearsearch(arr, size - 1, key);
    }

    public static void main(String[] args)
    {
        int arr[] = { 7,13,30,12,1,9 };
        int key = 12;
        int index = linearsearch(arr, arr.length, key);
        if (index != -1)
            System.out.println(
                "The element " + key + " is found at "
                + index + " index of the given array.");

        else
            System.out.println("The element " + key
                               + " is not found.");
    }
}