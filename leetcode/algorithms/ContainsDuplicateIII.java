/*
 * Given an array of integers, find out whether there 
 * are two distinct indices i and j in the array such 
 * that the difference between nums[i] and nums[j] is 
 * at most  * t and the difference between i and j is 
 * at most k.
 */
public class ContainsDuplicateIII {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for (int i = 0; i < nums.length - k; i++) {
            for (int j = i + 1; j <= i + k; j++) {
                if (Math.abs(nums[j] - nums[i]) <= t)
                    return true;
            }
        }
        return false;
    }

}

class BST {

    class TreeNode<Integer> {
        
        private Integer value;
        private TreeNode<Integer> left;
        private TreeNode<Integer> right;    
        
        TreeNode(Integer value) {
            this.value = value;
            left = null;
            right = null;
        }
    }   

    public void insert(Node node) {

    }

    public boolean search(T value) {

    }

    public void delete(T value) {

    }

}
