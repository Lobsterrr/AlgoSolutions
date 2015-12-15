/*
 * Given two strings, find the longest common subsequence (LCS).

Your code should return the length of LCS.

Example
For "ABCD" and "EDCA", the LCS is "A" (or "D", "C"), return 1.

For "ABCD" and "EACB", the LCS is "AC", return 2.

Clarification
What's the definition of Longest Common Subsequence?

https://en.wikipedia.org/wiki/Longest_common_subsequence_problem
http://baike.baidu.com/view/2020307.htm
 */
public class LongestCommonSubsequence {

    /**
     * @param A, B: Two strings.
     * @return: The length of longest common subsequence of A and B.
     */
    public int longestCommonSubsequence(String A, String B) {
        if (A.length() == 0 || B.length() == 0) {
            return 0;
        }
        int[][] dp = new int[A.length()][B.length()];
        for (int i = 0; i < A.length(); ++i) {
            for (int j = 0; j < B.length(); ++j) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    if (A.charAt(i) == B.charAt(j)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }
        }
        return dp[A.length() - 1][B.length() - 1];
    }

}
