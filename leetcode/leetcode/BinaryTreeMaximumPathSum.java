/*
Given a binary tree, find the maximum path sum.

For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path must contain at least one node and does not need to go through the root.

For example:
Given the below binary tree,

       1
      / \
     2   3
Return 6.
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
public class BinaryTreeMaximumPathSum {

    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return root.val;
        }
        int result = root.val;
        int left = Integer.MIN_VALUE;
        int right = Integer.MIN_VALUE;
        if (root.left != null) {
            left = maxPathSum(root.left);
            result = Math.max(result, left);
            result = Math.max(result, root.val + left);
        }
        if (root.right != null) {
            right = maxPathSum(root.right);
            result = Math.max(result, right);
            result = Math.max(result, root.val + right);
        }
        if (root.left != null && root.right != null) {
            result = Math.max(result, root.val + left + right);
        }
        return result;
    }

    public int getPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return root.val;
        }
    }

}
