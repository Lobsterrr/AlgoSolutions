/*
 *
 */
public class PowerOfThree {

    public boolean isPowerOfThree(int n) {
        int power = 1;
        while (power < n) {
            power *= 3;
        }
        return power == n;
    }

}
