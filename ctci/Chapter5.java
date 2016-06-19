public class Chapter5 {

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
    public int exchangeOddEven(int x) {
        return ((x & 0xAAAAAAAA) >> 1) | ((x & 0x55555555) << 1);
    }

}
