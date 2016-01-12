/*
 * Given an integer, write a function to determine if it is a power of three.

 * Follow up:
 * Could you do it without using any loop / recursion?
 */
public class PowerOfThree {

    public boolean isPowerOfThree(int n) {
        long power = 1;
        while (power < n) {
            power *= 3;
        }
        return power == n;
    }

}
