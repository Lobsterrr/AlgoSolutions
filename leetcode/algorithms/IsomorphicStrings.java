/*
 * Given two strings s and t, determine 
 * if they are isomorphic.
 * 
 * Two strings are isomorphic if the characters in 
 * s can be replaced to get t.
 * 
 * All occurrences of a character must be replaced 
 * with another character while preserving the 
 * order of characters. No two characters may map 
 * to the same character but a character may map 
 * to itself.
 * 
 * For example,
 * Given "egg", "add", return true.
 * 
 * Given "foo", "bar", return false.
 * 
 * Given "paper", "title", return true.
 */
public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && t.charAt(i) != t.charAt(j) ||
                        s.charAt(i) != s.charAt(j) && t.charAt(i) == t.charAt(j))
                    return false;
            }
        }
        return true;
    }

}
