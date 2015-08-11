public class BubbleSort {

    public void bubbleSort(int[] array, int low, int high) {
        for (int i = low; i <= high; ++i) {
            for (int j = high; j >= low + 1; --j) {
                if (array[j] > array[j - 1]) 
                    swap(array, j, j - 1);
            }
        }
    }

    public void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
