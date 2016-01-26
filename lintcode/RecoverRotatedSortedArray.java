/*
 * Given a rotated sorted array, recover it to sorted array in-place.

Example
[4, 5, 1, 2, 3] -> [1, 2, 3, 4, 5]

Challenge
In-place, O(1) extra space and O(n) time.

Clarification
What is rotated array?

For example, the orginal array is [1,2,3,4], The rotated array of it 
can be [1,2,3,4], [2,3,4,1], [3,4,1,2], [4,1,2,3]
 */
public class RecoverRotatedSortedArray {

    /**
     * @param nums: The rotated sorted array
     * @return: void
     */
    public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
        
    }

    public void reverse(ArrayList<Integer> nums, int low, int high) {
        for (int i = low; i < low + (high - low) / 2; ++i) {

        }
    }

    public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
        int index = 1;
        for (; index < nums.size() && nums.get(index - 1) <= nums.get(index); ++index);
        if (index == nums.size()) {
            return;
        }
        for (int i = index; i < nums.size(); ++i) {
            int toInsert = nums.remove(nums.size() - 1);
            nums.add(0, toInsert);
        }
    }

}
