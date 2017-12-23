/*
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while
preserving the order of characters. No two characters may map to the same
character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

Note:
You may assume both s and t have the same length.
 */
public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null) {
            return s == t;
        }
        if (s.length() != t.length()) {
            return false;
        }
        int[] index0 = new int[256];
        int[] index1 = new int[256];
        for (int i = 0; i < s.length(); ++i) {
            if (index0[s.charAt(i)] != index1[t.charAt(i)]) {
                return false;
            }
            index0[s.charAt(i)] = i + 1;
            index1[t.charAt(i)] = i + 1;
        }
        return true;
    }

/*****************************************************************************/

    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null) {
            return s == t;
        }
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map0 = new HashMap<Character, Character>();
        Map<Character, Character> map1 = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); ++i) {
            if (map0.containsKey(s.charAt(i))) {
                if (map0.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                map0.put(s.charAt(i), t.charAt(i));
            }

            if (map1.containsKey(t.charAt(i))) {
                if (map1.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            } else {
                map1.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }

}
