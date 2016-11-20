/*
 *
 */
public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        int i = 0;
        for (int j = 0; i < s.length() && j < t.length(); ++j) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
        }
        return i == s.length();
    }

}
