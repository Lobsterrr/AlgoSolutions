/*
Given n non-negative integers representing an elevation map where the width of 
each bar is 1, compute how much water it is able to trap after raining.

For example, 
Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.


The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In 
this case, 6 units of rain water (blue section) are being trapped. Thanks 
Marcos for contributing this image!
 */
public class TrappingRainWater {

    public int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }
        int len = height.length;
        int[] leftMost = new int[len];
        int[] rightMost = new int[len];
        leftMost[0] = height[0];
        rightMost[len - 1] = height[len - 1];
        for (int i = 1; i < len; ++i) {
            leftMost[i] = Math.max(leftMost[i - 1], height[i - 1]);
            rightMost[len - 1 - i] = Math.max(rightMost[len - i], height[len - i]);
        }
        int result = 0;
        for (int i = 1; i < len - 1; ++i) {
            if (height[i] < leftMost[i] && height[i] < rightMost[i]) {
                result += Math.min(leftMost[i], rightMost[i]) - height[i];
            }
        }
        return result;
    }

}
