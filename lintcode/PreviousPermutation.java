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
        int i = nums.size() - 2;
        while (i >= 0 && nums.get(i) <= nums.get(i + 1)) {
            i--;
        }
        if (i >= 0) {
            int j = i + 1;
            while (j < nums.size() && nums.get(j) < nums.get(i)) {
                j++;
            }
            j--;
            swap(nums, i, j);
        }
        for (int m = i + 1; m < nums.size(); ++m) {
            for (int n = nums.size() - 2; n >= m; --n) {
                if (nums.get(n) < nums.get(n + 1)) {
                    swap(nums, n, n + 1);
                }
            }
        }
        return nums;
    }

    public void List


    public ArrayList<Integer> previousPermutation(ArrayList<Integer> nums) {
        int i = nums.size() - 2;
        while (i >= 0 && nums.get(i) <= nums.get(i + 1)) {
            i--;
        }
        if (i >= 0) {
            int j = i + 1;
            for (int k = i + 2; k < nums.size(); ++k) {
                if (nums.get(k) < nums.get(i) && nums.get(k) > nums.get(j)) {
                    j = k;
                }
            }
            swap(nums, i, j);
        }
        for (int m = i + 1; m < nums.size(); ++m) {
            for (int n = nums.size() - 2; n >= m; --n) {
                if (nums.get(n) < nums.get(n + 1)) {
                    swap(nums, n, n + 1);
                }
            }
        }
        return nums;
    }
    
    public void swap(ArrayList<Integer> nums, int i, int j) {
        int tmp = nums.get(i);
        nums.set(i, nums.get(j));
        nums.set(j, tmp);
    }

}
