/*
 * Given a list of non negative integers, arrange them such that they form the largest number.

 Notice

The result may be very large, so you need to return a string instead of an integer.

Example
Given [1, 20, 23, 4, 8], the largest formed number is 8423201.

Challenge 
Do it in O(nlogn) time complexity.
 */
public class LargestNumber {

    /**
     *@param num: A list of non negative integers
     *@return: A string
     */
    public String largestNumber(int[] num) {
        quicksort(num, 0, num.length - 1);
        String result = "";
        for (int i = num.length - 1; i >= 0; --i) {
            result += num[i];
        }
        int i = 0;
        for (; i < result.length() && result.charAt(i) == '0'; ++i);
        if (i == result.length()) {
            i--;
        }
        result = result.substring(i);
        return result;
    }

    public void quicksort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int index = start;
        for (int i = start; i < end; ++i) {
            if (compare(nums[i], nums[end])) {
                swap(nums, index++, i);
            }
        }
        swap(nums, index, end);
        quicksort(nums, start, index - 1);
        quicksort(nums, index + 1, end);
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public boolean compare(int x, int y) {
        String s1 = "" + x;
        String s2 = "" + y;
        int i = 0;
        for (; i < Math.min(s1.length(), s2.length()); ++i) {
            if (s1.charAt(i) > s2.charAt(i)) {
                return false;
            }
        }
        if (i < s1.length()) {
            if (s1.charAt(i) > s1.charAt(0)) {
                return false;
            } else {
                return true;
            }
        }
        if (i < s2.length()) {
            if (s2.charAt(i) > s2.charAt(0)) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

}
