/*
 * Given an expression string array, return the Reverse Polish notation of this expression. (remove the parentheses)

Example
For the expression [3 - 4 + 5] (which denote by ["3", "-", "4", "+", "5"]), return [3 4 - 5 +] (which denote by ["3", "4", "-", "5", "+"])
 */
public class ConvertExpressionToReversePolishNotation {

    /**
     * @param expression: A string array
     * @return: The Reverse Polish notation of this expression
     */
    public ArrayList<String> convertToRPN(String[] expression) {
        String[] exps = expression.split(" ");
        Queue<String> nums = new LinkedList<String>();
        Queue<String> opts = new LinkedList<String>();
        for (int i = 0; i < exps.length(); ++i) {
            if (Character.isDigit(exps[i].charAt(0))) {
                nums.offer(Integer.parseInt(exps[i]));
            } else {
                opts.offer(exps[i]);
            }
        }
        ArrayList<String> result = new ArrayList<String>();
        if (nums.peek() != null) {
            result.add(nums.poll());
        }
        while (nums.peek() != null && opts.peek() != null) {
            result.add(nums.poll());
            result.add(opts.poll());
        }
        return result;
    }

}
