/*
 *
 */
public class HouseRobber {

    public long houseRobber(int[] A) {
        int prev = 0;
        int cur = 0;
        for (int a : A) {
            int tmp = cur;
            cur = Math.max(prev + a, cur);
            prev = tmp;
        }
        return cur;
    }

}
