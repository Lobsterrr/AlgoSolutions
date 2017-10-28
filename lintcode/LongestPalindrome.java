/*
Given a string which consists of lowercase or uppercase letters, find the
length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

 Notice

Assume the length of given string will not exceed 1010.

Example
Given s = "abccccdd" return 7

One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
public class LongestPalindrome {

    /*
     * @param s: a string which consists of lowercase or uppercase letters
     * @return: the length of the longest palindromes that can be built
     */
    public int longestPalindrome(String s) {
        int maxPalindromeLen = 0;
        for (int i = 1; i <= s.length(); ++i) {
            if (isPalindrome(s.substring(0, i))) {
                maxPalindromeLen = Math.max(maxPalindromeLen, i);
            }
            if (isPalindrome(s.substring(s.length() - i))) {
                maxPalindromeLen = Math.max(maxPalindromeLen, i);
            }
        }
        return s.length() - maxPalindromeLen;
    }

    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        for (int i = 0; i < s.length() / 2; ++i) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i) {
                return false;
            }
        }
        return true;
    }

}
