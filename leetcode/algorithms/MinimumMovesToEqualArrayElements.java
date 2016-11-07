/*
 * Given a non-empty integer array of size n, find the minimum number of moves 
 * required to make all array elements equal, where a move is incrementing 
 * n - 1 elements by 1.

 * Example:
 * 
 * Input:
 * [1,2,3]
 * 
 * Output:
 * 3
 * 
 * Explanation:
 * Only three moves are needed (remember each move increments two elements):
 * 
 * [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 */
public class MinimumMovesToEqualArrayElements {

    public int minMoves(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        long sum = 0;
        long max = Long.MIN_VALUE;
        for (int num : nums) {
            sum += num;
            max = Math.max(max, num);
        }
        while ((n * max - sum) % (n - 1) != 0) {
            max++;
        }
        return (int) ((n * max - sum) / (n - 1));
    }

}
