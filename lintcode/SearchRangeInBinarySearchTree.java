/*
 *
 */
public class SearchRangeInBinarySearchTree {

    public ArrayList<Integer> searchRange(TreeNode root, int k1, int k2) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                if (k1 <= cur.val && cur.val <= k2) {
                    result.add(cur.val);
                }
                cur = cur.right;
            }
        }
        return result;
    }

}
