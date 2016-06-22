/*
 * Implement regular expression matching with support for '.' and '*'.

'.' Matches any single character.
'*' Matches zero or more of the preceding element.

The matching should cover the entire input string (not partial).

The function prototype should be:
bool isMatch(const char *s, const char *p)
Example
isMatch("aa","a") ¡ú false
isMatch("aa","aa") ¡ú true
isMatch("aaa","aa") ¡ú false
isMatch("aa", "a*") ¡ú true
isMatch("aa", ".*") ¡ú true
isMatch("ab", ".*") ¡ú true
isMatch("aab", "c*a*b") ¡ú true
 */
public class RegularExpressionMatching {

    /**
     * @param s: A string 
     * @param p: A string includes "." and "*"
     * @return: A boolean
     */
    public boolean isMatch(String s, String p) {
        if (p.length() == 0) {
            return s.length() == 0;
        } else if (p.length() == 1) {
            return s.length() == 1 
                && (p.charAt(0) == '.' || p.charAt(0) == s.charAt(0));
        } else {
            if (p.charAt(1) != '*') {
                return s.length() > 0 
                    && (p.charAt(0) == '.' || p.charAt(0) == s.charAt(0)) 
                    && isMatch(s.substring(1), p.substring(1));
            } else {
                return s.length() > 0 
                    && (p.charAt(0) == '.' || p.charAt(0) == s.charAt(0)) 
                    && isMatch(s.substring(1), p) 
                    || isMatch(s, p.substring(2));
            }
        }
    }

}
