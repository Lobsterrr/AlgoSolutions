/*
Given an array of integers, return indices of the two numbers such that they 
add up to a specific target.

You may assume that each input would have exactly one solution, and you may not
use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
public class TwoSum {

    // O(n) time, O(n) space.
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return new int[2];
    }

/*****************************************************************************/

    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            if (nums[low] + nums[high] == target) {
                return new int[] {low, high};
            } else if (nums[low] + nums[high] < target) {
                low++;
            } else {
                high--;
            }
        }
        return new int[2];
    }

}
