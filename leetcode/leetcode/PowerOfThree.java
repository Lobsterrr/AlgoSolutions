/*
Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion?
 */
public class PowerOfThree {

    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }

/*****************************************************************************/

    public boolean isPowerOfThree(int n) {
        for (; num > 1 && num % 3 == 0; num /= 3);
        return num == 1;
    }

/*****************************************************************************/

    public boolean isPowerOfThree(int n) {
        while (n > 1 && n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

}
