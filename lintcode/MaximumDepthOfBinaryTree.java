/*
 * Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest 
path from the root node down to the farthest leaf node.

Example
Given a binary tree as follow:

  1
 / \ 
2   3
   / \
  4   5
The maximum depth is 3.
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
public class MaximumDepthOfBinaryTree {

    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : 
            1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

/*******************************************************************/

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int curLvCnt = 1;
        int nextLvCnt = 0;
        int level = 0;
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            curLvCnt--;
            if (node.left != null) {
                nextLvCnt++;
                queue.offer(node.left);
            }
            if (node.right != null) {
                nextLvCnt++;
                queue.offer(node.right);
            }
            if (curLvCnt == 0) {
                curLvCnt = nextLvCnt;
                nextLvCnt = 0;
                level++;
            }
        }
        return level;
    }

}
