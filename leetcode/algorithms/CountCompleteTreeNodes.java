/*
 * Given a complete binary tree, count the number of nodes.

 * Definition of a complete binary tree from Wikipedia:
 * In a complete binary tree every level, except possibly 
 * the last, is completely filled, and all nodes in the 
 * last level are as far left as possible. It can have 
 * between 1 and 2h nodes inclusive at the last level h.
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
public class CountCompleteTreeNodes {

    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        int leftHeight = getCompBinTreeHeight(root.left);
        int rightHeight = getCompBinTreeHeight(root.right);
        if (leftHeight == rightHeight)
            return (1 << leftHeight) + countNodes(root.right);
        return (1 << rightHeight) + countNodes(root.left);
    }

    public int getCompBinTreeHeight(TreeNode root) {
        int height = 0;
        while (root != null) {
            height++;
            root = root.left;
        }
        return height;
    }   

/*******************************************************************/

    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        int count = checkCompleteTreeNode(root);
        if (count > 0)
            return count;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public int checkCompleteTreeNode(TreeNode root) {
        int leftHeight = 0;
        int rightHeight = 0;
        for (TreeNode cur = root; cur != null; cur = cur.left) {
            leftHeight++;
        }
        for (TreeNode cur = root; cur != null; cur = cur.right) {
            rightHeight++;
        }
        if (leftHeight != rightHeight)
            return 0;
        return (1 << leftHeight) - 1;
    }   

}
