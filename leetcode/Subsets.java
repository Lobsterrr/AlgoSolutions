/*
 * Given a set of distinct integers, S, return all possible subsets.

 * Note:

 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * For example,
 * If S = [1,2,3], a solution is:

 * [
 *  [3],
 *  [1],
 *  [2],
 *  [1,2,3],
 *  [1,3],
 *  [2,3],
 *  [1,2],
 *  []
 * ]
 */

public class Subsets {

    public List<List<Integer>> subsets(int[] S) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(S);
        for (int i = 0; i < 1 << S.length; i++) {
            List<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < S.length; j++) {
                if ((i & 1 << j) != 0)
                    list.add(S[j]);
            }
            result.add(list);
        }
        return result;
    }

/*****************************************************************************/

    public List<List<Integer>> subsets(int[] S) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(S);
        result.add(new ArrayList<Integer>());
        for (int i = 0; i < S.length; i++) {
            int k = result.size();
            for (int j = 0; j < k; j++) {
                List<Integer> list = new ArrayList<Integer>(result.get(j));
                list.add(S[i]);
                result.add(list);
            }
        }
        return result;
    }

/*****************************************************************************/

    public void dfs(int[] S, int pos, ArrayList<ArrayList<Integer>> res, 
            ArrayList<Integer> list) {
        for(int i = pos; i < S.length; i++) {
            list.add(S[i]);
            res.add(new ArrayList<Integer>(list));
            dfs(S, i + 1, res, list);
            list.remove(list.size() - 1);
        }
    }

    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(S);
        ArrayList<Integer> list = new ArrayList<Integer>();
        res.add(list);
        dfs(S, 0, res, list);
        return res;
    }
}
