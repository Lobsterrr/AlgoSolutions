/*
 * Sort a linked list in O(n log n) time using constant space complexity.

Example
Given 1-3->2->null, sort it to 1->2->3->null.
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
public class SortList {

    /**
     * @param head: The head of linked list.
     * @return: You should return the head of the sorted linked list,
                    using constant space complexity.
     */
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur1 = head;
        ListNode cur2 = head.next;
        while (cur2 != null && cur2.next != null) {
            cur2 = cur2.next.next;
            cur1 = cur1.next;
        }
        ListNode head2 = cur1.next;
        cur1.next = null;
        return mergeList(head, head2);
    }

    public ListNode mergeList(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return dummy.next;
    }



    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = head;
        head = sortList(head.next);
        node.next = null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = dummy.next;
        for (; cur != null && cur.val <= node.val; cur = cur.next, prev = prev.next);
        prev.next = node;
        if (cur != null) {
            node.next = cur;
        }
        return dummy.next;
    }

}
