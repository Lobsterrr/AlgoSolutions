/*
 * Follow up for N-Queens problem.

Now, instead outputting board configurations, 
return the total number of distinct solutions.

Example
For n=4, there are 2 distinct solutions.
 */
public class NQueensII {

    /**
     * Calculate the total number of distinct N-Queen solutions.
     * @param n: The number of queens.
     * @return: The total number of distinct solutions.
     */
    int result = 0;

    public int totalNQueens(int n) {

    }

    public void dfs(int row) {
        if (row == n) {
            result++;
            return;
        }
        for (int i = 0; i < n; ++i) {
            if (canPlace(row, i)) {
                
            }
        }

    }
    
    pubilc boolean canPlace(int x, int y) {

    } 

}
