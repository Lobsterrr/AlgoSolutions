/*
Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of
all numbers in this range, inclusive.

For example, given the range [5, 7], you should return 4.
 */
public class BitwiseANDOfNumbersRange {

    public int rangeBitwiseAnd(int m, int n) {
        int delta = n - m;
        int mask = 1;
        int result = m & n;
        while (mask < delta) {
            result &= mask;
            mask <<= 1;
        }
        return result;
    }

}
