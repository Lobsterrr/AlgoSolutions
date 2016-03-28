/*
 * Write a program to find the nth super ugly number.

Super ugly numbers are positive numbers whose all prime factors are in the given prime list primes of size k. For example, [1, 2, 4, 7, 8, 13, 14, 16, 19, 26, 28, 32] is the sequence of the first 12 super ugly numbers given primes = [2, 7, 13, 19] of size 4.

 Notice

1 is a super ugly number for any given primes.
The given numbers in primes are in ascending order.
0 < k <= 100, 0 < n <= 10^6, 0 < primes[i] < 1000
Example
Given n = 6, primes = [2, 7, 13, 19] return 13
 */
public class SuperUglyNumber {

    /**
     * @param n a positive integer
     * @param primes the given prime list
     * @return the nth super ugly number
     */
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] result = new int[n];
        result[0] = 1;
        int next2 = 2;
        int next7 = 7;
        int next13 = 13;
        int next19 = 19;
        int i2 = 0;
        int i7 = 0;
        int i13 = 0;
        int i19 = 0;
        for (int i = 1; i < n; ++i) {
            result[i] = Math.min(Math.min(next2, next7), Math.min(next13, next19));
            if (result[i] == next2) {
                next2 = result[++i2] * 2;
            }
            if (result[i] == next7) {
                next7 = result[++i7] * 7;
            }
            if (result[i] == next13) {
                next13 = result[++i13] * 13;
            }
            if (result[i] == next19) {
                next19 = result[++i19] * 19;
            }
        }
        return result[n - 1];
    }

}
