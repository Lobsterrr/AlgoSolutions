/*
 * Given a binary tree, return the preorder traversal of its nodes' 
 * values.

Example
Given:

    1
   / \
  2   3
 / \
4   5
return [1,2,4,5,3].

Challenge
Can you do it without recursion?
 */
public class BinaryTreePreorderTraversal {

    // iteration
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                result.add(cur.val);
                cur = cur.left;
            } else {
                cur = stack.pop().right;
            }
        }
        return result;
    }

    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                result.add(root.val);
                root = root.left;
            } else {
                root = stack.pop().right;
            }
        }
        return result;
    }

/*******************************************************************/

    // recursion
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (root != null) {
            result.add(root.val);
            result.addAll(preorderTraversal(root.left));
            result.addAll(preorderTraversal(root.right));
        }
        return result;
    }

}
