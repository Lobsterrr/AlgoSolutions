/*
Implement int sqrt(int x).

Compute and return the square root of x.
 */
public class Sqrt {

    public int mySqrt(int x) {
        double sqrt = x;
        while (true) {
            double y = (1.0 + x / sqrt) / 2;
            if ((int) sqrt == (int) y) {
                return true;
            }
            sqrt = y;
        }
        return (int) sqrt;
    }

}
