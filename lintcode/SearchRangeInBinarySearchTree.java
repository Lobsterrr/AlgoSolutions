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
                if (cur.val < k1) {
                    cur = null;
                } else {
                    cur = cur.left;
                }
            } else {
                cur = stack.pop();
                result.add(cur.val);
                if (cur.val > k2) {
                    cur = null;
                } else {
                    cur = cur.right;
                }
            }
        }
        return result;
    }

}
