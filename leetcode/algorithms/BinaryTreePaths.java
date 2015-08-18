/*
 * Given a binary tree, return all root-to-leaf paths.

 * For example, given the following binary tree:
 * 
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 * All root-to-leaf paths are:
 * 
 * ["1->2->5", "1->3"]
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
        String path = "";

    }

    public void bfs(TreeNode root, List<String> result, String path) {
        if (root == null) 
            return ;
        if (root.left == null && root.right == null) {
            path += "->" + root.val;
            result.add(path);
            return ;
        }
    }

}
