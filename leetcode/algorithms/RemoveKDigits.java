/*
 * Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.
 * 
 * Note:
 * The length of num is less than 10002 and will be >= k.
 * The given num does not contain any leading zero.
 * Example 1:
 * 
 * Input: num = "1432219", k = 3
 * Output: "1219"
 * Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
 * Example 2:
 * 
 * Input: num = "10200", k = 1
 * Output: "200"
 * Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
 * Example 3:
 * 
 * Input: num = "10", k = 2
 * Output: "0"
 * Explanation: Remove all the digits from the number and it is left with nothing which is 0.
 */
public class RemoveKDigits {

    public String removeKdigits(String num, int k) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0, count = 0; i < num.length(); ++i) {
            if (count < k && !stack.isEmpty() && (num.charAt(i) - '0') < stack.peek()) {
                stack.pop();
                count++;
            }
            stack.push(num.charAt(i) - '0');
        }
        int result = 0;
        int base = 1;
        int count = num.length() - k;
        while (count > 0 && !stack.isEmpty()) {
            result += stack.pop() * base;
            base *= 10;
            count--;
        }
        return String.valueOf(result);
    }

}
