public class Chapter5 {

    // 5.1
    // not consider negative number
    public int binInsert(int n, int m, int j, int i) {
        int left = n >> i << i;
        int right = n << (32 - j) >>> (32 - j);
        return left | (m << j) | right;
    }

    // 5.3
    public int[] getCloseNumber(int x) {
        int i = 0; 
        int low = 0;
        int high = 0;
        int i = 1;
        for (; i < 32; ++i) {
            if ((x & 1 << i) == 0 && (x & (1 << i + 1) == 1)) {
                low = x | (1 << i);
                low &= ~(1 << i + 1);
                break;
            }
        }
        i++;
        for (; i < 32; ++i) {
            if ((x & 1 << i) == 1 && (x & (1 << i + 1) == 0)) {
                high = x & ~(1 << i);
                high |= 1 << i + 1;
                break;
            }
        }
        return new int{low, high};
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
