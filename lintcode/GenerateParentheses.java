/*
 *
 */
public class GenerateParentheses {

    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<String>();
        if (n == 0) {
            result.add("");
        } else if (n == 1) {
            result.add("()");
        } else if (n > 1) {
            for (int i = 0; i < n; ++i) {
                for (String inner : generateParenthesis(i)) {
                    for (String outer : generateParenthesis(n - i - 1)) {
                        result.add("(" + inner + ")" + outer);
                    }
                }
            }
        }
        return result;
    }

}
