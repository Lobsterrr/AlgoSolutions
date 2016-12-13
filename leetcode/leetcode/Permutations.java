/*
Given a collection of distinct numbers, return all possible permutations.

For example,
[1,2,3] have the following permutations:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
 */
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> tmp = new ArrayList<Integer>();
        tmp.add(nums[0]);
        result.add(tmp);
        for (int i = 1; i < nums.length; ++i) {
            int size = result.size();
            for (int j = 0; j < size; ++j) {
                List<Integer> list = result.remove(0);
                for (int k = 0; k <= list.size(); ++k) {
                    List<Integer> item = new ArrayList<Integer>(list);
                    item.add(k, nums[i]);
                    result.add(item);
                }
            }
        }
        return result;
    }

}
