/*
 * Given a string and an offset, rotate string by offset. (rotate from left to right)

Have you met this question in a real interview? Yes
Example
Given "abcdefg".

offset=0 => "abcdefg"
offset=1 => "gabcdef"
offset=2 => "fgabcde"
offset=3 => "efgabcd"
Challenge
Rotate in-place with O(1) extra memory.
 */
public class RotateString {

    /**
     * @param str: an array of char
     * @param offset: an integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        for (int i = 0; i < offset; ++i) {
            char tmp = str[str.length - 1];
            for (int j = str.length - 1; j > 0; --j) {
                str[j] = str[j - 1];
            }
            str[0] = tmp;
        }
    }

}
