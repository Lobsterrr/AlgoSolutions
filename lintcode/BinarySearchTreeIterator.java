/*
 * Design an iterator over a binary search tree with the following rules:

Elements are visited in ascending order (i.e. an in-order traversal)
next() and hasNext() queries run in O(1) time in average.
Example
For the following binary search tree, in-order traversal by using iterator is 
[1, 6, 10, 11, 12]

   10
 /    \
1      11
 \       \
  6       12

Challenge
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

    List<TreeNode> curLevel;
    List<TreeNode> nextLevel;

    //@param root: The root of binary tree.
    public BSTIterator(TreeNode root) {
        curLevel = new LinkedList<TreeNode>();
        nextLevel = new LinkedList<TreeNode>();
    }

    //@return: True if there has next node, or false
    public boolean hasNext() {
        return curLevel.size() != 0 && nextLevel.size() != 0;
    }

    //@return: return next node
    public TreeNode next() {
        if (curLevel.size() == 0 || nextLevel.size() == 0) {
            return null;
        } 
        if (curLevel.size() == 0) {
            curLevel = nextLevel;
            nextLevel = new LinkedList<TreeNode>();
        }
        TreeNode result = curLevel.poll();
        if (result.left != null) {
            nextLevel.add(result.left);
        }
        if (result.right != null) {
            nextLevel.add(result.right);
        }
        return result;
    }

}

class BSTIterator {

    Stack<TreeNode> stack;
    TreeNode cur;

    //@param root: The root of binary tree.
    public BSTIterator(TreeNode root) {
        stack = new Stack<TreeNode>();
        cur = root;
    }

    //@return: True if there has next node, or false
    public boolean hasNext() {
        return cur != null || !stack.isEmpty();
    }

    //@return: return next node
    public TreeNode next() {
        if (cur == null && stack.isEmpty()) {
            return null;
        }
        if (cur == null) {
            cur = stack.pop();
        }
        if (cur.right != null) {
            stack.push(cur.right);
        }
        TreeNode result = cur;
        cur = cur.left;
        return result;


        if (cur == null && stack.isEmpty()) {
            return null;
        }
        if (cur == null) {
            cur = stack.pop();
        }
        if (cur
    }

}
