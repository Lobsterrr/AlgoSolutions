/*
 * Given a permutation which contains no repeated number, 
 * find its index in all the permutations of these numbers, 
 * which are ordered in lexicographical order. The index 
 * begins at 1.

Example
Given [1,2,4], return 1.
 */
public class PermutationIndex {

    /**
     * @param A an integer array
     * @return a long integer
     */
    public long permutationIndex(int[] A) {
        if (A.length == 0) {
            return 0;
        }
        if (A.length == 1) {
            return 1;
        }
        int[] subA = Arrays.copyOfRange(A, 1, A.length);
        int factorial = 1;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < A.length; ++i) {
            factorial *= i + 1;
            list.add(A[i]);
        }

    }

}
