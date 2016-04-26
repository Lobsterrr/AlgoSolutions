/*
 * Given two 32-bit numbers, N and M, and two bit positions, i and j. Write a method to set all bits between i and j in N equal to M (e g , M becomes a substring of N located at i and starting at j)

 Notice

In the function, the numbers N and M will given in decimal, you should also return a decimal number.

Clarification
You can assume that the bits j through i have enough space to fit all of M. That is, if M=10011£¬ you can assume that there are at least 5 bits between j and i. You would not, for example, have j=3 and i=2, because M could not fully fit between bit 3 and bit 2.

Example
Given N=(10000000000)2, M=(10101)2, i=2, j=6

return N=(10001010100)2

Challenge 
Minimum number of operations?
 */
public class UpdateBits {

    /**
     *@param n, m: Two integer
     *@param i, j: Two bit positions
     *return: An integer
     */
    public int updateBits(int n, int m, int i, int j) {
        char[] am = Integer.toBinaryString(m).toCharArray();
        char[] an = new char[32];
        int index = an.length - 1;
        for (int i = Integer.toBinaryString(n).toCharArray() - 1; i >= 0; --i) {
            
        }
        if (j - i - 1 > am.length) {
            return 0;
        }
        for (int k = i; k <= j; ++k) {
            if (k - i + 1 <= am.length) {
                an[an.length - 1 - k] = am[am.length - 1 - k + i];
            } else {
                an[an.length - 1 - k] = '0';
            }
        }
        return Integer.parseInt(new String(an), 2);
    }
    
}
