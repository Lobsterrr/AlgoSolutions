/*
 * Given n distinct positive integers, integer k (k <= n) and a number target.

Find k numbers where sum is target. Calculate how many solutions there are?

Example
Given [1,2,3,4], k = 2, target = 5.

There are 2 solutions: [1,4] and [2,3].

Return 2.
 */
public class KSum {

    /**
     * @param A: an integer array.
     * @param k: a positive integer (k <= length(A))
     * @param target: a integer
     * @return an integer
     */
    public int kSum(int A[], int k, int target) {
        Arrays.sort(A);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        dfs(A, k, target, result, new ArrayList<Integer>(), 0);
        return result.size();
    }

    public void dfs(int[] A, int k, int target, List<List<Integer>> result, List<Integer> list, int position) {
        if (target == 0 && list.size() == k) {
            result.add(new ArrayList<Integer>(list));
            return;
        }
        for (int i = position; i < A.length; ++i) {
            list.add(A[position]);
            dfs(A, k, target - A[position], result, list, i + 1);
            list.remove(list.size() - 1);
        }
    }

}
