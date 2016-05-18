/*
 * Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
A single node tree is a BST
Example
An example:

  2
 / \
1   4
   / \
  3   5
The above binary tree is serialized as {2,1,4,#,#,3,5} (in level order).
 */
/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class ValidateBinarySearchTree {

    /**
     * @param root: The root of binary tree.
     * @return: True if the binary tree is BST, or false
     */
    public boolean isValidBST(TreeNode root) {
        if (root == null || root.left == null && root.right == null) {
            return true;
        }
        if (root.left != null) {
            TreeNode cur = root.left;
            if (cur.val > root.val) {
                return false;
            }
            while (cur.right != null) {
                cur = cur.right;
            }
            if (root.left.val > cur.val) {
                return false;
            }
        }
        if (root.right != null) {
            TreeNode cur = root.right;
            if (cur.val < root.val) {
                return false;
            }
            while (cur.left != null) {
                cur = cur.left;
            }
            if (root.right.val < cur.val) {
                return false;
            }
        }
        return isValidBST(root.left) && isValidBST(root.right);
    }

}
