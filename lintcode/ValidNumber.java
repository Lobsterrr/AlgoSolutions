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
        int dotCount = 0;
        int eCount = 0;
        int signCount = 0;
        int digitCount = 0;
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c == '+' || c == '-') {
                signCount++;
            } else if (c == '.') {
                dotCount++;
            } else if (c == 'e' || c == 'E') {
                eCount++;
                if (eCount > 0 && digitCount == 0) {
                    return false;
                }
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else {
                return false;
            } 
            if (signCount > 1 || dotCount > 1 || eCount > 1) {
                return false;
            }
        }
        return digitCount > 0;
    }


    public boolean isNumber(String s) {
        s = s.trim();
        int dotCount = 0;
        int eCount = 0;
        int signCount = 0;
        int digitCount = 0;
        int digitAfterE = 0;
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c == '+' || c == '-') {
                signCount++;
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
                if (dotCount > 0) {
                    return false;
                }
                if (i != 0 && eCount == 0) {
                    return false;
                }
            } else if (c == '.') {
                dotCount++;
                if (eCount > 0) {
                    return false;
                }
            } else if (c == 'e' || c == 'E') {
                eCount++;
                if (digitCount == 0) {
                    return false;
                }
            } else if (Character.isDigit(c)) {
                digitCount++;
                if (eCount > 0) {
                    digitAfterE++;
                }
            } else {
                return false;
            } 
            if (signCount > 1 || dotCount > 1 || eCount > 1) {
                return false;
            }
        }
        if (eCount > 0 && digitAfterE == 0) {
            return false;
        }
        return digitCount > 0;
    }

}
