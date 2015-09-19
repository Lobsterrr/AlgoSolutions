/*
 *
 */
public class MoveZeros {

    public void moveZeros(int[] nums) {
        int count = 0;
        int k = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 0)
                count++;
            else
                nums[k++] = nums[i];
        }
        for (int i = 0; i < count; ++i) {
            nums[nums.length - 1 - count] = 0;
        }
    }

}
