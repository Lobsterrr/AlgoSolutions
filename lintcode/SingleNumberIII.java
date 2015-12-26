/*
 * Given 2*n + 2 numbers, every numbers occurs twice except 
 * two, find them.

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
        int mask = xor & ~(xor - 1);
        int candidate0 = 0;
        int candidate1 = 0;
        for (int a : A) {
            if ((mask & a ) != 0) {
                candidate0 ^= a;
            } else {
                candidate1 ^= a;
            }
        }
        List<Integer> result = new ArrayList<Integer>();
        result.add(candidate0);
        result.add(candidate1);
        return result;
    }

}
