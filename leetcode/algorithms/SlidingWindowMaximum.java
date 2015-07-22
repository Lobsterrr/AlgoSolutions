/*
 * Given an array nums, there is a sliding window of size k which 
 * is moving from the very left of the array to the very right. 
 * You can only see the k numbers in the window. Each time the 
 * sliding window moves right by one position.

 * For example,
 * Given nums = [1,3,-1,-3,5,3,6,7], and k = 3.
 * 
 * Window position                Max
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 * Therefore, return the max sliding window as [3,3,5,5,6,7].
 * 
 * Note: 
 * You may assume k is always valid, ie: 1 ¡Ü k ¡Ü input array's 
 * size for non-empty array.
 * 
 * Follow up:
 * Could you solve it in linear time?
 */
public class SlidingWindowMaximum {


    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0)
            return new int[0];
        int[] result = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                while (deque.size() > 0 && nums[deque.peekLast()] <= nums[i]) {
                    deque.pollLast();
                }
                deque.offerLast(i);
            } else {
                result[i - k] = nums[deque.peekFirst()];
                while (deque.size() > 0 && nums[deque.peekLast()] <= nums[i]) {
                    deque.pollLast();
                }
                deque.offerLast(i);
                while (deque.size() > 0 && deque.peekFirst() + k <= i) {
                    deque.pollFirst();
                }
            }
        }
        result[result.length - 1] = nums[deque.peekFirst()];
        return result;
    }



    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0)
            return new int[0];
        int[] result = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                while (deque.size() > 0 && nums[deque.peekLast()] <= nums[i]) {
                    deque.pollLast();
                }
                deque.offerLast(i);
            } else {
                result[i - k] = nums[deque.peekFirst()];
                while (deque.size() > 0 && nums[deque.peekLast()] <= nums[i]) {
                    deque.pollLast();
                }
                deque.offerLast(i);
                while (deque.size() > 0 && deque.peekFirst() + k <= i) {
                    deque.pollFirst();
                }
            }
        }
        result[result.length - 1] = nums[deque.peekFirst()];
        return result;
    }




    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = k == 0 ? 0 : nums.length - k + 1;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            int tmpMax = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                tmpMax = Math.max(tmpMax, nums[j]);
            } 
            result[i] = tmpMax;
        }
        return result;
    }

}
