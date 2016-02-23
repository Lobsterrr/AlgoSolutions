/*
 *
 */
public class KSumII {

    /**
     * @param A: an integer array.
     * @param k: a positive integer (k <= length(A))
     * @param target: a integer
     * @return a list of lists of integer 
     */ 
    public ArrayList<ArrayList<Integer>> kSumII(int[] A, int k, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(A);
        dfs(result, new ArrayList<Integer>(), A, 0, k, target);
        return result;
    }
    
    public void dfs(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, int[] A, int position, int k, int target) {
        if (list.size() == k) {
            if (target == 0) {
                result.add(new ArrayList<Integer>(list));
            }
            return;
        }
        for (int i = position; i < A.length; ++i) {
            list.add(A[i]);
            dfs(result, list, A, i + 1, k, target - A[i]);
            list.remove(list.size() - 1);
        }
    }

}
