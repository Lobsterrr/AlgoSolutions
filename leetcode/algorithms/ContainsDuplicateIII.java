/*
 * Given an array of integers, find out whether there 
 * are two distinct indices i and j in the array such 
 * that the difference between nums[i] and nums[j] is 
 * at most t and the difference between i and j is 
 * at most k.
 */
public class ContainsDuplicateIII {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        BST bst = new BST();
        for (int i = 0; i < k; i++) {
            
        }
    }

}

class BST {

    private TreeNode root;

    class TreeNode {
        
        private int value;
        private TreeNode left;
        private TreeNode right;    
        
        TreeNode(Integer value) {
            this.value = value;
            left = null;
            right = null;
        }
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

    // search
    public boolean search(int value) {
        return search(root, value);
    }

    public boolean search(TreeNode root, int value) {
        if (root == null)
            return false;
        else if (root.value == value)
            return true;
        else if (root.value < value)
            return search(root.right, value);
        else
            return search(root.left, value);
    }

    // deleteMin
    public void deleteMin() {
        root = deleteMin(root);
    }

    public TreeNode deleteMin(TreeNode root) {
        if (root.left == null) 
            return root.right;
        root.left = deleteMin(root.left);
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

    // getMin
    public TreeNode getMin() {
        return getMin(root);
    }

    public TreeNode getMin(TreeNode root) {
        if (root.left == null)
            return root;
        return getMin(root.left);
    }

}
