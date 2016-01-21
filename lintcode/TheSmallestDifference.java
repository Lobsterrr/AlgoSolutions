/*
 *
 */
public class TheSmallestDifference {

    public int smallestDifference(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int result = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        while (i < A.length && j < B.length) {
            result = Math.min(result, Math.abs(A[i] - B[j]));
            if (A[i] < B[j]) {
                i++;
            } else {
                j++;
            }
        }
        return result;
    }
    // [3, 4, 6, 7], [2, 3, 8, 9]
}
