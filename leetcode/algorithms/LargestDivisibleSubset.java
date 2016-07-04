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
        if (nums == null || nums.length == 0) {
            return null;
        }
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; ++i) {
            List<Integer> list = new ArrayList<Integer>();
            for (int j = i; j >= 0; --j) {
                if (nums[i] % nums[j] == 0) {
                    list.add(0, nums[j]);
                }
                if (result.size() < list.size()) {
                    result = list;
                }
            }
        }
        return result;
    }

}
