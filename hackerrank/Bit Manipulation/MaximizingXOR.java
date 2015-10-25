/*
 *
 */
public class MaximizingXOR {

    public static int maxXor(int l, int r) {
        int xor = l ^ r;
        return (1 << Integer.toBinaryString(xor).length()) - 1;
    }

}
