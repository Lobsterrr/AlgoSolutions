/*
 *
 */
public class ReverseVowelsOfAString {

    public String reverseVowels(String s) {
        char[] array = s.toCharArray();
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (!isVowelsChar(array[i])) {
                i++;
            } else if (!isVowelsChar(array[j])) {
                j--;
            } else {
                swap(array, i, j);
            }
        }
        return new String(array);
    }

    public boolean isVowelsChar(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
