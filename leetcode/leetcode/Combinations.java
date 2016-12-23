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
        dfs(result, new ArrayList<Integer>(), n, k, 0);
        return result;
    }

    public void dfs(List<List<Integer>> result, List<Integer> list, int n, int k, int start) {
        if (list.size() == k) {
            result.add(list);
            return;
        }
        for (int i = start; i <= n; ++i) {
            List<Integer> item = new ArrayList<Integer>(list);
            item.add(i);
        }
    }

}
