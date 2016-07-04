/*
 * Given a set of distinct positive integers, find the largest subset 
 * such that every pair (Si, Sj) of elements in this subset satisfies: 
 * Si % Sj = 0 or Sj % Si = 0.

 * If there are multiple solutions, return any subset is fine.
 * 
 * Example 1:
 * 
 * nums: [1,2,3]
 * 
 * Result: [1,2] (of course, [1,3] will also be ok)
 * Example 2:
 * 
 * nums: [1,2,4,8]

Result: [1,2,4,8]
 */
public class LargestDivisibleSubset {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        Arrays.sort(nums);
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for (int i = 1; i < nums.length; ++i) {
            for (int j = i - 1; j >= 0; --j) {
                if (nums[i] % nums[j] == 0) {
                    dp[i] = dp[j] + 1;
                    break;
                }
            }
        }
        int maxIndex = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (dp[i] > dp[maxIndex]) {
                maxIndex = i;
            }
        }
        for (int i = maxIndex; i >= 0; --i) {
            if (nums[maxIndex] % nums[i] == 0) {
                result.add(0, nums[i]);
            }
        }
        return result;
    }

    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; ++i) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(0, nums[i]);
            for (int j = i - 1; j >= 0; --j) {
                if (list.get(0) % nums[j] == 0) {
                    list.add(0, nums[j]);
                }
            }
            if (result.size() < list.size()) {
                result = list;
            }
        }
        return result;
    }

}
