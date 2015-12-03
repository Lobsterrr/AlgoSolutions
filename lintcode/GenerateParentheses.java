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

    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<String>();
        dfs(result, "", n, n);
        return result;
    }

    public void dfs(ArrayList<String> result, String s, int left, int right) {
        if (left < 0 || right < 0) {
            return;
        }
        if (left == 0 && right == 0) {
            result.add(s);
        }
        dfs(result, s + ")", left, right - 1);
        dfs(result, "(" + s, left - 1, right);
    }

}
