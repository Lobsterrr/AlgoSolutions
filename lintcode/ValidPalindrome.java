/*
 * Given a string, determine if it is a palindrome, considering 
 * only alphanumeric characters and ignoring cases.

Example
"A man, a plan, a canal: Panama" is a palindrome.

"race a car" is not a palindrome.

Note
Have you consider that the string might be empty? This is a good 
question to ask during an interview.

For the purpose of this problem, we define empty string as valid 
palindrome.
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
        while (i < j) {
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
