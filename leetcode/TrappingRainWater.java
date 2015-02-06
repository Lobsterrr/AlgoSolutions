/*
 * Given n non-negative integers representing an elevation map where the width 
 * of each bar is 1, compute how much water it is able to trap after raining.

 * For example, 
 * Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 */
public class TrappingRainWater {

    public int trap(int[] A) {
        int[] leftMax = new int[A.length];
        int[] rightMax = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            leftMax[i] = Math.max(leftMax[i - (i == 0 ? 0 : 1)], A[i]);
            rightMax[A.length - 1 - i] = Math.max(rightMax[A.length - 
                    (i == 0 ? 1 : 0) - i], A[A.length - 1 - i]);
        }
        int result = 0 ;
        for (int i = 0; i < A.length; i++) {
            result += Math.min(leftMax[i], rightMax[i]) - A[i];
        }
        return result;
    }

/*****************************************************************************/

    public int trap_2(int[] A) {
        int res = 0, i = 0, j = A.length - 1;
        while(i < j) {
            int k;
            if(A[i] < A[j]) {
                k = i + 1;
                while(A[i] > A[k]) {
                    res += A[i] - A[k];
                    k++;
                }
                i = k;
            } else {
                k = j - 1;
                while(A[j] > A[k]) {
                    res += A[j] - A[k];
                    k--;
                }
                j = k;
            }
        }
        return res;
    }
}
