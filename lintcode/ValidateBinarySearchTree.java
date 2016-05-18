/*
 * Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's 
key.
The right subtree of a node contains only nodes with keys greater than the 
node's key.
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
        return dfs(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean dfs(TreeNode root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        return dfs(root.left, min, root.val) && dfs(root.right, root.val, max);
    }


    public boolean isValidBST(TreeNode root) {
        return dfs(root, null, null);
    }

    public boolean dfs(TreeNode root, TreeNode low, TreeNode high) {
        return root == null || (low == null || low.val < root.val) && dfs(root.left, low, root) && (high == null || high.val > root.val) && dfs(root.right, root, high);
    }

/*****************************************************************************/

    public boolean isValidBST(TreeNode root) {
        if (root == null || root.left == null && root.right == null) {
            return true;
        }
        TreeNode cur = root.left;
        while (cur != null) {
            if (cur.val >= root.val) {
                return false;
            }
            cur = cur.right;
        }
        cur = root.right;
        while (cur != null) {
            if (cur.val <= root.val) {
                return false;
            }
            cur = cur.left;
        }
        return isValidBST(root.left) && isValidBST(root.right);
    }

/*****************************************************************************/

    public TreeNode cur = null;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isValidBST(root.left)) {
            return false;
        }
        if (cur != null && root != cur && root.val <= cur.val) {
            return false;
        }
        cur = root;
        if (!isValidBST(root.right)) {
            return false;
        }
        return true; 
    }

}
