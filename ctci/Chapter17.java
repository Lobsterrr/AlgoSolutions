public class Chapter17 {

    // 17.1
    public int[] exchangeAB(int[] AB) {
        // write code here
        AB[0] ^= AB[1];
        AB[1] ^= AB[0];
        AB[0] ^= AB[1];
        return AB;
    }

    // 17.3
    public int getFactorSuffixZero(int n) {
        int result = 0;
        while (n > 0) {
            n /= 5;
            result += n;
        }
        return result;
    }

    // 17.4
    public int getMax(int a, int b) {
        int sign = (a - b) >> 31;
        return a + sign * (a - b);
    }

    public int getMax(int a, int b) {
        // a + b + |a - b| 最大值的两倍，同理a + b - |a - b|是最小值的两倍
        return (a + b + Math.abs(a - b)) / 2;
    }

    public int getMax(int a, int b) {
        b = a - b;
        a -= b & (b >> 31);
        return a;
    }

    // 17.8
    public int getMaxSum(int[] A, int n) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0, curSum = 0; i < A.length; ++i) {
            curSum += A[i];
            maxSum = Math.max(maxSum, curSum);
            curSum = Math.max(curSum, 0);
        }
        return maxSum;
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
