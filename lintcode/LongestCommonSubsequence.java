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
        int result = 0;
        for (int i = 0; i < A.length(); i++) {
            int j = 0;
            while (j < B.length() && A.charAt(i + j) == B.charAt(j)) {
                j++;
            }
            result = Math.max(result, j - i);
        }
        return result;
    }

}
