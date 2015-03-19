/*
 *
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - k) 
                l1.add(nums[i]);
            else 
                l2.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - k)
                num[i] = l2.get(i);
            else 
                num[i] = l1.get(nums.length - i);
        }
    }

}
