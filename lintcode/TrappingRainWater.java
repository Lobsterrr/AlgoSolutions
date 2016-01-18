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
        int[] leftMax = new int[heights.length];
        int[] rightMax = new int[heights.length];
        leftMax[0] = heights[0];
        rightMax[heights.length - 1] = heights[heights.length - 1];
        for (int i = 1; i < heights.length; ++i) {
            leftMax[i] = Math.max(leftMax[i - 1], heights[i]);
            rightMax[heights.length - 1 - i] = Math.max(rightMax[heights.length - i], heights[heights.length - 1 - i]);
        }
        int result = 0;
        for (int i = 0; i < heights.length; ++i) {
            result += Math.min(leftMax[i], rightMax[i]) - heights[i];
        }
        return result;
    }

}
