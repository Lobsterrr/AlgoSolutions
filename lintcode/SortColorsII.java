/*
 *
 */
public class SortColorsII {

    public void sortColors2(int[] colors, int k) {
        
    }

/*******************************************************************/

    public void sortColors2(int[] colors, int k) {
        quicksort(colors);    
    }

    public void quicksort(int[] A, int low, int high) {
        if (low >= high) {
            return;
        } 
        int index = low;
        for (int i = low; i < high; ++i) {
            if (A[i] < A[high]) {
                swap(A, index++, i);
            }
        }
        swap(A, index, high);
        quicksort(A, low, index - 1);
        quicksort(A, index + 1, high);
    }

    public void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

/*******************************************************************/

    public void sortColors2(int[] colors, int k) {
        int[] count = new int[k];
        for (int color : colors) {
            count[color - 1]++;
        }
        int color = 1;
        for (int i = 0; i < colors.length; ++i) {
            colors[i] = color;
            count[color - 1]--;
            while (color <= k && count[color - 1] == 0) {
                color++;
            }
        }
    }

}
