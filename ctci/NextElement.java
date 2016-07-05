public class NextElement {

    public int[] findNext(int[] A, int n) {
        if (A == null || A.length == 0) {
            return null;
        }
        int[] result = new int[A.length];
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = A.length - 1; i >= 0; --i) {
            while (stack.size() > 0 && A[i] >= stack.peek()) {
                stack.pop();
            }
            result[i] = stack.size() == 0 ? -1 : stack.peek();
            stack.push(A[i]);
        }
        return result;
    }

}
