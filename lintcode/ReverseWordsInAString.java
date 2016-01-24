/*
 * Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".

Example
Clarification
What constitutes a word?
A sequence of non-space characters constitutes a word.
Could the input string contain leading or trailing spaces?
Yes. However, your reversed string should not contain leading or trailing spaces.
How about multiple spaces between two words?
Reduce them to a single space in the reversed string.
 */
public class ReverseWordsInAString {

    /**
     * @param s : A string
     * @return : A string
     */
    public String reverseWords(String s) {
        s = s.trim();
        String result = "";
        int i = s.length() - 1;
        int j = s.length() - 1;
        while (i >= 0 && j >= 0) {
            while (j >= 0 && s.charAt(j) == ' ') {
                j--;
            }
            i = j;
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            if (result.length() > 0) {
                result += " ";
            }
            result += s.substring(i + 1, j + 1);
            j = i;
        }
        return result;
    }

    public void 

}
