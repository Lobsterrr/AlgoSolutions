/*
 * Find the nth digit of the infinite integer sequence 1, 2,
 * 3, 4, 5, 6, 7, 8, 9, 10, 11, ...

 * Note:
 * n is positive and will fit within the range of a 32-bit 
 * signed integer (n < 2^31).
 * 
 * Example 1:
 * 
 * Input:
 * 3
 * 
 * Output:
 * 3
 * Example 2:
 * 
 * Input:
 * 11
 * 
 * Output:
 * 0
 * 
 * Explanation:
 * The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9,
 * 10, 11, ... is a 0, which is part of the number 10.
 */
public class NthDigit {

    public int findNthDigit(int n) {
        int len = 1;
        while (n > len * 9 * (Math.pow(10, len - 1))) {
            n -= len * 9 * Math.pow(10,len - 1);
            len++;
        }
        int num = (int) Math.pow(10, len - 1) + (n - 1) / len;
        num = num / ((int) Math.pow(10, len - 1 - (n - 1) % len));
        return num % 10;
    }

    public int findNthDigit(int n) {
        int[] digitSum = new int[9];
        for (int i = 1; i < digitSum.length; ++i) {
            digitSum[i] = digitSum[i - 1] + i * 9 * (int) Math.pow(10, i - 1);
        }
        int index = 0;
        for (; index < digitSum.length && digitSum[index] < n; ++index);
        int remainder = n - digitSum[index - 1] - 1; // less than real remainder
        int num = remainder / index + (int) Math.pow(10, index - 1);
        int diff = index - (remainder % index + 1);
        for (; diff > 0; diff--) {
            num /= 10;
        }
        return num % 10;
    }

}
