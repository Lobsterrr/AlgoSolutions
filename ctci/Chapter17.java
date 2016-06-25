/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}*/
public class Chapter17 {

    // 17.1
    public int[] exchangeAB(int[] AB) {
        // write code here
        AB[0] ^= AB[1];
        AB[1] ^= AB[0];
        AB[0] ^= AB[1];
        return AB;
    }

    // 17.3
    public int getFactorSuffixZero(int n) {
        int result = 0;
        while (n > 0) {
            n /= 5;
            result += n;
        }
        return result;
    }

    // 17.4
    public int getMax(int a, int b) {
        int sign = (a - b) >> 31;
        return a + sign * (a - b);
    }

    public int getMax(int a, int b) {
        // a + b + |a - b| 最大值的两倍，同理a + b - |a - b|是最小值的两倍
        return (a + b + Math.abs(a - b)) / 2;
    }

    public int getMax(int a, int b) {
        b = a - b;
        a -= b & (b >> 31);
        return a;
    }

    // 17.8
    public int getMaxSum(int[] A, int n) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0, curSum = 0; i < A.length; ++i) {
            curSum += A[i];
            maxSum = Math.max(maxSum, curSum);
            curSum = Math.max(curSum, 0);
        }
        return maxSum;
    }

    // 17.9
    public int getFrequency(String[] article, int n, String word) {
        // write code here
        int count = 0;
        for (String s : article) {
            count += s.equals(word) ? 1 : 0;
        }
        return count;
    }

    // 17.13
    public ListNode treeToList(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                cur.next = new ListNode(root.val);
                cur = cur.next;
                root = root.right;
            }
        }
        return dummy.next;
    }

    public ListNode treeToList(TreeNode root) {
        if (root == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = treeToList(root.left);
        ListNode cur = dummy;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new ListNode(root.val);
        cur = cur.next;
        cur.next = treeToList(root.right);
        return dummy.next;
    }

}
