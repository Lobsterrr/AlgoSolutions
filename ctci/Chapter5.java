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
        int low = 0;
        int high = 0;
        int count = 0;
        int i = 0;
        for (i = 0; i < 32; ++i) {
            if ((x >>> i & 1) == 1) {
                count++;
            }
            if ((x >>> i & 1) == 0 && (x >>> i + 1 & 1) == 1) {
                low = x | (1 << i);
                low &= ~(1 << i + 1);
                break;
            }
        }
        int mask = 0;
        for (int j = 0; j < count; ++j) {
            mask |= 1 << j;
        }
        mask <<= i - count;
        low = (low >>> i << i) | mask;
        for (i = 0, count = 0; i < 32; ++i) {
            if ((x >>> i & 1) == 0) {
                count++;
            }
            if ((x >>> i & 1) == 1 && (x >>> i + 1 & 1) == 0) {
                high = x & ~(1 << i);
                high |= 1 << i + 1;
                break;
            }
        }
        count--;
        mask = 0;
        for (int j = 0; j < count; ++j) {
            mask |= 1 << j;
        }
        high = high >>> i << i | mask;
        return new int[]{low, high};
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
