/*
Given four lists A, B, C, D of integer values, compute how many tuples (i, j, k, l) there are such that A[i] + B[j] + C[k] + D[l] is zero.

To make problem a bit easier, all A, B, C, D have same length of N where 0 ≤ N ≤ 500. All integers are in the range of -228 to 228 - 1 and the result is guaranteed to be at most 231 - 1.

Example:

Input:
A = [ 1, 2]
B = [-2,-1]
C = [-1, 2]
D = [ 0, 2]

Output:
2

Explanation:
The two tuples are:
1. (0, 0, 0, 1) -> A[0] + B[0] + C[0] + D[1] = 1 + (-2) + (-1) + 2 = 0
2. (1, 1, 0, 0) -> A[1] + B[1] + C[0] + D[0] = 2 + (-1) + (-1) + 0 = 0
 */
public class FourSumII {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        if (A == null || A.length == 0 || B == null || B.length == 0 
                || C == null || C.length == 0 || D == null || D.length == 0) {
            return 0;
        }
        int result = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        Arrays.sort(D);
        int minA = -(B[B.length - 1] + C[C.length - 1] + D[D.length - 1]);
        int maxA = -(B[0] + C[0] + D[0]);
        if (minA <= A[A.length - 1] && maxA >= A[0]) {
            for (int a = 0; a < A.length; ++a) {
                int minB = -(A[a] + C[C.length - 1] + D[D.length - 1]);
                int maxB = -(A[a] + C[0] + D[0]);
                if (minB <= B[B.length - 1] && maxB >= B[0]) {
                    for (int b = 0; b < B.length; ++b) {
                        int minC = -(A[a] + B[b] + D[D.length - 1]);
                        int maxC = -(A[a] + B[b] + D[0]);
                        if (minC <= C[C.length - 1] && maxC >= C[0]) {
                            for (int c = 0; c < C.length; ++c) {
                                if (-(A[a] + B[b] + C[c]) <= D[D.length - 1] 
                                        && -(A[a] + B[b] + C[c]) >= D[0]) {
                                    for (int d = 0; d < D.length; ++d) {
                                        if (A[a] + B[b] + C[c] + D[d] == 0) {
                                            result++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

}
