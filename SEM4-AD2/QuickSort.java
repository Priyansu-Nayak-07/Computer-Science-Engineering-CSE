public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 7, 2, 8, 6, 1, 4, 10};

        System.out.println("Array before sorting:");
        printArray(arr);

        System.out.println("Sorting with pivot as the first element:");
        quickSortFirst(arr, 0, arr.length - 1);
        printArray(arr);

        System.out.println("Sorting with pivot as the last element:");
        quickSortLast(arr, 0, arr.length - 1);
        printArray(arr);
    }

    static void quickSortFirst(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partitionFirst(arr, low, high);

            quickSortFirst(arr, low, pi - 1);
            quickSortFirst(arr, pi + 1, high);
        }
    }


    static int partitionFirst(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;

        for (int j = low + 1; j <= high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, low, i);
        return i;
    }

    static void quickSortLast(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partitionLast(arr, low, high);

            quickSortLast(arr, low, pi - 1);
            quickSortLast(arr, pi + 1, high);
        }
    }

    static int partitionLast(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
