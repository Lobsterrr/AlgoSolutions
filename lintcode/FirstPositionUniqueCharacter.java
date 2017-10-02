/*
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Example
Given s = "lintcode", return 0.

Given s = "lovelintcode", return 2.
 */
public class FirstPositionUniqueCharacter {

    /*
     * @param s: a string
     * @return: it's index
     */
    public int firstUniqChar(String s) {
        if (s == null) {
            return -1;
        }
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); ++i) {
            map.put(s.charAt(i), 1 + (map.get(s.charAt(i)) == null ? 0 : map.get(s.charAt(i))));
        }
        for (int i = 0; i < s.length(); ++i) {
            if (map.get(i) == 1) {
                return i;
            }
        }
        return -1;
    }

}
