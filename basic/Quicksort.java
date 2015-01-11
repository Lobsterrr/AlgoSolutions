public class Quicksort {

/*************************** updated 20150111 **********************/

    public void quicksort(int[] array, int low, int high) {
        if (low >= high)
            return;
        int i = low;
        for (int j = low; j < high; j++) {
            if (array[j] <= array[high]) {
                swap(array, i++, j);
            }
        }
        swap(array, i, high);
        quicksort(array, low, i - 1);
        quicksort(array, i, high);
    }

    public void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    
}
