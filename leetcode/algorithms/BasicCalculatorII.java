/*
 * Implement a basic calculator to evaluate a simple expression string.
 * 
 * The expression string contains only non-negative integers, +, -, *, / operators and empty spaces . The integer division should truncate toward zero.
 * 
 * You may assume that the given expression is always valid.
 * 
 * Some examples:
 * "3+2*2" = 7
 * " 3/2 " = 1
 * " 3+5 / 2 " = 5
 * Note: Do not use the eval built-in library function.
 */
public class BasicCalculatorII {

    public int calculate(String s) {
        List<Object> list = new ArrayList<Object>();
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('0' <= c && c <= '9') {
                start = i;
                while ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                    i++;
                }
                list.add(Integer.parseInt(s.substring(start, i);
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                list.add(c);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj == '*' || obj == '/') {
                int value = 0;
                if (obj == '*') {
                    value = list.get(i - 1) * list.get(i + 1);
                } else {
                    value = list.get(i - 1) / list.get(i + 1);
                }
                list.remove(i - 1, i + 1);
                list.add(i - 1, value);
            }
        }
    }

}
