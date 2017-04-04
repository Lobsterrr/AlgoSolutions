/*
Suppose an array sorted in ascending order is rotated at some pivot unknown to 
you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.
 */
public class FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            if (nums[low] < nums[high]) {
                return nums[low];
            }
            int mid = low + (high - low) / 2;
    // 3, 4, 5, 6, 7, 8, 9, 1, 2
    // 8, 9, 1, 2, 3, 4, 5, 6, 7
            if (low == mid) {
                return nums[high];
            } else if (nums[low] < nums[mid]) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }

}
