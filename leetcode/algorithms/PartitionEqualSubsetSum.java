/*
 * Given a non-empty array containing only positive integers, find if the array can be partitioned into two subsets such that the sum of elements in both subsets is equal.

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
        List<List<Integer>> list = combinationSum2(nums);
        return list.size() > 0;
    }

     public List<List<Integer>> combinationSum2(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        dfs(result, new ArrayList<Integer>(), nums, 0, 0, sum);
        return result;
    }

    public void dfs(List<List<Integer>> result, List<Integer> list, int[] num, int position, int curSum, int sum) {
        if (2 * curSum == sum) {
            result.add(new ArrayList<Integer>(list));
            return;
        }
        for (int i = position; i <= num.length - 1 && 2 * curSum < sum; i++) {
            if (i > position && num[i] == num[i - 1])
                continue;
            list.add(num[i]);
            dfs(result, list, num, i + 1, curSum + num[i], sum);
            list.remove(list.size() - 1);
        }
    }

}
