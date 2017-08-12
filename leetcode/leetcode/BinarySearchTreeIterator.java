/*
Implement an iterator over a binary search tree (BST). Your iterator will be
initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

Note: next() and hasNext() should run in average O(1) time and uses O(h)
memory, where h is the height of the tree.
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

}

class BSTIterator {

    private TreeNode root;
    private List<TreeNode> list;
    private int index;

    public BSTIterator(TreeNode root) {
        this.root = root;
        this.list = new ArrayList<TreeNode>();
        int index = 0;
        init();
    }

    public void init() {
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                TreeNode top = stack.pop();
                list.add(top);
                cur = top.right;
            }
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return index != list.size();
    }

    /** @return the next smallest number */
    public int next() {
        return list.get(index++).val;
    }

}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
