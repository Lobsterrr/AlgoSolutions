/*
 * Design an iterator over a binary search tree with the following rules:

Elements are visited in ascending order (i.e. an in-order traversal)
next() and hasNext() queries run in O(1) time in average.
Have you met this question in a real interview? Yes
Example
Challenge
Tags
Related Problems
 Notes
For the following binary search tree, in-order traversal by using iterator is [1, 6, 10, 11, 12]

   10
 /    \
1      11
 \       \
  6       12
Challenge
Tags
Related Problems
 Notes
Extra memory usage O(h), h is the height of the tree.

Super Star: Extra memory usage O(1)
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
 * Example of iterate a tree:
 * BSTIterator iterator = new BSTIterator(root);
 * while (iterator.hasNext()) {
 *    TreeNode node = iterator.next();
 *    do something for node
 * } 
 */
public class BinarySearchTreeIterator {

}

class BSTIterator {

    //@param root: The root of binary tree.
    public class BSTIterator(TreeNode root) {

    }

    //@return: True if there has next node, or false
    public boolean hasNext() {

    }

    //@return: return next node
    public TreeNode next() {

    }

}
