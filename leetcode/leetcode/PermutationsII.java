/*
Given a collection of numbers that might contain duplicates, return all 
possible unique permutations.

For example,
[1,1,2] have the following unique permutations:
[
  [1,1,2],
  [1,2,1],
  [2,1,1]
]
 */
public class PermutationsII {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        result.add(new ArrayList<Integer>());
        for (int i = 0; i < nums.length; ++i) {
            List<List<Integer>> tmp = new ArrayList<List<Integer>>();
            for (int j = 0; j < result.size(); ++j) {
                int start = 0;
                if (i > 0 && nums[i] == nums[i - 1]) {
                    start = result.get(0).size();
                }
                for (int k = start; k <= result.get(j).size(); ++k) {
                    List<Integer> list = new ArrayList<Integer>(result.get(j));
                    list.add(k, nums[i]);
                    tmp.add(list);
                }
            }
            result = tmp;
        }
        return result;
    }

}
