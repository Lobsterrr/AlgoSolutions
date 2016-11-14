/*
Given a positive integer num, write a function which returns True if num is a 
perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:

Input: 16
Returns: True
Example 2:

Input: 14
Returns: False
 */
public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        for (int i = 1; num > 0; ++i) {
            num -= 2 * i - 1;
        }
        return num == 0;
    }

/*****************************************************************************/

    public boolean isPerfectSquare(int num) {
        int sqrt = mySqrt(num);
        return sqrt * sqrt == num;
    }

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
