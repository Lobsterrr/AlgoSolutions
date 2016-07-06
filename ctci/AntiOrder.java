public class AntiOrder {

    public int count(int[] A, int n) {
        int count = 0;
        for (int i = 0; i < A.length; ++i) {
            for (int j = i + 1; j < A.length; ++j) {
                if (A[i] > A[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

}
