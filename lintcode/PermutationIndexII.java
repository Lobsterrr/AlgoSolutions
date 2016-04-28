/*
 * Given a permutation which may contain repeated numbers, find its index in all the permutations of these numbers, which are ordered in lexicographical order. The index begins at 1.

Example
Given the permutation [1, 4, 2, 2], return 3.
 */
public class PermutationIndexII {

    /**
     * @param A an integer array
     * @return a long integer
     */
    public long permutationIndexII(int[] A) {
        long result = 1;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = A.length - 2; i >= 0; --i) {
            map.put(A[i + 1], 1 + (map.containsKey(A[i + 1]) ? map.get(A[i + 1]) : 0));
            int reverseCount = 0;
            for (int j = i + 1; j < A.length; ++j) {
                if (A[i] > A[j]) {
                    reverseCount++;
                }
            }
            // long increment = reverseCount * factorial(A.length - 1 - i);
            for (int key : map.keySet()) {
                increment /= factorial(map.get(key));
            }
            result += increment;
        }
        return result;
    }

    public long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; ++i) {
            result *= i;
        }
        return result;
    }

}
