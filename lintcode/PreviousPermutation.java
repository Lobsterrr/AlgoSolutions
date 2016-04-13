/*
 * Given a list of integers, which denote a permutation.

Find the previous permutation in ascending order.

 Notice

The list may contains duplicate integers.

Example
For [1,3,2,3], the previous permutation is [1,2,3,3]

For [1,2,3,4], the previous permutation is [4,3,2,1]
 */
public class PreviousPermutation {

    /**
     * @param nums: A list of integers
     * @return: A list of integers that's previous permuation
     */
    public ArrayList<Integer> previousPermutation(ArrayList<Integer> nums) {
            
    }
    
    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}
