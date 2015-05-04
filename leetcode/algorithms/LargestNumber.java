/*
 * Given a list of non negative integers, arrange them such that they form the largest number.
 * 
 * For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.
 * 
 * Note: The result may be very large, so you need to return a string instead of an integer.
 * 
 */
public class LargestNumber {

    public String largestNumber(int[] nums) {

    }

    public int compare(int a, int b) {
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
