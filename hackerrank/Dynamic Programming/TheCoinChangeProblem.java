/*
 *
 */

public class TheCoinChangeProblem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] coins = new int[M];
        for (int i = 0; i < M; ++i) {
            coins[i] = in.nextInt();
        }
        System.out.println(getWays(coins, N));
    }

    public static int getWays(int[] coins, int N) {
        int[] dp = new int[N + 1];
        for (int coin : coins) {
            for (int i = coin; i <= N; ++i) {
                dp[i] += dp[i - coin];
            }
        }
        return dp[N];
    }

}
