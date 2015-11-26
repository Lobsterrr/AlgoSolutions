/*
 *
 */
public class MajorityNumber {

    public int majorityNumber(ArrayList<Integer> nums) {
        int vote = 0;
        int result = 0;
        for (int num : nums) {
            if (num = result) {
                vote++;
            } else {
                vote--;
                if (vote == 0) {
                    result = num;
                    vote = 1;
                }
            }
        }
        return result;
    }

}
