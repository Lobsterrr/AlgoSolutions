/*
 *
 */
public class ContainsDuplicateIII {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for (int i = 0; i < nums.length - k; i++) {
            for (int j = i + 1; j <= i + k; j++) {
                if (Math.abs(nums[j] - nums[i]) <= t)
                    return true;
            }
        }
        return false;
    }

}
