/*
Given a binary tree, flatten it to a linked list in-place.

For example,
Given

         1
        / \
       2   5
      / \   \
     3   4   6
The flattened tree should look like:
   1
    \
     2
      \
       3
        \
         4
          \
           5
            \
             6

Hints:
If you notice carefully in the flattened tree, each node's right child points 
to the next node of a pre-order traversal.
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
public class FlattenBinaryTreeToLinkedList {

    public void flatten(TreeNode root) {
        if (root == null || root.left == null && root.right == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        TreeNode cur = root;
        TreeNode leftMost = null;
        while (cur != null || !stack.isEmpty()) {

        }
    }

    public void flatten(TreeNode root) {
        if (root == null || root.left == null && root.right == null) {
            return;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode right = root.right;
        root.right = root.left;
        root.left = null;
        TreeNode cur = root;
        while (cur.right != null) {
            cur = cur.right;
        }
        cur.right = right;
    }

}
