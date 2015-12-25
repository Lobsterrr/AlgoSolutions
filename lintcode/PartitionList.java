/*
 * Given a linked list and a value x, partition it 
 * such that all nodes less than x come before 
 * nodes greater than or equal to x.

You should preserve the original relative order 
of the nodes in each of the two partitions.

For example,
Given 1->4->3->2->5->2->null and x = 3,
return 1->2->2->4->3->5->null. 
 */
/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class PartitionList {

    /**
     * @param head: The first node of linked list.
     * @param x: an integer
     * @return: a ListNode 
     */
    public ListNode partition(ListNode head, int x) {
        List<Integer> small = new ArrayList<Integer>();
        List<Integer> large = new ArrayList<Integer>();
        ListNode cur = head;
        while (cur != null) {
            if (cur.val < x) {
                small.add(cur.val);
            } else {
                large.add(cur.val);
            }
            cur = cur.next;
        }
        ListNode dummy = new ListNode(0);
        cur = dummy;
        for (int i = 0; i < small.size() + large.size(); ++i) {
            if (i < small.size()) {
                cur.next = new ListNode(small.get(i));
            } else {
                cur.next = new ListNode(large.get(i - small.size()));
            }
            cur = cur.next;
        }
        return dummy.next;
    }

}
