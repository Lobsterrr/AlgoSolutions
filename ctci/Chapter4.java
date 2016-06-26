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
        ArrayList<ArrayList<Integer>> result 
            = new ArrayList<ArrayList<Integer>>();
        dfs(root, target, 0, result, new ArrayList<Integer>());
        return result;
    }

    public void dfs(TreeNode root, int target, int sum, 
            ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        sum += root.val;
        if (root.left == null && root.right == null) {
            if (target == sum) {
                result.add(list);
            }
        }
        dfs(root.left, target, sum, result, new ArrayList<Integer>(list));
        dfs(root.right, target, sum, result, new ArrayList<Integer>(list));
    }

}
