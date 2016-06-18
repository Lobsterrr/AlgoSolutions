public class Chapter17 {

    // 17.1
    public int[] exchangeAB(int[] AB) {
        // write code here
        AB[0] ^= AB[1];
        AB[1] ^= AB[0];
        AB[0] ^= AB[1];
        return AB;
    }

    // 17.4
    public int getMax(int a, int b) {
        int sign = (a - b) >> 31;
        return a + sign * (a - b);
    }

    public int getMax(int a, int b) {
        return (a + b + Math.abs(a - b)) / 2;
    }

    public int getMax(int a, int b) {
        b = a - b;
        a -= b & (b >> 31);
        return a;
    }

    // 17.9
    public int getFrequency(String[] article, int n, String word) {
        // write code here
        int count = 0;
        for (String s : article) {
            count += s.equals(word) ? 1 : 0;
        }
        return count;
    }

}
