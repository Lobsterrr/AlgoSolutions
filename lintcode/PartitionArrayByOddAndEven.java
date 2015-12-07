/*
 * Partition an integers array into odd number first and even number second.

Example
Given [1, 2, 3, 4], return [1, 3, 2, 4]

Challenge
Do it in-place.
 */
public class PartitionArrayByOddAndEven {
    
    /**
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] % 2 == 1) {
                int tmp = nums[i];
                nums[i] = nums[index];
                nums[index++] = tmp;
            }
        }
    }

}
