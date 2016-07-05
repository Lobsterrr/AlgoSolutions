public class NextElement {

    public int[] findNext(int[] A, int n) {
        if (A == null || A.length == 0) {
            return null;
        }
        int[] result = new int[A.length];
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = A.length - 1; i >= 0; --i) {
            if (stack.isEmpty()) {
                result[i] = -1;
                stack.push(A[i]);
            } else {
                if (A[i] < stack.peek()) {
                    result[i] = stack.peek();
                } else {

                }
            }


            if (stack.size() > 0 && stack.peek() < A[i]) {
                while (stack.size() > 0 && stack.peek() < A[i]) {
                    stack.pop();
                }
                if (stack.isEmty()) {
                    
                }
            }

            if (stack.isEmty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
        }
        return result;
    }

}
