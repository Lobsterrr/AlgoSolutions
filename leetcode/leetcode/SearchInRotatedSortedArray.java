/*
Suppose an array sorted in ascending order is rotated at some pivot unknown to
you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index,
otherwise return -1.

You may assume no duplicate exists in the array.
 */
public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    public int binarySearch(int[] nums, int target, int low, int high) {
        if (nums == null || nums.length == 0 || low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        // 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 1, 2, 3
        // 6, 7, 0, 1, 2, 3, 4, 5
        if (target < nums[low]) {
            if (nums[mid] < nums[low] && nums[mid] > target) {
                return binarySearch(nums, target, low, mid - 1);
            } else {
                return binarySearch(nums, target, mid + 1, high);
            }
        } else { // target > nums[low]
            if (nums[mid] > nums[low] && nums[mid] < target) {
                return binarySearch(nums, target, mid + 1, high);
            } else {
                return binarySearch(nums, target, low, mid - 1);
            }
        }
    }

}
