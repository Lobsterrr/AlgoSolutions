/*
 *
 */
public class SearchInRotatedSortedArrayII {

    public boolean search(int[] A, int target) {
        int low = 0;
        int high = A.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A[mid] == target) {
                return A[mid];
            }
        }
    }

}
