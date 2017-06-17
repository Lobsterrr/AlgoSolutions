/*
Given a binary tree, return the zigzag level order traversal of its nodes' 
values. (ie, from left to right, then right to left for the next level and 
alternate between).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
  [15,7]
]
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) {
            return result;
        }
        List<Integer> list = new ArrayList<Integer>();
        boolean isL2R = true;
        Queue<TreeNode> curLayer = new LinkedList<TreeNode>();
        Queue<TreeNode> nextLayer = new LinkedList<TreeNode>();
        curLayer.offer(root);
        while (!curLayer.isEmpty()) {
            TreeNode node = curLayer.poll();
            list.add(node.val);
            if (node.left != null) {
                nextLayer.offer(node.left);
            }
            if (node.right != null) {
                nextLayer.offer(node.right);
            }
            if (curLayer.isEmpty()) {
                if (!isL2R) {
                    Collections.reverse(list);
                }
                isL2R = !isL2R;
                result.add(list);
                list = new ArrayList<Integer>();
                curLayer = nextLayer;
                nextLayer = new LinkedList<TreeNode>();
            }
        }
        return result;
    }

}
