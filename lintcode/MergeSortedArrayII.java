/*
 *
 */
public class MergeSortedArrayII {

    public int[] mergeSortedArray(int[] A, int[] B) {
        int[] C = new int[A.length + B.length];
        int i = A.length - 1;
        int j = B.length - 1;
        for (int k = A.length + B.length - 1; k >= 0; --k) {
            C[k] = (j < 0 || i >= 0 && A[i] > B[j]) ? A[i--] : B[j--];
        }
        return C;
    }

}
