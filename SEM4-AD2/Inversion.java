public class Inversion {
  
  public static int countAndMerge(int arr[], int left, int mid, int right) {
    int n1 = mid - left + 1;
    int n2 = right - mid;
    int leftArr[] = new int[n1];
    int rightArr[] = new int[n2];
    for(int i=0; i<n1; i++) {
      leftArr[i] = arr[left + i];
    }

    for(int i=0; i<n2; i++) {
      rightArr[i] = arr[mid + 1 + i];
    }

    int i = 0, j = 0, k = left, swaps = 0;

    while(i < n1 && j < n2) {
      if(leftArr[i] <= rightArr[j]){
        arr[k++] = leftArr[i++];
      }else {
        arr[k++] = rightArr[j++];
        swaps += (mid + 1) - (left + i);
      }
    }

    while(i < n1) {
      arr[k++] = leftArr[i++];
    }
    while(j < n2) {
      arr[k++] = rightArr[j++];
    }

    return swaps;
  }

  public static int countByMergeSort(int arr[], int left, int right) {
    int count = 0;

    if(left < right) {
      int mid = (left + right) / 2;

      count += countByMergeSort(arr, left, mid);
      count += countByMergeSort(arr, mid + 1, right);
      count += countAndMerge(arr, left, mid, right);
    }

    return count;
  }

  public static void main(String[] args) {
    int arr[] = {1, 20, 6, 4, 5};
    System.out.println("Number of inversions are: " + countByMergeSort(arr, 0, arr.length - 1));
  }
}
