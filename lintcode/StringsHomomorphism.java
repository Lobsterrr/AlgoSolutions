/*
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while
preserving the order of characters. No two characters may map to the same
character but a character may map to itself.

 Notice

You may assume both s and t have the same length.

Example
Given s = "egg", t = "add", return true.

Given s = "foo", t = "bar", return false.

Given s = "paper", t = "title", return true.
 */
public class StringsHomomorphism {

    /*
     * @param s: a string
     * @param t: a string
     * @return: true if the characters in s can be replaced to get t or false
     */
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null) {
            return s == t;
        }
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> stMap = new HashMap<Character, Character>();
        Map<Character, Character> tsMap = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); ++i) {
            if (stMap.get(s.charAt(i)) != null && stMap.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
            if (tsMap.get(t.charAt(i)) != null && tsMap.get(t.charAt(i)) != s.charAt(i)) {
                return false;
            }
            stMap.put(s.charAt(i), t.charAt(i));
            tsMap.put(t.charAt(i), s.charAt(i));
        }
        return true;
    }

}
