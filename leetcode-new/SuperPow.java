/*
Your task is to calculate ab mod 1337 where a is a positive integer and b is an extremely large positive integer given in the form of an array.

Example1:

a = 2
b = [3]

Result: 8
Example2:

a = 2
b = [1,0]

Result: 1024
 */
public class SuperPow {

    public int superPow(int a, int[] b) {
        int result = 1;
        for (int i = 0, base = a; i < b.length; ++i) {
            result *= (int) Math.pow(base, b[b.length - 1 - i]);
            base = (int) Math.pow(base, 10);
        }
        return result;
    }

    public int pow(int a, int exp, int mod) {
        int result = 1;
        int base = a;
        while (exp > 0) {
            if ((exp & 1) != 0) {
                result *= base;
            }
            base *= base;
            exp >>= 1;
        }
        return result;
    }

}
