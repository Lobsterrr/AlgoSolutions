/*
 * Given an array of size n, find the majority element. The majority element is 
 * the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always 
exist in the array.
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        int candidate = Integer.MAX_VALUE;
        int count = 1;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                candidate = num;
                count = 1;
            }
        }
        return candidate;
    }

}
