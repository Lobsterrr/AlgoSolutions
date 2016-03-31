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
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int endIndex = 0; endIndex < strs[0].length(); ++endIndex) {
            for (int i = 1; i < strs.length; ++i) {
                if (endIndex >= strs[i].length() || 
                        strs[i].charAt(endIndex) != strs[0].charAt(endIndex)) {
                    return strs[0].substring(0, endIndex);
                }
            }
        }
        return strs[0];
    }

}
