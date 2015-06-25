/*
 *
 */

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            String s = "";
            if (start < i)
                s = nums[start] + "->" + nums[i];
            else
                s += nums[start];
            result.add(s);
        }
        return result;
    }

}
