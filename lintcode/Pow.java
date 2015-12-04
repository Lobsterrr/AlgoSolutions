/*
 *
 */
public class Pow {

    /**
     * @param x the base number
     * @param n the power number
     * @return the result
     */
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double result = myPow(x, n / 2) * myPow(x, n / 2);
        if (n % 2 != 0) {
            if (n > 0) {
                result *= x;
            } else {
                result /= x;
            }
        }
        return result;
    }

}
