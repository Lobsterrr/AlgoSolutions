/*
 *
 */
public class LongestCommonSubsequence {

    /**
     * @param num: a rotated sorted array
     * @return: the minimum number in the array
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
