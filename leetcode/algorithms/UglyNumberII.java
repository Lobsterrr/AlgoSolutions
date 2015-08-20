/*
 * Write a program to find the n-th ugly number.

 * Ugly numbers are positive numbers whose prime factors 
 * only include 2, 3, 5. For example, 1, 2, 3, 4, 5, 6, 8, 
 * 9, 10, 12 is the sequence of the first 10 ugly numbers.

 * Note that 1 is typically treated as an ugly number.

 * Hint:

 * 1. The naive approach is to call isUgly for every number 
 * until you reach the nth one. Most numbers are not ugly. 
 * Try to focus your effort on generating only the ugly ones.
 * 2. An ugly number must be multiplied by either 2, 3, or 5 
 * from a smaller ugly number.
 * 3. The key is how to maintain the order of the ugly 
 * numbers. Try a similar approach of merging from three 
 * sorted lists: L1, L2, and L3.
 * 4. Assume you have Uk, the kth ugly number. Then Uk+1 must 
 * be Min(L1 * 2, L2 * 3, L3 * 5).
 */
public class UglyNumberII {

    public int nthUglyNumber(int n) {
        int[] result = new int[n];
        result[0] = 1;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        int next2 = 2;
        int next3 = 3;
        int next5 = 5;
        int next;
        for (int i = 1; i < n; ++i) {
            next = Math.min(next2, Math.min(next3, next5));
            result[i] = next;
            if (next == next2) {
                i2++;
                next2 = result[i2] * 2;
            }
            if (next == next3) {
                i3++;
                next3 = result[i3] * 3;
            }
            if (next == next5) {
                i5++;
                next5 = result[i5] * 5;
            }
        }
        return next;
    }

    public int nthUglyNumber(int n) {
        int[] result = new int[n];
        result[0] = 1;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        int next;
        for (int i = 1; i < n; ++i) {
            
        }
    }

}
