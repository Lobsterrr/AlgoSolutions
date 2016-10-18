public class ArithmeticSlices {

    public int numberOfArithmeticSlices(int[] A) {
        int result = 0;
        for (int i = 2, len = 2; i < A.length; ++i) {
            if (A[i] == A[i - 1] && A[i - 1] == A[i - 2]) {
                len++;
            }
            if (len > 2 && (A[i] != A[i - 1] || A[i] != A[i - 2] || i == A.length - 1)) {
                result += (len - 1) * (len - 2) / 2;
                len = 2;
            }
        }
        return result;
    }

}
