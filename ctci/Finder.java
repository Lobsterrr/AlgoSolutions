public class Finder {

    public int findElement(int[] A, int n, int x) {
        int low = 0;
        int high = A.lenght - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (A[mid] == x) {
                return mid;
            }
        }
    }

}
