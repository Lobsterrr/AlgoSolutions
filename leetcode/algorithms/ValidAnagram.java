/*
 * Given two strings s and t, write a function to determine if 
 * t is an anagram of s.

 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * 
 * Note:
 * You may assume the string contains only lowercase alphabets.
 */
public class ValidAnagram {
    
    public boolean isAnagram(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ct);
        s = new String(cs);
        t = new String(ct);
        return s.equals(t);
    }

}
