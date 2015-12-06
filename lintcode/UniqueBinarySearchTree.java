/*
 *
 */
public class UniqueBinarySearchTree {

    public int numTrees(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 0;
        for (int i = 0; i < n; ++i) {
            result += numTree(i) * numTree(n - 1 - i);
        }
        return result;
    }

}
