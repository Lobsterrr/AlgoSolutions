/*
 * Given k strings, find the longest common prefix (LCP).

Example
For strings "ABCD", "ABEF" and "ACEF", the LCP is "A"

For strings "ABCDEFG", "ABCEFG" and "ABCEFA", the LCP is "ABC"
 */
public class LongestCommonPrefix {

    /**
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
        int endIndex = 0;
        for (int i = 1; i < strs.length; ++i) {
            


            if (endIndex == strs[i].length()) {
                break;
            }
        }
    }

}
