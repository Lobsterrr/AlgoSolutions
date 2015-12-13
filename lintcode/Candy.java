/*
 *
 */
public class Candy {

    /**
     * @param ratings Children's ratings
     * @return the minimum candies you must give
     */
    public int candy(int[] ratings) {
        if (ratings.length == 0 || ratings.length == 1) {
            return ratings.length;
        }
        int[] candy = new int[ratings.length];
        Arrays.fill(candy, 1);
        for (int i = 1; i < ratings.length; ++i) {
            if (ratings[i] > ratings[i - 1]) {
                candy[i] = candy[i - 1] + 1;
            }
        }
        for (int i = candy.length - 1; i >= 1; --i) {
            if (ratings[i] < ratings[i - 1]) {
                candy[i - 1] = candy[i] + 1;
            }
        }
        int result = 0;
        for (int c : candy) {
            result += c;
        }
        return result;
    }

}
