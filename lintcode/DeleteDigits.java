/*
 * Given string A representative a positive integer which has N 
 * digits, remove any k digits of the number, the remaining digits 
 * are arranged according to the original order to become a new 
 * positive integer.

Find the smallest integer after remove k digits.

N <= 240 and k <= N,

Example
Given an integer A = "178542", k = 4

return a string "12"
 */
public class DeleteDigits {

    /**
     *@param A: A positive integer which has N digits, A is a string.
     *@param k: Remove k digits.
     *@return: A string
     */
    public String DeleteDigits(String A, int k) {
        Deque<Character> deque = new LinkedList<Character>();
        for (int i = 0; i < A.length() && k > 0; ++i) {
            if (i == 0 || deque.peek() == null || A.charAt(i) >= deque.peekLast()) {
                deque.offerLast(A.charAt(i));
            } else if (A.charAt(i) < deque.peekLast()) {
                deque.pollLast();
                k--;
            }
        }
        String result = "";
        while (deque.peek() != null) {
            result += deque.pollFirst();
        }
        return result;
    }

}
