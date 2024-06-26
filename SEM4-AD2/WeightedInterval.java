
import java.util.Arrays;

public class WeightedInterval {

  static class Job {
    int start, finish, profit;
    Job (int start, int finish, int profit) {
      this.start = start;
      this.finish = finish;
      this.profit = profit;
    }
  }

  private static int nonConflict(Job arr[], int i) {
    for(int j = i-1; j >= 0; j--) {
      if(arr[i - 1].start >= arr[j].finish) return j;
    }

    return -1;
  }

  private static int findMaxProfit(Job arr[], int n) {
    int dp[] = new int[n];
    dp[0] = arr[0].profit;

    for(int i=1; i<n; i++) {
      int incl = arr[i].profit;
      int j = nonConflict(arr, i);
      if(j != -1) incl += dp[j];

      dp[i] = Math.max(incl, dp[i - 1]);
    }

    int res = dp[n - 1];

    return res;
  }
  public static void main(String[] args) {
    Job arr[] = new Job[4];
    arr[0] = new Job(3, 10, 20);
    arr[1] = new Job(1, 2, 50);
    arr[2] = new Job(6, 19, 100);
    arr[3] = new Job(2, 100, 200);

    Arrays.sort(arr, (a, b) -> a.finish - b.finish);
    int n = arr.length;
    System.out.println("The profit is: " + findMaxProfit(arr, n));
  }
}