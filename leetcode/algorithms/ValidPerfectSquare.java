/*
 * Given a positive integer num, write a function which returns 
 * True if num is a perfect square else False.

 * Note: Do not use any built-in library function such as sqrt.
 * 
 * Example 1:
 * 
 * Input: 16
 * Returns: True
 * Example 2:
 * 
 * Input: 14
 * Returns: False
 */
public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num -= 2 * i - 1;
        }
        return num == 0;
    }

    public boolean isPerfectSquare(int num) {
        int sqrt = sqrt(num);
        return sqrt * sqrt == num;
    }

    public int sqrt(int num) {
        double x = num;
        double y = 0;
        while (y != x) {
            y = x;
            x = (x + num / x) / 2;
        }
        return (int) x;
    }

}
