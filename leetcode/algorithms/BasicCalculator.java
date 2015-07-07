/*
 * Implement a basic calculator to evaluate a simple expression string.

 * The expression string may contain open ( and closing parentheses ), 
 * the plus + or minus sign -, non-negative integers and empty spaces .
 * 
 * You may assume that the given expression is always valid.
 * 
 * Some examples:
 * "1 + 1" = 2
 * " 2-1 + 2 " = 3
 * "(1+(4+5+2)-3)+(6+8)" = 23
 */
public class BasicCalculator {

    public int calculate(String s) {
        Stack<Object> stack0 = new Stack<Object>();
        Stack<Object> stack1 = new Stack<Object>();
        s = s.replaceAll(" ", "");
        for (int i = 0; i < s.length(); i++) {
            if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                int start = i;
                while (i < s.length() && '0' <= s.charAt(i) && s.charAt(i) <= '9') {
                    i++;
                }
                stack1.push(Integer.parseInt(s.substring(start, i));
            } else if (s.charAt(i) == '(') {

            } else if (s.charAt(i) == ')') {

            } else if (s.charAt(i) == '+' || s.charAt(i) == '-') {

            } else if (s.charAt(i) == '*' || s.charAt(i) == '/') {

            }
        }
    }

}
