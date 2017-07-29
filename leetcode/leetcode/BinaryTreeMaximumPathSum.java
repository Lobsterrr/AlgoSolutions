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
        if (root.left == null && root.right == null) {
            maxSum = Math.max(maxSum, root.val);
            return root.val;
        } else if (root.left == null && root.right != null) { 
            int R = Math.max(0, getPathSum(root.right));
            maxSum = Math.max(maxSum, root.val + Math.max(0, R));
            return root.val + Math.max(0, R);
        } else if (root.left != null && root.right == null) {
            int L = Math.max(0, getPathSum(root.left));
            maxSum = Math.max(maxSum, root.val + Math.max(0, L));
            return root.val + Math.max(0, root.val + Math.max(0, L));
        } else {
            int L = Math.max(0, getPathSum(root.left));
            int R = Math.max(0, getPathSum(root.right));
            maxSum = Math.max(maxSum, root.val + Math.max(0, Math.max(L, Math.max(R, L + R))));
            return root.val + Math.max(0, Math.max(L, Math.max(R, L + R)));
        }
    }

}
