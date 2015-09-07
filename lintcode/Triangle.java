/*
 *
 */
public class Triangle {

    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        int xLen = triangle.size();
        int[] dp = new int[xLen];
        for (int i = xLen - 1; i >= 0; --i) {
            int yLen = triangle.get(i).size();
            for (int j = 0; j < yLen; ++j) {
                if (i == xLen - 1)
                    dp[j] = triangle.get(i).get(j);
                else 
                    dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);

            }
        }
        return dp[0];
    }

}
