/*
 *
 */
public class ArithMeticSlices {

    public int numberOfArithmeticSlices(int[] A) {
        if (A == null || A.length < 3) {
            return 0;
        }
        int result = 0;
        for (int i = 2, count = 0; i < A.length; ++i) {
            count = A[i] + A[i - 2] == 2 * A[i - 1] ? count + 1 : 0;
            result += count;
        }
        return result;
    }

}
