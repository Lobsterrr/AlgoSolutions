/*
 * Given 2*n + 2 numbers, every numbers occurs twice except two, find them.

Example
Given [1,2,2,3,4,4,5,3] return 1 and 5

Challenge
O(n) time, O(1) extra space.
 */
public class SingleNumberIII {

    /**
     * @param A : An integer array
     * @return : Two integers
     */
    public List<Integer> singleNumberIII(int[] A) {
        int xor = 0;
        for (int a : A) {
            xor ^= a;
        }
        int lowestBit = xor ^ (xor - 1);
    }

}
