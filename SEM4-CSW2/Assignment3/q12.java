package assignment3;

import java.util.PriorityQueue;

public class q12 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 8, 7, 3, 4, 6, 5, 9};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.offer(num); 
        }

        System.out.println("Min Heap elements:");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " "); 
        }
    }
}
