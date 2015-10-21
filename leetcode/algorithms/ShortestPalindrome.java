/*
 * Given a string S, you are allowed to convert it to 
 * a palindrome by adding characters in front of it. 
 * Find and return the shortest palindrome you can 
 * find by performing this transformation.

 * For example:

 * Given "aacecaaa", return "aaacecaaa".

 * Given "abcd", return "dcbabcd".
 */
public class ShortestPalindrome {

    public String shortestPalindrome(String s) {
        int i = s.length();
        while (!isPalindrome(s.substring(0, i))) {
            i--;
        }
        String addStr = new StringBuilder(s.substring(i)).reverse().toString();
        return addStr + s;
    }

    public boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; ++i) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
