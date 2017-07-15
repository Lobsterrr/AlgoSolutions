/*
Given inorder and postorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.

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
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    public TreeNode buildTree(int[] inorder, int iStart, int iEnd, int[] postorder, int pStart, int pEnd) {
        if (inorder == null || iStart < 0 || iEnd >= inorder.length || iStart > iEnd || postorder == null || pStart < 0 || pEnd >= postorder.length || pStart > pEnd || iEnd - iStart != pEnd - pStart) {
            return null;
        }
        TreeNode root = new TreeNode(inorder[iStart]);
        int i = pStart;
        for (; i <= pEnd && postorder[i] != inorder[iStart]; ++i);
        root.left = buildTree(inorder, iStart + 1, iStart + i - pStart, postorder, pStart, i - 1);
        root.right = buildTree(inorder, iStart + i - pStart + 1, iEnd, postorder, i + 1, pEnd);
        return root;
    }

}
