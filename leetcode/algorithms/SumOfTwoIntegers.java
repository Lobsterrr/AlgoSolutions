/*
 *
 */
public class SumOfTwoIntegers {

    public int getSum(int a, int b) {
        while (b != 0) {
            int carrier = a ^ b;
            a = carrier;
            b = carrier << 1;
        }
        return a;
    }

    public int getSum(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getSum(a ^ b, (a & b) << 1);
    }

}
