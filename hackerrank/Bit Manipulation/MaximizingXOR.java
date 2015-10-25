/*
 *
 */
public class MaximizingXOR {

    public static int maxXor(int l, int r) {
        int count = 0;
        for (int i = 31; i >= 0; --i) {
            count++;
            int mask = 1 << i;
            if ((l ^ r) & mask == 0))
               break; 
        }
        return (1 << count) - 1;
    }

}
