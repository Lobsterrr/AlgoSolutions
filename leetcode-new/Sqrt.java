/*
Implement int sqrt(int x).

Compute and return the square root of x.
 */
public class Sqrt {

    public int mySqrt(int x) {
        long sqrt = x;
        while (sqrt * sqrt > x) {
            sqrt = (sqrt + x / sqrt) / 2;
        }
        return (int) sqrt;
    }

/*****************************************************************************/

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

/*****************************************************************************/

    public int mySqrt(int x) {
        int low = 1;
        int high = x;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid <= x / mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low - 1;
    }

}
