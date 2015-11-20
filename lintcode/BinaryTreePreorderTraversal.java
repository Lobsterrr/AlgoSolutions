/*
 * Given a binary tree, return the preorder traversal of its nodes' values.

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

    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (root == null)
            return result;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        result.add(cur.val);
        while (cur != null || !stack.isEmpty()) {
            if (cur.left != null) {
                stack.push(cur.left);
                result.add(cur.left.val);
            } else {
                cur = stack.pop();
                cur = cur.right;
            }
        }
    }

}
