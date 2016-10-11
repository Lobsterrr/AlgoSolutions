/*
 * Given a non-empty array containing only positive integers, find if the array 
 * can be partitioned into two subsets such that the sum of elements in both 
 * subsets is equal.

 * Note:
 * Both the array size and each of the array element will not exceed 100.
 * 
 * Example 1:
 * 
 * Input: [1, 5, 11, 5]
 * 
 * Output: true
 * 
 * Explanation: The array can be partitioned as [1, 5, 5] and [11].
 * Example 2:
 * 
 * Input: [1, 2, 3, 5]
 * 
 * Output: false
 * 
 * Explanation: The array cannot be partitioned into equal sum subsets.
 */
public class PartitionEqualSubsetSum {

    public boolean canPartition(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) {
            return false;
        }
        Arrays.sort(nums);
        return dfs(nums, 0, sum / 2);
    }

    public boolean dfs(int[] nums, int position, int sum) {
        if (sum == 0) {
            return true;
        }
        for (int i = position; i < nums.length && sum > 0; ++i) {
            if (i > position && nums[i] == nums[i - 1]) {
                continue;
            }
            if (dfs(nums, i + 1, sum - nums[i])) {
                return true;
            }
        }
        return false;
    }

/*****************************************************************************/

    public boolean canPartition(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) {
            return false;
        }
        Arrays.sort(nums);
        return dfs(nums, nums.length, sum / 2);
    }

    public boolean dfs(int[] nums, int position, int sum) {
        if (sum == 0) {
            return true;
        }
        if (position == 0 && sum != 0) {
            return false;
        }
        if (nums[position - 1] > 0) {
            return dfs(nums, position - 1, sum);
        }
        return dfs(nums, position - 1, sum) || dfs(nums, position - 1, sum - nums[position - 1]);



        for (int i = position; i < nums.length && sum > 0; ++i) {
            if (i > position && nums[i] == nums[i - 1]) {
                continue;
            }
            if (dfs(nums, i + 1, sum - nums[i])) {
                return true;
            }
        }
        return false;
    }

}
