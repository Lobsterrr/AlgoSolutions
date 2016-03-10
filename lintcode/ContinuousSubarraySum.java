/*
 * Given an integer array, find a continuous subarray where the sum 
 * of numbers is the biggest. Your code should return the index of 
 * the first number and the index of the last number. (If their are 
 * duplicate answer, return anyone)

Example
Give [-3, 1, 3, -3, 4], return [1,4].
 */
public class ContinuousSubarraySum {

    /**
     * @param A an integer array
     * @return  A list of integers includes the index of the 
     * first number and the index of the last number
     */
    public ArrayList<Integer> continuousSubarraySum(int[] A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(-1);
        result.add(-1);
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0, start = 0, thisSum = 0; i < A.length; ++i) {
            thisSum += A[i];
            if (maxSum < thisSum) {
                maxSum = thisSum;
                result.set(0, start);
                result.set(1, i);
            }
            if (thisSum < 0) {
                thisSum = 0;
                start= i + 1;
            }
        }
        return result;
    }

}
