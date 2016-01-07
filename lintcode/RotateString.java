/*
 *
 */
public class RotateString {

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
