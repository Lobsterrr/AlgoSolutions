/*
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

 * According to the definition of LCA on Wikipedia: ¡°The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).¡±
 * 
 *         _______3______
 *        /              \
 *     ___5__          ___1__
 *    /      \        /      \
 *    6      _2       0       8
 *          /  \
 *          7   4
 * For example, the lowest common ancestor (LCA) of nodes 5 and 1 is 3. Another example is LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.
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
public class LowestCommonAncestorOfABinaryTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode cur = root;
        while (cur != null) {
            if (p.val == root.val || q.val == root.val)
                return cur;
            else if (onLeft(root, p) && onLeft(root, q))
                cur = cur.left;    
            else if (onLeft(root, p) && onRight(root, q))
                return cur;
            else if (onRight(root, p) && onLeft(root, q))
                return cur;
            else
                return cur = cur.right;
        }
        return cur;
    }

    public boolean onLeft(TreeNode root, TreeNode p) {
        return root != null && search(root.left, p);
    }

    public boolean onRight(TreeNode root, TreeNode p) {
        return root != null && search(root.right, p);
    }

    public boolean search(TreeNode root, TreeNode p) {
        if (root == null)
            return false;
        if (p.val == root.val)
            return true;
        return search(root.left, p) || search(root.right, p);
    }

}
