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

    // 4.3
    public int buildMinimalBST(int[] vals) {
        if (vals == null || vals.length == 0) {
            return null;
        }
        return buildMinimalBST(vals, 0, vals.length - 1);
    }

    public TreeNode buildMinimalBST(int[] vals, int low, int high) {
        if (vals == null || vals.length == 0 || low < 0 || high >= vals.length || low > high) {
            return null;
        }
        int mid = low + (high - low) / 2;
        TreeNode root = new TreeNode(vals[mid]);
        root.left = buildMinimalBST(vals, low, mid - 1);
        root.high = buildMinimalBST(vals, mid + 1, high);
        return root;
    }

    // 4.9
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> result 
            = new ArrayList<ArrayList<Integer>>();
        dfs(root, target, result, new ArrayList<Integer>());
        return result;
    }

    public void dfs(TreeNode root, int target, 
            ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        if (root.left == null && root.right == null && target == root.val) {
            result.add(list);
        }
        dfs(root.left, target - root.val, result, new ArrayList<Integer>(list));
        dfs(root.right, target - root.val, result, new ArrayList<Integer>(list));
    }

}
