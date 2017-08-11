/*
Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of
all numbers in this range, inclusive.

For example, given the range [5, 7], you should return 4.
 */
public class BitwiseANDOfNumbersRange {

    public int rangeBitwiseAnd(int m, int n) {
        int delta = n - m;
        int mask = 0xFFFFFFFF;
        int result = m & n;
        for (int i = 0; delta > 0; --i) {
            mask = (mask >> (i + 1));
            mask = (mask << (i + 1));
            result &= mask;
            delta >> 1;
        }
        return result;
    }

}
