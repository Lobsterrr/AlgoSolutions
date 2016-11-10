/*
Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]
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
public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        binaryTreePaths(root, "", result);
        return result;
    }

    public void binaryTreePaths(TreeNode root, String path, List<String> result) {
        if (root == null) {
            return;
        }
        sb.append("->" + root.val);
        if (root.left == null && root.right == null) {
            result.add(path.substring(2).toString());
        }
        binaryTreePaths(root.left, path, result);
        binaryTreePaths(root.right, path, result);
    }

}
