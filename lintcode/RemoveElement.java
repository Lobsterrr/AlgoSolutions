/*
 *
 */
public class RemoveElement {

    public int removeElement(int[] A, int elem) {
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < A.length) {
            if (A[i] != elem) {
                A[j] = A[i];
                j++;
            }
            i++;
        }
        return j;
    }

}
