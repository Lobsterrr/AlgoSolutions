/*
 *
 */
public class Sqrt {

    public int sqrt(int x) {
        int i = 1;
        while (i != x / i) {
            i = (i + x / i) / 2;
        }
        return i;
    }

}
