/*
 * Given an unsorted integer array, find the first missing positive integer.

Example
Given [1,2,0] return 3,
and [3,4,-1,1] return 2.

Challenge
Your algorithm should run in O(n) time and uses constant space.
 */
public class FirstMissingPositive {

    /**    
     * @param A: an array of integers
     * @return: an integer
     */
    public int firstMissingPositive(int[] A) {
        int i = 0;
        while (i < A.length) {
            if (A[i] != (i + 1) && 1 <= A[i] && A[i] <= A.length) {
                swap(A, i, A[i] - 1);
            } else {
                i++;
            }
        }
        for (int i = 0; i < A.length; ++i) {
            if (A[i] != i + 1) {
                return i + 1;
            }
        }
        return 1;
    }

    public void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

}
