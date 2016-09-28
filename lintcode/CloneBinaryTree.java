/*
 * For the given binary tree, return a deep copy of it.

Example
Given a binary tree:

     1
   /  \
  2    3
 / \
4   5
return the new binary tree with same structure and same value:

     1
   /  \
  2    3
 / \
4   5
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
public class CloneBinaryTree {

    /**
     * @param root: The root of binary tree
     * @return root of new tree
     */
    public TreeNode cloneTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        Map<TreeNode, TreeNode> map = new HashMap<TreeNode, TreeNode>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else if (!stack.isEmpty()) {
                cur = stack.pop();
                map.put(cur, new TreeNode(cur.val));
                cur = cur.right;
            }
        }
        cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else if (!stack.isEmpty()) {
                cur = stack.pop();
                TreeNode copyNode = map.get(cur);
                copyNode.left = map.get(cur.left);
                copyNode.right = map.get(cur.right);
                cur = cur.right;
            }
        }
        return map.get(root);
    }

    public TreeNode cloneTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode copy = new TreeNode(root.val);
        copy.left = cloneTree(root.left);
        copy.right = cloneTree(root.right);
        return copy;
    }

}
