/*
 * Find K-th largest element in an array.

 Notice

You can swap elements in the array

Example
In array [9,3,2,4,8], the 3rd largest element is 4.

In array [1,2,3,4,5], the 1st largest element is 5, 2nd 
largest element is 4, 3rd largest element is 3 and etc.

Challenge
O(n) time, O(1) extra memory.
 */
public class KthLargestElement {

    /*
     * @param k : description of k
     * @param nums : array of nums
     * @return: description of return
     */
    public int kthLargestElement(int k, int[] nums) {
        return quicksort(k, nums, 0, nums.length - 1);
    }

    public int quicksort(int k, int[] nums, int low, int high) {
        int j = low;
        for (int i = low; i <= high; ++i) {
            if (nums[i] > nums[high]) {
                swap(nums, i, j++);
            }
        }
        swap(nums, high, j);
        if (k - 1 == j) {
            return nums[k - 1];
        } else if (k - 1 < j) {
            return quicksort(k, nums, low, j - 1);
        }
        return quicksort(k, nums, j + 1, high);
    }
    
    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

/*******************************************************************/

    // O(n * k)
    public int kthLargestElement(int k, int[] nums) {
        for (int i = 0; i < k; ++i) {
            for (int j = nums.length - 2; j >= i; --j) {
                if (nums[j] < nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
        return nums[k - 1];
    }

/*******************************************************************/

    // O(nlg(n))
    public int kthLargestElement(int k, int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

}
