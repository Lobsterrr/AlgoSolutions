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
        long factorial = 1;
        for (int i = A.length - 2; i >= 0; i--) {
            factorial *= A.length - 1 - i;
            int reverseCount = 0;
            int dupilcateCount = 1;
            for (int j = i + 1; j < A.length; ++j) {
                if (A[i] >= A[j]) {
                    reverseCount++;
                }
                if (A[i] == A[j]) {
                    dupilcateCount++;
                }
            }
            result += reverseCount * factorial / dupilcateCount;
        }
        return result;
    }

}
