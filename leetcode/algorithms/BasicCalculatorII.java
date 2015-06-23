/*
 * Implement a basic calculator to evaluate a simple expression string.
 * 
 * The expression string contains only non-negative integers, +, -, *, / 
 * operators and empty spaces . The integer division should truncate toward zero.
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
                while (i < s.length() && '0' <= s.charAt(i) && s.charAt(i) <= '9') {
                    i++;
                }
                list.add(Long.parseLong(s.substring(start, i--)));
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                list.add(c);
            }
        }
        for (int i = list.size() - 2; i >= 0; i -= 2) {
            Object obj = list.get(i);
            if (obj.equals('*') || obj.equals('/')) {
                long value = 0;
                if (obj.equals('*')) {
                    value = (long) list.get(i - 1) * (long) list.get(i + 1);
                } else {
                    value = (long) list.get(i - 1) / (long) list.get(i + 1);
                }
                list.remove(i + 1);
                list.remove(i);
                list.remove(i - 1);
                list.add(i - 1, value);
            }
        }
        long result = (long) list.get(0);
        for (int i = 1; i < list.size(); i += 2) {
            if (list.get(i).equals('+'))
                result += (long) list.get(i + 1);
            else
                result -= (long) list.get(i + 1);
        }
        return (int) result;
    }

}
