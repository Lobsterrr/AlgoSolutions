/*
 * Given two integers n and k, return all possible 
 * combinations of k numbers out of 1 ... n.

Example
For example,
If n = 4 and k = 2, a solution is:
[[2,4],[3,4],[2,3],[1,2],[1,3],[1,4]]
 */
public class Combinations {

    /**
     * @param n: Given the range of numbers
     * @param k: Given the numbers of combinations
     * @return: All the combinations of k numbers out of 1..n
     */
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (k == 0) {
            result.add(new ArrayList<Integer>());
            return result;
        }
        for (int i = k; i <= n; ++i) {
            for (List<Integer> list : combine(i - 1, k - 1)) {
                list.add(i);
                result.add(list);
            }
        }
        return result;
    }

    
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (k == 0) {
            result.add(new ArrayList<Integer>());
            return result;
        }
        for (int i = k; i <= n; ++i) {
            for (List<Integer> list : combine(i - 1, k - 1)) {
                list.add(i);
                result.add(list);
            }
        }
        return result;
    }

}
