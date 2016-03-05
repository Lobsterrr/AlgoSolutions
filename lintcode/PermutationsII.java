/*
 * Given a list of numbers with duplicate number in it. Find all unique permutations.

Example
For numbers [1,2,2] the unique permutations are:

[
  [1,2,2],
  [2,1,2],
  [2,2,1]
]

Challenge
Using recursion to do it is acceptable. If you can do it without recursion, that would be great!
 */
public class PermutationsII {

    /**
     * @param nums: A list of integers.
     * @return: A list of unique permutations.
     */
    public ArrayList<ArrayList<Integer>> permuteUnique(ArrayList<Integer> nums) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (nums == null) {
            return result;
        }
        result.add(new ArrayList<Integer>());
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; ++i) {
            ArrayList<ArrayList<Integer>> tmp = new ArrayList<ArrayList<Integer>>(result);
            for (int i = 0; i < tmp.size(); ++i) {
                for (int k = 0; k <= tmp.get(i).size(); ++k) {
                    ArrayList<Integer> list = new ArrayList<Integer>(tmp.get(i));
                    list.add(k, nums[i]);
                    if (
                }
            }
        }
    }

}
