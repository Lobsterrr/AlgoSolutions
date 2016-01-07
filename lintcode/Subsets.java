/*
 * Given a set of distinct integers, return all possible subsets.

Example
If S = [1,2,3], a solution is:

[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
Note
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
Challenge
Can you do it in both recursively and iteratively?
 */
public class Subsets {

    /**
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> result = 
            new ArrayList<ArrayList<Integer>>();
        result.add(new ArrayList<Integer>());
        for (int num : nums) {
            ArrayList<ArrayList<Integer>> newResult = 
                new ArrayList<ArrayList<Integer>>();
            for (ArrayList<Integer> list : result) {
                ArrayList<Integer> newList = new ArrayList<Integer>(list);
                newList.add(num);
                newResult.add(newList);
            }
            result.addAll(newResult);
        }
        return result;
    }

}
