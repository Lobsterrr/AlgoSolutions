/*
 * Given an integer array, sort it in ascending order. Use quick sort, merge sort, heap sort or any O(nlogn) algorithm.

Have you met this question in a real interview? Yes
Example
Given [3, 2, 1, 4, 5], return [1, 2, 3, 4, 5].
 */
public class SortIntegersII {
    /**
     * @param A an integer array
     * @return void
     */
    public void sortIntegers2(int[] A) {
        
    }

    public void quicksort(int[] A, int low, int high) {
        if (A == null || A.length <= 1 || low < 0 
                || high >= A.length || low >= high) {
            return;
        }
        int index = low;
        for (int i = low; i < high; ++i) {
            if (A[i] <= A[high]) {
                swap(A, i, index++);
            }
        }
        swap(A, index, high);
        quicksort(A, low, index - 1);
        quicksort(A, index + 1, high);
    }

    public void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

}
