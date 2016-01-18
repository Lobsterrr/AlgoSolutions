/*
 * Given n non-negative integers representing an 
 * elevation map where the width of each bar is 
 * 1, compute how much water it is able to trap 
 * after raining.

Trapping Rain Water

Example
Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.

Challenge
O(n) time and O(1) memory

O(n) time and O(n) memory is also acceptable.
 */
public class TrappingRainWater {

    /**
     * @param heights: an array of integers
     * @return: a integer
     */
    public int trapRainWater(int[] heights) {
        if (heights.length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(heights[0]);
        int lastMaxHeightIndex = 0;
        int result = 0;
        for (int i = 1; i < heights.length; ++i) {
            if (heights[i] >= stack.peek()) {
                for (int j = lastMaxHeightIndex; j < i; ++j) {
                    result += Math.max(0, heights[lastMaxHeightIndex] - heights[j]);
                }
                stack.push(heights[i]);
                lastMaxHeightIndex = i;
            }
        }
    }

}
