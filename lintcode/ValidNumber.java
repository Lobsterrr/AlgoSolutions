/*
 * Validate if a given string is numeric.

Example
"0" => true

" 0.1 " => true

"abc" => false

"1 a" => false

"2e10" => true
 */
public class ValidNumber {

    /**
     * @param s the string that represents a number
     * @return whether the string is a valid number
     */
    public boolean isNumber(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (Character.isLetter(c) && c != 'e' && c != 'E') {
                return false;
            }
        }
    }

}
