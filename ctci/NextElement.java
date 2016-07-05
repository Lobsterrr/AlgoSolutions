public class NextElement {

    public int[] findNext(int[] A, int n) {
        if (A == null || A.length == 0) {
            return null;
        }
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; ++i) {
            int value = -1;
            for (int j = i + 1; j < A.length; ++j) {
                if (A[j] > A[i]) {
                    value = A[j];
                    break;
                }
            }
            result[i] = value;
        }
        return result;
    }

}
