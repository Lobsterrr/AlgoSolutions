/*
 * Given a string source and a string target, find the minimum window in source which will contain all the characters in target.

 Notice

If there is no such window in source that covers all characters in target, return the emtpy string "".

If there are multiple such windows, you are guaranteed that there will always be only one unique minimum window in source.

Clarification
Should the characters in minimum window has the same order in target?

Not necessary.
Example
For source = "ADOBECODEBANC", target = "ABC", the minimum window is "BANC"

Challenge 
Can you do it in time complexity O(n) ?
 */
public class MinimumWindowSubstring {

    /**
     * @param source: A string
     * @param target: A string
     * @return: A string denote the minimum window
     *          Return "" if there is no such a string
     */
    public String minWindow(String source, String target) {
        int[] toFind = new int[256];
        int[] hasFound = new int[256];
        for (int i = 0; i < target.length(); ++i) {
            toFind[target.charAt(i)]++;
        }
        String result = "";
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < source.length(); ++i) {
            hasFound[source.charAt(i)]++;
            toFind[source.charAt(i)] = toFind[source.charAt(i)] - 1;
            if (toFind[source.charAt(i)] < 0) {
                toFind[source.charAt(i)] = 0;
            }
        }
    }

}
