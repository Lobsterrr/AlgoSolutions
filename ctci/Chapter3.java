public class Chapter3 {

    // 3.5
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    // 3.6
    public ArrayList<Integer> twoStacksSort(int[] numbers) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (numbers == null || numbers.length == 0) {
            return result;
        }
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        for (int number : numbers) {
            stack2.push(number);
        }
        while (!stack2.isEmpty()) {
            int x = stack2.pop();
            if (stack1.isEmpty() || stack1.peek() <= x) {
                stack1.push(x);
            } else {
                while (!stack1.isEmpty() && stack1.peek() > x) {
                    stack2.push(stack1.pop());
                }
                stack1.push(x);
            }
        }
        while (!stack1.isEmpty()) {
            result.add(stack1.pop());
        }
        return result;
    }

}
