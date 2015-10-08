/*
 *
 */
public class SingleNumberII {

    public int singleNumberII(int[] A) {
        int[] bits = new int[32];
        int result = 0;
        for (int i = 0; i < 32; ++i) {
            for (int a : A) {
                bits[i] += (a >> i) & 1;
            }
            result |= (bits[i] % 3) << i;
        }
        return result;
    }

}
