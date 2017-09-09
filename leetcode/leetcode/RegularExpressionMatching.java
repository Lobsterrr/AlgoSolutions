/*
Implement regular expression matching with support for '.' and '*'.

'.' Matches any single character.
'*' Matches zero or more of the preceding element.

The matching should cover the entire input string (not partial).

The function prototype should be:
bool isMatch(const char *s, const char *p)

Some examples:
isMatch("aa","a") → false
isMatch("aa","aa") → true
isMatch("aaa","aa") → false
isMatch("aa", "a*") → true
isMatch("aa", ".*") → true
isMatch("ab", ".*") → true
isMatch("aab", "c*a*b") → true
 */
public class RegularExpressionMatching {

    public boolean isMatch(String s, String p) {
        if (s == null || p == null) {
            return s == p;
        }
        if (s.equals(p)) {
            return true;
        }
        if (p.length() == 0) {
            return s.length() == 0;
        }
        char cp = p.charAt(p.length() - 1);
        char cs = s.charAt(s.length() - 1);
        if (cp != '.' && cp != '*') {
            return cp == cs && isMatch(s.substring(0, s.length() - 1), p.substring(0, p.length() - 1));
        }
        if (cp == '.') {
            return isMatch(s.substring(0, s.length() - 1), p.substring(0, p.length() - 1));
        }
        if (cp == '*') {
            for (int i = 0; i < p.length(); ++i) {

            }
        }
    }

}
