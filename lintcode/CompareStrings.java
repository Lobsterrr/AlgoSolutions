/*
 *
 */
public class CompareStrings {

    public boolean compareStrings(String A, String B) {
        int[] chars = new int[256];
        for (int i = 0; i < A.length(); ++i) {
            chars[A.charAt(i)]++;
        }
        for (int i = 0; i < B.length(); ++i) {
            if (--chars[B.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }

}
