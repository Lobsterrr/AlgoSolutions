/*
 * Given a string S and a string T, count the number of 
 * distinct subsequences of T in S.

A subsequence of a string is a new string which is formed 
from the original string by deleting some (can be none) of 
the characters without disturbing the relative positions 
of the remaining characters. (ie, "ACE" is a subsequence of 
"ABCDE" while "AEC" is not).

Example
Given S = "rabbbit", T = "rabbit", return 3.

Challenge
Do it in O(n^2) time and O(n) memory.

O(n2) memory is also acceptable if you do not know how to 
optimize memory.
 */
public class DistinctSubsequences {

    /**
     * @param S, T: Two string.
     * @return: Count the number of distinct subsequences
     */
    public int numDistinct(String S, String T) {
        int[][] dp = new int[S.length() + 1][T.length() + 1];
    }

}
