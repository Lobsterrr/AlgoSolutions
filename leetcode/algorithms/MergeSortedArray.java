/*
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.

 * Note:
 * You may assume that A has enough space to hold additional elements from B. 
 * The number of elements initialized in A and B are m and n respectively.
 */

public class MergeSortedArray {

/**************************** updated 2013/12/16 *****************************/

    public void merge(int A[], int m, int B[], int n) {
        m--;
        n--;
        while(n >= 0) {
            if(m >= 0) 
                A[m + n + 1] = (A[m] > B[n]) ? A[m--] : B[n--];
            else
                A[n] = B[n--];
        }
    } 

/**************************** updated 2014.11.25 *****************************/

    public void merge(int nums1[], int m, int nums2[], int n) {
        int i = m - 1;
        int j = n - 1;
        for (int k = m + n - 1; k >= 0; k--) { 
            nums1[k] = (j < 0 || i >= 0 && nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        }
    }



    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1 = m - 1;
        int i2 = n - 1;
        for (int i = i1 + i2 - 1; i >= 0; --i) {
            nums1[i] = (i2 < 0 || i1 >= 0 && nums1[i1] > nums2[i2]) ? nums1[i1--] : nums2[i2--];
        }
    }

}
