/*
 *
 */
public class Sqrt {

    public int sqrt(int x) {
        double i = 1.0;
        while ((int) i != (int) (x / i)) {
            i = (i + x / i) / 2;
        }
        return (int) i;
    }

}
