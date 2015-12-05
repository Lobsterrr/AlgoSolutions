/*
 *
 */
public class RemoveElement {

    public int removeElement(int[] A, int elem) {
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

    public int removeElement(int[] A, int elem) {
        int index = 0;
        for (int i = 0; i < A.length; ++i) {
            if (A[i] != elem) {
                A[index++] = A[i];
            }
        }
        return index;
    }
}
