public class Chapter7 {

    // 7.2
    public double antsCollision(int n) {
        return 1 - 1.0 / (1 << n - 1);
    }

    // 7.4
    public int calc(int a, int b, int type) {
        if (type == 1) {
            return multiple(a, b);
        } else if (type == 0) {
            return divide(a, b);
        } else if (type == -1) {
            return minus(a, b);
        }
        return Integer.MAX_VALUE;
    }

    public int negative(int x) {
        int base = x > 0 ? -1 : 1;
        int result = 0;
        for (; x != 0; x += base, result += base);
        return result;
    }

    public int multiple(int a, int b) {
        boolean flag = a >= 0 && b >= 0 || a < 0 && b < 0;
        if (a < 0) {
            a = negative(a);
        }
        if (b < 0) {
            b = negative(b);
        }
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        int result = 0;
        for (int i = 0; i < b; ++i) {
            result += a;
        }
        return flag ? result : negative(result);
    }

    public int minus(int a, int b) {
        return a + negative(b);
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException();
        }
        boolean flag = a >= 0 && b > 0 || a < 0 && b < 0;
        if (a < 0) {
            a = negative(a);
        }
        if (b < 0) {
            b = negative(b);
        }
        int result = 0;
        for (int sum = b; sum <= a; sum += b, ++result);
        return flag ? result : negative(result);
    }

}
