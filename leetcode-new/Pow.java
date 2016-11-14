/*
Implement pow(x, n).
 */
public class Pow {

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        double half = myPow(x, n / 2);
        double result = half * half;
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
