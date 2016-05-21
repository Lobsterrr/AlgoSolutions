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
        dfs(A, k, target, 0, 
        return 
    }

    public void dfs(int[] A, int k, int target, int sum, List<Integer> list, List<List<Integer>> result, int position) {
        if (sum == target) {
            result.add(new ArrayList<Integer>(list));
            return;
        }
        if (list.size() > k) {
            return;
        }
        list.add(A[position]);
        sum += A[position];
        for (int i = position + 1; i < A.length; ++i) {
            dfs(A, k, target, sum, list, result, position + 1);
        }
        sum -= A[position];
        list.remove(list.size() - 1);
    }

}
