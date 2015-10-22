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
        if (s.length() <= 1) 
            return s;
        String result = null;
        for (int i = s.length() / 2; i >= 1; --i) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                if ((result = check(s, i, i - 1)) != null)
                    return result;
            } else {
                if ((result = check(s, i - 1, i - 1)) != null) 
                    return result;
            }
        }
        return result;
    }

    public String check(String s, int left, int right) {
        int i = 1;
        for (; left - i >= 0 && right + i < s.length(); ++i) {
            if (s.charAt(left - i) != s.charAt(right + i)) {
                break;
            }
        }
        if (left - i >= 0)
            return null;
        StringBuffer sb = new StringBuffer(s.substring(right + i));
        sb.reverse();
        return sb.append(s).toString();
    }

}
