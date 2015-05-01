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

    //Time Limit Exceeded
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

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> mapS = new HashMap<Character, Integer>();
        Map<Character, Integer> mapT = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (mapS.containsKey(s.charAt(i))) {
                int value = mapS.get(s.charAt(i));
                mapS.put(s.charAt(i), value + 1);
            } else {
                mapS.put(s.charAt(i), 1);
            }
            if (mapT.containsKey(t.charAt(i))) {
                int value = mapT.get(t.charAt(i));
                mapT.put(t.charAt(i), value + 1);
            } else {
                mapT.put(t.charAt(i), 1);
            }
        }
        return mapS.equals(mapT);
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, ArrayList<Integer>> map1 = new HashMap<Character, ArrayList<Integer>>();
        Map<Character, ArrayList<Integer>> map2 = new HashMap<Character, ArrayList<Integer>>();
        for (int i = 0; i < s.length(); i++) {
            if (map1.containsKey(s.charAt(i))) {
                map1.get(s.charAt(i)).add(i);
            } else {
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(i);
                map1.put(s.charAt(i), list);
            }
            if (map2.containsKey(t.charAt(i))) {
                map2.get(t.charAt(i)).add(i);
            } else {
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(i);
                map2.put(t.charAt(i), list);
            }
        }
        return map1.values().equals(map2.values());
    }

}
