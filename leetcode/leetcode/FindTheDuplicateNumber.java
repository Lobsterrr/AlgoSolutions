/*
Given an array nums containing n + 1 integers where each integer is between 1 
and n (inclusive), prove that at least one duplicate number must exist. Assume 
that there is only one duplicate number, find the duplicate one.

Note:
You must not modify the array (assume the array is read only).
You must use only constant, O(1) extra space.
Your runtime complexity should be less than O(n^2).
There is only one duplicate number in the array, but it could be repeated more 
than once.
 */
public class FindTheDuplicateNumber {

    public int findDuplicate(int[] nums) {
        if (nums.length <= 2) {
            return nums[0];
        }
        int cur1 = nums[0] - 1;
        int cur2 = nums[nums[0] - 1] - 1;
        while (true) {
            cur1 = nums[cur1] - 1;
            cur2 = nums[nums[cur2] - 1] - 1;
            if (cur1 == cur2) {
                break;
            }
        }
        cur1 = 0;
        while (nums[cur1] != nums[cur2]) {
            cur1 = nums[cur1] - 1;
            cur2 = nums[cur2] - 1;
        }
        return nums[cur1];
    }

}
