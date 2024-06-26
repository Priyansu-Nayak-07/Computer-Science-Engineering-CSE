import java.util.Arrays;

public class CoinExchange {

  static int dp[];

  private static int minCoin(int coins[], int m, int v) {
    if(v == 0) return 0;

    if(dp[v] != -1) return dp[v];

    int res = Integer.MAX_VALUE;

    for(int i=0; i<m; i++) {
      if(coins[i] <= v) {
        int ans = minCoin(coins, m, v-coins[i]);

        if(ans != Integer.MAX_VALUE && ans + 1 < res) res = ans + 1;
      }
    }

    dp[v] = res;

    return res;
  }

  public static void main(String[] args) {
    int coins[] = {9, 6, 5, 1};
    int m = coins.length;
    int v = 11;

    dp = new int[v+1];
    Arrays.fill(dp, -1);

    int res = minCoin(coins, m, v);
    if(res == Integer.MAX_VALUE) System.out.println("Not possible");
    else System.out.println("Minimum coins required: " + res);
  }
}