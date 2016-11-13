/*
Given an array of integers, find out whether there are two distinct indices i 
and j in the array such that the difference between nums[i] and nums[j] is at 
most t and the difference between i and j is at most k.
 */
public class ContainsDuplicateIII {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (set.size() > 0 && Math.abs(nums[i] - set.first()) <= t) {
                return true;
            } else {
                set.add(nums[i]);
                if (set.size() > k) {
                    set.remove(new Integer(nums[i - k]));
                }
            }
        }
        return false;
    }

}
