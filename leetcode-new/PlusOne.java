/*
Given a non-negative number represented as an array of digits, plus one to the 
number.

The digits are stored such that the most significant digit is at the head of 
the list.
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        for (; i >= 0 && digits[i] == 9; --i) {
            digits[i] = 0;
        }
        if (i < 0) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }
        return digits;
    }

    public int[] plusOne(int[] digits) {
        int i = 0;
        for (; i < digits.length; ++i) {
            if (digits[i] != 9) {
                break;
            }
        }
        if (i == digits.length) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        i = digits.length - 1;
        for (; i >= 0 && digits[i] == 9; --i) {
            digits[i] = 0;
        }
        digits[i]++;
        return digits;
    }

}
