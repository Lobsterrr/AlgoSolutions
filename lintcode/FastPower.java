/*
 * Calculate the a ^ n % b where a, b and n are all 32bit integers.

Example
For 2 ^ 31 % 3 = 2

For 100 ^ 1000 % 1000 = 0

Challenge
O(logn)
 */
public class FastPower {

    /*
     * @param a, b, n: 32bit integers
     * @return: An integer
     */
    public int fastPower(int a, int b, int n) {
        if (n == 0 || n == 1) {
            return Math.pow(a, n) % b;
        }
        int half = fastPower(a, b, n / 2);
        int result = half * half % b;
        if (n % 2 == 1) {
            result = result * a % b;
        }
        return result;
    }

}
