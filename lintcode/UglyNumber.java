/*
 * Ugly number is a number that only have factors 3, 5 and 7.

Design an algorithm to find the Kth ugly number. The first 5 ugly numbers are 3, 5, 7, 9, 15 ...

Example
If K=4, return 9.

Challenge
O(K log K) or O(K) time.
 */
public class UglyNumber {

    /**
     * @param k: The number k.
     * @return: The kth prime number as description.
     */
    public long kthPrimeNumber(int k) {
        int[] ugly = new int[k + 1];
        ugly[0] = 1;
        int i3 = 0;
        int i5 = 0;
        int i7 = 0;
        for (int i = 1; i <= k; ++i) {
            int next = Math.min(ugly[i3] * 3, Math.min(ugly[i5] * 5, ugly[i7] * 7));
            
        }
    }

}
