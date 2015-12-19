/*
 *
 */
public class SortColorsII {

    public void sortColors2(int[] colors, int k) {
        int[] count = new int[k];
        for (int color : colors) {
            count[color - 1]++;
        }
        int color = 1;
        for (int i = 0; i < colors.length; ++i) {
            colors[i] = color;
            count[color - 1]--;
            if (count[color - 1] == 0) {
                color++;
            }
        }
    }

}
