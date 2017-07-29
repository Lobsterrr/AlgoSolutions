/*
Write a function to find the longest common prefix string amongst an array of
strings.
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int i = 0;
        boolean isValid = true;
        while (isValid) {
            for (int j = 0; j < strs.length; ++j) {
                if (strs[j] == null || strs[j].length() == 0) {
                    return "";
                }
                char c = strs[0].charAt(i);
                if (strs[j].charAt(i) != c) {
                    isValid = false;
                    --i;
                    break;
                }
                if (i == strs[j].length() - 1) {
                    isValid = false;
                }
            }
            if (isValid) {
                ++i;
            }
        }
        return strs[0].substring(0, i + 1);
    }

}
