public class MergeSort {

    public void mergeSort(int[] array, int low, int high) {
        if (low >= high)
            return;
        int mid = low + (high - low) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        int[] firstHalf = Arrays.copyOfRange(array, low, mid + 1);
        int i = low; 
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high) {
            array[k++] = array[j] < firstHalf[i] ? array[j++] : firstHalf[i++];
        }
        while (i <= mid) {
            array[k++] = firstHalf[i++];
        }
    }

}
