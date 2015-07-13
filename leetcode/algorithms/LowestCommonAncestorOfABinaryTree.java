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

/*******************************************************************/

    // TODO not finished.

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> leftPath = findPath(root, p, new ArrayList<TreeNode>());
        ArrayList<TreeNode> rightPath = findPath(root, q, new ArrayList<TreeNode>());
        int size = Math.min(leftPath.size(), rightPath.size());
        for (int i = 0; i < size; i++) {
            if (leftPath.get(i).val != rightPath.get(i).val)
                return leftPath.get(i - 1);
        }
        return leftPath.get(size - 1);
    }


    public ArrayList<TreeNode> findPath(TreeNode root, TreeNode p, ArrayList<TreeNode> path) {
        ArrayList<TreeNode> result = new ArrayList<TreeNode>();
        if (root == null)
            return result;
        path.add(root);
        if (root.val == p.val) {
            result = new ArrayList<TreeNode>(path);
        } else {
            findPath(root.left, p, path);
            path.remove(path.size() - 1);
            findPath(root.right, p, path);
            path.remove(path.size() - 1);
        }
        return result;
    }

}
