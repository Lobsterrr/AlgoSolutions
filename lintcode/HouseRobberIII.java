/*
 * The thief has found himself a new place for his thievery again. There is only one entrance to this area, called the "root." Besides the root, each house has one and only one parent house. After a tour, the smart thief realized that "all houses in this place forms a binary tree". It will automatically contact the police if two directly-linked houses were broken into on the same night.

Determine the maximum amount of money the thief can rob tonight without alerting the police.

Example
  3
 / \
2   3
 \   \ 
  3   1
Maximum amount of money the thief can rob = 3 + 3 + 1 = 7.

    3
   / \
  4   5
 / \   \ 
1   3   1
Maximum amount of money the thief can rob = 4 + 5 = 9.
 */
/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int x) { val = x; }
 * }
 */
public class HouseRobberIII {

    /**
     * @param root: The root of binary tree.
     * @return: The maximum amount of money you can rob tonight
     */
    public int houseRobber3(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sumWithRoot = root.val;
        if (root.left != null) {
            sumWithRoot += houseRobber3(root.left.left);
            sumWithRoot += houseRobber3(root.left.right);
        }
        if (root.right != null) {
            sumWithRoot += houseRobber3(root.right.left);
            sumWithRoot += houseRobber3(root.right.right);
        }
        int sumWithoutRoot = houseRobber3(root.left) + houseRobber3(root.right);
        return Math.max(sumWithRoot, sumWithoutRoot);
    }

}
