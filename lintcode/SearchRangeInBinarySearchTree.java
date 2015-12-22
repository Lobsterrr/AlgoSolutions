/*
 * Given two values k1 and k2 (where k1 < k2) and a root pointer to a 
 * Binary Search Tree. Find all the keys of tree in range k1 to k2. 
 * i.e. print all x such that k1<=x<=k2 and x is a key of given BST. 
 * Return all the keys in ascending order.

Example
If k1 = 10 and k2 = 22, then your function should return [12, 20, 22].

    20
   /  \
  8   22
 / \
4   12
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
public class SearchRangeInBinarySearchTree {

    /**
     * @param root: The root of the binary search tree.
     * @param k1 and k2: range k1 to k2.
     * @return: Return all keys that k1<=key<=k2 in ascending order.
     */
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
                if (k1 <= cur.val && cur.val <= k2) {
                    result.add(cur.val);
                }
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
