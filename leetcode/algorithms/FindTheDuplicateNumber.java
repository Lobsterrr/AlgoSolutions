/*
 *
 */
public class FindTheDuplicateNumber {

    public int findDuplicate(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
            if (i < nums.length - 1)
                xor ^= i + 1;
        }
        return xor;
    }

}
