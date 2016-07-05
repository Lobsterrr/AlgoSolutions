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
            return 0;
        }
        int h = 1;
        for (; (2 << h - 1) < vals.length; ++h);
        return h;
    }

    // 4.7
    public int getLCA(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("illegal input: " + a + ", " + b);
        }
        if (a == b) {
            return a;
        } else if (a > b) {
            return getLCA(a / 2, b);
        } else {
            return getLCA(a, b / 2);
        }
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
