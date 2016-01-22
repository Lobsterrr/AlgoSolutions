/*
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume NO duplicates in the array.

Example
[1,3,5,6], 5 ¡ú 2

[1,3,5,6], 2 ¡ú 1

[1,3,5,6], 7 ¡ú 4

[1,3,5,6], 0 ¡ú 0

Challenge
O(log(n)) time
 */
public class SearchInsertPosition {

    /** 
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    public int searchInsert(int[] A, int target) {
        int low = 0;
        int high = A.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A[mid] == target) {
                return mid;
            }
            if (A[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

}
