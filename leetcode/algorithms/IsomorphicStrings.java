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
        Map<Character, List<Integer>> map1 = new LinkedHashMap<Character, List<Integer>>();
        Map<Character, List<Integer>> map2 = new LinkedHashMap<Character, List<Integer>>();
        for (int i = 0; i < s.length(); i++) {
            if (map1.containsKey(s.charAt(i))) {
                map1.get(s.charAt(i)).add(i);
            } else {
                List<Integer> list = new ArrayList<Integer>();
                list.add(i);
                map1.put(s.charAt(i), list);
            }
            if (map2.containsKey(t.charAt(i))) {
                map2.get(t.charAt(i)).add(i);
            } else {
                List<Integer> list = new ArrayList<Integer>();
                list.add(i);
                map2.put(t.charAt(i), list);
            }
        }
        return new ArrayList<List<Integer>>(map1.values()).equals(new ArrayList<List<Integer>>(map2.values()));
    }

/*****************************************************************************/

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

}
