/*
 * Given a list of non negative integers, arrange 
 * them such that they form the largest number.
 * 
 * For example, given [3, 30, 34, 5, 9], the 
 * largest formed number is 9534330.
 * 
 * Note: The result may be very large, so you 
 * need to return a string instead of an integer.
 */
public class LargestNumber {

    public String largestNumber(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
        String result = "";
        for (int i = nums.length - 1; i >= 0; i--) {
            result += nums[i];
        }
        int i = 0;
        for (; i < result.length() && result.charAt(i) == '0'; i++);
        if (i == result.length())
            result = "0";
        else 
            result = result.substring(i);
        return result;
    }

    public void quicksort(int[] array, int start, int end) {
        if (start >= end) 
            return;
        int i = start;
        for (int j = start; j < end; j++) {
            if (compare(array[j], array[end]) <= 0) {
                swap(array, i++, j);
            }
        }
        swap(array, i, end);
        quicksort(array, start, i - 1);
        quicksort(array, i, end);
    }

    public void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public int compare(int a, int b) {
        if (a * b == 0) {
            if (a == 0 && b == 0)
                return 0;
            return a > 0 ? 1 : -1;
        }
        long ab = (long) Math.pow(10, (int) Math.log10(b) + 1) * a + b;
        long ba = (long) Math.pow(10, (int) Math.log10(a) + 1) * b + a;
        if (ab > ba)
            return 1;
        else if (ab == ba)
            return 0;
        else
            return -1;
    }

}
