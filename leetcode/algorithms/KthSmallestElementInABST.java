/*
 * Given a binary search tree, write a function kthSmallest to find 
 * the kth smallest element in it.
 * 
 * Note: 
 * You may assume k is always valid, 1 ¡Ü k ¡Ü BST's total elements.
 * 
 * Follow up:
 * What if the BST is modified (insert/delete operations) often and 
 * you need to find the kth smallest frequently? How would you 
 * optimize the kthSmallest routine?
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
public class KthSmallestElementInABST {

    public int kthSmallest(TreeNode root, int k) {
        int leftSize = treeSize(root.left);
        if (k - 1 == leftSize)
            return root.val;
        else if (k - 1 < leftSize)
            return kthSmallest(root.left, k);
        else
            return kthSmallest(root.right, k - leftSize - 1);
    }

    public int treeSize(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + treeSize(root.left) + treeSize(root.right);
    }

}
