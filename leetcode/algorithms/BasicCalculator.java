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
        Stack<Character> stackOpt = new Stack<Character>();
        Stack<Integer> stackNum = new Stack<Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('0' <= c && c <= '9') {
                int num = 0;
                while (i < s.length() && '0' <= s.charAt(i) && s.charAt(i) <= '9') {
                    num = num * 10 + s.charAt(i) - '0';
                    i++;
                }
                i--;
                stackNum.push(num);
            } else if (c == '(' || c == '*' || c == '/') {
                stackOpt.push(c);
            } else if (c == ')') {
                while (!stackOpt.isEmpty() && stackOpt.peek() != '(') {
                    calc(stackOpt, stackNum);
                }
                stackOpt.pop(); // pop '('.
            } else if (c == '+' || c == '-') {
                if (!stackOpt.isEmpty() && (stackOpt.peek() == '*' || stackOpt.peek() == '/')) {
                    Stack<Character> stackOptTmp = new Stack<Character>();
                    Stack<Integer> stackNumTmp = new Stack<Integer>();
                    while (!stackOpt.isEmpty() && (stackOpt.peek() == '*' || stackOpt.peek() == '/')) {
                        stackOptTmp.push(stackOpt.pop());
                        stackNumTmp.push(stackNum.pop());
                    }
                    stackNumTmp.push(stackNum.pop());
                    while (!stackOptTmp.isEmpty()) {
                        calc(stackOptTmp, stackNumTmp);
                    }
                    stackNum.push(stackNumTmp.pop());
                }
                while (!stackOpt.isEmpty() && (stackOpt.peek() == '*' || stackOpt.peek() == '/')) {
                    calc(stackOpt, stackNum);
                }
                stackOpt.push(c);
            }
        }
        while (!stackOpt.isEmpty()) {
            calc(stackOpt, stackNum);
        }
        return stackNum.pop();
    }

    public void calc(Stack<Character> stackOpt, Stack<Integer> stackNum) {
        int num2 = stackNum.pop();
        int num1 = stackNum.pop();
        stackNum.push(calc(num1, stackOpt.pop(), num2));
    }

    public int calc(int num1, char operator, int num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                return Integer.parseInt(null);
        }
    }



/*****************************************************************************/

    public int calculate(String s) {
        List<Integer> numList = new LinkedList<Integer>();
        List<Character> optList = new LinkedList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('0' <= c && c <= '9') {
                int num = 0;
                while (i < s.length() && '0' <= s.charAt(i) && s.charAt(i) <= '9') {
                    num = num * 10 + s.charAt(i) - '0';
                    i++;
                }
                i--;
                numList.add(num);
            } else if (c == '(') {
                optList.add(c);
            } else if (c == '+' || c == '-') {
                optList.add(c);
            } else if (c == ')') {
                Stack<Integer> stackNum = new Stack<Integer>();
                Stack<Character> stackOpt = new Stack<Character>();
                while (optList.get(optList.size() -1) != '(') {
                    stackOpt.push(optList.remove(optList.size() - 1));
                    stackNum.push(numList.remove(numList.size() - 1));
                }
                optList.remove(optList.size() - 1);
                int tmpRes = numList.remove(numList.size() - 1);
                while (!stackNum.isEmpty()) {
                    tmpRes = calc(tmpRes, stackNum.pop(), stackOpt.pop());
                }
                numList.add(tmpRes);
            }
        }

        int result = numList.remove(0);
        while (!optList.isEmpty()) {
            result = calc(result, numList.remove(0), optList.remove(0));
        }
        return result;
    }






    public int calculate(String s) {
        Stack<Character> stackOpt = new Stack<Character>();
        Stack<Integer> stackNum = new Stack<Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int num = 0; 
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = 10 * num + s.charAt(i) - '0';
                    i++;
                }
                i--;
                stackNum.push(num);
            } else if (c == '(' || c == '+' || c == '-') {
                stackOpt.push(c);
            } else if (c == ')') {
                Stack<Character> stackOptTmp = new Stack<Character>();
                Stack<Integer> stackNumTmp = new Stack<Integer>();
                while (stackOpt.peek() != '(') {
                    stackOptTmp.push(stackOpt.pop());
                    stackNumTmp.push(stackNum.pop());
                }
                stackOpt.pop();
                int tmpRes = stackNum.pop();
                while (!stackOptTmp.empty()) {
                    tmpRes = calc(tmpRes, stackNumTmp.pop(), stackOptTmp.pop());
                }
                stackNum.push(tmpRes);
            }
        }
        Stack<Character> stackOptTmp = new Stack<Character>();
        Stack<Integer> stackNumTmp = new Stack<Integer>();
        while (!stackOpt.empty()) {
            stackOptTmp.push(stackOpt.pop());
            stackNumTmp.push(stackNum.pop());
        }
        int result = stackNum.pop();
        while (!stackOptTmp.empty()) {
            result = calc(result, stackNumTmp.pop(), stackOptTmp.pop());
        }
        return result;
    }

    public int calc(int num1, int num2, char operator) {
        return num1 + (operator == '+' ? 1 : -1) * num2;
    }

/*****************************************************************************/

    public int calculate(String s) {
        Deque<Integer> numList = new LinkedList<Integer>();
        Deque<Character> optList = new LinkedList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = 10 * num + s.charAt(i) - '0';
                    i++;
                }
                i--;
                numList.add(num);
            } else if (c == '(' || c == '+' || c == '-') {
                optList.add(c);
            } else if (c == ')') {
                Stack<Integer> stackNum = new Stack<Integer>();
                Stack<Character> stackOpt = new Stack<Character>();
                while (optList.peekLast() != '(') {
                    stackNum.push(numList.pollLast());
                    stackOpt.push(optList.pollLast());
                }
                optList.pollLast();
                int tmpRes = numList.pollLast();
                while (!stackOpt.empty()) {
                    tmpRes = calc(tmpRes, stackNum.pop(), stackOpt.pop());
                }
                numList.add(tmpRes);
            }
        }
        int result = numList.pollFirst();
        while (optList.size() > 0) {
            result = calc(result, numList.pollFirst(), optList.pollFirst());
        }
        return result;
    }

}
