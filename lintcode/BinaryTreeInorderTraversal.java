/*
 *
 */
public class BinaryTreeInorderTraversal {

    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (root != null) {
            result.addAll(root.left);
            result.add(root.val);
            result.addAll(root.right);
        }
        return result;
    }

}
