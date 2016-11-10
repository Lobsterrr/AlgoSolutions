/*
Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?
 */
public class PascalTriangleII {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<Integer>();
        for (int k = 0, nCk = 1; k <= rowIndex; ++k) {
            result.add(nCk);
            nCk = (int) ((long) nCk * (rowIndex - k) / (k + 1)); 
        }
        return result;
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<Integer>();
        getRow(rowIndex, 0, result);
        return result;
    }

    public void getRow(int rowIndex, int i, List<Integer> result) {
        if (i == rowIndex) {
            return;
        }
        int size = result.size();
        result.add(result.get(size - 2) + result.get(size - 1));
        getRow(rowIndex, i + 1, result);
    }

}
