public class Library {

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % a;
        }
        return a;
    }

    public int log2(int a) {
        int res = 0;
        while(a >= 2) {
            res++;
            a >>= 1;
        }
        return res;
    }
}
