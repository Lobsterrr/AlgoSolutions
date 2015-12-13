/*
 *
 */
public class Candy {

    public int candy(int[] ratings) {
        if (ratings.length == 0 || ratings.length == 1) {
            return ratings.length;
        }
        int[] candy = new int[ratings.length];
        candy[0] = candy[candy.length - 1] = 1;
        for (int i = 1; i < ratings.length; ++i) {
            if (ratings[i] > ratings[i - 1]) {
                candy[i] = candy[i - 1] + 1;
            }
        }
    }

}
