/*
 * Given a binary tree, return the inorder traversal of its nodes' 
 * values.

Example
Given binary tree {1,#,2,3},

   1
    \
     2
    /
   3
 

return [1,3,2].

Challenge
Can you do it without recursion?
 */
public class BinaryTreeInorderTraversal {

    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();




        return result;
    }

    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (root != null) {
            result.addAll(inorderTraversal(root.left));
            result.add(root.val);
            result.addAll(inorderTraversal(root.right));
        }
        return result;
    }

}
