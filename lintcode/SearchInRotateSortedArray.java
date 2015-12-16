/*
 *
 */
public class SearchInRotateSortedArray {

    public int search(int[] A, int target) {
        int low = 0;
        int high = A.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (A[mid] < A[low]) {
                high = mid;
            } else if (A[mid] > A[low]) {
                low = mid + 1;
            }
        }
        return low;
    }

}
