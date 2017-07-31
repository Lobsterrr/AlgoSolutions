/*
Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.

For example,
Given:
s1 = "aabcc",
s2 = "dbbca",

When s3 = "aadbbcbcac", return true.
When s3 = "aadbbbaccc", return false.
 */
public class InterleavingString {

    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1 == null || s2 == null || s3 == null || 
                s1.length() + s2.length() != s3.length()) {
            return false;
        }
        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();
        boolean[][] dp = new boolean[len1 + 1][len2 + 1];
        for (int i = 0; i < len1; ++i) {

        }
    }

}
