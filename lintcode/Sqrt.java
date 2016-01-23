/*
 *
 */
public class Sqrt {

    public int sqrt(int x) {
        int i = 1;
        while (i != 0) {
            int next = (i + x / i) / 2;
            if (next <= i) {
                return i;
            } else {
                i = next;
            }
        }
        return i;
    }

}
