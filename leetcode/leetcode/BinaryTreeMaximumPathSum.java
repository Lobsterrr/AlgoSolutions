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

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        getPathSum(root);
        return maxSum;
    }

    public int getPathSum(TreeNode root) {
        if (root == null) {
            maxSum = Math.max(maxSum, 0);
            return 0;
        }
        if (root.left != null) {
            maxSum = Math.max(maxSum, root.val + Math.max(0, getPathSum(root.left)));
        }
        if (root.right != null) {
            maxSum = Math.max(maxSum, root.val + Math.max(0, getPathSum(root.right)));
        }
        return root.val + Math.max(0, Math.max(getPathSum(root.left), getPathSum(root.right)));
    }

}
