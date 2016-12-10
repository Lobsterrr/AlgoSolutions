/*
Write a function that takes a string as input and reverse only the vowels of a 
string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

Note:
The vowels does not include the letter "y".
 */
public class ReverseVowelsOfAString {

    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        while (i < j) {
            if (isVowel(s.charAt(i)) && isVowel(s.charAt(j))) {
                sb.replace(i, i + 1, s.charAt(j));
                sb.replace(j, j + 1, s.charAt(i));
                i++;
                j--;
            } else if (!isVowel(s.charAt(i))) {
                i++;
            } else {
                j--;
            }
        }
        return sb.toString();
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' 
            || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

}
