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
 *
 * Note:
 * You may assume both s and t have the same length.
 */
public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map1 = new HashMap<Character, Character>();
        Map<Character, Character> map2 = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (map1.containsKey(c1) && map1.get(c1) != c2 || 
                    map2.containsKey(c2) && map2.get(c2) != c1)
                return false;
            map1.put(c1, c2);
            map2.put(c2, c1);
        }
        return true;
    }

    public booleana isIsomorphic(String s, String t) {
        int[] array1 = new int[128];
        int[] array2 = new int[128];
        for (int i = 0; i < s.length(); i++) {
            int c1 = (int) s.charAt(i);
            int c2 = (int) t.charAt(i);
            if (array1[c1] != 0 && array1[c1] != c2 ||
                    array2[c2] != 0 && array2[c2] != c1)
                return false;
            array1[c1] = c2;
            array2[c2] = c1;
        }
        return true;
    }

}
