/*
 *
 */
public class ImplementQueueByTwoStacks {

}

class Queue {
    
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    int topValue;

    public Queue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    public void push(int element) {
        if (stack1.isEmpty()) {
            topValue = element;
        }
        stack1.push(element);
    }

    public int pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int popValue = stack2.pop();
        topValue = stack2.peek();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return popValue;
    }

    public int top() {
        return topValue; 
    }

}
