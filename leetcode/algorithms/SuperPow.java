/*
 * Your task is to calculate ab mod 1337 where a is a positive integer and b is an extremely large positive integer given in the form of an array.

 * Example1:
 * 
 * a = 2
 * b = [3]
 * 
 * Result: 8
 * Example2:
 * 
 * a = 2
 * b = [1,0]
 * 
 * Result: 1024
 */
public class SuperPow {

    public int superPow(int a, int[] b) {
        int pow = 1;
        int mod = 1337;
        for (int i = b.length - 1, base = 1; i >= 0; --i, base *= 10) {
            for (int j = 1; j <= b[i] * base; ++j) {
                pow = pow * (a % mod) % mod;
            }
        }
        return pow;
    }

}
