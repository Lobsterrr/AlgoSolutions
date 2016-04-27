/*
 * Count the number of k's between 0 and n. k can be 0 - 9.

Example
if n=12, k=1 in [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12], 
we have FIVE 1's (1, 10, 11, 12)
 */
public class DigitCounts {

    /*
     * param k : As description.
     * param n : As description.
     * return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n) {
        if (n <= k) {
            return n == k ? 1 : 0;
        }
        int result = 0;
        int base = 0;
        int pow = 1;
        while (n >= pow) {
            int m = n / pow % 10;
            result += m * base;
            if (m == k) {
                result += n % pow;
            } else if (m > k) {
                result += pow;
            }
            base = 10 * base + pow;
            pow *= 10;
        }
        return result;
    }

}
