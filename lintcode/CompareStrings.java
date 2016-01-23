/*
 *
 */
public class CompareStrings {

    public boolean compareStrings(String A, String B) {
        if (A.length() < B.length()) {
            return false;
        }
        int[] chars = new int[256];
        for (int i = 0; i < A.length(); ++i) {
            chars[A.charAt(i)]++;
            if (i < B.length()) {
                chars[B.charAt(i)]--;
            }
        }
        for (int i = 0; i < chars.length; ++i) {
            if (chars[i] < 0) {
                return false;
            }
        }
        return true;
    }

}
