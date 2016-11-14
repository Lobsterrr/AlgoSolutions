/*
Implement int sqrt(int x).

Compute and return the square root of x.
 */
public class Sqrt {

    public int mySqrt(int x) {
        double sqrt = x;
        while (true) {
            if ((int) sqrt == (int) (1 + sqrt) / 2) {
                return (int) sqrt;
            }
            sqrt = (1.0 + sqrt) / 2;
        }
        return (int) sqrt;
    }

}
