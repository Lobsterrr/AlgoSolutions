/*
Given a string, determine if it is a palindrome, considering only alphanumeric 
characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to 
ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            } else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            } else {
                int small = Math.min(s.charAt(i), s.charAt(j));
                int large = Math.max(s.charAt(i), s.charAt(j));
                if (small != large && (Character.isLetter(s.charAt(i)) || Character.isLetter(s.charAt(j))) && large != small + 32) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }

}
