/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Chapter4 {

    // 4.9
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {

    }

    public void dfs(TreeNode root, int target, int sum, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root);
        if (root.left == null && root.right == null) {
            if (target == sum) {
                result.add(new ArrayList<Integer>(list));
            }
        }
    }

}
