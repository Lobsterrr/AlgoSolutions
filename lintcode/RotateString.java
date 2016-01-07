/*
 *
 */
public class RotateString {

    public void rotateString(char[] str, int offset) {
        return str.substring(str.length() - offset) + str.substring(0, str.length() - offset);
    }

}
