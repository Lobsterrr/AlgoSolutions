/*
 *
 */
public class IdenticalBinaryTree {

    public boolean isIdentical(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null && b != null || a != null && b == null) {
            return false;
        }
        return a.val == b.val && isIdentical(a.left, b.left) && isIdentical(a.right, b.right);
    }

}
