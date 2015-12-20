/*
 *
 */
public class ContainerWithMostWater {

    public int maxArea(int[] heights) {
        int result = 0;
        int low = 0; 
        int high = heights.length - 1;
        while (low <= high) {
            result = Math.max(result, Math.min(heights[low], heights[high]) * (high - low));
            if (heights[low] < heights[high]) {
                low++;
            } else {
                high--;
            }
        }
        return result;
    }

}
