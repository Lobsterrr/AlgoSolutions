/*
 * Given a 2D binary matrix filled with 0's and 1's, find the largest square containing all 1's and return its area.

 * For example, given the following matrix:
 * 
 * 1 0 1 0 0
 * 1 0 1 1 1
 * 1 1 1 1 1
 * 1 0 0 1 0
 * Return 4.
 */
public class MaximalSquare {

    public int maximalSquare(char[][] matrix) {
        int xLen = matrix.length;
        int yLen = matrix[0].length;
        int[] height = new int[yLen];
        int result = 0;
        for (int i = 0; i < xLen; i++) {
            for (int j = 0; j < yLen; j++) {
                height[j] = matrix[i][j] == '0' ? 0 : height[j] + 1;    
            }
            int k = 0;
            Stack<Integer> stack = new Stack<Integer>();
            while (k < yLen) {
                if (stack.isEmpty() || height[k] >= height[stack.peek()]) {
                    stack.push(k++);
                } else {
                    int x = k - 1 - stack.pop();
                    int y = height[k];
                    int a = Math.max(x, y);
                    result = Math.max(result, a * a);
                }
            }
        }
        return result;
    }

    
}
