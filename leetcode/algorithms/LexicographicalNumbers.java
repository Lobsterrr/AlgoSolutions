/*
 * Given an integer n, return 1 - n in lexicographical order.

 * For example, given 13, return: [1,10,11,12,13,2,3,4,5,6,7,8,9].

 * Please optimize your algorithm to use less time and space. The input size may be as large as 5,000,000.
 */
public class LexicographicalNumbers {

    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<Integer>();
        if (n < 0) {
            return result;
        }
        for (int i = 1, value = 1; i <= n; ++i) {
            result.add(value);
            if (value * 10 <= n) {
                value *= 10;
            } else {
                if (value >= n) {
                    value /= 10;
                }
                value += 1;
                while (value % 10 == 0) {
                    value /= 10;
                }
            }
        }
        return result;
    }

    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<Integer>();
        if (n < 0) {
            return result;
        }
        helper(result, n, 1);
        return result;
    }

    public void helper(List<Integer> result, int n, int value) {
        if (result.size() >= n) {
            return;
        }
        result.add(value);
        if (value * 10 <= n) {
            value *= 10;
        } else {
            if (value >= n) {
                value /= 10;
            }
            value += 1;
            while (value % 10 == 0) {
                value /= 10;
            }
        }
        helper(result, n, value);
    }

}
