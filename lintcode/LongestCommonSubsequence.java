/*
 *
 */
public class LongestCommonSubsequence {

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
