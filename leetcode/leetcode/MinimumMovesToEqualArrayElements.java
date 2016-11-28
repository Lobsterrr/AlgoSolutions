/*
Given a non-empty integer array of size n, find the minimum number of moves 
required to make all array elements equal, where a move is incrementing n - 1 
elements by 1.

Example:

Input:
[1,2,3]

Output:
3

Explanation:
Only three moves are needed (remember each move increments two elements):

[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 */

public class MinimumMovesToEqualArrayElements {


    public int minMoves(int[] nums) {
        int result = 0;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        for (int num : nums) {
            result += max - num;
        }
        return result;
    }

}
