/*
 * Implement an algorithm to determine if a string has all unique characters.

Example
Given "abc", return true.

Given "aab", return false.

Challenge
What if you can not use additional data structures?
 */
public class UniqueCharacter {

    public boolean isUnique(String str) {
        if (str.length() <= 1)
            return true;
        boolean[] isUnique = new boolean[str.length()];
        for (int i = 0; i < str.length(); ++i) {
            if (isUnique[str.charAt(i)]) {

            }
        }
    }

}
