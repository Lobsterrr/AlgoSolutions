/*
 * There are two sorted arrays A and B of size m and n 
 * respectively. Find the median of the two sorted 
 * arrays. The overall run time complexity should be 
 * O(log (m+n)).
 */
public class MedianOfTwoSortedArrays {

    public double findMediaSortedArrays(int A[], int B[]) {
        int[] C = new int[A.length + B.length];
        int a = 0;
        int b = 0;
        int c = 0;
        while (a < A.length && b < B.length) {
            if (A[a] < B[b]) {
                C[c++] = A[a++];
            } else {
                C[c++] = B[b++];
            }
        }
        while (a < A.length) {
            C[c++] = A[a++];
        }
        while (b < B.length) {
            C[c++] = B[b++];
        }
        double result = C[C.length / 2];
        if (C.length % 2 == 0) {
            result += C[C.length / 2 - 1];
            result /= 2;
        }
        return result;
    }

}
