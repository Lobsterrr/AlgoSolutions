/*
Given an unsorted array nums, reorder it such that
nums[0] < nums[1] > nums[2] < nums[3]....

Example:
(1) Given nums = [1, 5, 1, 1, 6, 4], one possible answer is [1, 4, 1, 5, 1, 6].
(2) Given nums = [1, 3, 2, 2, 3, 1], one possible answer is [2, 3, 1, 3, 1, 2].

Note:
You may assume all input has valid answer.

Follow Up:
Can you do it in O(n) time and/or in-place with O(1) extra space?
 */
public class WiggleSortII {

    public void wiggleSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        Arrays.sort(nums);
        1, 1, 1, 4, 5, 6;
        1, 6, 1, 5, 1, 4;
        1, 6, 1, 4, 5, 1;
        1, 6, 1, 5, 4, 1;

        1, 1, 2, 2, 3, 3;
        1, 2, 1, 3, 2, 3;
        int len = nums.length;
        for (int i = 1; i < len / 2; i += 2) {
            int tmp = nums[i];
            nums[i] = nums[len / 2 + i / 2];
            nums[len / 2 + i / 2] = tmp;
        }
    }

}
