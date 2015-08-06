/*
 * Given an array of integers, find out whether there 
 * are two distinct indices i and j in the array such 
 * that the difference between nums[i] and nums[j] is 
 * at most t and the difference between i and j is 
 * at most k.
 */
public class ContainsDuplicateIII {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < nums.length; ++i) {
            set.add(nums[i]);
            int floor = nums[i] < Integer.MIN_VALUE + t ? Integer.MIN_VALUE : nums[i] - t;
            int ceil = nums[i] > Integer.MAX_VALUE - t ? Integer.MAX_VALUE : nums[i] + t;
            if (i > 0 && set.subSet(floor, ceil).size() > 0)
                return true;
            if (i >= k) 
                set.remove(nums[i - k]);
        }
        return false;
    }

    // TODO
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k == 0)
            return false;
        BST bst = new BST();
        for (int i = 0; i < nums.length; i++) {
            bst.insert(nums[i]);
            if (i > 0 && bst.getKthMin(2).value - bst.getMin().value <= t)
                return true;
            if (i >= k)
                bst.delete(nums[i - k]);
        }
        return false;
    }

}

class TreeNode {

    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}

class BST {

    private TreeNode root;

    BST() {
        root = null;
    }

    // insert
    public void insert(int value) {
        root = insert(root, value);
    }

    private TreeNode insert(TreeNode root, int value) {
        if (root == null)
            root = new TreeNode(value);
        else if (value <= root.value)
            root.left = insert(root.left, value);
        else
            root.right = insert(root.right, value);
        return root;
    }

    // delete
    public void delete(int value) {
        root = delete(root, value);
    }

    public TreeNode delete(TreeNode root, int value) {
        if (root == null)
            return null;
        if (value < root.value)
            root.left = delete(root.left, value);
        else if (value > root.value)
            root.right = delete(root.right, value);
        else {
            if (root.right == null)
                return root.left;
            if (root.left == null)
                return root.right;
            TreeNode t = root;
            root = getMin(t.right);
            root.right = deleteMin(t.right);
            root.left = t.left;
        }
        return root;
    }

    // deleteMin
    public TreeNode deleteMin(TreeNode root) {
        if (root.left == null)
            return root.right;
        root.left = deleteMin(root.left);
        return root;
    }

    // getMax
    public TreeNode getMax() {
        return getMax(root);
    }

    public TreeNode getMax(TreeNode root) {
        if (root.right == null)
            return root;
        return getMax(root.right);
    }

    // getMin
    public TreeNode getMin() {
        return getMin(root);
    }

    public TreeNode getMin(TreeNode root) {
        if (root.left == null)
            return root;
        return getMin(root.left);
    }

    public TreeNode getKthMin(int k) {
        return getKthMin(root, k);
    }

    public TreeNode getKthMin(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        while (cur != null || stack.size() > 0) {
            if (cur != null) {
                stack.add(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                k--;
                if (k == 0)
                    return cur;
                cur = cur.right;
            }
        }
        return null;
    }

}
