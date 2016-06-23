public class Chapter5 {

    // 5.1
    public int binInsert(int n, int m, int j, int i) {
        int left = n >> i;
        int right = n << (32 - j) >> (32 - j);
        return left | (m << j) | right;
    }

    // 5.5
    public int calcCost(int A, int B) {
        // write code here
        int xor = A ^ B;
        int count = 0;
        while (xor != 0) {
            count++;
            xor &= xor - 1;
        }
        return count;
    }

    // 5.6
    // 此题要么使用不带符号的右移，要么带符号右移后，再将首位置零
    public int exchangeOddEven(int x) {
        return ((x & 0xAAAAAAAA) >>> 1) | ((x & 0x55555555) << 1);
    }

    public int exchangeOddEven(int x) {
        return (((x & 0xAAAAAAAA) >> 1) & 0x7FFFFFFF) | ((x & 0x55555555) << 1);
    }

}
