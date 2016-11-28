/*
Given an integer, write a function to determine if it is a power of two.
 */
public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public boolean isPowerOfTwo(int n) {
        return Integer.toBinaryString(n, 2).matches("10*");
    }

}
