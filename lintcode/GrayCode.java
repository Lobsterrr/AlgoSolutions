/*
 *
 */
public class GrayCode {

    public ArrayList<Integer> grayCode(int n) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < (1 << n); ++i) {
            result.add(i ^ (i >> 1));
        }
        return result;
    }

}
