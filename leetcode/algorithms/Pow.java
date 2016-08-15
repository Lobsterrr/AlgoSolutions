/*
 * Implement pow(x, n).
 */

public class Pow {

    public double myPow(double x, int n) {
        double result = 1.0;
        double base = n >= 0 ? x : 1 / x;
        n = Math.abs(n);
        while (n > 0) {
            if (n % 2 != 0) {
                result *= base;
            }
            base *= base;
            n /= 2;
        }
        return result;
    }

    public double pow(double x, int n) {
        if (n == 0)
            return 1;
        double half = pow(x, n / 2);
        double result = half * half;
        if (n % 2 != 0) {
            if (n > 0)
                result *= x;
            else 
                result /= x;
        }
        return result;
    }
    
}
