/*
 * Given an array with positive and negative integers. Re-range it to interleaving with positive and negative integers.

 Notice

You are not necessary to keep the original order of positive integers or negative integers.

Example
Given [-1, -2, -3, 4, 5, 6], after re-range, it will be [-1, 5, -2, 4, -3, 6] or any other reasonable answer.

Challenge 
Do it in-place and without extra memory.
 */
public class InterleavingPositiveAndNegativeNumbers {

    /**
     * @param A: An integer array.
     * @return: void
     */
    public void rerange(int[] A) {
        boolean needPositive = true;
        for (int i = 0; i < A.length; ++i) {
            if (needPositive && A[i] < 0) {
                int j = i + 1;
                for (; j < A.length && A[j] <= 0; ++j);
                if (j < A.length) {
                    swap(A, i, j);
                }
            } else if (!needPositive && A[i] > 0) {
                int j = i + 1;
                for (; j < A.length && A[j] >= 0; ++j);
                if (j < A.length) {
                    swap(A, i, j);
                }
            }
            needPositive = !needPositive;
        }
    }

    public void swap(int[] array, int x, int y) {
        int tmp = array[x];
        array[x] = array[y];
        array[y] = tmp;
    }

}
