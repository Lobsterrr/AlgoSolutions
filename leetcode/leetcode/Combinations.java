/*
Given two integers n and k, return all possible combinations of k numbers out 
of 1 ... n.

For example,
If n = 4 and k = 2, a solution is:

[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
 */
public class Combinations {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= n; ++i) {
            list.add(i);
        }
        for (int i = 1; i <= k; ++i) {

        }
        return result;
    }

}
