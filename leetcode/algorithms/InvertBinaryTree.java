/*
 * Invert a binary tree.
 * 
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * to
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode tmp = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(tmp);
        }
        return root;
    }


    public TreeNode invertTree(TreeNode root) {
        if (root == null) 
            return root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        stack.push(root);
        while (!stack.isEmpty()) {
            if (cur.left != null) {
                stack.push(cur.left);
                cur = cur.left;
            } else {
                TreeNode node = stack.pop();
                TreeNode tmp = node.left;
                node.left = node.right;
                node.right = tmp;
                cur = node;
            }
        }
        return root;
    }
}
