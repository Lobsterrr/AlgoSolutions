/*
 *
 */
public class ValidPalindrome {

    /**
     * @param s A string
     * @return Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        // Write your code here
        int i = 0; 
        int j = s.length() - 1;
        while (i < s.length() && i <= j && j >= 0) {
            if (!isLetter(s.charAt(i)) && !isNumber(s.charAt(i)))
                i++;
            else if (!isLetter(s.charAt(j)) && !isNumber(s.charAt(j)))
                j--;
            else {
                if (isLetter(s.charAt(i)) && isNumber(s.charAt(j))
                        || isLetter(s.charAt(j)) && isNumber(s.charAt(i)))
                    return false;
                int diff = Math.abs(s.charAt(i) - s.charAt(j));
                if (diff != 'a' - 'a' && diff != 'a' - 'A')
                    return false;
                i++;
                j--;
            }
        }
        return true;
    }

    public boolean isLetter(char c) {
        return 'a' <= c && c <= 'z' || 'A' <= c && c <= 'Z';
    }

    public boolean isNumber(char c) {
        return '0' <= c && c <= '9';
    }

}
