/*
Given an unsorted array of integers, find the length of the longest consecutive
elements sequence.

For example,
Given [100, 4, 200, 1, 3, 2],
The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

Your algorithm should run in O(n) complexity.
 */
public class LongestConsecutiveSequence {

    // O(n) time, O(n) space.
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<Integer>();
        for(int num : nums) {
            set.add(num);
        }
        int result = 1;
        for (int num : nums) {
            int low = num;
            int high = num + 1;
            while (set.contains(low)) {
                set.remove(low--);
            }
            while (set.contains(high)) {
                set.remove(high++);
            }
            result = Math.max(result, high - low);
        }
        return result;
    }

/*****************************************************************************/

    // O(nlg(n)) time, O(1) space.
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int result = 1;
        int count = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == nums[i - 1] + 1) {
                count++;
            } else if (nums[i] != nums[i - 1]) {
                count = 1;
            }
            result = Math.max(result, count);
        }
        return result;
    }

}
