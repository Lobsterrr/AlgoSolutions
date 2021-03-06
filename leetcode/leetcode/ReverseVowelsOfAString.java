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
        char[] array = s.toCharArray();
        for (int i = 0, j = array.length - 1; i < j;) {
            if (!isVowel(array[i])) {
                i++;
            } else if (!isVowel(array[j])) {
                j--;
            } else {
                swap(array, i++, j--);
            }
        }
        return new String(array);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' 
            || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public void swap(char[] array, int i, int j) {
        char tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
