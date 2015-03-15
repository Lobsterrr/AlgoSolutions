/*
 * Write a function that takes an unsigned integer and returns the 
 * number of ¡¯1' bits it has (also known as the Hamming weight).

 * For example, the 32-bit integer ¡¯11' has binary representation 
 * 00000000000000000000000000001011, so the function should return 3.
 */

public class NumberOfOneBits {

    public int hammingWeight(int n) {
        return hammingWeight(n);
    }

    public int helper(long n) {
        if (n == 0 || n == 1)
            return (int) n;
        return 1 + helper(n - (long) Math.pow(2, (long) (Math.log(n) / Math.log(2))));
    }

}
