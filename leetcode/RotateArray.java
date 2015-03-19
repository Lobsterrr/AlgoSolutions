/*
 *
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = nums.length - k; i < nums.length; i++) {
            list.add(nums[i]);
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            nums[i] = i >= k ? nums[i - k] : list.get(i);
        }
    }

}
