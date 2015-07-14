/*
 * Given a binary tree, find the lowest common ancestor (LCA) 
 * of two given nodes in the tree.

 * According to the definition of LCA on Wikipedia: ¡°The 
 * lowest common ancestor is defined between two nodes v and 
 * w as the lowest node in T that has both v and w as 
 * descendants (where we allow a node to be a descendant of 
 * itself).¡±
 * 
 *         _______3______
 *        /              \
 *     ___5__          ___1__
 *    /      \        /      \
 *    6      _2       0       8
 *          /  \
 *          7   4
 * For example, the lowest common ancestor (LCA) of nodes 5 and 
 * 1 is 3. Another example is LCA of nodes 5 and 4 is 5, since 
 * a node can be a descendant of itself according to the LCA 
 * definition.
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
        if (root == p || root == q)
            return root;
        int totalMatches = countMatchesPQ(root.left, p, q);
        if (totalMatches == 1)
            return root;
        else if (totalMatches == 2)
            return lowestCommonAncestor(root.left, p, q);
        else
            return lowestCommonAncestor(root.right, p, q);
    }

    public int countMatchesPQ(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return 0;
        int matches = countMatchesPQ(root.left, p, q) + countMatchesPQ(root.right, p, q);
        if (root == p || root == q)
            return 1 + matches;
        else
            return matches;
    }

/*******************************************************************/

    // TLE
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p.val == root.val || q.val == root.val || onLeft(root, p) && onRight(root, q) || onLeft(root, q) && onRight(root, p))
            return root;
        else if (onLeft(root, p) && onLeft(root,q))
            return lowestCommonAncestor(root.left, p, q);
        else
            return lowestCommonAncestor(root.right, p, q);
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

/*******************************************************************/

    // TODO not finished.

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> path0 = new ArrayList<TreeNode>();
        List<TreeNode> path1 = new ArrayList<TreeNode>();
        if (!findPath(root, p, path0) || !findPath(root, q, path1))
            return null;
        int i = 0;
        for (; i < Math.min(path0.size(), path1.size()); i++) {
            if (path0.get(i).val != path1.get(i).val)
                break;
        }
        return path0.get(i - 1);
    }

    public boolean findPath(TreeNode root, TreeNode p, List<TreeNode> path) {
        if (root == null)
            return false;
        path.add(root);
        if (root.val == p.val)
            return true;
        if ((root.left != null && findPath(root.left, p, path)) || (root.right != null && findPath(root.right, p, path)))
            return true;
        path.remove(path.size() - 1);
        return false;
    }

/*******************************************************************/

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;
        if (root.val == p.val || root.val == q.val)
            return root;
        TreeNode L = lowestCommonAncestor(root.left, p, q);
        TreeNode R = lowestCommonAncestor(root.right, p, q);
        if (L != null && R != null)
            return root;
        return L != null ? L : R;
    }
}
