/*
 *
 */
public class HouseRobber {

    public long houseRobber(int[] A) {
        long prev = 0;
        long cur = 0;
        for (int a : A) {
            int tmp = cur;
            cur = Math.max(prev + a, cur);
            prev = tmp;
        }
        return cur;
    }

}
