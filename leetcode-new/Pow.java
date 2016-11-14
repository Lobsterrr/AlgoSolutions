/*
Implement pow(x, n).
 */
public class Pow {

    public double myPow(double x, int n) {
        double base = x;
        if (n < 0) {
            base = 1.0 / x;
            n = -n;
        }
        double result = 1.0;
        while (n != 0) {
            if (n % 2 != 0) {
                result *= base;
            }
            base *= base;
            n >>= 1;
        }
        return result;
    }

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
