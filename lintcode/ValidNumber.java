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
        s = s.trim();
        if (s == null || s.length() == 0) {
            return false;
        }
        int nonDigitCount = 0;
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                nonDigitCount++;
                if (Character.isLetter(c)) {
                    if (c != 'e' && c != 'E') {
                        return false;
                    } else {
                        nonDigitCount--;
                    }
                }
            }
        }
        if ( > 1) {
            return false;
        }

    }

}
