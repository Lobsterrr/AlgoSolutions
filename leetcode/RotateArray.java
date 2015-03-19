/*
 * Rotate an array of n elements to the right by k steps.

 * For example, with n = 7 and k = 3, the array [1,2,3,4,
 * 5,6,7] is rotated to [5,6,7,1,2,3,4].

 * Note:
 * Try to come up as many solutions as you can, there are 
 * at least 3 different ways to solve this problem.
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = nums.length - k; i < nums.length; i++) {
            list.add(nums[i]);
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            nums[i] = i >= k ? nums[i - k] : list.get(i);
        }
    }

    public void rotate(int[] nums, int k) {
        k = k 
    }

}
