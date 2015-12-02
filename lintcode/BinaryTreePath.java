/*
 * Given a binary tree, return all root-to-leaf paths.

Example
Given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

[
  "1->2->5",
  "1->3"
]
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
public class BinaryTreePath {

    /**
     * @param root the root of the binary tree
     * @return all root-to-leaf paths
     */
    public List<String> binaryTreePath(TreeNode root) {
        List<String> result = new ArrayList<String>();

    }

    public void dfs(List<String> result, TreeNode root, String path) {
        if (root == null) {
            return;
        }
        path += (path.length() == 0 ? "" : "->") + root.val;
        if (root.left == null && root.right == null) {
            result.add(path);
            return;
        } else if (root.left != null && root.right == null) {
            dfs(result, root.left, path);
        } else if (roo.left == null && root.right != null) {
            dfs(result, root.right, path);
        } else {
            dfs(result, root.left, path);
            dfs(result, root.right, path);
        }
    }

}
