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
        TreeNode copy = new TreeNode(root.val);
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        Map<TreeNode, TreeNode> map = new HashMap<TreeNode, TreeNode>();
        map.put(root, copy);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            if (cur.left != null && !map.containsKey(cur.left)) {
                stack.push(cur.left);
                TreeNode copyNode = new TreeNode(cur.left.val);
                map.put(cur.left, copyNode);
            }
            if (cur.right != null && !map.containsKey(cur.right)) {
                stack.push(cur.right);
                TreeNode copyNode = new TreeNode(cur.right.val);
                map.put(cur.right, copyNode);
            }
            map.get(cur).left = map.get(copyNode.left);
            map.get(cur).right = map.get(copyNode.right);
        }
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
