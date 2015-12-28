/*
 *
 */
public class FirstPositionOfTarget {

    public int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high && target <= nums[high]) {
            if (nums[low] == target) {
                return low;
            }
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                high = mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            }
        }
        return -1;
    }

}
