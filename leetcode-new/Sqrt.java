/*
Implement int sqrt(int x).

Compute and return the square root of x.
 */
public class Sqrt {

    public int mySqrt(int x) {
        int sqrt = x;
        while ((long) sqrt * sqrt > x) {
            sqrt = (sqrt + x / sqrt) / 2;
        }
        return sqrt;
    }

    public int mySqrt(int x) {
        double sqrt = x;
        while (true) {
            double y = (sqrt + x / sqrt) / 2;
            if ((int) sqrt == (int) y) {
                break;
            }
            sqrt = y;
        }
        return (int) sqrt;
    }

}
