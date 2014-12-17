/*
 * Given an unsorted array, find the maximum difference 
 * between the successive elements in its sorted form.

 * Try to solve it in linear time/space.

 * Return 0 if the array contains less than 2 elements.

 * You may assume all elements in the array are non-negative 
 * integers and fit in the 32-bit signed integer range.
 */
public class MaximumGap {

    // O(n) 
    public int maximumGap(int[] num) {
        if (num.length < 2)
            return 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            max = Math.max(max, num[i]);
            min = Math.min(min, num[i]);
        }
        double w = (double) (max - min) / (num.length + 1);
        int[][] bucket = new int[2][num.length + 1];
        Arrays.fill(bucket[0], min);
        Arrays.fill(bucket[1], max);
        for (int i = 0; i < num.length; i++) {
            int k = (int) Math.floor((num[i] - min) / w);
            if (k == num.length + 1)
                k--;
            bucket[0][k] = Math.max(bucket[0][k], num[i]);
            bucket[1][k] = Math.min(bucket[1][k], num[i]);
        }
        int result = Integer.MIN_VALUE;
        for (int i = 1, j = 0; i < num.length + 1; i++) {
            if (bucket[0][i] != min) {
                result = Math.max(result, bucket[1][i] - bucket[0][j]);
                j = i;
            }
        }
        return result;
    }

/***********************************************************************/

    // O(n*log(n))
    public int maximumGap(int[] num) {
        Arrays.sort(num);
        int result = 0;
        for (int i = 1; i < num.length; i++) {
            result = Math.max(result, num[i] - num[i - 1]);
        }
        return result;
    }
    
}
