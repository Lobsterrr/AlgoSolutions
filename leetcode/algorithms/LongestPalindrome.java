/*
 * Given a string which consists of lowercase or uppercase letters, find the 
 * length of the longest palindromes that can be built with those letters.

 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 * 
 * Note:
 * Assume the length of given string will not exceed 1,010.
 * 
 * Example:
 * 
 * Input:
 * "abccccdd"
 * 
 * Output:
 * 7
 * 
 * Explanation:
 * One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
public class LongestPalindrome {

    public int longestPalindrome(String s) {
        int[] count = new int[256];
        for (int i = 0; i < s.length(); ++i) {
            count[s.charAt(i)]++;
        }
        int result = 0;
        int maxOdd = 0;
        for (int c : count) {
            if (c % 2 == 0) {
                result += c;
            } else {
                maxOdd = Math.max(maxOdd, c);
            }
        }
        result += maxOdd;
        return result;
    }

}
