/*
 *
 */
public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        int x = sqrt(num);
        return x * x == num;
    }

    public int sqrt(int num) {
        double x = num;
        double y = 0;
        while (x != y) {
            y = x;
            x = (x + y / x) / 2;
        }
        return (int) x;
    }

}
