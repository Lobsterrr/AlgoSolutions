/*
 * Given an integer array, sort it in ascending order. Use selection sort, bubble sort, insertion sort or any O(n2) algorithm.

Example
Given [3, 2, 1, 4, 5], return [1, 2, 3, 4, 5].
 */
public class SortIntegers {

    /**
     * @param A an integer array
     * @return void
     */
    public void sortIntegers(int[] A) {
        bubbleSort(A);
    }

    // bubble sort
    public void bubbleSort(int[] A) {
        for (int i = 0; i < A.length; ++i) {
            for (int j = 1; j <= A.length - 1 - i; ++j) {
                if (A[j] < A[j - 1]) {
                    swap(A, j - 1, j);
                }
            }
        }
    }

    public void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

}
