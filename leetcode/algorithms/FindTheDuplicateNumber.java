/*
 * Given an array nums containing n + 1 integers where each integer 
 * is between 1 and n (inclusive), prove that at least one duplicate 
 * element must exist. Assume that there is only one duplicate 
 * number, find the duplicate one.

 * Note:
 * You must not modify the array (assume the array is read only).
 * You must use only constant extra space.
 * Your runtime complexity should be less than O(n^2).
 */
public class FindTheDuplicateNumber {

    // O(n) time, O(1) space
    public int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i]);
            if (nums[index] < 0)
                return index;
            else if (nums[index] > 0)
                nums[index] *= -1;
        }
        return -1;
    }

/*******************************************************************/

    // O(n * lg(n)) time, O(1) space
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == nums[i - 1])
                return nums[i];
        }
        return -1;
    }

}
