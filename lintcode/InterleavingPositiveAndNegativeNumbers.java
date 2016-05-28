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
        int index = 0;
        for (int i = 0; i < A.length; ++i) {
            if (A[i] < 0) {
                swap(A, index++, i);
            }
        }
        if (index != (A.length + 1) / 2) {
            if (index < (A.length + 1) / 2) {
                for (int i = 0; i < A.length / 2; ++i) {
                    swap(A, i, A.length - 1 - i);
                }
            }
            swap(A, index - 1, A.length - 1);
            index--;
        }
        // a a a b b b a;
        //
        // a a a a b b b b
        if (index % 2 == 1) {
            index++;
        }
        for (int i = 1; i <= A.length / 2; i += 2, index += 2) {
            swap(A, i, index);
        }
    }

    public void rerange(int[] A) {
        int positiveCount = 0;
        for (int a : A) {
            positiveCount += a > 0 ? 1 : 0;
        }
        boolean needPositive = 2 * positiveCount > A.length ? true : false;
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
