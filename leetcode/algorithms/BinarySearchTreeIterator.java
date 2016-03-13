/*
 * Implement an iterator over a binary search tree (BST). Your 
 * iterator will be initialized with the root node of a BST.

 * Calling next() will return the next smallest number in the BST.

 * Note: next() and hasNext() should run in average O(1) time 
 * and uses O(h) memory, where h is the height of the tree.
 * 
 */
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BinarySearchTreeIterator {

    private Stack<TreeNode> stack = new Stack<TreeNode>();
    private List<TreeNode> list = new ArrayList<TreeNode>();
    private TreeNode cur;
    private int index;

    public BinarySearchTreeIterator(TreeNode root) {
        cur = root;
        index = 0;
        iterator(cur, list);
    }

    public void iterator(TreeNode root, List<TreeNode> list) {
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode node = stack.pop();
            list.add(node);
            cur = node.right;
        }
    }

    public boolean hasNext() {
        return index < list.size();
    }

    public next() {
        return hasNext() ? list.get(index++) : null;
    }

    private TreeNode cur;
    private Stack<TreeNode>;
    
    public BinarySearchTreeIterator(TreeNode root) {
        cur = root;
        stack = new Stack<TreeNode>();
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return cur != null || !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        while (cur != null) {
            stack.push(cur);
            cur = cur.left;
        }
        TreeNode node = stack.pop();
        cur = node.right;
        return node.val;
    }
    
}
