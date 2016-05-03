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
        s = s.trim();
        int dotCount = 0;
        int letterCount = 0;
        int eCount = 0;
        int signCount = 0;
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c == '+' || c == '-') {
                signCount++;
            } else if (c == '.') {
                dotCount++;
            } else if (c == 'e' || c == 'E') {
                eCount++;
            } else if (!Character.isDigit(c)) {
                letterCount++;
            }
            
            if (signCount > 1 || dotCount > 1 || eCount > 1 || letterCount > 1) {
                return false;
            }
        }
        return true;
    }

}
